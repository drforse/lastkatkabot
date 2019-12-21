package com.senderman.lastkatkabot.usercommands

import com.senderman.CommandExecutor
import com.senderman.lastkatkabot.LastkatkaBotHandler
import org.telegram.telegrambots.meta.api.objects.Message

class ShortInfo constructor(val handler: LastkatkaBotHandler) : CommandExecutor {
    override val command: String
        get() = "/shortinfo"
    override val desc: String
        get() = "краткая инфа о сообщении. Поддерживается реплай"

    override fun execute(message: Message) {
        val chatId = message.chatId
        val userId = message.from.id
        var info = """
            ==== Информация ====
            
            💬 ID чата: <code>$chatId</code>
            🙍‍♂️ Ваш ID: <code>$userId</code>
        """.trimIndent()
        message.replyToMessage?.let { reply ->
            val replyMessageId = reply.messageId
            val replyUserId = reply.from.id
            info += """
                
                ✉️ ID reply: <code>$replyMessageId</code>
                🙍‍♂ ID юзера из reply: <code>$replyUserId</code>
            """.trimIndent()

            if (reply.chat.isChannelChat) {
                info += "\n\uD83D\uDCE2 ID канала: <code>${reply.chatId}</code>"
            }
        }

        handler.sendMessage(chatId, info)
    }
}