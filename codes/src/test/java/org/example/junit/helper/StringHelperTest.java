package org.example.junit.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

    StringHelper helper;

    // Runs before every test cases
    @Before
    public void before(){
        helper = new StringHelper();
    }

    // Returns true, if exists equality; otherwise, returns false
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    // ABCD => false, ABAB => true, AB => true, A => false
    // Returns false, if exists equality
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(
                helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    // Returns true, if exists equality
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(
                helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
