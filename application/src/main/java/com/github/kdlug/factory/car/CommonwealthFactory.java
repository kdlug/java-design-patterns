package com.github.kdlug.factory.car;

public class CommonwealthFactory extends Factory {
    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMax:
                return new Ford(	1560, "gasoline", 1995, "LEFT");
            case Focus:
                return new Ford(	2000, "gasoline", 2000, "LEFT");
            default:
                throw new UnsupportedOperationException("Invalid Ford Model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(	3000, "gasoline", 2019, "LEFT");
            case E60:
                return new BMW(	2000, "gasoline", 2000, "LEFT");
            default:
                throw new UnsupportedOperationException("Invalid BMW Model");
        }
    }
}
