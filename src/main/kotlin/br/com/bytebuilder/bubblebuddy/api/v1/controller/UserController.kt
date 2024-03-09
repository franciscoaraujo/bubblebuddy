package br.com.bytebuilder.bubblebuddy.api.v1.controller

import br.com.bytebuilder.bubblebuddy.domain.dto.User
import br.com.bytebuilder.bubblebuddy.domain.repository.UserRepository
import br.com.bytebuilder.bubblebuddy.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class UserController(private val service: UserService) {

    @PostMapping("users")
    fun createUser(@RequestBody user: User) {
        service.createUser(user);
    }

    @PostMapping("users/login")
    fun loginUser(@RequestBody user: User) {
        //
    }
}