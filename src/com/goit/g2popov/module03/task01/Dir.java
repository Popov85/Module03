package com.goit.g2popov.module03.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 24.05.2016.
 */
public class Dir extends File {
        private List<File> files;
        // Signifies if the directory is actually the root (disk C:/, D:/, etc.)
        private boolean ifRoot=false;

        public Dir () {
               files = new ArrayList<File>();
        }

        public void setFiles(List<File> files) {
                this.files = files;
        }

        public void setIfRoot(boolean ifRoot) {
                this.ifRoot = ifRoot;
        }

        public List<File> getFiles() {
                return files;
        }

        public boolean isIfRoot() {
                return ifRoot;
        }

        public void sort() {
                System.out.println("Loop through the list and take out every File to determine its type and name!");
        }
}
