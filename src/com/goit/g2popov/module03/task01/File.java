package com.goit.g2popov.module03.task01;

import java.util.Calendar;

/**
 * Created by Андрей on 24.05.2016.
 */
public abstract class File {
        private String fileName;
        private int size;
        private Calendar dateOfCreation;
        private Dir location;

        public void setFileName(String fileName) {
                this.fileName = fileName;
        }

        public void setSize(int size) {
                this.size = size;
        }

        public void setDateOfCreation(Calendar dateOfCreation) {
                this.dateOfCreation = dateOfCreation;
        }

        public String getFileName() {
                return fileName;
        }

        public int getSize() {
                return size;
        }

        public Calendar getDateOfCreation() {
                return dateOfCreation;
        }

        public Dir getLocation() {
                return location;
        }

        public void setLocation(Dir location) {
                this.location = location;
        }

        public void download() {
                System.out.println("It's easy to download any file!");
        }

        public void upload() {
                System.out.println("It's easy to upload any file!");
        }

        public void archive() {
                System.out.println("It's easy to archive any file!");
        }
}
