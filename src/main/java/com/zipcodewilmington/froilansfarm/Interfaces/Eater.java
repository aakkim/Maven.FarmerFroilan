package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Eater <EdibleThing extends Edible> {
    boolean eat(EdibleThing edible);
}
