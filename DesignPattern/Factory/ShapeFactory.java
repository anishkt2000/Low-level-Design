package DesignPattern.Factory;

public class ShapeFactory {

    Shape getShape(String input){
        switch (input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
