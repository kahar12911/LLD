package DesignPattern.AbstractFactory.UIToolKit;

public class WindowButton implements Button{
    @Override
    public void paint() {
        System.out.println("Window Buttom Painting");
    }
}
