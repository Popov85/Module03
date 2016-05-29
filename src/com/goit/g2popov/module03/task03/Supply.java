package com.goit.g2popov.module03.task03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Андрей on 29.05.2016.
 */
public class Supply {
        private Calendar date;
        private List<SupplyItem> items;

        public Supply() {
                Calendar currentDate = Calendar.getInstance();
                date = currentDate;
                items = new ArrayList<SupplyItem>();
        }

        public Calendar getDate() {
                return date;
        }

        public List<SupplyItem> getItems() {
                return items;
        }

        public void setDate(Calendar date) {
                this.date = date;
        }

        public void setItems(List<SupplyItem> items) {
                this.items = items;
        }
}
