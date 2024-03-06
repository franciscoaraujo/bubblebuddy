package br.com.bytebuilder.bubblebuddy.domain.repository


import br.com.bytebuilder.bubblebuddy.domain.dto.User
import com.google.cloud.firestore.Firestore
import com.google.firebase.cloud.FirestoreClient
import org.springframework.stereotype.Repository


interface UserRepository {

    fun createUser(user: User)
    fun getUserById(userId: String): User?

}