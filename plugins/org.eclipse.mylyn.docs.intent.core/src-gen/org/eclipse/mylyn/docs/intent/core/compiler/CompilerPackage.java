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
package org.eclipse.mylyn.docs.intent.core.compiler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to
 * represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilerFactory
 * @model kind="package"
 * @generated
 */
public interface CompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/intent/compilerinfos/0.7";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "intentCompilerInfos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	CompilerPackage eINSTANCE = org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl <em>EString To EObject</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEStringToEObject()
	 * @generated
	 */
	int ESTRING_TO_EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EOBJECT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EOBJECT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EOBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl <em>Textual Reference To Contributions</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTextualReferenceToContributions()
	 * @generated
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Textual Reference To Contributions</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_REFERENCE_TO_CONTRIBUTIONS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl <em>String To EObject Map</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getStringToEObjectMap()
	 * @generated
	 */
	int STRING_TO_EOBJECT_MAP = 2;

	/**
	 * The feature id for the '<em><b>Name To Element</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EOBJECT_MAP__NAME_TO_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>String To EObject Map</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_EOBJECT_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl <em>EType To String To EObject Map</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getETypeToStringToEObjectMap()
	 * @generated
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EType To String To EObject Map</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ETYPE_TO_STRING_TO_EOBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl <em>EObject To Unresolved References List</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEObjectToUnresolvedReferencesList()
	 * @generated
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EObject To Unresolved References List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EOBJECT_TO_UNRESOLVED_REFERENCES_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl
	 * <em>Resource To Contained Elements Map Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getResourceToContainedElementsMapEntry()
	 * @generated
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Resource To Contained Elements Map Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl <em>Modeling Unit To Status List</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getModelingUnitToStatusList()
	 * @generated
	 */
	int MODELING_UNIT_TO_STATUS_LIST = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_TO_STATUS_LIST__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_TO_STATUS_LIST__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Modeling Unit To Status List</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MODELING_UNIT_TO_STATUS_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl
	 * <em>Created Element To Instruction Map Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCreatedElementToInstructionMapEntry()
	 * @generated
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Created Element To Instruction Map Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl <em>Unresolved Reference Holder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedReferenceHolder()
	 * @generated
	 */
	int UNRESOLVED_REFERENCE_HOLDER = 8;

	/**
	 * The feature id for the '<em><b>Textual Reference</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__TEXTUAL_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Containment Reference</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__CONTAINMENT_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Instruction Container</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__INSTRUCTION_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Concerned Feature</b></em>' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER__CONCERNED_FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Unresolved Reference Holder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl <em>Compilation Status</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatus()
	 * @generated
	 */
	int COMPILATION_STATUS = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Compilation Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl <em>Compilation Status Manager</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusManager()
	 * @generated
	 */
	int COMPILATION_STATUS_MANAGER = 10;

	/**
	 * The feature id for the '<em><b>Compilation Status List</b></em>' reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER__COMPILATION_STATUS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Modeling Unit To Status List</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER__MODELING_UNIT_TO_STATUS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Validation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER__VALIDATION_TIME = 2;

	/**
	 * The number of structural features of the '<em>Compilation Status Manager</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_STATUS_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl <em>Compilation Information Holder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationInformationHolder()
	 * @generated
	 */
	int COMPILATION_INFORMATION_HOLDER = 11;

	/**
	 * The feature id for the '<em><b>Generated Element List</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__GENERATED_ELEMENT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Element To Unresolved Reference Map</b></em>' map.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__ELEMENT_TO_UNRESOLVED_REFERENCE_MAP = 1;

	/**
	 * The feature id for the '<em><b>Type To Name To Elements Map</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__TYPE_TO_NAME_TO_ELEMENTS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Created Elements To Instructions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__CREATED_ELEMENTS_TO_INSTRUCTIONS = 3;

	/**
	 * The feature id for the '<em><b>Current Generated Element List</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__CURRENT_GENERATED_ELEMENT_LIST = 4;

	/**
	 * The feature id for the '<em><b>Resource To Contained Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__RESOURCE_TO_CONTAINED_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Unresolved Contributions</b></em>' map.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER__UNRESOLVED_CONTRIBUTIONS = 6;

	/**
	 * The number of structural features of the '<em>Compilation Information Holder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPILATION_INFORMATION_HOLDER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl <em>Unresolved Contribution Holder</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedContributionHolder()
	 * @generated
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER = 12;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER__RESOLVED = 0;

	/**
	 * The feature id for the '<em><b>Referenced Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER__REFERENCED_CONTRIBUTION = 1;

	/**
	 * The number of structural features of the '<em>Unresolved Contribution Holder</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_CONTRIBUTION_HOLDER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl <em>Traceability Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndex()
	 * @generated
	 */
	int TRACEABILITY_INDEX = 13;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Traceability Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl <em>Traceability Index Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndexEntry()
	 * @generated
	 */
	int TRACEABILITY_INDEX_ENTRY = 14;

	/**
	 * The feature id for the '<em><b>Generated Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__GENERATED_RESOURCE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Compilation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__COMPILATION_TIME = 1;

	/**
	 * The feature id for the '<em><b>Resource Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__RESOURCE_DECLARATION = 2;

	/**
	 * The feature id for the '<em><b>Contained Element To Instructions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY__CONTAINED_ELEMENT_TO_INSTRUCTIONS = 3;

	/**
	 * The number of structural features of the '<em>Traceability Index Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_INDEX_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl <em>Compiled Element To Instruction Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompiledElementToInstructionEntry()
	 * @generated
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Compiled Element To Instruction Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.InstructionTraceabilityEntryImpl <em>Instruction Traceability Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.InstructionTraceabilityEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getInstructionTraceabilityEntry()
	 * @generated
	 */
	int INSTRUCTION_TRACEABILITY_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_TRACEABILITY_ENTRY__INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_TRACEABILITY_ENTRY__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Instruction Traceability Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_TRACEABILITY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.FeatureToAffectationEntryImpl <em>Feature To Affectation Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.FeatureToAffectationEntryImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getFeatureToAffectationEntry()
	 * @generated
	 */
	int FEATURE_TO_AFFECTATION_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_AFFECTATION_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_AFFECTATION_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Feature To Affectation Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TO_AFFECTATION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.SynchronizerCompilationStatusImpl <em>Synchronizer Compilation Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.SynchronizerCompilationStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getSynchronizerCompilationStatus()
	 * @generated
	 */
	int SYNCHRONIZER_COMPILATION_STATUS = 23;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS__TARGET = COMPILATION_STATUS__TARGET;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS__MESSAGE = COMPILATION_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS__SEVERITY = COMPILATION_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS__TYPE = COMPILATION_STATUS__TYPE;

	/**
	 * The feature id for the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS__COMPILED_RESOURCE_URI = COMPILATION_STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS__WORKING_COPY_RESOURCE_URI = COMPILATION_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronizer Compilation Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT = COMPILATION_STATUS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceChangeStatusImpl <em>Resource Change Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceChangeStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getResourceChangeStatus()
	 * @generated
	 */
	int RESOURCE_CHANGE_STATUS = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__TARGET = SYNCHRONIZER_COMPILATION_STATUS__TARGET;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__MESSAGE = SYNCHRONIZER_COMPILATION_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__SEVERITY = SYNCHRONIZER_COMPILATION_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__TYPE = SYNCHRONIZER_COMPILATION_STATUS__TYPE;

	/**
	 * The feature id for the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__COMPILED_RESOURCE_URI = SYNCHRONIZER_COMPILATION_STATUS__COMPILED_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI = SYNCHRONIZER_COMPILATION_STATUS__WORKING_COPY_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Working Copy Resource State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__WORKING_COPY_RESOURCE_STATE = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compiled Resource State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS__COMPILED_RESOURCE_STATE = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Change Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CHANGE_STATUS_FEATURE_COUNT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelElementChangeStatusImpl <em>Model Element Change Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelElementChangeStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getModelElementChangeStatus()
	 * @generated
	 */
	int MODEL_ELEMENT_CHANGE_STATUS = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__TARGET = SYNCHRONIZER_COMPILATION_STATUS__TARGET;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__MESSAGE = SYNCHRONIZER_COMPILATION_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__SEVERITY = SYNCHRONIZER_COMPILATION_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__TYPE = SYNCHRONIZER_COMPILATION_STATUS__TYPE;

	/**
	 * The feature id for the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__COMPILED_RESOURCE_URI = SYNCHRONIZER_COMPILATION_STATUS__COMPILED_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI = SYNCHRONIZER_COMPILATION_STATUS__WORKING_COPY_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Change State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__CHANGE_STATE = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compiled Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__COMPILED_PARENT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compiled Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__COMPILED_ELEMENT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Working Copy Parent URI Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__WORKING_COPY_PARENT_URI_FRAGMENT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Working Copy Element URI Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Element Change Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_CHANGE_STATUS_FEATURE_COUNT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.StructuralFeatureChangeStatusImpl <em>Structural Feature Change Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.StructuralFeatureChangeStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getStructuralFeatureChangeStatus()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS = 20;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__TARGET = SYNCHRONIZER_COMPILATION_STATUS__TARGET;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__MESSAGE = SYNCHRONIZER_COMPILATION_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__SEVERITY = SYNCHRONIZER_COMPILATION_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__TYPE = SYNCHRONIZER_COMPILATION_STATUS__TYPE;

	/**
	 * The feature id for the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_RESOURCE_URI = SYNCHRONIZER_COMPILATION_STATUS__COMPILED_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI = SYNCHRONIZER_COMPILATION_STATUS__WORKING_COPY_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Change State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__CHANGE_STATE = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__FEATURE_NAME = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compiled Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_ELEMENT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Working Copy Element URI Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Structural Feature Change Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_CHANGE_STATUS_FEATURE_COUNT = SYNCHRONIZER_COMPILATION_STATUS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ReferenceChangeStatusImpl <em>Reference Change Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ReferenceChangeStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getReferenceChangeStatus()
	 * @generated
	 */
	int REFERENCE_CHANGE_STATUS = 21;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__TARGET = STRUCTURAL_FEATURE_CHANGE_STATUS__TARGET;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__MESSAGE = STRUCTURAL_FEATURE_CHANGE_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__SEVERITY = STRUCTURAL_FEATURE_CHANGE_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__TYPE = STRUCTURAL_FEATURE_CHANGE_STATUS__TYPE;

	/**
	 * The feature id for the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__COMPILED_RESOURCE_URI = STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI = STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Change State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__CHANGE_STATE = STRUCTURAL_FEATURE_CHANGE_STATUS__CHANGE_STATE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__FEATURE_NAME = STRUCTURAL_FEATURE_CHANGE_STATUS__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Compiled Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__COMPILED_ELEMENT = STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Working Copy Element URI Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT = STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Compiled Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__COMPILED_TARGET = STRUCTURAL_FEATURE_CHANGE_STATUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Working Copy Target URI Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS__WORKING_COPY_TARGET_URI_FRAGMENT = STRUCTURAL_FEATURE_CHANGE_STATUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Change Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CHANGE_STATUS_FEATURE_COUNT = STRUCTURAL_FEATURE_CHANGE_STATUS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.AttributeChangeStatusImpl <em>Attribute Change Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.AttributeChangeStatusImpl
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getAttributeChangeStatus()
	 * @generated
	 */
	int ATTRIBUTE_CHANGE_STATUS = 22;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__TARGET = STRUCTURAL_FEATURE_CHANGE_STATUS__TARGET;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__MESSAGE = STRUCTURAL_FEATURE_CHANGE_STATUS__MESSAGE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__SEVERITY = STRUCTURAL_FEATURE_CHANGE_STATUS__SEVERITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__TYPE = STRUCTURAL_FEATURE_CHANGE_STATUS__TYPE;

	/**
	 * The feature id for the '<em><b>Compiled Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__COMPILED_RESOURCE_URI = STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Working Copy Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI = STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_RESOURCE_URI;

	/**
	 * The feature id for the '<em><b>Change State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__CHANGE_STATE = STRUCTURAL_FEATURE_CHANGE_STATUS__CHANGE_STATE;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__FEATURE_NAME = STRUCTURAL_FEATURE_CHANGE_STATUS__FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Compiled Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__COMPILED_ELEMENT = STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Working Copy Element URI Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT = STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT;

	/**
	 * The number of structural features of the '<em>Attribute Change Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CHANGE_STATUS_FEATURE_COUNT = STRUCTURAL_FEATURE_CHANGE_STATUS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity <em>Compilation Status Severity</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusSeverity()
	 * @generated
	 */
	int COMPILATION_STATUS_SEVERITY = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType <em>Compilation Message Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationMessageType()
	 * @generated
	 */
	int COMPILATION_MESSAGE_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerResourceState <em>Synchronizer Resource State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerResourceState
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getSynchronizerResourceState()
	 * @generated
	 */
	int SYNCHRONIZER_RESOURCE_STATE = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerChangeState <em>Synchronizer Change State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerChangeState
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getSynchronizerChangeState()
	 * @generated
	 */
	int SYNCHRONIZER_CHANGE_STATE = 27;

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To EObject</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EString To EObject</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" valueType="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EClass getEStringToEObject();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEObject()
	 * @generated
	 */
	EAttribute getEStringToEObject_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEObject()
	 * @generated
	 */
	EReference getEStringToEObject_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Textual Reference To Contributions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Reference To Contributions</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder" valueContainment="true" valueResolveProxies="true" valueMany="true"
	 * @generated
	 */
	EClass getTextualReferenceToContributions();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTextualReferenceToContributions()
	 * @generated
	 */
	EAttribute getTextualReferenceToContributions_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTextualReferenceToContributions()
	 * @generated
	 */
	EReference getTextualReferenceToContributions_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap <em>String To EObject Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To EObject Map</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap
	 * @generated
	 */
	EClass getStringToEObjectMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap#getNameToElement <em>Name To Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Name To Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap#getNameToElement()
	 * @see #getStringToEObjectMap()
	 * @generated
	 */
	EReference getStringToEObjectMap_NameToElement();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EType To String To EObject Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType To String To EObject Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EClassifier"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.StringToEObjectMap"
	 * @generated
	 */
	EClass getETypeToStringToEObjectMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getETypeToStringToEObjectMap()
	 * @generated
	 */
	EReference getETypeToStringToEObjectMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getETypeToStringToEObjectMap()
	 * @generated
	 */
	EReference getETypeToStringToEObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EObject To Unresolved References List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject To Unresolved References List</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder" valueContainment="true" valueResolveProxies="true" valueMany="true"
	 * @generated
	 */
	EClass getEObjectToUnresolvedReferencesList();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToUnresolvedReferencesList()
	 * @generated
	 */
	EReference getEObjectToUnresolvedReferencesList_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEObjectToUnresolvedReferencesList()
	 * @generated
	 */
	EReference getEObjectToUnresolvedReferencesList_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Resource To Contained Elements Map Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource To Contained Elements Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.mylyn.docs.intent.core.modelingunit.ResourceDeclaration" keyRequired="true"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueMany="true"
	 * @generated
	 */
	EClass getResourceToContainedElementsMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResourceToContainedElementsMapEntry()
	 * @generated
	 */
	EReference getResourceToContainedElementsMapEntry_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResourceToContainedElementsMapEntry()
	 * @generated
	 */
	EReference getResourceToContainedElementsMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Modeling Unit To Status List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modeling Unit To Status List</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.mylyn.docs.intent.core.modelingunit.ModelingUnit"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus" valueMany="true"
	 * @generated
	 */
	EClass getModelingUnitToStatusList();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getModelingUnitToStatusList()
	 * @generated
	 */
	EReference getModelingUnitToStatusList_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getModelingUnitToStatusList()
	 * @generated
	 */
	EReference getModelingUnitToStatusList_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Created Element To Instruction Map Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created Element To Instruction Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.genericunit.UnitInstruction" valueMany="true"
	 * @generated
	 */
	EClass getCreatedElementToInstructionMapEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCreatedElementToInstructionMapEntry()
	 * @generated
	 */
	EReference getCreatedElementToInstructionMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCreatedElementToInstructionMapEntry()
	 * @generated
	 */
	EReference getCreatedElementToInstructionMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder <em>Unresolved Reference Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Reference Holder</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder
	 * @generated
	 */
	EClass getUnresolvedReferenceHolder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getTextualReference <em>Textual Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textual Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getTextualReference()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EAttribute getUnresolvedReferenceHolder_TextualReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#isContainmentReference <em>Containment Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment Reference</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#isContainmentReference()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EAttribute getUnresolvedReferenceHolder_ContainmentReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getInstructionContainer <em>Instruction Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction Container</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getInstructionContainer()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EReference getUnresolvedReferenceHolder_InstructionContainer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getConcernedFeature <em>Concerned Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concerned Feature</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedReferenceHolder#getConcernedFeature()
	 * @see #getUnresolvedReferenceHolder()
	 * @generated
	 */
	EReference getUnresolvedReferenceHolder_ConcernedFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus <em>Compilation Status</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus
	 * @generated
	 */
	EClass getCompilationStatus();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getTarget()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EReference getCompilationStatus_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getMessage()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EAttribute getCompilationStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getSeverity()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EAttribute getCompilationStatus_Severity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatus#getType()
	 * @see #getCompilationStatus()
	 * @generated
	 */
	EAttribute getCompilationStatus_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager <em>Compilation Status Manager</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Status Manager</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager
	 * @generated
	 */
	EClass getCompilationStatusManager();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getCompilationStatusList <em>Compilation Status List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compilation Status List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getCompilationStatusList()
	 * @see #getCompilationStatusManager()
	 * @generated
	 */
	EReference getCompilationStatusManager_CompilationStatusList();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getModelingUnitToStatusList <em>Modeling Unit To Status List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Modeling Unit To Status List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getModelingUnitToStatusList()
	 * @see #getCompilationStatusManager()
	 * @generated
	 */
	EReference getCompilationStatusManager_ModelingUnitToStatusList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getValidationTime <em>Validation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Time</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusManager#getValidationTime()
	 * @see #getCompilationStatusManager()
	 * @generated
	 */
	EAttribute getCompilationStatusManager_ValidationTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder <em>Compilation Information Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Information Holder</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder
	 * @generated
	 */
	EClass getCompilationInformationHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getGeneratedElementList <em>Generated Element List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Element List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getGeneratedElementList()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_GeneratedElementList();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getElementToUnresolvedReferenceMap <em>Element To Unresolved Reference Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Element To Unresolved Reference Map</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getElementToUnresolvedReferenceMap()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_ElementToUnresolvedReferenceMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getTypeToNameToElementsMap <em>Type To Name To Elements Map</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Type To Name To Elements Map</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getTypeToNameToElementsMap()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_TypeToNameToElementsMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCreatedElementsToInstructions <em>Created Elements To Instructions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Created Elements To Instructions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCreatedElementsToInstructions()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_CreatedElementsToInstructions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCurrentGeneratedElementList <em>Current Generated Element List</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Current Generated Element List</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getCurrentGeneratedElementList()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_CurrentGeneratedElementList();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getResourceToContainedElements <em>Resource To Contained Elements</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resource To Contained Elements</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getResourceToContainedElements()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_ResourceToContainedElements();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getUnresolvedContributions <em>Unresolved Contributions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Unresolved Contributions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationInformationHolder#getUnresolvedContributions()
	 * @see #getCompilationInformationHolder()
	 * @generated
	 */
	EReference getCompilationInformationHolder_UnresolvedContributions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder <em>Unresolved Contribution Holder</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Contribution Holder</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder
	 * @generated
	 */
	EClass getUnresolvedContributionHolder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#isResolved()
	 * @see #getUnresolvedContributionHolder()
	 * @generated
	 */
	EAttribute getUnresolvedContributionHolder_Resolved();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#getReferencedContribution <em>Referenced Contribution</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Contribution</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.UnresolvedContributionHolder#getReferencedContribution()
	 * @see #getUnresolvedContributionHolder()
	 * @generated
	 */
	EReference getUnresolvedContributionHolder_ReferencedContribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex <em>Traceability Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Index</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex
	 * @generated
	 */
	EClass getTraceabilityIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndex#getEntries()
	 * @see #getTraceabilityIndex()
	 * @generated
	 */
	EReference getTraceabilityIndex_Entries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry <em>Traceability Index Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Index Entry</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry
	 * @generated
	 */
	EClass getTraceabilityIndexEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getGeneratedResourcePath <em>Generated Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Resource Path</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getGeneratedResourcePath()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EAttribute getTraceabilityIndexEntry_GeneratedResourcePath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getCompilationTime <em>Compilation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compilation Time</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getCompilationTime()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EAttribute getTraceabilityIndexEntry_CompilationTime();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getResourceDeclaration <em>Resource Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Declaration</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getResourceDeclaration()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EReference getTraceabilityIndexEntry_ResourceDeclaration();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getContainedElementToInstructions <em>Contained Element To Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Contained Element To Instructions</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.TraceabilityIndexEntry#getContainedElementToInstructions()
	 * @see #getTraceabilityIndexEntry()
	 * @generated
	 */
	EReference getTraceabilityIndexEntry_ContainedElementToInstructions();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Compiled Element To Instruction Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiled Element To Instruction Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.emf.ecore.EObject" keyRequired="true"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry" valueContainment="true" valueResolveProxies="true" valueMany="true"
	 * @generated
	 */
	EClass getCompiledElementToInstructionEntry();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCompiledElementToInstructionEntry()
	 * @generated
	 */
	EReference getCompiledElementToInstructionEntry_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCompiledElementToInstructionEntry()
	 * @generated
	 */
	EReference getCompiledElementToInstructionEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry <em>Instruction Traceability Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Traceability Entry</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry
	 * @generated
	 */
	EClass getInstructionTraceabilityEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry#getInstruction()
	 * @see #getInstructionTraceabilityEntry()
	 * @generated
	 */
	EReference getInstructionTraceabilityEntry_Instruction();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Features</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.InstructionTraceabilityEntry#getFeatures()
	 * @see #getInstructionTraceabilityEntry()
	 * @generated
	 */
	EReference getInstructionTraceabilityEntry_Features();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Feature To Affectation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature To Affectation Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.mylyn.docs.intent.core.modelingunit.ValueForStructuralFeature" valueRequired="true" valueMany="true"
	 * @generated
	 */
	EClass getFeatureToAffectationEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFeatureToAffectationEntry()
	 * @generated
	 */
	EAttribute getFeatureToAffectationEntry_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getFeatureToAffectationEntry()
	 * @generated
	 */
	EReference getFeatureToAffectationEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.ResourceChangeStatus <em>Resource Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Change Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ResourceChangeStatus
	 * @generated
	 */
	EClass getResourceChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.ResourceChangeStatus#getWorkingCopyResourceState <em>Working Copy Resource State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Resource State</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ResourceChangeStatus#getWorkingCopyResourceState()
	 * @see #getResourceChangeStatus()
	 * @generated
	 */
	EAttribute getResourceChangeStatus_WorkingCopyResourceState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.ResourceChangeStatus#getCompiledResourceState <em>Compiled Resource State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compiled Resource State</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ResourceChangeStatus#getCompiledResourceState()
	 * @see #getResourceChangeStatus()
	 * @generated
	 */
	EAttribute getResourceChangeStatus_CompiledResourceState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus <em>Model Element Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Change Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus
	 * @generated
	 */
	EClass getModelElementChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getChangeState <em>Change State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change State</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getChangeState()
	 * @see #getModelElementChangeStatus()
	 * @generated
	 */
	EAttribute getModelElementChangeStatus_ChangeState();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getCompiledParent <em>Compiled Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compiled Parent</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getCompiledParent()
	 * @see #getModelElementChangeStatus()
	 * @generated
	 */
	EReference getModelElementChangeStatus_CompiledParent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getCompiledElement <em>Compiled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compiled Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getCompiledElement()
	 * @see #getModelElementChangeStatus()
	 * @generated
	 */
	EReference getModelElementChangeStatus_CompiledElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getWorkingCopyParentURIFragment <em>Working Copy Parent URI Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Parent URI Fragment</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getWorkingCopyParentURIFragment()
	 * @see #getModelElementChangeStatus()
	 * @generated
	 */
	EAttribute getModelElementChangeStatus_WorkingCopyParentURIFragment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getWorkingCopyElementURIFragment <em>Working Copy Element URI Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Element URI Fragment</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ModelElementChangeStatus#getWorkingCopyElementURIFragment()
	 * @see #getModelElementChangeStatus()
	 * @generated
	 */
	EAttribute getModelElementChangeStatus_WorkingCopyElementURIFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus <em>Structural Feature Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature Change Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus
	 * @generated
	 */
	EClass getStructuralFeatureChangeStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getChangeState <em>Change State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change State</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getChangeState()
	 * @see #getStructuralFeatureChangeStatus()
	 * @generated
	 */
	EAttribute getStructuralFeatureChangeStatus_ChangeState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getFeatureName()
	 * @see #getStructuralFeatureChangeStatus()
	 * @generated
	 */
	EAttribute getStructuralFeatureChangeStatus_FeatureName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getCompiledElement <em>Compiled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compiled Element</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getCompiledElement()
	 * @see #getStructuralFeatureChangeStatus()
	 * @generated
	 */
	EReference getStructuralFeatureChangeStatus_CompiledElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getWorkingCopyElementURIFragment <em>Working Copy Element URI Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Element URI Fragment</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.StructuralFeatureChangeStatus#getWorkingCopyElementURIFragment()
	 * @see #getStructuralFeatureChangeStatus()
	 * @generated
	 */
	EAttribute getStructuralFeatureChangeStatus_WorkingCopyElementURIFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.ReferenceChangeStatus <em>Reference Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Change Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ReferenceChangeStatus
	 * @generated
	 */
	EClass getReferenceChangeStatus();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mylyn.docs.intent.core.compiler.ReferenceChangeStatus#getCompiledTarget <em>Compiled Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compiled Target</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ReferenceChangeStatus#getCompiledTarget()
	 * @see #getReferenceChangeStatus()
	 * @generated
	 */
	EReference getReferenceChangeStatus_CompiledTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.ReferenceChangeStatus#getWorkingCopyTargetURIFragment <em>Working Copy Target URI Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Target URI Fragment</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.ReferenceChangeStatus#getWorkingCopyTargetURIFragment()
	 * @see #getReferenceChangeStatus()
	 * @generated
	 */
	EAttribute getReferenceChangeStatus_WorkingCopyTargetURIFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.AttributeChangeStatus <em>Attribute Change Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Change Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.AttributeChangeStatus
	 * @generated
	 */
	EClass getAttributeChangeStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus <em>Synchronizer Compilation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronizer Compilation Status</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus
	 * @generated
	 */
	EClass getSynchronizerCompilationStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getWorkingCopyResourceURI <em>Working Copy Resource URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Copy Resource URI</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getWorkingCopyResourceURI()
	 * @see #getSynchronizerCompilationStatus()
	 * @generated
	 */
	EAttribute getSynchronizerCompilationStatus_WorkingCopyResourceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getCompiledResourceURI <em>Compiled Resource URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compiled Resource URI</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerCompilationStatus#getCompiledResourceURI()
	 * @see #getSynchronizerCompilationStatus()
	 * @generated
	 */
	EAttribute getSynchronizerCompilationStatus_CompiledResourceURI();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity <em>Compilation Status Severity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compilation Status Severity</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
	 * @generated
	 */
	EEnum getCompilationStatusSeverity();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType <em>Compilation Message Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compilation Message Type</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
	 * @generated
	 */
	EEnum getCompilationMessageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerResourceState <em>Synchronizer Resource State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronizer Resource State</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerResourceState
	 * @generated
	 */
	EEnum getSynchronizerResourceState();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerChangeState <em>Synchronizer Change State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronizer Change State</em>'.
	 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerChangeState
	 * @generated
	 */
	EEnum getSynchronizerChangeState();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompilerFactory getCompilerFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl <em>EString To EObject</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EStringToEObjectImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEStringToEObject()
		 * @generated
		 */
		EClass ESTRING_TO_EOBJECT = eINSTANCE.getEStringToEObject();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_EOBJECT__KEY = eINSTANCE.getEStringToEObject_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_EOBJECT__VALUE = eINSTANCE.getEStringToEObject_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl <em>Textual Reference To Contributions</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TextualReferenceToContributionsImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTextualReferenceToContributions()
		 * @generated
		 */
		EClass TEXTUAL_REFERENCE_TO_CONTRIBUTIONS = eINSTANCE.getTextualReferenceToContributions();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__KEY = eINSTANCE
				.getTextualReferenceToContributions_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TEXTUAL_REFERENCE_TO_CONTRIBUTIONS__VALUE = eINSTANCE
				.getTextualReferenceToContributions_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl <em>String To EObject Map</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.StringToEObjectMapImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getStringToEObjectMap()
		 * @generated
		 */
		EClass STRING_TO_EOBJECT_MAP = eINSTANCE.getStringToEObjectMap();

		/**
		 * The meta object literal for the '<em><b>Name To Element</b></em>' map feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_EOBJECT_MAP__NAME_TO_ELEMENT = eINSTANCE.getStringToEObjectMap_NameToElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl <em>EType To String To EObject Map</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ETypeToStringToEObjectMapImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getETypeToStringToEObjectMap()
		 * @generated
		 */
		EClass ETYPE_TO_STRING_TO_EOBJECT_MAP = eINSTANCE.getETypeToStringToEObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_TO_STRING_TO_EOBJECT_MAP__KEY = eINSTANCE.getETypeToStringToEObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_TO_STRING_TO_EOBJECT_MAP__VALUE = eINSTANCE.getETypeToStringToEObjectMap_Value();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl
		 * <em>EObject To Unresolved References List</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.EObjectToUnresolvedReferencesListImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getEObjectToUnresolvedReferencesList()
		 * @generated
		 */
		EClass EOBJECT_TO_UNRESOLVED_REFERENCES_LIST = eINSTANCE.getEObjectToUnresolvedReferencesList();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__KEY = eINSTANCE
				.getEObjectToUnresolvedReferencesList_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EOBJECT_TO_UNRESOLVED_REFERENCES_LIST__VALUE = eINSTANCE
				.getEObjectToUnresolvedReferencesList_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl <em>Resource To Contained Elements Map Entry</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceToContainedElementsMapEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getResourceToContainedElementsMapEntry()
		 * @generated
		 */
		EClass RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY = eINSTANCE.getResourceToContainedElementsMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__KEY = eINSTANCE
				.getResourceToContainedElementsMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_TO_CONTAINED_ELEMENTS_MAP_ENTRY__VALUE = eINSTANCE
				.getResourceToContainedElementsMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl <em>Modeling Unit To Status List</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelingUnitToStatusListImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getModelingUnitToStatusList()
		 * @generated
		 */
		EClass MODELING_UNIT_TO_STATUS_LIST = eINSTANCE.getModelingUnitToStatusList();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_UNIT_TO_STATUS_LIST__KEY = eINSTANCE.getModelingUnitToStatusList_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELING_UNIT_TO_STATUS_LIST__VALUE = eINSTANCE.getModelingUnitToStatusList_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl <em>Created Element To Instruction Map Entry</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CreatedElementToInstructionMapEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCreatedElementToInstructionMapEntry()
		 * @generated
		 */
		EClass CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY = eINSTANCE.getCreatedElementToInstructionMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__KEY = eINSTANCE
				.getCreatedElementToInstructionMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATED_ELEMENT_TO_INSTRUCTION_MAP_ENTRY__VALUE = eINSTANCE
				.getCreatedElementToInstructionMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl <em>Unresolved Reference Holder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedReferenceHolderImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedReferenceHolder()
		 * @generated
		 */
		EClass UNRESOLVED_REFERENCE_HOLDER = eINSTANCE.getUnresolvedReferenceHolder();

		/**
		 * The meta object literal for the '<em><b>Textual Reference</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNRESOLVED_REFERENCE_HOLDER__TEXTUAL_REFERENCE = eINSTANCE
				.getUnresolvedReferenceHolder_TextualReference();

		/**
		 * The meta object literal for the '<em><b>Containment Reference</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute UNRESOLVED_REFERENCE_HOLDER__CONTAINMENT_REFERENCE = eINSTANCE
				.getUnresolvedReferenceHolder_ContainmentReference();

		/**
		 * The meta object literal for the '<em><b>Instruction Container</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNRESOLVED_REFERENCE_HOLDER__INSTRUCTION_CONTAINER = eINSTANCE
				.getUnresolvedReferenceHolder_InstructionContainer();

		/**
		 * The meta object literal for the '<em><b>Concerned Feature</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNRESOLVED_REFERENCE_HOLDER__CONCERNED_FEATURE = eINSTANCE
				.getUnresolvedReferenceHolder_ConcernedFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl <em>Compilation Status</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatus()
		 * @generated
		 */
		EClass COMPILATION_STATUS = eINSTANCE.getCompilationStatus();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_STATUS__TARGET = eINSTANCE.getCompilationStatus_Target();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS__MESSAGE = eINSTANCE.getCompilationStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS__SEVERITY = eINSTANCE.getCompilationStatus_Severity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS__TYPE = eINSTANCE.getCompilationStatus_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl <em>Compilation Status Manager</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationStatusManagerImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusManager()
		 * @generated
		 */
		EClass COMPILATION_STATUS_MANAGER = eINSTANCE.getCompilationStatusManager();

		/**
		 * The meta object literal for the '<em><b>Compilation Status List</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_STATUS_MANAGER__COMPILATION_STATUS_LIST = eINSTANCE
				.getCompilationStatusManager_CompilationStatusList();

		/**
		 * The meta object literal for the '<em><b>Modeling Unit To Status List</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_STATUS_MANAGER__MODELING_UNIT_TO_STATUS_LIST = eINSTANCE
				.getCompilationStatusManager_ModelingUnitToStatusList();

		/**
		 * The meta object literal for the '<em><b>Validation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_STATUS_MANAGER__VALIDATION_TIME = eINSTANCE
				.getCompilationStatusManager_ValidationTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl <em>Compilation Information Holder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilationInformationHolderImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationInformationHolder()
		 * @generated
		 */
		EClass COMPILATION_INFORMATION_HOLDER = eINSTANCE.getCompilationInformationHolder();

		/**
		 * The meta object literal for the '<em><b>Generated Element List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__GENERATED_ELEMENT_LIST = eINSTANCE
				.getCompilationInformationHolder_GeneratedElementList();

		/**
		 * The meta object literal for the '<em><b>Element To Unresolved Reference Map</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__ELEMENT_TO_UNRESOLVED_REFERENCE_MAP = eINSTANCE
				.getCompilationInformationHolder_ElementToUnresolvedReferenceMap();

		/**
		 * The meta object literal for the '<em><b>Type To Name To Elements Map</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__TYPE_TO_NAME_TO_ELEMENTS_MAP = eINSTANCE
				.getCompilationInformationHolder_TypeToNameToElementsMap();

		/**
		 * The meta object literal for the '<em><b>Created Elements To Instructions</b></em>' map feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__CREATED_ELEMENTS_TO_INSTRUCTIONS = eINSTANCE
				.getCompilationInformationHolder_CreatedElementsToInstructions();

		/**
		 * The meta object literal for the '<em><b>Current Generated Element List</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__CURRENT_GENERATED_ELEMENT_LIST = eINSTANCE
				.getCompilationInformationHolder_CurrentGeneratedElementList();

		/**
		 * The meta object literal for the '<em><b>Resource To Contained Elements</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__RESOURCE_TO_CONTAINED_ELEMENTS = eINSTANCE
				.getCompilationInformationHolder_ResourceToContainedElements();

		/**
		 * The meta object literal for the '<em><b>Unresolved Contributions</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMPILATION_INFORMATION_HOLDER__UNRESOLVED_CONTRIBUTIONS = eINSTANCE
				.getCompilationInformationHolder_UnresolvedContributions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl <em>Unresolved Contribution Holder</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.UnresolvedContributionHolderImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getUnresolvedContributionHolder()
		 * @generated
		 */
		EClass UNRESOLVED_CONTRIBUTION_HOLDER = eINSTANCE.getUnresolvedContributionHolder();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNRESOLVED_CONTRIBUTION_HOLDER__RESOLVED = eINSTANCE
				.getUnresolvedContributionHolder_Resolved();

		/**
		 * The meta object literal for the '<em><b>Referenced Contribution</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UNRESOLVED_CONTRIBUTION_HOLDER__REFERENCED_CONTRIBUTION = eINSTANCE
				.getUnresolvedContributionHolder_ReferencedContribution();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl <em>Traceability Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndex()
		 * @generated
		 */
		EClass TRACEABILITY_INDEX = eINSTANCE.getTraceabilityIndex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_INDEX__ENTRIES = eINSTANCE.getTraceabilityIndex_Entries();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl <em>Traceability Index Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.TraceabilityIndexEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getTraceabilityIndexEntry()
		 * @generated
		 */
		EClass TRACEABILITY_INDEX_ENTRY = eINSTANCE.getTraceabilityIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Generated Resource Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_INDEX_ENTRY__GENERATED_RESOURCE_PATH = eINSTANCE
				.getTraceabilityIndexEntry_GeneratedResourcePath();

		/**
		 * The meta object literal for the '<em><b>Compilation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACEABILITY_INDEX_ENTRY__COMPILATION_TIME = eINSTANCE
				.getTraceabilityIndexEntry_CompilationTime();

		/**
		 * The meta object literal for the '<em><b>Resource Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_INDEX_ENTRY__RESOURCE_DECLARATION = eINSTANCE
				.getTraceabilityIndexEntry_ResourceDeclaration();

		/**
		 * The meta object literal for the '<em><b>Contained Element To Instructions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_INDEX_ENTRY__CONTAINED_ELEMENT_TO_INSTRUCTIONS = eINSTANCE
				.getTraceabilityIndexEntry_ContainedElementToInstructions();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl <em>Compiled Element To Instruction Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompiledElementToInstructionEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompiledElementToInstructionEntry()
		 * @generated
		 */
		EClass COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY = eINSTANCE.getCompiledElementToInstructionEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__KEY = eINSTANCE
				.getCompiledElementToInstructionEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILED_ELEMENT_TO_INSTRUCTION_ENTRY__VALUE = eINSTANCE
				.getCompiledElementToInstructionEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.InstructionTraceabilityEntryImpl <em>Instruction Traceability Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.InstructionTraceabilityEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getInstructionTraceabilityEntry()
		 * @generated
		 */
		EClass INSTRUCTION_TRACEABILITY_ENTRY = eINSTANCE.getInstructionTraceabilityEntry();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_TRACEABILITY_ENTRY__INSTRUCTION = eINSTANCE
				.getInstructionTraceabilityEntry_Instruction();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_TRACEABILITY_ENTRY__FEATURES = eINSTANCE
				.getInstructionTraceabilityEntry_Features();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.FeatureToAffectationEntryImpl <em>Feature To Affectation Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.FeatureToAffectationEntryImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getFeatureToAffectationEntry()
		 * @generated
		 */
		EClass FEATURE_TO_AFFECTATION_ENTRY = eINSTANCE.getFeatureToAffectationEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TO_AFFECTATION_ENTRY__KEY = eINSTANCE.getFeatureToAffectationEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TO_AFFECTATION_ENTRY__VALUE = eINSTANCE.getFeatureToAffectationEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceChangeStatusImpl <em>Resource Change Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ResourceChangeStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getResourceChangeStatus()
		 * @generated
		 */
		EClass RESOURCE_CHANGE_STATUS = eINSTANCE.getResourceChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Working Copy Resource State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CHANGE_STATUS__WORKING_COPY_RESOURCE_STATE = eINSTANCE
				.getResourceChangeStatus_WorkingCopyResourceState();

		/**
		 * The meta object literal for the '<em><b>Compiled Resource State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CHANGE_STATUS__COMPILED_RESOURCE_STATE = eINSTANCE
				.getResourceChangeStatus_CompiledResourceState();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelElementChangeStatusImpl <em>Model Element Change Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ModelElementChangeStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getModelElementChangeStatus()
		 * @generated
		 */
		EClass MODEL_ELEMENT_CHANGE_STATUS = eINSTANCE.getModelElementChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Change State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CHANGE_STATUS__CHANGE_STATE = eINSTANCE
				.getModelElementChangeStatus_ChangeState();

		/**
		 * The meta object literal for the '<em><b>Compiled Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_CHANGE_STATUS__COMPILED_PARENT = eINSTANCE
				.getModelElementChangeStatus_CompiledParent();

		/**
		 * The meta object literal for the '<em><b>Compiled Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_CHANGE_STATUS__COMPILED_ELEMENT = eINSTANCE
				.getModelElementChangeStatus_CompiledElement();

		/**
		 * The meta object literal for the '<em><b>Working Copy Parent URI Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CHANGE_STATUS__WORKING_COPY_PARENT_URI_FRAGMENT = eINSTANCE
				.getModelElementChangeStatus_WorkingCopyParentURIFragment();

		/**
		 * The meta object literal for the '<em><b>Working Copy Element URI Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT = eINSTANCE
				.getModelElementChangeStatus_WorkingCopyElementURIFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.StructuralFeatureChangeStatusImpl <em>Structural Feature Change Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.StructuralFeatureChangeStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getStructuralFeatureChangeStatus()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_CHANGE_STATUS = eINSTANCE.getStructuralFeatureChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Change State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE_CHANGE_STATUS__CHANGE_STATE = eINSTANCE
				.getStructuralFeatureChangeStatus_ChangeState();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE_CHANGE_STATUS__FEATURE_NAME = eINSTANCE
				.getStructuralFeatureChangeStatus_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Compiled Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_CHANGE_STATUS__COMPILED_ELEMENT = eINSTANCE
				.getStructuralFeatureChangeStatus_CompiledElement();

		/**
		 * The meta object literal for the '<em><b>Working Copy Element URI Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE_CHANGE_STATUS__WORKING_COPY_ELEMENT_URI_FRAGMENT = eINSTANCE
				.getStructuralFeatureChangeStatus_WorkingCopyElementURIFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.ReferenceChangeStatusImpl <em>Reference Change Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.ReferenceChangeStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getReferenceChangeStatus()
		 * @generated
		 */
		EClass REFERENCE_CHANGE_STATUS = eINSTANCE.getReferenceChangeStatus();

		/**
		 * The meta object literal for the '<em><b>Compiled Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_CHANGE_STATUS__COMPILED_TARGET = eINSTANCE
				.getReferenceChangeStatus_CompiledTarget();

		/**
		 * The meta object literal for the '<em><b>Working Copy Target URI Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CHANGE_STATUS__WORKING_COPY_TARGET_URI_FRAGMENT = eINSTANCE
				.getReferenceChangeStatus_WorkingCopyTargetURIFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.AttributeChangeStatusImpl <em>Attribute Change Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.AttributeChangeStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getAttributeChangeStatus()
		 * @generated
		 */
		EClass ATTRIBUTE_CHANGE_STATUS = eINSTANCE.getAttributeChangeStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.impl.SynchronizerCompilationStatusImpl <em>Synchronizer Compilation Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.SynchronizerCompilationStatusImpl
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getSynchronizerCompilationStatus()
		 * @generated
		 */
		EClass SYNCHRONIZER_COMPILATION_STATUS = eINSTANCE.getSynchronizerCompilationStatus();

		/**
		 * The meta object literal for the '<em><b>Working Copy Resource URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZER_COMPILATION_STATUS__WORKING_COPY_RESOURCE_URI = eINSTANCE
				.getSynchronizerCompilationStatus_WorkingCopyResourceURI();

		/**
		 * The meta object literal for the '<em><b>Compiled Resource URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONIZER_COMPILATION_STATUS__COMPILED_RESOURCE_URI = eINSTANCE
				.getSynchronizerCompilationStatus_CompiledResourceURI();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity <em>Compilation Status Severity</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationStatusSeverity
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationStatusSeverity()
		 * @generated
		 */
		EEnum COMPILATION_STATUS_SEVERITY = eINSTANCE.getCompilationStatusSeverity();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType <em>Compilation Message Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.CompilationMessageType
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getCompilationMessageType()
		 * @generated
		 */
		EEnum COMPILATION_MESSAGE_TYPE = eINSTANCE.getCompilationMessageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerResourceState <em>Synchronizer Resource State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerResourceState
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getSynchronizerResourceState()
		 * @generated
		 */
		EEnum SYNCHRONIZER_RESOURCE_STATE = eINSTANCE.getSynchronizerResourceState();

		/**
		 * The meta object literal for the '{@link org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerChangeState <em>Synchronizer Change State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.SynchronizerChangeState
		 * @see org.eclipse.mylyn.docs.intent.core.compiler.impl.CompilerPackageImpl#getSynchronizerChangeState()
		 * @generated
		 */
		EEnum SYNCHRONIZER_CHANGE_STATE = eINSTANCE.getSynchronizerChangeState();

	}

} // CompilerPackage
