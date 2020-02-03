package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Triangle;

//import edu.eci.cvds.patterns.shapes.concrete;

public class ShapeFactory{

    public static Shape create( RegularShapeType type){
        Shape instance = null;

        switch(type){
            case Triangle:
                instance = new Triangle(); 
                break;
            case Quadrilateral:
                instance = new Quadrilateral();
                break;
            case Pentagon:
                instance = new Pentagon();
                break;
            case Hexagon:
                instance = new Hexagon();
                break;
        }
        return instance;
    }
}