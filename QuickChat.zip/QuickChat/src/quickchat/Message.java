/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchat;

/**
 *
 * @author Asus
 */
import java.util.Random;
public class Message {
 
    private String messageID;
    private int numMessages;
    private String recipient;
    private String message;
    private String messageHash;

    public Message(int numMessages, String recipient, String message) {

        this.numMessages = numMessages;
        this.recipient = recipient;
        this.message = message;

        generateMessageID();
        createMessageHash();
    }

    public void generateMessageID() {

        Random random = new Random();

        long number = 1000000000L + 
                (long)(random.nextDouble() * 9000000000L);

        messageID = String.valueOf(number);
    }

    public boolean checkMessageID() {

        return messageID.length() == 10;
    }

    public String checkRecipientCell() {

        if(recipient.startsWith("+") && recipient.length() <= 13) {

            return "Cell phone number successfully captured.";
        }
        return "Cell phone number is incorrectly formatted or does not contain an international code.";
    }

    public String checkMessageLength() {

        if(message.length() <= 250) {

            return "Message ready to send.";
        }

        int excess = message.length() - 250;

        return "Message exceeds 250 characters by " + excess;
    }

    public String createMessageHash() {

        String[] words = message.split(" ");

        String firstWord = words[0].toUpperCase();
        String lastWord = words[words.length - 1].toUpperCase();

        messageHash = messageID.substring(0,2)
                + ":" +
                numMessages
                + ":" +
                firstWord +
                lastWord;

        return messageHash;
    }

   
    public String sentMessage(int option) {

        switch(option) {

            case 1:
                return "Message successfully sent.";

            case 2:
                return "Press 0 to delete message.";

            case 3:
                return "Message successfully stored.";

            default:
                return "Invalid option.";
        }
    }

    
    public String printMessages() {

        return """
                Message ID: %s
                Message Hash: %s
                Recipient: %s
                Message: %s
                """.formatted(messageID, messageHash,
                recipient, message);
    }

    
    public String getMessageID() {
        return messageID;
    }

    public String getMessageHash() {
        return messageHash;
    }
}
