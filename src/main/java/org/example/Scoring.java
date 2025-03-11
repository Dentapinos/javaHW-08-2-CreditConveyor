package org.example;

import org.example.exception.HandlerException;

import java.util.Random;

public class Scoring extends AbstractHandler{
    private static final Random random = new Random();

    /**
     * Автоматизированная проверка по сети интернет, сравнение переданных данных и сопоставление с примером положительного клиента
     * Условно генерируется бал от 0-2, Если 0 то Нейтральный человек к рейтингу недоверия добавляем 1, если 1, то к рейтингу недоверия добавляем 2
     * если 2 то это доверенный человек рейтинг недоверия остается на прежнем уровне
     */

    @Override
    public void handle(Order order) throws HandlerException {
        System.out.println("Скоринговый алгоритм");
        int grope = random.nextInt(3);
        if (grope == 0) {
            order.setCreditRatingAmendment();
        } else if (grope == 1) {
            order.setCreditRatingAmendment();
            order.setCreditRatingAmendment();
        }
        handler.handle(order);
    }
}
