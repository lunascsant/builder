package com.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testBuildPersonWithAllFields() {
        Person person = new Person.Builder()
                .setName("Ana")
                .setAge(30)
                .setEmail("ana@email.com")
                .setAddress("Rua A, 123")
                .setPhone("99999-0000")
                .build();
        assertEquals("Ana", person.getName());
        assertEquals(30, person.getAge());
        assertEquals("ana@email.com", person.getEmail());
        assertEquals("Rua A, 123", person.getAddress());
        assertEquals("99999-0000", person.getPhone());
    }

    @Test
    void testBuildPersonWithNameAndAgeOnly() {
        Person person = new Person.Builder()
                .setName("Carlos")
                .setAge(22)
                .build();
        assertEquals("Carlos", person.getName());
        assertEquals(22, person.getAge());
        assertNull(person.getEmail());
        assertNull(person.getAddress());
        assertNull(person.getPhone());
    }

    @Test
    void testBuildPersonWithEmailOnly() {
        Person person = new Person.Builder()
                .setEmail("joao@email.com")
                .build();
        assertNull(person.getName());
        assertEquals(0, person.getAge());
        assertEquals("joao@email.com", person.getEmail());
        assertNull(person.getAddress());
        assertNull(person.getPhone());
    }

    @Test
    void testBuildPersonWithNoFields() {
        Person person = new Person.Builder().build();
        assertNull(person.getName());
        assertEquals(0, person.getAge());
        assertNull(person.getEmail());
        assertNull(person.getAddress());
        assertNull(person.getPhone());
    }

    @Test
    void testBuildPersonWithPhoneAndAddress() {
        Person person = new Person.Builder()
                .setPhone("88888-1111")
                .setAddress("Rua B, 456")
                .build();
        assertNull(person.getName());
        assertEquals(0, person.getAge());
        assertNull(person.getEmail());
        assertEquals("Rua B, 456", person.getAddress());
        assertEquals("88888-1111", person.getPhone());
    }
}

