package com.parthasarathys.design_patterns.factory.animal;

public class Tiger implements IAnimal{
    @Override
    public void doFly() {
        System.out.println("Doesn't fly!!!");
    }
}
