package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Food.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilotTest {
    @Test
    public void testInheritence(){
        Pilot pilot = new Pilot();

        assertTrue(pilot instanceof Eater);
    }
    @Test
    public void testInheritence2(){
        Pilot pilot = new Pilot();


        assertTrue(pilot instanceof NoiseMaker);
    }
    @Test
    public void testInheritence3(){
        Pilot pilot = new Pilot();


        assertTrue(pilot instanceof Animal);
    }
    @Test
    public void testInheritence4(){
        Pilot pilot = new Pilot();


        assertTrue(pilot instanceof Botanist);
    }

    @Test
    public void testInheritence5(){
        Pilot pilot = new Pilot();


        assertTrue(pilot instanceof Rider);
    }
    @Test
    public void testRiding(){
        Pilot pilot = new Pilot();

        Horse horse = new Horse();

        assertTrue(pilot.mount(horse));
    }
    @Test
    public void testRiding2(){
        Pilot pilot = new Pilot();

        CropDuster cd = new CropDuster();

        assertTrue(pilot.mount(cd));
    }

    @Test
    public void testEating(){
        Pilot pilot = new Pilot();

        Corn corn = new Corn();

        assertTrue(pilot.eat(corn));
    }
    @Test
    public void testEating2(){
        Pilot pilot = new Pilot();

        Tomato tomato = new Tomato();

        assertTrue(pilot.eat(tomato));
    }

    @Test
    public void testEating3(){
        Pilot pilot = new Pilot();

        Egg egg = new Egg();


        assertTrue(pilot.eat(egg));
    }

    @Test
    public void testMakeNoise(){
        Pilot pilot = new Pilot("Froilanda");


        String expected = "Hello, I'm Froilanda";
        String actual = pilot.makeNoise();

        assertEquals(expected, actual);
    }

    @Test
    public void testUseCD(){
        Pilot pilot = new Pilot();
        CropDuster cd = new CropDuster();
        CropRow<CornStalk> cr = new CropRow<CornStalk>();
        for(int i = 0; i < 5; i++){
            cr.add(new CornStalk());
        }

        pilot.useCropDuster(cd, cr);

        for(CornStalk cs: cr){
            assertTrue(cs.hasBeenFertalized());
        }

    }

}