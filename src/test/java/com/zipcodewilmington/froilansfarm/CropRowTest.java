package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Food.*;
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
        cropRow.add(new CornStalk());
        cropRow.add(new TomatoPlant());
        int expected = 2;

        int actual = cropRow.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCropsList2() {
        cropRow.add(new CornStalk());
        cropRow.add(new TomatoPlant());
        cropRow.add(new TomatoPlant());
        cropRow.add(new TomatoPlant());
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
        CornStalk cornStalk = new CornStalk();
        Assert.assertTrue(cropRow.fertilize(cornStalk));
    }

    @Test
    public void testFertilize2() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Assert.assertTrue(cropRow.fertilize(tomatoPlant));
    }

}