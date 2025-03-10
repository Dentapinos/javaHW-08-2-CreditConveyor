package org.example;

public enum Country {

    RUSSIAN_FEDERATION("Российская Федерация", "RUR"),
    UNITED_STATES_OF_AMERICA("Соединенные Штаты Америки", "USD"),
    UNITED_KINGDOM("Соединенное Королевство", "GBP"),
    PEOPLE_S_REPUBLIC_OF_CHINA("Китайская Народная Республика", "CNY"),
    JAPAN("Япония", "JPY"),
    FEDERAL_REPUBLIC_OF_GERMANY("Федеративная Республика Германия", "EUR"),
    FRANCE("Франция", "EUR"),
    ITALY("Италия", "EUR"),
    CANADA("Канада", "CAD"),
    AUSTRALIA("Австралия", "AUD"),
    BRAZIL("Бразилия", "BRL"),
    INDIA("Индия", "INR"),
    SOUTH_KOREA("Республика Корея", "KRW"),
    MEXICO("Мексика", "MXN"),
    INDONESIA("Индонезия", "IDR"),
    SAUDI_ARABIA("Саудовская Аравия", "SAR"),
    TURKEY("Турция", "TRY"),
    SWITZERLAND("Швейцария", "CHF"),
    NETHERLANDS("Нидерланды", "EUR"),
    SPAIN("Испания", "EUR"),
    ARGENTINA("Аргентина", "ARS"),
    SOUTH_AFRICA("Южно-Африканская Республика", "ZAR"),
    OTHER("Другая страна", "NULL"); // Added South Africa

    private final String fullName;
    private final String currencyCode;

    Country(String fullName, String currencyCode) {
        this.fullName = fullName;
        this.currencyCode = currencyCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @Override
    public String toString() {
        return fullName + " (" + currencyCode + ")";
    }
}
