package com.goit.g2popov.module03.task02;

import java.util.List;

/**
 * Created by Андрей on 29.05.2016.
 */
public class BushOfRoses implements Separatable {
        private List<Rose> roses;

        public void setRoses(List<Rose> roses) {
                this.roses = roses;
        }

        public List<Rose> getRoses() {
                return roses;
        }

        public void separateBush(int number) {
                System.out.println("Create" +number +"Rose objects from a bush of roses and delete the bush obkect");
        }
}
