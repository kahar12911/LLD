package DesignPattern.AbstractFactory.UIToolKit;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacBook Paint Button");
    }
}
