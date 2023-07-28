package com.zipcodewilmington.froilansfarm.WeekTests;

import com.zipcodewilmington.froilansfarm.Animals.Farmer;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Pilot;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MondayTest {


    @Before
    public void setup() {
        Farm farm = new Farm();
        Pilot froilanda = new Pilot();
        Farmer froiland = new Farmer();
        Field field = new Field();
        CropRow cr = new CropRow();
        for (int i = 0; i < 2; i++) {
            cr.add(new Corn());
        }
        field.add(cr);
        CropRow cr2 = new CropRow();
        for (int i = 0; i < 2; i++) {
            cr2.add(new Tomato());
        }
        field.add(cr2);
        for (int i = 0; i < 5; i++) {
            CropRow c = new CropRow();
            for (int y = 0; y < 5; y++) {
                c.add(new Corn());
            }
            field.add(c);
        }
        //farm.fields = field;
    }
}








