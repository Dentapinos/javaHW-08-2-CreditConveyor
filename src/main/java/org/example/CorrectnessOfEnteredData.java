package org.example;

public class CorrectnessOfEnteredData extends AbstractHandler {

    /**
     * Простая проверка ввода данных. Имя, Фамилия и Отчество должны бить заполнены и длинна должна быть более 2 символов
     * В графе стаж работы должно быть число превышающее 1 месяц
     */

    @Override
    public void handle(Order order) {
        System.out.println("Проверка правильности заполнения анкеты");
        StringBuilder notCorrectData = new StringBuilder();

        if (order.firstName == null || order.firstName.length() < 2){
            notCorrectData.append("имя: ").append(order.firstName).append(",");
        }

        if (order.secondName == null || order.secondName.length() < 2){
            notCorrectData.append("фамилия: ").append(order.secondName).append(",");
        }

        if (order.surname == null || order.surname.length() < 2){
            notCorrectData.append("отчество: ").append(order.firstName).append(",");
        }

        if (order.surname == null || order.surname.length() < 2){
            notCorrectData.append("отчество: ").append(order.firstName).append(",");
        }

        if (order.getTotalWorkExperience() < 1 || order.getWorkExperienceInLastPlace() < 1){
            notCorrectData.append("стаж работы не может быть меньше 1 : ").append(order.firstName).append(",");
        }

        if (notCorrectData.isEmpty()){
            handler.handle(order);
        } else {
            System.out.println("ОТКАЗАНО!");
            System.out.println("Не корректные данные: " + notCorrectData);
        }
    }
}
