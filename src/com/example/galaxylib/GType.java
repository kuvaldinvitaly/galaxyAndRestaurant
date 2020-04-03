package com.example.galaxylib;

public class GType {
    /**
     * Определяем тип галлактики по коду (первая буква типа)
     *
     * @param charType код типа - кириллические символы С, Э, Н либо Л
     * @throws RuntimeException если неправильно указан код
     */
    public GType(String charType) {
        switch (charType) {
            case "С":
                type = "Спиральная";
                break;
            case "Э":
                type = "Эллиптическая";
                break;
            case "Н":
                type = "Неправильная";
                break;
            case "Л":
                type = "Линзовидная";
                break;
            default:
                throw new RuntimeException("Неизвестный тип галактики!");
        }
    }


    @Override
    public String toString() {
        return "тип: " + type;
    }

    public final String type;
}
