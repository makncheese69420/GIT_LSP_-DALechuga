package org.howard.edu.lsp.oopfinal.question3;

public class ShapeFactory {
	public Shape createShape(String type) {
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

}
