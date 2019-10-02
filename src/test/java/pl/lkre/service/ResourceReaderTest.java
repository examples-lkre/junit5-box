package pl.lkre.service;

import org.junit.jupiter.api.Test;
import pl.lkre.exception.ResourceReaderException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ResourceReaderTest {

    @Test
    void fromFileSuccess() throws ResourceReaderException {
        ResourceReader resourceReader = new ResourceReader();
        String actual = resourceReader.fromFile("test.csv");
        String expected = "test;test2;test3;\n" +
                "test;test2;test3;";
        assertEquals(expected, actual);
    }

    @Test
    void fromFileThrowsException() {
        ResourceReader resourceReader = new ResourceReader();
        assertThrows(ResourceReaderException.class,
                () -> {
                    resourceReader.fromFile("badFile.csv");
                });
    }
}