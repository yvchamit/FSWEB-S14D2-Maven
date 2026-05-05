package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall("Left");
        Wall wall1 = new Wall("Right");
        Wall wall2 = new Wall("Front");
        Wall wall3 = new Wall("Back");

        Carpet carpet = new Carpet(10, 10, PaintColor.GREEN);
        Ceiling ceiling = new Ceiling(20, PaintColor.GREEN);
        Bed bed = new Bed("King", 3, 3, 3, 3);

        Lamp lamp = new Lamp(LampType.NEON, false, 5);
        Wardrobe wardrobe = new Wardrobe(2, 2, 15.5);
        Bedroom bedroom1 = new Bedroom("Cocuk Odasi", wall, wall1, wall2, wall3, ceiling, bed, lamp, wardrobe, carpet);


    }
}