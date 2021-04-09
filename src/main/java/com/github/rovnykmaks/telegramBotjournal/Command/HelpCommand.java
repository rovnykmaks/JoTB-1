package com.github.rovnykmaks.telegramBotjournal.Command;

import com.github.rovnykmaks.telegramBotjournal.Service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.rovnykmaks.telegramBotjournal.Command.CommandName.*;

public class HelpCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("<b>Доступные команды</b>\n\n"
                    + "%s - начать работу со мной\n"
                    + "%s - приостоновить работу со мной\n"
                    + "%s - получить помощь в работе со мной",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.SendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
