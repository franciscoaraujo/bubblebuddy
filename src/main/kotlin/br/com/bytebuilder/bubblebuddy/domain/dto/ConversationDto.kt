package br.com.bytebuilder.bubblebuddy.domain.dto

import br.com.bytebuilder.bubblebuddy.domain.entity.ConversationEntity
import com.google.firebase.database.PropertyName
import java.util.*

class ConversationDto(
    private var idConversation: String? = null,
    private var participants: List<String>? = null,
    private var lastMessage: String? = null
) {
    companion object ObjectMapper {
        fun toEntity(conversationDto: ConversationDto): ConversationEntity {
            return ConversationEntity(
                conversationDto.idConversation,
                conversationDto.participants,
                conversationDto.lastMessage
            )
        }

        fun toDto(conversationEntity: ConversationEntity): ConversationDto {
            return ConversationDto(
                conversationEntity.getIdConversation(),
                conversationEntity.getParticipants(),
                conversationEntity.getLastMessage()
            )
        }
    }

    fun getIdConversation() = idConversation
    fun getParticipants() = participants
    fun getLastMessage() = lastMessage

}