package org.example;

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
    public void handle(Order order) {
        System.out.println("Проверка в базе истории кредитования граждан");
        if (generalCreditBasis.isClientConscientious(order)) {
            handler.handle(order);
        } else {
            System.out.println("Вы находитесь в черном списке кредиторов!");
        }
    }
}
