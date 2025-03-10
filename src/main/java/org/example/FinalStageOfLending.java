package org.example;

public class FinalStageOfLending extends AbstractHandler{

    /**
     * Финальный этап. Расчет процентной ставки по кредиту. На этом этапе кредит точно одобрен.
     */

    @Override
    public void handle(Order order) {
        System.out.println("Процесс одобрения кредита...");
        double finalCreditRate = calculationOfRateOnBasisAmountAndTerm(order);
        finalCreditRate = correctionOfKeyRateOnInternalRanking(finalCreditRate, order.getCreditRatingAmendment());

        System.out.println("Кредит одобрен на сумму " + order.getDesiredLoanAmount() + " руб. под " + finalCreditRate + "% годовых");
    }

    private double calculationOfRateOnBasisAmountAndTerm(Order order){
        double finalCreditRate = 11.00;

        if (order.getLoanTermInMonths() < 12){
            if (order.getDesiredLoanAmount() < 100_000){
                finalCreditRate = 11.0;
            } else {
                finalCreditRate = 11.5;

            }
        } else if (order.getLoanTermInMonths() < 24){
            if (order.getDesiredLoanAmount() < 100_000){
                finalCreditRate = 12.0;

            } else if (order.getDesiredLoanAmount() < 1000_000){
                finalCreditRate = 12.5;

            } else {
                finalCreditRate = 12.7;

            }
        } else if (order.getLoanTermInMonths() < 56){
            if (order.getDesiredLoanAmount() < 1000_000){
                finalCreditRate = 12.5;

            } else {
                finalCreditRate = 13.7;
            }
        }

        System.out.println("Базовая ставка " + finalCreditRate + "%");

        return finalCreditRate;
    }

    double correctionOfKeyRateOnInternalRanking(double creditRate, int rating){
        if (rating == 0){
            return creditRate - 1.0;
        } else if (rating > 0 && rating <= 2){
            return creditRate - 0.7;
        } else {
            return creditRate + 1.3;
        }
    }
}
