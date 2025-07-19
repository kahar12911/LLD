package DesignPattern.FactoryDesign;

public class FactoryShape {
    public static Shape createObject(String type){
        if(type == null || type.isEmpty()) return null;
        else if(type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;

    }
}
