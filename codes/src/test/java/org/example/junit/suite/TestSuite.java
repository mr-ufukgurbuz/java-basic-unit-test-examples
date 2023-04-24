package org.example.junit.suite;

import org.example.junit.helper.ArraysCompareTest;
import org.example.junit.helper.StringHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Tum unit test'leri gruplamamizi ve toplu bir sakilde calistirmamizi saglar
@RunWith(Suite.class)
@Suite.SuiteClasses({ArraysCompareTest.class, StringHelperTest.class})

public class TestSuite {
}
