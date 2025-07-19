package DesignPattern.FactoryDesign;

public class Demo {
    public static void main(String[] args) {
//        Shape circle = new Circle();
//        Shape rectangle = new Rectangle();
//        circle.draw();
//        rectangle.draw();
        // Need factory here to hide object creation layer

        String type = "Circle";
        Shape obj = FactoryShape.createObject(type);
        obj.draw();
        //System.out.println();
        Shape enumObj = EnumFactoryShape.getObject(EnumFactory.CIRCLE);
        enumObj.draw();

    }
}
