package br.com.bytebuilder.bubblebuddy.domain.dto


class Conversation(
    private var idConversation: String? = null,
    private var participants: List<String>? = null,
    private var lastMessage: String? = null
) {

    fun setIdConversation(idConversation: String) = apply { this.idConversation = idConversation }
    fun setParticipants(participants: List<String>) = apply { this.participants = participants }
    fun setLastMessage(lastMessage: String) = apply { this.lastMessage = lastMessage }

    fun getIdConversation() = idConversation
    fun getParticipants() = participants
    fun getLastMessage() = lastMessage

}