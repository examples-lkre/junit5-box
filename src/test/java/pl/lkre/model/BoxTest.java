package pl.lkre.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoxTest {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar"})
    void assertEqual(String value) {
//        when
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(2, 3, 4, 5);
        Box box1 = new Box(rectangle1, value);
        Box box2 = new Box(rectangle1, value);
//        then
        assertTrue(new ReflectionEquals(box1).matches(box2));
    }

    @Test
    void assertDifferentRectangles() {
//        when
        Rectangle rectangle1 = new Rectangle(1, 2, 3, 4);
        Rectangle rectangle2 = new Rectangle(2, 3, 4, 5);
        Box box1 = new Box(rectangle1, "box");
        Box box2 = new Box(rectangle2, "box");
//        then
        assertFalse(new ReflectionEquals(box1).matches(box2));
    }
}