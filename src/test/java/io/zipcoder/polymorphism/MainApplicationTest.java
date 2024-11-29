package io.zipcoder.polymorphism;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class MainApplicationTest {
@Test
    public void testMe(){}




    @Test
    public void testPetList() {
            String input = "2\nDog\nRex\nCat\nWhiskers\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            PetApp app = new PetApp();
            app.collectPetData();
            app.displayPets();
            assertEquals(2, app.getPets().size());
            assertEquals("Rex", app.getPets().get(0).getName());
            assertEquals("Meow", app.getPets().get(1).speak());
        }
}
