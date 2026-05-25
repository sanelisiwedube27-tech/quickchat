/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package quickchat;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Asus
 */
public class MessageTest {
    
    @Test
    public static void testMessageLengthSuccess() {
        Message msg = 
                new Message(0,
                    "+27711406434",
                    "Hello");
                  
        assertEquals("Message ready to send.",
                msg.checkMessageLength());
    }
    
    @Test 
    public void testRecipientSuccess(){
        Message msg = 
                new Message(0,
                "+27711406434",
                "Hello");
        
        assertEquals(
               "Cell phone number successfully captured.",
                msg.checkRecipientCell());
    }
}  
   