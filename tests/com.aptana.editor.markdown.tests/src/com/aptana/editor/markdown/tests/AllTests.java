/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.markdown.tests;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.aptana.editor.markdown.text.rules.MarkdownPartitionScannerTest;
import com.aptana.editor.markdown.text.rules.MarkdownScannerTest;

@RunWith(Suite.class)
@SuiteClasses({MarkdownPartitionScannerTest.class, MarkdownScannerTest.class, })
public class AllTests
{

//	public static Test suite()
//	{
//		TestSuite suite = new TestSuite(AllTests.class.getName());
//		// $JUnit-BEGIN$
//		suite.addTestSuite(MarkdownPartitionScannerTest.class);
//		suite.addTestSuite(MarkdownScannerTest.class);
//		// $JUnit-END$
//		return suite;
//	}
//
}
