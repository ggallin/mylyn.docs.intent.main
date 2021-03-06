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
package org.eclipse.mylyn.docs.intent.core.modelingunit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value For Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature#getInstanciationReference <em>Instanciation Reference</em>}</li>
 *   <li>{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature#getReferencedMetaType <em>Referenced Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getReferenceValueForStructuralFeature()
 * @model
 * @generated
 */
public interface ReferenceValueForStructuralFeature extends ValueForStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Instanciation Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instanciation Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instanciation Reference</em>' containment reference.
	 * @see #setInstanciationReference(InstanciationInstructionReference)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getReferenceValueForStructuralFeature_InstanciationReference()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	InstanciationInstructionReference getInstanciationReference();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature#getInstanciationReference <em>Instanciation Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanciation Reference</em>' containment reference.
	 * @see #getInstanciationReference()
	 * @generated
	 */
	void setInstanciationReference(InstanciationInstructionReference value);

	/**
	 * Returns the value of the '<em><b>Referenced Meta Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Meta Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Meta Type</em>' reference.
	 * @see #setReferencedMetaType(EObject)
	 * @see org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnitPackage#getReferenceValueForStructuralFeature_ReferencedMetaType()
	 * @model
	 * @generated
	 */
	EObject getReferencedMetaType();

	/**
	 * Sets the value of the '{@link org.eclipse.mylyn.docs.intent.core.modelingunit.ReferenceValueForStructuralFeature#getReferencedMetaType <em>Referenced Meta Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Meta Type</em>' reference.
	 * @see #getReferencedMetaType()
	 * @generated
	 */
	void setReferencedMetaType(EObject value);

} // ReferenceValueForStructuralFeature
