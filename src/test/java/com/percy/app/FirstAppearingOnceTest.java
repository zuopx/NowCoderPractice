package com.percy.app;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * FirstAppearingOnceTest
 */
public class FirstAppearingOnceTest {
    String stringStream = null;

    @Before
    public void setUp() {
        stringStream = "google";
    }

    @Test
    public void testFistAppearingOnce() {
        FirstAppearingOnce obj = new FirstAppearingOnce();
        for (int i = 0; i != stringStream.length(); i++) {
            obj.insert(stringStream.charAt(i));
            System.out.println(obj.firstAppearingOnce());
        }
        assertTrue(true);
    }
}