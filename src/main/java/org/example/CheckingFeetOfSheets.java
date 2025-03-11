package org.example;

import org.example.exception.FeetOfSheetsException;
import org.example.exception.HandlerException;

public class CheckingFeetOfSheets  extends AbstractHandler{
    GeneralCreditBasis generalCreditBasis;

    public CheckingFeetOfSheets() {
        this.generalCreditBasis = new GeneralCreditBasis();
    }

    /**
     * Проверка в базе кредитования всех граждан. Проверяет в базе есть ли заемщик в списках ранее кредитованых лиц.
     * Если есть, то является ли он добросовестным заемщиком.
     */

    @Override
    public void handle(Order order) throws HandlerException {
        System.out.println("Проверка в базе истории кредитования граждан");
        if (generalCreditBasis.isClientConscientious(order)) {
            handler.handle(order);
        } else {
            throw new FeetOfSheetsException("Вы находитесь в черном списке кредиторов!", this);
        }
    }
}
