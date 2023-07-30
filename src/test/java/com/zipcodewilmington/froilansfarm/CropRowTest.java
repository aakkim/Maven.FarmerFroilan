package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.Crop;
import com.zipcodewilmington.froilansfarm.Food.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropRowTest {

    @Test
    void idkWhatImTestingHere() {
        CropRow<Crop> crop = new CropRow<>();

        CornStalk earCorn = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();

        crop.add(earCorn);
        crop.add(tomatoPlant);

        assertEquals(earCorn, crop.get(0));
        assertEquals(tomatoPlant, crop.get(1));
    }
}