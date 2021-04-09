package com.github.rovnykmaks.telegramBotjournal.Command;

import com.github.rovnykmaks.telegramBotjournal.Service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String UNKNOWN_COMMAND = "Не понимаю вас \uD83D\uDE1F, " +
            "напишите /help чтобы узнать что я понимаю.";

    public UnknownCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.SendMessage(update.getMessage().getChatId().toString(), UNKNOWN_COMMAND);
    }
}
