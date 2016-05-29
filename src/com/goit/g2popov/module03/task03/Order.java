package com.goit.g2popov.module03.task03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Андрей on 29.05.2016.
 */
public class Order {
        private Calendar date;
        private boolean ifFulfilled;
        private Cashier cashier;
        private Client client;
        private List<OrderItem> items;

        public Order() {
                Calendar currentDate = Calendar.getInstance();
                date = currentDate;
                items = new ArrayList<OrderItem>();
                ifFulfilled=false;
                client= new Client();
        }

        public Calendar getDate() {
                return date;
        }

        public boolean isIfFulfilled() {
                return ifFulfilled;
        }

        public Cashier getCashier() {
                return cashier;
        }

        public Client getClient() {
                return client;
        }

        public List<OrderItem> getItems() {
                return items;
        }

        public void setDate(Calendar date) {
                this.date = date;
        }

        public void setIfFulfilled(boolean ifFulfilled) {
                this.ifFulfilled = ifFulfilled;
        }

        public void setClient(Client client) {
                this.client = client;
        }

        public void setCashier(Cashier cashier) {
                this.cashier = cashier;
        }

        public void setItems(List<OrderItem> items) {
                this.items = items;
        }

        /*TODO
          Will change the state of StoreHouse when an order is paid and shipped
          and when a new batch of instruments arrives.
        */
        public void changeStateOfStoreHouse() {

        }
        /*TODO
          Will change the state of Cash Desk once an order is paid and shipped
          and when a new batch of instruments arrives.
        */
        public void changeStateOfCashDesk() {

        }
}
