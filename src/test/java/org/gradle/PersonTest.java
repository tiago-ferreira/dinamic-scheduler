package org.gradle;

import io.redspark.dinamic.scheduler.Person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
