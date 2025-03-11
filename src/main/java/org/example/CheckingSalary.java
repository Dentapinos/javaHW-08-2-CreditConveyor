package org.example;

public class CheckingSalary extends AbstractHandler{

    /**
     * Проверка кредитуемого лица на платежеспособность.
     * Если банк получения заработной платы (сбербанк), то дополнительная нагрузка на зарплату должна быть 13_000 сверх ежемесячного платежа.
     * Если банк получения зп иной, то дополнительная нагрузка на зарплату должна быть 16_000 сверх ежемесячного платежа.
     * Если при расчете ежемесячного платежа, он будет незначительно превышать сумму зп, то будет рассчитана новая рекомендуемая сумма кредита на тот же срок
     *
     */

    @Override
    public void handle(Order order) throws HandlerException {
        System.out.println("Проверка заработной платы");

        if (order.getBindingSalaryToTheBank().equals(Bank.SBER_BANK)){
            double requiredAmountOfSalaryPerMonth = (order.getDesiredLoanAmount() / order.getLoanTermInMonths()) + 13_000;
            if (requiredAmountOfSalaryPerMonth > order.getSalary()){
                int recommendedLoanAmount = (order.getSalary() - 13_000) * order.getLoanTermInMonths();
                if (recommendedLoanAmount > 0){
                    recommendedLoanAmount *= order.getLoanTermInMonths();
                    throw new HandlerException("Отказано! Рекомендуем сумму кредитования " + recommendedLoanAmount + "руб. сроком на " + order.getLoanTermInMonths() + " мес.");
                } else {
                    throw new HandlerException("Отказано! Недостаточная сумма зарплаты!");
                }
            } else {
                handler.handle(order);
            }
        } else {
            double requiredAmountOfSalaryPerMonth = (order.getDesiredLoanAmount() / order.getLoanTermInMonths()) + 16_000;
            if (requiredAmountOfSalaryPerMonth > order.getSalary()){
                int recommendedLoanAmount = order.getSalary() - 16_000;
                if (recommendedLoanAmount > 0){
                    recommendedLoanAmount *= order.getLoanTermInMonths();
                    throw new HandlerException("Отказано! Рекомендуем сумму кредитования " + recommendedLoanAmount + "руб. сроком на " + order.getLoanTermInMonths() + " мес.");
                } else {
                    throw new HandlerException("Отказано! Недостаточная сумма зарплаты!");
                }

            } else {
                order.setCreditRatingAmendment();
                handler.handle(order);
            }
        }
    }
}
