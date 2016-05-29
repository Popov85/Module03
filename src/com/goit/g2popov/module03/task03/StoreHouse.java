package com.goit.g2popov.module03.task03;

import java.util.List;

/**
 * Created by Андрей on 29.05.2016.
 */

public class StoreHouse {
        private static List<Instrument> stock;

        public static List<Instrument> getStock() {
                return stock;
        }

        public static void addGuitar(Guitar item) {
                stock.add(item);
        }

        public static void addTrumpet(Trumpet item) {
                stock.add(item);
        }

        public static void addPiano(Piano item) {
                stock.add(item);
        }

        public static int calculateGuitars() {
                System.out.println("Loop through the list and count only Guitar objects.");
                return 0;
        }

        public static int calculateTrumpets() {
                System.out.println("Loop through the list and count only Trumpet objects.");
                return 0;
        }

        public static int calculatePianos() {
                System.out.println("Loop through the list and count only Piano objects.");
                return 0;
        }
}
