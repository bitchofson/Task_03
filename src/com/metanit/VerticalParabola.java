package com.metanit;

// Вертикальная парабола вида (x+x0)^2 + y0. Ветви направленны вниз.

public class VerticalParabola {

    public double x0;
    public double y0;
    public double a;

    VerticalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a =   a;
    } // Конструктор который задаёт начальные параметры

    public boolean isPointOfParabola(double x, double y) {

        return y <= (a * Math.pow(x + x0, 2) + y0);
    } // Проверяем входит ли точка в промежуток параболы

}
