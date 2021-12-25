package com.metanit;

// Квадрат задаётся промежутком точек x и y.

class Square {

    double x0, x1;
    double y0, y1;

    Square(double x0, double x1, double y0, double y1) {

        this.x0 = x0;
        this.x1 = x1;

        this.y0 = y0;
        this.y1 = y1;
    }

    public boolean isPointSquare(double x, double y) {
        if(x <= x0 && x >= x1 && y <= y0 && y >= y1) return true;
        else return false;
    } // Проверка входит ли точка в заданный промежуток (промежуток квадрата)

}
