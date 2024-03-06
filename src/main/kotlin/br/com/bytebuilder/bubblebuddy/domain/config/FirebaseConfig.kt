/*
package br.com.bytebuilder.bubblebuddy.domain.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import jakarta.annotation.PostConstruct
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import java.io.FileInputStream
import java.io.IOException



@Configuration
class FirebaseConfig {

    @Lazy(true)
    @Bean
    fun firebaseInit() : FirebaseApp{
        val refreshToken = FileInputStream("service-account-file.json")

        val options = FirebaseOptions.builder()
            .setCredentials(GoogleCredentials.fromStream(refreshToken))
            .setDatabaseUrl("https://bubblebuddy-871a5.firebaseio.com")
            .build()

        return if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options)
        } else {
            FirebaseApp.getInstance()
        }
    }
}*/
