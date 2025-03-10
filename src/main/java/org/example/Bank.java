package org.example;

public enum Bank {
    SBER_BANK("Сбербанк"),
    ALPHA("Альфа-банк"),
    VTB("ВТБ"),
    T_BANK("Т-Банк"),
    OTHER_BANK("другой банк");
    private final String name;
    Bank(final String name) {
        this.name = name;
    }

}
