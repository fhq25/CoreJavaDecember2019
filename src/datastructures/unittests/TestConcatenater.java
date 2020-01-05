package datastructures.unittests;

import org.junit.Assert;
import org.junit.Test;

public class TestConcatenater {

    @Test
    public void testThatTwoLowercaseStringsConcatenateCorrectly() {
        String actualOutcome = Concatenater.concatenateStrings("good", "morning");
        String expectedOutcome = "goodmorning";
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }

    @Test
    public void testThatConcatenateWithEmptyStringWorks() {
        String actualOutcome = Concatenater.concatenateStrings("good", "");
        String expectedOutcome = "good";
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }

    @Test
    public void testThatConcatenateWithStringNumericalsWorks() {
        String actualOutcome = Concatenater.concatenateStrings("35", "24");
        String expectedOutcome = "3524";
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
