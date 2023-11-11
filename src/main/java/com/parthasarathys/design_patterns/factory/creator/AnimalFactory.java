package com.parthasarathys.design_patterns.factory.creator;

import com.parthasarathys.design_patterns.factory.animal.IAnimal;

public abstract class AnimalFactory {

    public AnimalFactory() {
        System.out.println("Factory pattern loading....");
    }

    public IAnimal createAnimal() {
        IAnimal animal = getAnimal();
        animal.doFly();

        return animal;
    }

    protected abstract IAnimal getAnimal();
}
