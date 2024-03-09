package br.com.bytebuilder.bubblebuddy.domain.dto


class User(
    private var idUser: String,
    private var userName: String? = null,
    private var email: String? = null,
    private var profilePicture: String? = null
) {


    fun setIdUser(idUser: String) = apply { this.idUser = idUser }
    fun setUserName(userName: String) = apply { this.userName = userName }
    fun setEmail(email: String) = apply { this.email = email }
    fun setProfilePicture(profilePicture: String) = apply { this.profilePicture = profilePicture }
    fun getIdUser() = idUser
    fun getUserName() = userName
    fun getEmail() = email
    fun getProfilePicture() = profilePicture
}