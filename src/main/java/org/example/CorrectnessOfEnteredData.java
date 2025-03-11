package org.example;

public class CorrectnessOfEnteredData extends AbstractHandler {

    /**
     * Простая проверка ввода данных. Имя, Фамилия и Отчество должны бить заполнены и длинна должна быть более 2 символов
     * В графе стаж работы должно быть число превышающее 1 месяц
     */

    @Override
    public void handle(Order order) throws HandlerException {
        System.out.println("Проверка правильности заполнения анкеты");
        StringBuilder notCorrectData = new StringBuilder();

        if (order.getFirstName() == null || order.getFirstName().length() < 2){
            notCorrectData.append("имя: ").append(order.getFirstName()).append(",");
        }

        if (order.getSecondName() == null || order.getSecondName().length() < 2){
            notCorrectData.append("фамилия: ").append(order.getSecondName()).append(",");
        }

        if (order.getSurname() == null || order.getSurname().length() < 2){
            notCorrectData.append("отчество: ").append(order.getSurname()).append(",");
        }

        if (order.getTotalWorkExperience() < 1 || order.getWorkExperienceInLastPlace() < 1){
            notCorrectData.append("стаж работы не может быть меньше 1 : ").append(order.getFirstName()).append(",");
        }

        if (notCorrectData.isEmpty()){
            handler.handle(order);
        } else {
            throw new HandlerException("ОТКАЗАНО!\nНе корректные данные: " + notCorrectData);
        }
    }
}
