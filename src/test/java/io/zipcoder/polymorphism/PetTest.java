package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void DogSpeak(){
        Pet dog = new Dog("Rex");
        Assert.assertEquals("Woof", dog.speak());
    }

    @Test
    public void CatSpeak(){
        Pet cat = new Cat("Whiskers");
        Assert.assertEquals("Meow", cat.speak());
    }

    @Test
    public void SnakeSpeak(){
        Pet snake = new Snake("Roger");
        Assert.assertEquals("Hiss", snake.speak());
    }


}
