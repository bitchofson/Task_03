package com.metanit;

/*
  Горизонтальная парабола вида x = a * (y - y0)^2 + x0. Ветви направленны на 90 влево.
 */

public class HorizontalParabola {

    public double x0;
    public double y0;
    public double a;


    public HorizontalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }  // Конструктор который задаёт начальные параметры

    public boolean isPointLeftOfParabola(double x, double y) {
        return x <= a * Math.pow(y - y0, 2) + x0;
    } // Проверяем входит ли точка в область параболы

}
