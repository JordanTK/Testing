/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testingmessage;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author Jordan
 */
public class TestingMessageTest
{
    
    public TestingMessageTest()
    {
    }

    TestingMessage test = new TestingMessage();
    @Test
    public void testGetMessge()
    {
        String expected = "Hello World";
        String actual = test.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void testMain()
    {
    }
    
}
