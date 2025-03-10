package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneralCreditBasis {
    List<ArrayList<String>> clients;
    private static final String RUSSIAN_LETTERS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final Random random = new Random();

    public GeneralCreditBasis() {
        this.clients = new ArrayList<>();
        generateClients();
    }

    boolean isClientConscientious(Order order){
        for (ArrayList<String> client : clients) {
            if (order.getFirstName().toUpperCase().startsWith(client.get(0)) &&
                    order.getSurname().toUpperCase().startsWith(client.get(1)) &&
                    order.getSecondName().toUpperCase().startsWith(client.get(2))){
                return false;
            }
        }
        return true;
    }

    private void generateClients(){
        ArrayList<String> client = new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 3; i++) {
                client.add(generateTwoLetters());
            }
            clients.add(client);
        }
    }

    private static String generateTwoLetters() {
        StringBuilder sb = new StringBuilder(2);
        sb.append(RUSSIAN_LETTERS.charAt(random.nextInt(RUSSIAN_LETTERS.length())));
        sb.append(RUSSIAN_LETTERS.charAt(random.nextInt(RUSSIAN_LETTERS.length())));
        return sb.toString();
    }

}
