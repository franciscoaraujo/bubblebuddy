package br.com.bytebuilder.bubblebuddy.api.v1.chat

import org.apache.logging.log4j.message.SimpleMessage
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.stereotype.Controller

@Controller
class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    fun sendMessage(
        @Payload chatMessage: ChatMessage
    ): ChatMessage {
        return chatMessage
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    fun addUser(
        @Payload chatMessage: ChatMessage,
        headerAccessor: SimpMessageHeaderAccessor
    ): ChatMessage {
        headerAccessor.getSessionAttributes()?.put("username", chatMessage.getSender());
        return chatMessage
    }

}