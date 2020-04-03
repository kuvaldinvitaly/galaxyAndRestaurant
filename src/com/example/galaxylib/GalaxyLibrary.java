package com.example.galaxylib;

import java.util.ArrayList;
import java.util.List;

/**
 * БИБЛИОТЕКА ГАЛЛАКТИК
 * Программа предназначена для изучения процесса дебага
 * все ошибки внесены преднамеренно, все совпадения с реальными программами случайны.
 *
 * Цели программы: отформатированный вывод списка галлактик с расстоянием в световых годах либо в километрах
 */
public class GalaxyLibrary {
    /**
     * Здесь добавляются галлактики в библиотеку
     */
    private static final List<Galaxy> galaxies = new ArrayList<Galaxy>() {
        {
            add(new Galaxy("Вертушка", 25, new GType("С")));
            add(new Galaxy("Колесо телеги", 100, new GType("Л")));
            add(new Galaxy("Малое Магелланово Облако", 160, new GType("Н")));
            add(new Galaxy("Головастик", 500, new GType("С")));
            add(new Galaxy("Андромеды", 3, new GType("С")));
            add(new Galaxy("Маффеи 1", 11, new GType("Э")));
        }
    };

    public static void main(String[] args) {
        showGalaxiesLY(galaxies);
        System.out.println();
        showGalaxiesKm(galaxies);
    }

/* Должно вывести:
        Вертушка,   25000 сл,   тип: Спиральная
        Колесо телеги,   100000 сл,   тип: Линзовидная
        Малое Магелланово Облако,   160000 сл,   тип: Неправильная
        Головастик,   500000 сл,   тип: Спиральная
        Андромеды,   3000 сл,   тип: Спиральная
        Маффеи 1,   11000 сл,   тип: Эллиптическая
*/
    private static void showGalaxiesLY(List<Galaxy> galaxies) {
        for (Galaxy galaxy : galaxies) {
            System.out.println(galaxy.name + ",   " + convertKLY2LY(galaxy.lightYearsDistance) + " сл,   " + galaxy.type);
        }
    }

    /**
     * Переводит Кило Световые годы в Световые годы
     * @param distanceKLY расстояние в КилоСветовых годах
     * @return расстояние в световых годах
     */
    private static int convertKLY2LY(int distanceKLY) {
        return 1000 * distanceKLY;
    }


/* Должно вывести:
        Вертушка,  32469624100 км,  тип: Спиральная
        Колесо телеги,  129878496400 км,  тип: Линзовидная
        Малое Магелланово Облако,  207805594240 км,  тип: Неправильная
        Головастик,  649392482000 км,  тип: Спиральная
        Андромеды,  3896354892 км,  тип: Спиральная
        Маффеи 1,  14286634604 км,  тип: Эллиптическая
*/
    private static void showGalaxiesKm(List<Galaxy> galaxies) {
        for (Galaxy galaxy : galaxies) {
            System.out.println(galaxy.name + ",  " + convertKLY2KM(galaxy.lightYearsDistance) + " км,  " + galaxy.type);
        }
    }

    private static long convertKLY2KM(int distanceKLY) {
        return KM_IN_LY * convertKLY2LY(distanceKLY);
    }

    private static final long KM_IN_LY = 1298784964;
}
