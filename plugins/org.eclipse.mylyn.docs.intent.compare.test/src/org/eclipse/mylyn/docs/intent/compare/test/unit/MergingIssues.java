package org.eclipse.mylyn.docs.intent.compare.test.unit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.mylyn.docs.intent.compare.test.utils.AbstractEMFCompareTest;
import org.eclipse.mylyn.docs.intent.core.document.IntentStructuredElement;
import org.eclipse.mylyn.docs.intent.parser.modelingunit.ParseException;
import org.eclipse.mylyn.docs.intent.serializer.IntentSerializer;

public class MergingIssues extends AbstractEMFCompareTest {

	private static List<String> passed = new ArrayList<String>();

	public void testDoubleSectionInsertion() throws IOException, ParseException {
		compareAndMerge("doubleSectionInsertion");
	}

	public void testDoubleTopTextAddition() throws IOException, ParseException {
		compareAndMerge("doubleTopTextAddition");
	}

	public void testEndTextAddition() throws IOException, ParseException {
		compareAndMerge("endTextAddition");
	}

	public void testMuAddition() throws IOException, ParseException {
		compareAndMerge("muAddition");
	}

	public void testNewInstruction() throws IOException, ParseException {
		compareAndMerge("newInstruction");
	}

	public void testNewTopSection() throws IOException, ParseException {
		compareAndMerge("newTopSection");
	}

	public void testRenameAll() throws IOException, ParseException {
		compareAndMerge("renameAll");
	}

	public void testSectionInsertion() throws IOException, ParseException {
		compareAndMerge("sectionInsertion");
	}

	public void testTextDeletion() throws IOException, ParseException {
		compareAndMerge("textDeletion");
	}

	public void testTextInsertion() throws IOException, ParseException {
		compareAndMerge("textInsertion");
	}

	public void testTopChapterAddition() throws IOException, ParseException {
		compareAndMerge("topChapterAddition");
	}

	public void testTopTextAddition() throws IOException, ParseException {
		compareAndMerge("topTextAddition");
	}

	public void testRename() throws IOException, ParseException {
		compareAndMerge("rename");
	}

	public void testReverseRename() throws IOException, ParseException {
		compareAndMerge("reverseRename");
	}

	private void compareAndMerge(String testName) throws IOException, ParseException {
		passed.add(testName);
		String repository = getFileAsString(new File("data/" + testName + "/IntentDocument.text"));
		String modified = getFileAsString(new File("data/" + testName + "/IntentDocument.text.modifications"));
		IntentStructuredElement left = parseIntentDocument(modified);
		IntentStructuredElement right = parseIntentDocument(repository);
		compareAndMergeDiffs(left, right);
		assertEquals(modified, new IntentSerializer().serialize(right));
	}
}
