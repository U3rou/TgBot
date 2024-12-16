package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args ) throws TelegramApiException {

    String token = "";
    Bot bot = new Bot(token);

    TelegramBotsApi telegramBotsApi  = new TelegramBotsApi(DefaultBotSession.class);
    telegramBotsApi.registerBot(bot);




    }
}
