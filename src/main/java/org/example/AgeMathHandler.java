package org.example;

public class AgeMathHandler extends AbstractHandler{

    /**
     * Проверка возраста клиента. Кредит выдается только в возрасте от 18 до 80 лет включительно.
     * В возрасте до 21 года включительно максимальная сумма займа составляет до 50_000руб.
     * В Возрасте от 75 и выше максимальная сумма займа составляет до 300_000руб
     * Максимально возможная сумма займа не более 5млн.
     */
    @Override
    public void handle(Order order) {
        if (order.getAge() > 18 || order.getAge() < 80 ) {
            if (order.getAge() < 21 && order.getDesiredLoanAmount() > 50_000.0) {
                System.out.println("Отказано! В возрасте до 21 года максимальная сумма кредита 50_000 руб.");
            } else if (order.getAge() > 75 && order.getDesiredLoanAmount() > 300_000.0) {
                System.out.println("Отказано! В возрасте свыше 75 лет максимальная сумма кредита 300_000 руб.");
            } else if (order.getDesiredLoanAmount() > 5_000_000.0) {
                System.out.println("Отказано! Сумма свыше 5_000_000 руб. не кредитуется");
            } else {
                handler.handle(order);
            }
        } else {
            System.out.println("Отказано! Кредитование осуществляется в возрасте от 18 до 80");
        }
    }
}


