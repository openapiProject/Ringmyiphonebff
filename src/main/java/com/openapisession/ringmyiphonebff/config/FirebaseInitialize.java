package com.openapisession.ringmyiphonebff.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class FirebaseInitialize {


    @PostConstruct
    public void initialize() {
        try {
            FileInputStream serviceAccount =
                    new FileInputStream("/Users/nickchang/Desktop/ringmyiphone-bff/properties/s1.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://loginauth244.firebaseio.com")
                    .build();

            FirebaseApp defaultApp = FirebaseApp.initializeApp(options);
            System.out.println("!@#!@#!@#@!#!@#   "+ defaultApp.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}