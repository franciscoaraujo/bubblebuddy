package br.com.bytebuilder.bubblebuddy.api.v1.chat

class ChatMessage {
    private var sender: String? = null
    private var message: String? = null
    private var type: MessageType? = null

    constructor(sender: String?, message: String?, type: MessageType?) {
        this.sender = sender
        this.message = message
        this.type = type
    }

    //setter

    fun setSender(sender: String?) {
        this.sender = sender
    }

    fun setMessage(message: String?) {
        this.message = message
    }

    fun setType(type: MessageType?) {
        this.type = type
    }

    fun getSender(): String? {
        return sender
    }

    fun getMessage(): String? {
        return message
    }

    fun getType(): MessageType? {
        return type
    }
}