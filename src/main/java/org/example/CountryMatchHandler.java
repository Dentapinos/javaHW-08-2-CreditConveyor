package org.example;

import java.util.Objects;

public class CountryMatchHandler extends AbstractHandler {

    /**
     * Проверка гражданства
     * Если заемщик гражданин России то все отлично
     * Если заемщик имеет гражданство Турции или Китая это неплохо, но ухудшает итоговый процент
     * В любых других случаях гражданства в кредите будет отказано!
     */

    @Override
    public void handle(Order order) throws HandlerException {
        System.out.println("Проверка гражданства");
        if (Objects.equals(order.getNationality().getCurrencyCode(), Country.RUSSIAN_FEDERATION.getCurrencyCode())) {
            handler.handle(order);
        } else {
            if (Objects.equals(order.getNationality().getCurrencyCode(), Country.TURKEY.getCurrencyCode()) || Objects.equals(order.getNationality().getCurrencyCode(), Country.PEOPLE_S_REPUBLIC_OF_CHINA.getCurrencyCode())) {
                order.setCreditRatingAmendment();
                handler.handle(order);
            } else {
                throw new HandlerException("Ваша страна не " + Country.RUSSIAN_FEDERATION.getFullName() + " резидентам других стран кредит не выдаем!!!");
            }
        }
    }
}
