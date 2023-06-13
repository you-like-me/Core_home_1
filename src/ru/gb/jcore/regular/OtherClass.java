package ru.gb.jcore.regular;

/**
 * Другой, очень полезный класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 * */
public class OtherClass {

    /**
     * Функция суммирования двух целых чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b, без проверки на переполнение переменной.
     */
    public static int add(int a, int b){
        return a + b;
    }

    /**
     * Функция деления двух целых чисел
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b, без проверки на переполнение переменной.
     * */
    public static int div(int a, int b){
        return b == 0 ? a : a / b;
    }

    /**
     * Функция произведения двух целых чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b, без проверки на переполнение переменной.
     * */
    public static int mul(int a, int b){
        return a * b;
    }

    /**
     * Функция вычитания двух целых чисел
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b, без проверки на переполнение переменной.
     * */
    public static int sub(int a, int b){
        return a - b;
    }
}
