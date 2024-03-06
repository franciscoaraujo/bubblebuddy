package br.com.bytebuilder.bubblebuddy.service

import br.com.bytebuilder.bubblebuddy.domain.dto.User
import br.com.bytebuilder.bubblebuddy.domain.repository.FirestoreUserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val repository: FirestoreUserRepository) {


    fun createUser(user: User) {
        repository.createUser(user)
    }

    fun getUserById(userId: String): User? {
        return repository.getUserById(userId)
    }
}