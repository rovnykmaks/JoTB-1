package com.github.rovnykmaks.telegramBotjournal.Command;

import com.github.rovnykmaks.telegramBotjournal.Service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Hello";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.SendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
