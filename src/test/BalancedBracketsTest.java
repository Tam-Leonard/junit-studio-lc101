package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void bracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void bracketsOfBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]] []"));
    }
    @Test
    public void tripleBracketsOfBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void twoTripleBracketsOfBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsWithIphoneStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[iPhone]"));
    }
    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void oppositeBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        //was giving false so we had to go to the balacebrackets.java file and look at the method
        //added this: if (brackets < 0) return false;
        //rerun every test to make sure nothing broke
    }
    @Test
    public void unequalBracketsWithIphoneReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[iPhone[]"));
    }

}
