package br.com.bytebuilder.bubblebuddy

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.FileInputStream

@SpringBootApplication
class BubblebuddyApplication

fun main(args: Array<String>) {
	firebaseInit()
	runApplication<BubblebuddyApplication>(*args)
}

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