/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickchat;
/**
 *
 * @author Asus
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonStorage {
    private static final String FILE_NAME = "messages.json";
    
    public static void saveMessages(ArrayList<Message> messages){
        Gson gson = new Gson();
        String json = gson.toJson(messages);
        
        try (FileWriter writer = new FileWriter(FILE_NAME)){
            writer.write(json);
        } catch (IOException e){
            System.out.println("Error saving messages: " + e.getMessage());
        }
    }
    public static ArrayList<Message> loadMessages(){
        
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Message>>(){}.getType();
        
        try (FileReader reader = new FileReader(FILE_NAME)){
            return gson.fromJson(reader, type);
        }catch (IOException e){
            return new ArrayList<>();
        }
    }
    
}
