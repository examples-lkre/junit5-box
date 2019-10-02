package pl.lkre.service;

import pl.lkre.exception.ResourceReaderException;

import java.io.InputStream;
import java.util.Scanner;

class ResourceReader {

    String fromFile(String fileName) throws ResourceReaderException {
        ClassLoader classLoader = ResourceReader.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream(fileName);

        try (Scanner scanner = new Scanner(resourceAsStream)) {
            return scanner.useDelimiter("\\A").next();
        } catch (NullPointerException e) {
            throw new ResourceReaderException(e);
        }
    }
}
