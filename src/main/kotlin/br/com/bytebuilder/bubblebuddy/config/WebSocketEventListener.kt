package br.com.bytebuilder.bubblebuddy.config

import br.com.bytebuilder.bubblebuddy.api.v1.chat.ChatMessage
import br.com.bytebuilder.bubblebuddy.api.v1.chat.MessageType
import org.springframework.messaging.simp.SimpMessageSendingOperations
import org.springframework.messaging.simp.stomp.StompHeaderAccessor
import org.springframework.stereotype.Component
import org.springframework.web.socket.messaging.SessionDisconnectEvent


@Component
class WebSocketEventListener {

    var messagingTemplate: SimpMessageSendingOperations? = null

    fun handleWebSocketDisconnectListener(event: SessionDisconnectEvent) {
        var headerAccessor = StompHeaderAccessor.wrap(event.getMessage())
        var username = headerAccessor.getSessionAttributes()?.get("username") as String

        if (username != null) {
            var chatMessage = ChatMessage(
                username,
                "$username has left the chat",
                MessageType.LEAVE
            )
            messagingTemplate?.convertAndSend("/topic/public", chatMessage)
        }

    }
}