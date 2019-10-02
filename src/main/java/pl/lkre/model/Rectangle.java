package pl.lkre.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle {
    private int top, left, right, bottom;

    @Override
    public String toString() {
        return "{" + top + " " + left + " " + right + " " + bottom + "}";
    }
}
