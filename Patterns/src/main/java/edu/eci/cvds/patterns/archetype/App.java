package edu.eci.cvds.patterns.archetype;

import edu.eci.cvds.patterns.shapes.Shape;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Please provide the name of a shape (e.g., Hexagon, Pentagon, Quadrilateral, Triangle).");
            return;
        }

        String shapeName = args[0];
        Shape shape = createShape(shapeName);

        if (shape != null) {
            System.out.println("The number of edges of " + shapeName + " is: " + shape.getNumberOfEdges());
        } else {
            System.err.println("Unknown shape: " + shapeName);
        }
    }

    private static Shape createShape(String shapeName) {
        switch (shapeName.toLowerCase()) {
            case "hexagon":
                return new Hexagon();
            case "pentagon":
                return new Pentagon();
            case "quadrilateral":
                return new Quadrilateral();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
