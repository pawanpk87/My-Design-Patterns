package PrototypeCode;

import PrototypeCode.shapes.Rectangle;
import PrototypeCode.shapes.Shape;

public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 20;

        Rectangle notCloneObj = new Rectangle();
        notCloneObj.height = 10;
        notCloneObj.width = 20;

        Shape clonedObj = rectangle.clone();

        System.out.println(rectangle.equals(clonedObj));

        System.out.println(rectangle.equals(notCloneObj));
    }

}
