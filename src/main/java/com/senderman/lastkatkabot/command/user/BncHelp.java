package com.senderman.lastkatkabot.command.user;

import com.annimon.tgbotsmodule.commands.context.MessageContext;
import com.senderman.lastkatkabot.command.CommandExecutor;
import com.senderman.lastkatkabot.config.BotConfig;
import org.springframework.stereotype.Component;

@Component
public class BncHelp implements CommandExecutor {

    private final BotConfig config;

    public BncHelp(BotConfig config) {
        this.config = config;
    }

    @Override
    public String command() {
        return "/bnchelp";
    }

    @Override
    public String getDescription() {
        return "помощь по игре Быки и Коровы";
    }

    @Override
    public void accept(MessageContext ctx) {
        ctx.replyWithPhoto()
                .setFile(config.bncHelpPictureId())
                .callAsync(ctx.sender);
    }
}
