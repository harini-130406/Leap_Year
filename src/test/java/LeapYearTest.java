package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {

    LeapYear leap = new LeapYear();

    @Test
    public void testLeapYear() {
        assertTrue(leap.isLeapYear(2024));
    }

    @Test
    public void testNonLeapYear() {
        assertFalse(leap.isLeapYear(2023));
    }

    @Test
    public void testCenturyNotLeapYear() {
        assertFalse(leap.isLeapYear(1900));
    }

    @Test
    public void testCenturyLeapYear() {
        assertTrue(leap.isLeapYear(2000));
    }
}