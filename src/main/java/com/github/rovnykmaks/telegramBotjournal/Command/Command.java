package com.github.rovnykmaks.telegramBotjournal.Command;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {
    void execute(Update update);
}
