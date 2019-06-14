package com.github.kdlug.factory.car;

abstract public class Factory {
    abstract public Car buildFord(FordModel model);
    abstract public Car buildBMW(BMWModel model);
}
