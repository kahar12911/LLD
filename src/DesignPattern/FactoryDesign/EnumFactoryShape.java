package DesignPattern.FactoryDesign;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EnumFactoryShape {
    private static final Map<EnumFactory, Supplier<Shape>> map = new HashMap<>();

    static{
        map.put(EnumFactory.CIRCLE, Circle::new);
        map.put(EnumFactory.RECTANGLE, Rectangle::new);
    }
    public static Shape getObject(EnumFactory enumFactory){
//        return switch (enumFactory){
//            case CIRCLE -> new Circle();
//            case RECTANGLE -> new Rectangle();
//
//        };

        return map.get(enumFactory).get();
    }
}
