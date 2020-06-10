package com.bellogate;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);


        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://jeff:jeff2468JEFF@cluster0-8whh1.gcp.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");

        System.out.println("Connection complete!");
    }
}
