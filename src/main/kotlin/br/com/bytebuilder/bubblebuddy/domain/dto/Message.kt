package br.com.bytebuilder.bubblebuddy.domain.dto


class Message(

    private var idMessage: String? = null,
    private var idSender: String? = null,
    private var idRecieived: String? = null,
    private var timestamp: String? = null,
) {

    fun setIdMessage(idMessage: String) = apply { this.idMessage = idMessage }
    fun setIdSender(idSender: String) = apply { this.idSender = idSender }
    fun setIdRecieived(idRecieived: String) = apply { this.idRecieived = idRecieived }

    fun setTimestamp(timestamp: String?) = apply { this.timestamp = timestamp }
    fun getIdMessage() = idMessage
    fun getIdSender() = idSender
    fun getIdRecieived() = idRecieived
    fun getTimestamp() = timestamp
}