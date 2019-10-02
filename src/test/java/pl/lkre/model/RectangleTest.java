package pl.lkre.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void testEquals(int top, int left, int right, int bottom) {
//        when
        Rectangle rectangle1 = new Rectangle(top, left, right, bottom);
        Rectangle rectangle2 = new Rectangle(top, left, right, bottom);
//        then
        assertTrue(new ReflectionEquals(rectangle1).matches(rectangle2));
    }

    @Test
    void testNotEquals() {
//        when
        Rectangle rectangle1 = new Rectangle(11, 20, 30, 40);
        Rectangle rectangle2 = new Rectangle(10, 20, 30, 40);
//        then
        assertFalse(new ReflectionEquals(rectangle1).matches(rectangle2));
    }

    static Stream argumentProvider() {
        return Stream.of(
                Arguments.of(11, 20, 30, 40),
                Arguments.of(12, 20, 30, 40)
        );
    }
}