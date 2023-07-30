package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CornStalkTest {

    @Test
    void testCornInheritance(){

        Corn corn = new Corn();

        //test to make sure corn recognizes instance of edible
        //assert true corn instance of edible
        //make sure that object comes out of cornstalk. yield == corn
        //instance of interface or abstract class
        //upperbound 'wildcard' least amount of functionality based on extends
        //knows functionality object coming in or out
        //setting bounds extends to functionality of superclass
        assertTrue(corn instanceof Edible);

    }

    @Test
    void testCornYield(){

        CornStalk cornStalk = new CornStalk();

        //System.out.println(cornStalk.yield());
        assertTrue(cornStalk.yield() instanceof Corn);
    }

}