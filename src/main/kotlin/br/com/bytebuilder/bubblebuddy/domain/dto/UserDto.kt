package br.com.bytebuilder.bubblebuddy.domain.dto

import br.com.bytebuilder.bubblebuddy.domain.entity.UserEntity
import java.util.UUID

class UserDto(
    private var idUser: String? = null,
    private var userName: String? = null,
    private var email: String? = null,
    private var profilePicture: String? = null
) {

    //Companion object funciona como um acesso static que pertence a classe e nao a instancia da classe
    companion object ObjeManager {
        fun toEntity(userDto: UserDto): UserEntity {
            return UserEntity(
                userDto.idUser,
                userDto.userName,
                userDto.email,
                userDto.profilePicture
            )
        }

        fun toDto(userEntity: UserEntity): UserDto {
            return UserDto(
                userEntity.getIdUser(),
                userEntity.getUserName(),
                userEntity.getEmail(),
                userEntity.getProfilePicture()
            )
        }
    }

    fun getIdUser() = idUser
    fun getUserName() = userName
    fun getEmail() = email
    fun getProfilePicture() = profilePicture
}