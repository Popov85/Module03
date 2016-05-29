package com.goit.g2popov.module03.task02;

import java.util.List;

/**
 * Created by Андрей on 29.05.2016.
 */
public class BunchOfFlowers implements Creatable {
        private List<Flower> flowers;
        private double price;

        public void setFlowers(List<Flower> flowers) {
                this.flowers = flowers;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public List<Flower> getFlowers() {

                return flowers;
        }

        public double getPrice() {
                return price;
        }

        public void createBunch(int number) {
                System.out.println("Create and mix a list of "+ number+ " flowers in a random order from the piles of M different flowers");
        }
}
