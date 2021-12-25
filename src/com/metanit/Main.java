package com.metanit;

// Рисунок №93

import java.util.Scanner;

public class Main {

    public static final HorizontalParabola  P1 = new HorizontalParabola(6, -1, -0.15);             // Горизонтальная парабола
    public static final VerticalParabola    P2 = new VerticalParabola(5, -1, -0.9);                // Вертикальная парабола
    public static final Square              S1 = new Square(6, 2, 10, 0);                      // Квадрат(задан промежутком)
    public static final Line                L1 = new Line(-2, 7, 2.7);                             // Линия


    public static SimpleColor getColor(double x, double y) {



        if (S1.isPointSquare(x, y)) {
            if(P1.isPointLeftOfParabola(x,y)) {
                return SimpleColor.YELLOW;
            } else return SimpleColor.WHITE;
        }
        else if(P1.isPointLeftOfParabola(x,y)) {
            if(!L1.isPointAboveLine(x,y)) {
               return SimpleColor.GREEN;
           } else if(P2.isPointOfParabola(x,y)) {
               if (L1.isPointAboveLine(x,y)){
                   return SimpleColor.BLUE;
               } else return SimpleColor.GREEN;
           } else return SimpleColor.WHITE;

        }
        else if (P2.isPointOfParabola(x,y)) {
           return SimpleColor.ORANGE;
        }
        else if (y >= 7 && L1.isPointAboveLine(x, y) && !P1.isPointLeftOfParabola(x, y)) return SimpleColor.GRAY;
        else return SimpleColor.WHITE;


    } // Метод проверяющий какому промежутку принадлежит точка, и возвращающий значение типа SimpleColor

    public static void printColorForPoint(double x, double y) {

        if ((x >= -10 && x <= 10) && (y >= -10 && y <= 10))
        System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
        else  System.out.println("Вы ввели не корректный данные!\n Диапозон: (-10 <= x <= 10, -10 <= y <= 10)");



    } // Метод вывода и проверки точки на заданный диапозон

    public static void Input() {

        Scanner input = new Scanner(System.in);

        double x, y;
        System.out.print("Введите значение x: ");
        x = input.nextDouble();

        System.out.print("Введите значение y: ");
        y = input.nextDouble();

        printColorForPoint(x, y);

    } // Метод для задании точки

    public static void main(String[] args) {

        // Напоминалка
        // Точки TN+1 ищи в VSU на картинке

        printColorForPoint(3, 2);       // T1
        printColorForPoint(6, 3);       // T2
        printColorForPoint(8, 7);       // T3
        printColorForPoint(8, -6);      // T4
        printColorForPoint(2, -2);      // T5
        printColorForPoint(-2, 3);      // T6
        printColorForPoint(43, 2);      // Умышленно делаем ошибку
        printColorForPoint(-4, 9);      // T7
        printColorForPoint(-9, 4);      // T8
        printColorForPoint(-8, -3);     // T9
        printColorForPoint(-6, -2);     // T10
        printColorForPoint(-4, -6);     // T11
        printColorForPoint(-3, -10);    // T12

        Input();

    }
}
