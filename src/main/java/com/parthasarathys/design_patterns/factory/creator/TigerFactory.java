package com.parthasarathys.design_patterns.factory.creator;

import com.parthasarathys.design_patterns.factory.animal.IAnimal;
import com.parthasarathys.design_patterns.factory.animal.Tiger;

public class TigerFactory extends AnimalFactory{
    @Override
    protected IAnimal getAnimal() {
        return new Tiger();
    }
}
