package test.isen.library;

import isen.library.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @org.junit.Test
    @Test
    public void testPerson() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }

    @Test
    public void testSetName() {
        Person person = new Person();
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    public void testSetYears() {
        Person person = new Person();
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}
