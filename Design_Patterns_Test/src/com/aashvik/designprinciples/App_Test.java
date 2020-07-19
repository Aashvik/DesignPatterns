package com.aashvik.designprinciples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class App_Test extends TestCase {

	 /**
     * Create the test case
     *
     *  testName name of the test case
     */
    public App_Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App_Test.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
