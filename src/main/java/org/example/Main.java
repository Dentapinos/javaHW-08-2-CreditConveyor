package org.example;

public class Main {
    public static void main(String[] args) {

        /**
         * Создаем проверяющие классы
         */
        CorrectnessOfEnteredData correctnessOfEnteredData = new CorrectnessOfEnteredData();
        CountryMatchHandler countryMatchHandler = new CountryMatchHandler();
        Scoring scoring = new Scoring();
        CheckingSalary checkingSalary = new CheckingSalary();
        AgeMathHandler ageMathHandler = new AgeMathHandler();
        CheckingExperienceOfWork checkingExperienceOfWork = new CheckingExperienceOfWork();
        CheckingFeetOfSheets checkingFeetOfSheets = new CheckingFeetOfSheets();
        FinalStageOfLending finalStageOfLending = new FinalStageOfLending();

        /**
         * Указываем последовательность проверки заявки
         */

        correctnessOfEnteredData.setNextHandler(countryMatchHandler);
        countryMatchHandler.setNextHandler(scoring);
        scoring.setNextHandler(checkingSalary);
        checkingSalary.setNextHandler(ageMathHandler);
        ageMathHandler.setNextHandler(checkingExperienceOfWork);
        checkingExperienceOfWork.setNextHandler(checkingFeetOfSheets);
        checkingFeetOfSheets.setNextHandler(finalStageOfLending);

        /**
         * Создаем заявку
         * Для тестирования:
         * ИФО - сделать пустыми (firstName, secondName, surname)
         * Установить возраст до 18, 18-21, 75+ (age)
         * Изменить гражданство (country)
         * Изменить Банк получения заработной платы (bank)
         * Изменить желаемую сумму кредита (desiredLoanAmount)
         * Изменить срок кредитования (loanTermlnMonths)
         * Изменить стаж на текущем месте работы (workExperienceInLastPlace)
         * Изменить общий стаж (totalWorkExperience)
         */

        Order order = new Order("Пупкин",
                "Артем",
                "Сидорович",
                22,
                Country.RUSSIAN_FEDERATION,
                Bank.T_BANK,
                6,
                14,
                100_000,
                8,
                30_000);

        /**
         * Отправляем заявку на проверку и ожидаем результатов
         */

        correctnessOfEnteredData.handle(order);
    }
}





