/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickchat;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
public class QuickChat {

      public static ArrayList<Message>messages = new ArrayList<>();
      
      public static void addMessage(Message msg){
          
          messages.add(msg);
      }   
      public static String printMessages(){
          String output = "";
          
          for(Message msg : messages){
              
              output +=msg.printMessages() + "\n";
          }
          return output;
      }
      
      public static int returnTotalMessages(){
          return messages.size();
      }
   }