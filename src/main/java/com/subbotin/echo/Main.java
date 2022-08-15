package com.subbotin.echo;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        /*
        Регистрация бота:
        - создаем обьект класса TelegramBotsApi, который позволяет прописывать различные параметры для ботов;
        - создаем экземпляр нашего бота;
        - регистрируем бот.
        */

        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        EchoBot echoBot = new EchoBot();
        telegramBotsApi.registerBot(echoBot);
    }
}