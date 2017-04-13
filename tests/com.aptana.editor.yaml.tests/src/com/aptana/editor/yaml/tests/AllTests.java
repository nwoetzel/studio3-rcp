/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.yaml.tests;

import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.aptana.editor.yaml.YAMLCodeScannerTest;
import com.aptana.editor.yaml.YAMLSourcePartitionScannerTest;
import com.aptana.editor.yaml.internal.text.YAMLFoldingComputerTest;
import com.aptana.editor.yaml.outline.YAMLOutlineProviderTest;
import com.aptana.editor.yaml.parsing.YAMLParserTest;

@RunWith(Suite.class)
@SuiteClasses({YAMLSourcePartitionScannerTest.class, YAMLCodeScannerTest.class, YAMLFoldingComputerTest.class, YAMLOutlineProviderTest.class, YAMLParserTest.class, })
public class AllTests
{

//	public static Test suite()
//	{
//		TestSuite suite = new TestSuite(AllTests.class.getName());
//		// $JUnit-BEGIN$
//		suite.addTestSuite(YAMLSourcePartitionScannerTest.class);
//		suite.addTestSuite(YAMLCodeScannerTest.class);
//		suite.addTestSuite(YAMLFoldingComputerTest.class);
//		suite.addTestSuite(YAMLOutlineProviderTest.class);
//		suite.addTestSuite(YAMLParserTest.class);
//		// $JUnit-END$
//		return suite;
//	}
}
