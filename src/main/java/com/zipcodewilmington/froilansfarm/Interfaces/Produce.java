package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce <EdibleThing extends Edible>{

    <EdibleThing> Edible yield();
}
