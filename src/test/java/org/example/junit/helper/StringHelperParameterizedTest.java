package org.example.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

// JUnit Parameterized, bir test sınıfında verilen farklı parametrelerle test metotları çalıştırılır.
// Tanımladığımız parametreler sayesinde test metotlarını farklı değerler ile tekrar çalıştırmış oluruz.
// Bu yöntem ile aynı test metotlarını farklı değerler için oluşturmamızın önüne geçmiş oluruz.
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {
                { "AACD", "CD" },
                { "ACD", "CD" } };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput,
                helper.truncateAInFirst2Positions(input));
    }
}
