package com.github.kdlug.factory.car;

public class ContinentalwealthFactory extends Factory {
    @Override
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMax:
                return new Ford(	1560, "gasoline", 1995, "RIGHT");
            case Focus:
                return new Ford(	2000, "gasoline", 2000, "RIGHT");
            default:
                throw new UnsupportedOperationException("Invalid Ford Model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(	3000, "gasoline", 2019, "RIGHT");
            case E60:
                return new BMW(	2000, "gasoline", 2000, "RIGHT");
            default:
                throw new UnsupportedOperationException("Invalid BMW Model");
        }
    }
}
