/*******************************************************************************
 * Copyright (c) 2010, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.docs.intent.client.ui.cdo.launcher;

import com.google.common.collect.Maps;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.docs.intent.client.compiler.launcher.CompilerCreator;
import org.eclipse.mylyn.docs.intent.client.compiler.repositoryconnection.CompilerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.IndexerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.indexer.launcher.IndexerCreator;
import org.eclipse.mylyn.docs.intent.client.synchronizer.SynchronizerRepositoryClient;
import org.eclipse.mylyn.docs.intent.client.synchronizer.launcher.SynchronizerCreator;
import org.eclipse.mylyn.docs.intent.client.synchronizer.listeners.GeneratedElementListener;
import org.eclipse.mylyn.docs.intent.collab.common.logger.IIntentLogger.LogType;
import org.eclipse.mylyn.docs.intent.collab.common.logger.IntentLogger;
import org.eclipse.mylyn.docs.intent.collab.common.repository.IntentRepositoryManager;
import org.eclipse.mylyn.docs.intent.collab.handlers.adapters.ReadOnlyException;
import org.eclipse.mylyn.docs.intent.collab.repository.Repository;
import org.eclipse.mylyn.docs.intent.collab.repository.RepositoryConnectionException;

/**
 * Launch all the clients needed by the ui application (Compiler, Synchronizer...).
 * 
 * @author <a href="mailto:alex.lagarde@obeo.fr">Alex Lagarde</a>
 */
public final class IntentCDOManager {

	private static Map<String, IntentCDOManager> cdoManagers = Maps.newLinkedHashMap();

	private Repository repository;

	private CompilerRepositoryClient compilerClient;

	private SynchronizerRepositoryClient synchronizerClient;

	private IndexerRepositoryClient indexerClient;

	private String repositoryLocation;

	private boolean isConnected;

	/**
	 * CDOApplicationLauncher constructor.
	 */
	private IntentCDOManager(String repositoryLocation) {
		this.repositoryLocation = repositoryLocation;
	}

	/**
	 * Connects to a repository.
	 * 
	 * @throws RepositoryConnectionException
	 *             if the repository cannot be reached
	 */
	private void connect() throws RepositoryConnectionException {
		if (!isConnected) {
			try {
				repository = IntentRepositoryManager.INSTANCE.getRepository(repositoryLocation);
				IntentLogger.getInstance().log(LogType.LIFECYCLE,
						"[IntentProjectManager] Connecting to project " + repositoryLocation);
				if (repository != null) {
					repository.getOrCreateSession();

				} else {
					throw new RepositoryConnectionException("Cannot create Repository on project "
							+ repositoryLocation);
				}
			} catch (CoreException e) {
				throw new RepositoryConnectionException(e.getMessage());
			}
			isConnected = true;
		}
	}

	/**
	 * Launch all the clients needed by the ui application (Compiler, Synchronizer...).
	 * 
	 * @throws ReadOnlyException
	 * @throws RepositoryConnectionException
	 */
	public void initializeClients() throws RepositoryConnectionException, ReadOnlyException {
		connect();

		// Clients creation (if needed)

		// Compiler
		if (compilerClient == null) {
			compilerClient = CompilerCreator.createCompilerClient(repository);
		}

		// Synchronizer
		if (synchronizerClient == null) {
			// TODO
			synchronizerClient = SynchronizerCreator.createSynchronizer(repository,
					new GeneratedElementListener() {

						public void setSynchronizer(SynchronizerRepositoryClient synchronizer) {
							// TODO Auto-generated method stub

						}

						public void removeElementToListen(URI uri) {
							// TODO Auto-generated method stub

						}

						public void notifySynchronizer(URI uriOfChangedElement) {
							// TODO Auto-generated method stub

						}

						public void dispose() {
							// TODO Auto-generated method stub

						}

						public void clearElementToListen() {
							// TODO Auto-generated method stub

						}

						public void addElementToListen(URI uri) {
							// TODO Auto-generated method stub

						}
					});
		}

		// Indexer
		if (indexerClient == null) {
			indexerClient = IndexerCreator.createIndexer(repository);
		}

		// notifies the clients

		// launch the indexer in order to allow navigation within the document
		indexerClient.handleChangeNotification(null);

		// launch the compiler to detect eventual existing issues
		compilerClient.handleChangeNotification(null);

	}

	public static IntentCDOManager getCDOManager(String repositoryLocation) {
		IntentCDOManager projectManager = cdoManagers.get(repositoryLocation);
		if (projectManager == null) {
			projectManager = new IntentCDOManager(repositoryLocation);
			cdoManagers.put(repositoryLocation, projectManager);
		}
		return projectManager;
	}
}
