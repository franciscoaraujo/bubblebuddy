package br.com.bytebuilder.bubblebuddy.domain.entity

import com.google.firebase.database.PropertyName

class MessageEntity(
    @get:PropertyName("id_message") @set:PropertyName("id_message") var idMessage: String? = null,
    @get:PropertyName("id_sender") @set:PropertyName("id_sender") var idSender: String? = null,
    @get:PropertyName("id_receiver") @set:PropertyName("id_receiver") var idReciver: String? = null,
    @get:PropertyName("timestamp") @set:PropertyName("timestamp") var timestamp: String? = null,
) {

    fun setTimestamp(timestamp: String?) = apply { this.timestamp = timestamp }
    fun getIdMessage() = idMessage
    fun getIdSender() = idSender
    fun getIdReciver() = idReciver
    fun getTimestamp() = timestamp
}