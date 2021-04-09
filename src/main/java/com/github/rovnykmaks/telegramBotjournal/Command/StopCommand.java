package com.github.rovnykmaks.telegramBotjournal.Command;

import com.github.rovnykmaks.telegramBotjournal.Service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String STOP_MESSAGE = "Stop";

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.SendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
