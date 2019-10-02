package pl.lkre.service;

import org.junit.jupiter.api.Test;
import pl.lkre.exception.ResourceReaderException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResourceReaderTest {

    @Test
    void fromFileSuccess() throws ResourceReaderException {
        ResourceReader resourceReader = new ResourceReader();
        String actual = resourceReader.fromFile("test.csv");
        String expected = "test;test2;test3";
        assertEquals(expected, actual);
    }
}