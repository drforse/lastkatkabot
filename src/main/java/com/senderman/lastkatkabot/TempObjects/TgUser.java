package com.senderman.lastkatkabot.TempObjects;

public class TgUser {

    private int id;
    private String name;

    public TgUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        name = name.replace("<", "&lt;").replace(">", "&gt;");
        return String.format("<a href=\"tg://user?id=%1$d\">%2$s</a>", id, name);
    }
}