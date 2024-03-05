package br.com.bytebuilder.bubblebuddy.domain.entity

import com.google.firebase.database.PropertyName
import java.util.*

class ConversationEntity (
    @get:PropertyName("id_conversation") @set:PropertyName("id_conversation") var idConversation: String? = null,
    @get:PropertyName("participants") @set:PropertyName("participants") var participants: List<String>? = null,
    @get:PropertyName("lastMessage") @set:PropertyName("lastMessage") var lastMessage: String? = null
) {

    fun getIdConversation() = idConversation
    fun getParticipants() = participants
    fun getLastMessage() = lastMessage

}