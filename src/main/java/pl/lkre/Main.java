package pl.lkre;

import pl.lkre.model.Box;
import pl.lkre.model.Rectangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        Box box1 = new Box(new Rectangle(1, 2, 3, 4), null);
        Box boxExtended1 = new Box(new Rectangle(2, 3, 4, 5), "boxExtended1");
        boxes.add(box1);
        boxes.add(boxExtended1);
        boxes.forEach(o -> {
                    String maybeValue = o.getMaybeValue();
                    String upperCase = "";
                    if (maybeValue != null) {
                        upperCase = maybeValue.toUpperCase();
                    }
                    System.out.println(o.getClass() + " - " + o.getRectangle().toString() + " " + upperCase);
                }
        );
    }
}
