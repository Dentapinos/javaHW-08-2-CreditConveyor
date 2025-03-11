package org.example;

import com.sun.jdi.event.ExceptionEvent;

public class CheckingExperienceOfWork extends AbstractHandler{

    /**
     * Проверка стажа работы и целевой банк начисления зарплаты
     * Если зарплата начисляется в банк в который идет обращение на займ (Сбербанк), то стаж с последнего места роботы должен быть
     * не менее 2 месяцев, а общий стаж не менее года.
     * Если зарплата начисляется в любой другой банк, то стаж с последнего места работы должен быть более 6 месяцев, а общий стаж
     * более 13 месяцев
     */

    @Override
    public void handle(Order order) throws HandlerException {
        System.out.println("Проверка стажа работы");

        if (order.getBindingSalaryToTheBank() == Bank.SBER_BANK){
            if (order.getTotalWorkExperience() >= 12 && order.getWorkExperienceInLastPlace() >= 2){
                handler.handle(order);
            } else {
                throw new HandlerException("Недостаточный стаж работы");
            }
        } else {
            if (order.getTotalWorkExperience() > 13 && order.getWorkExperienceInLastPlace() >= 6){
                order.setCreditRatingAmendment();
                handler.handle(order);
            } else  {
                System.out.println("Недостаточный стаж работы");
            }
        }
    }
}



