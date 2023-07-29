package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CropRowTest {
    CropRow cropRow = new CropRow();

    @Test
    public void testNullaryConstructor() {

        Assert.assertTrue(cropRow.isEmpty());
    }

    @Test
    public void testNullaryConstructor2() {

        Assert.assertNotNull(cropRow);
    }

    @Test
    public void testCropsList() {
        cropRow.add(new Corn());
        cropRow.add(new Tomato());
        int expected = 2;

        int actual = cropRow.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropsList2() {
        cropRow.add(new Corn());
        cropRow.add(new Tomato());
        cropRow.add(new Tomato());
        cropRow.add(new Tomato());
        int expected = 3;

        int actual = cropRow.size();

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void testCropsListNull() {
        int expected = 0;

        int actual = cropRow.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFertilize() {
        Corn corn = new Corn();
        Assert.assertTrue(cropRow.fertilize(corn));
    }

    @Test
    public void testFertilize2() {
        Egg egg = new Egg();
        Assert.assertFalse(cropRow.fertilize(egg));
    }

}