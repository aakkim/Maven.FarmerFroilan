package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChickenTest {

    @Test
    public void testInheritence(){
        Chicken chicken = new Chicken();

        assertTrue(chicken instanceof NoiseMaker);
    }
    @Test
    public void testInheritence2(){
        Chicken chicken = new Chicken();

        assertTrue(chicken instanceof Eater);
    }

    @Test
    public void testNoise(){
        Chicken chicken = new Chicken();
        String expected = "Cluck Cluck";
        String actual = chicken.makeNoise();

        assertEquals(expected, actual);
    }

    @Test
    public void testEdible(){
        Chicken chicken = new Chicken();

        assertTrue(chicken.yield() instanceof Edible);
    }
    @Test
    public void testEdible2(){
        Chicken chicken = new Chicken();

        assertTrue(chicken.yield() instanceof Egg);
    }

    @Test
    public void eatSomething(){
        Chicken chicken = new Chicken();
        Tomato tomato = new Tomato();

        assertFalse(chicken.eat(tomato));
    }
    @Test
    public void eatSomething2(){
        Chicken chicken = new Chicken();
        Corn corn  = new Corn();

        assertTrue(chicken.eat(corn));
    }
    @Test
    public void eatSomething3(){
        Chicken chicken = new Chicken();
        Corn corn  = new Corn();
        chicken.eat(corn);
        assertTrue(chicken.isFull());
    }

}