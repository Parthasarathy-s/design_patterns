package com.parthasarathys.design_patterns.factory.creator;

import com.parthasarathys.design_patterns.factory.animal.IAnimal;
import com.parthasarathys.design_patterns.factory.animal.Peacock;

public class PeacockFactory extends AnimalFactory{
    @Override
    protected IAnimal getAnimal() {
        return new Peacock();
    }
}
