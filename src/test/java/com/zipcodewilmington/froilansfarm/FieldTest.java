package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {

    Field field = new Field();

    @Test
    public void testNullaryConstructor() {

        Assert.assertTrue(field.isEmpty());
    }

    @Test
    public void testNullaryConstructor2() {

        Assert.assertNotNull(field);
    }

    @Test
    public void testCropRowsList() {
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        field.add(cropRow);
        int expected = 2;

        int actual = field.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropRowsList2() {
        CropRow cropRow = new CropRow();
        field.add(cropRow);
        field.add(cropRow);
        int expected = 3;

        int actual = field.size();


        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testCropRowsList3() {
        int expected = 0;
        int actual = field.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropsInList() {
        CornStalk cornStalk = new CornStalk();
        CropRow cropRow = new CropRow();
        cropRow.add(cornStalk);

        field.add(cropRow);
        boolean expected = true;

        CropRow inField = field.get(0);
        boolean actual = inField.contains(cornStalk);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropsInList2() {
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        CropRow cropRow = new CropRow();
        cropRow.add(cornStalk);
        cropRow.add(tomatoPlant);

        field.add(cropRow);
        TomatoPlant expected = tomatoPlant;

        CropRow inField = field.get(0);
        TomatoPlant actual = (TomatoPlant) inField.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropsInList3() {
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();

        CropRow<Crop> cropRow1 = new CropRow<>();
        cropRow1.add(cornStalk);
        cropRow1.add(cornStalk);
        cropRow1.add(tomatoPlant);

        CropRow cropRow2 = new CropRow();
        cropRow2.add(tomatoPlant);
        cropRow2.add(tomatoPlant);

        field.add(cropRow1);
        field.add(cropRow2);
        TomatoPlant expected = tomatoPlant;

        CropRow inField = field.get(1);
        TomatoPlant actual = (TomatoPlant) inField.get(0);

        Assert.assertEquals(expected, actual);
    }

}