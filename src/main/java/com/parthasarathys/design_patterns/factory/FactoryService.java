package com.parthasarathys.design_patterns.factory;

import com.parthasarathys.design_patterns.factory.creator.AnimalFactory;
import com.parthasarathys.design_patterns.factory.creator.PeacockFactory;
import org.springframework.stereotype.Service;

@Service
public class FactoryService {

    public FactoryService() {

        AnimalFactory animal = new PeacockFactory();
        animal.createAnimal();
    }
}
