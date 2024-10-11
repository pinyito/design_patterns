package com.pinyito;

public abstract class AbstractShapeFactory {
    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
    // other helper methods can be added here
}

class RectangleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class SquareFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Square();
    }
}

class CircleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Circle();
    }
}

