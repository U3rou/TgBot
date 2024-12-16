package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Locale;

public class Bot extends TelegramLongPollingBot {

    public Bot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {

        String message = update.getMessage().getText();
        String nameUser = update.getMessage().getFrom().getUserName();

        System.out.println("name: " + nameUser);
        System.out.println("message: " + message);
        System.out.println("-------------------------");



        String response;
        if (message.equalsIgnoreCase("привет")){
            response = "пока";
        }else if(message.equalsIgnoreCase("пока")) {
            response = "привет";
        }else if(message.equalsIgnoreCase("Майнкрафт")) {
            response = "Minecraft — это песочница с элементами выживания и жанра RPG, в которой игроки исследуют и осваивают процедурно сгенерированные миры, собранные из кубических блоков.Minecraft — это песочница с элементами выживания и жанра RPG, в которой игроки исследуют и осваивают процедурно сгенерированные миры, собранные из кубических блоков.";
        }else if(message.equalsIgnoreCase("Дота")) {
            response = "Dota 2 — многопользовательская командная компьютерная игра в жанре MOBA, разработанная и изданная корпорацией Valve. Игра является продолжением DotA — пользовательской карты-модификации для игры Warcraft III: Reign of Chaos и дополнения к ней Warcraft III: The Frozen Throne. ";
        }else if(message.equalsIgnoreCase("ксго")) {
            response = "Counter-Strike: Global Offensive (сокр. CS) — многопользовательская компьютерная игра в жанре шутера от первого лица. Разработана компаниями Valve и Hidden Path Entertainment.";
        }else if(message.equalsIgnoreCase("Сталкер 2")) {
            response = "«S.T.A.L.K.E.R. 2: Сердце Чернобыля» — компьютерная игра в жанре шутера от первого лица с открытым миром, разработанная и изданная украинской компанией GSC Game World 20 ноября 2024 года. ";
        }else if(message.equalsIgnoreCase("лига легенд")) {
            response = "League of Legends (в переводе с англ. — «Лига легенд») — многопользовательская компьютерная игра в которую играют люди с отклонением в развитии";
        }else {
            response = message.toUpperCase();
        }

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        sendMessage.setText(response);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getBotUsername() {
        return "U3rou_bot";
    }


}
