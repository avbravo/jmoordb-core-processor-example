package com.avbravo.trace.producer;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class MongoDBManagerProducer implements Serializable {

    @Inject
    private Config config;
    @Inject
    @ConfigProperty(name = "mongodb.uri")
    private String mongodburi;

    
    @Produces
    @ApplicationScoped
    public MongoClient mongoClient() {

            MongoClient mongoClient = MongoClients.create(mongodburi);
            System.out.println("@Produces :{Connected successfully to server.}");
        return mongoClient;

    }

    public void close(@Disposes final MongoClient mongoClient) {
        System.out.println("[@Disposes] .....");
        mongoClient.close();
    }

}
