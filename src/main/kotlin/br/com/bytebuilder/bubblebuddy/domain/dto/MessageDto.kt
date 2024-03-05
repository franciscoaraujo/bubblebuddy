package br.com.bytebuilder.bubblebuddy.domain.dto

import br.com.bytebuilder.bubblebuddy.domain.entity.MessageEntity
import com.google.firebase.database.PropertyName
import java.util.UUID

class MessageDto(

    private var idMessage: String? = null,
    private var idSender: String? = null,
    private var idRecieived: String? = null,
    private var timestamp: String? = null,
) {
    companion object ObjeManager {


        fun toEntity(messageDto: MessageDto): MessageEntity {
            return MessageEntity(
                messageDto.idMessage,
                messageDto.idSender,
                messageDto.idRecieived,
                messageDto.timestamp
            )
        }

        fun toDto(messageEntity: MessageEntity): MessageDto {
            return MessageDto(
                messageEntity.getIdMessage(),
                messageEntity.getIdSender(),
                messageEntity.getIdReciver(),
                messageEntity.getTimestamp()
            )
        }


    }

    fun setTimestamp(timestamp: String?) = apply { this.timestamp = timestamp }
    fun getIdMessage() = idMessage
    fun getIdSender() = idSender
    fun getIdRecieived() = idRecieived
    fun getTimestamp() = timestamp
}