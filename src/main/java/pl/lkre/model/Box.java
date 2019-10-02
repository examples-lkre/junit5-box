package pl.lkre.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Box {
    private Rectangle rectangle;
    private String maybeValue;
}
