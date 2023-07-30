package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.CornStalk;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FarmerTest {

    @Test
    public void testInheritence(){
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Eater);
    }
    @Test
    public void testInheritence2(){
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof NoiseMaker);
    }
    @Test
    public void testInheritence3(){
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Animal);
    }
    @Test
    public void testInheritence4(){
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Botanist);
    }

    @Test
    public void testInheritence5(){
        Farmer farmer = new Farmer();

        assertTrue(farmer instanceof Rider);
    }
    @Test
    public void testRiding(){
        Farmer farmer = new Farmer();
        Horse horse = new Horse();

        assertTrue(farmer.mount(horse));
    }
    @Test
    public void testRiding2(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();

        assertTrue(farmer.mount(tractor));
    }
    @Test
    public void testPlanting(){
        Farmer farmer = new Farmer();
        CornStalk cs = new CornStalk();

        assertTrue(farmer.plant(cs, new CropRow<CornStalk>()));
    }
    @Test
    public void testEating(){
        Farmer farmer = new Farmer();
        Corn corn = new Corn();

        assertTrue(farmer.eat(corn));
    }
    @Test
    public void testEating2(){
        Farmer farmer = new Farmer();
        Tomato tomato = new Tomato();

        assertTrue(farmer.eat(tomato));
    }

    @Test
    public void testEating3(){
        Farmer farmer = new Farmer();
        Egg egg = new Egg();


        assertTrue(farmer.eat(egg));
    }

    @Test
    public void testMakeNoise(){
        Farmer farmer = new Farmer("Froiland");

        String expected = "Hi, I'm Froiland";
        String actual = farmer.makeNoise();

        assertEquals(expected, actual);
    }
}