package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
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
    public void testCropsInList() {
        Corn corn = new Corn();
        CropRow cropRow = new CropRow();
        cropRow.add(corn);

        field.add(cropRow);
        boolean expected = true;

        CropRow inField = field.get(0);
        boolean actual = inField.contains(corn);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropsInList2() {
        Corn corn = new Corn();
        Tomato tomato = new Tomato();
        CropRow cropRow = new CropRow();
        cropRow.add(corn);
        cropRow.add(tomato);

        field.add(cropRow);
        Edible expected = tomato;

        CropRow inField = field.get(0);
        Edible actual = (Edible)inField.get(1);

        Assert.assertEquals(expected, actual);
    }

}