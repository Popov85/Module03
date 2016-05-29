package com.goit.g2popov.module03.task03;

import java.util.List;

/**
 * Created by Андрей on 29.05.2016.
 */
public class OrderItem {
        private int numberOfItems;
        private Instrument instrument;

        public Instrument getInstrument() {
                return instrument;
        }

        public int getNumberOfItems() {
                return numberOfItems;
        }

        public void setNumberOfItems(int numberOfItems) {
                this.numberOfItems = numberOfItems;
        }

        public void setInstrument(Instrument instrument) {
                this.instrument = instrument;
        }
}
