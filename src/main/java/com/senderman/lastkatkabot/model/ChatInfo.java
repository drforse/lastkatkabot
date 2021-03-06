package com.senderman.lastkatkabot.model;

import org.jetbrains.annotations.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

import java.util.List;

@TypeAlias("chatinfo")
public class ChatInfo {

    @Id
    private long chatId;
    @Nullable
    private List<String> lastPairs;
    @Nullable
    private Integer lastPairDate;

    public ChatInfo() {

    }

    public ChatInfo(long chatId) {
        this.chatId = chatId;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public @Nullable List<String> getLastPairs() {
        return lastPairs;
    }

    public void setLastPairs(@Nullable List<String> lastPairs) {
        this.lastPairs = lastPairs;
    }

    public @Nullable Integer getLastPairDate() {
        return lastPairDate;
    }

    public void setLastPairDate(@Nullable Integer lastPairDate) {
        this.lastPairDate = lastPairDate;
    }
}
