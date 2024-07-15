package com.nt.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testSumWithPositives()
    {
    	App app = new App();
    	int expected = 30;
    	int actual = app.sum(20, 10);
    	assertEquals("Test1", expected, actual);
    }
}
