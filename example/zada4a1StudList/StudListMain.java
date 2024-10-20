package org.example.zada4a1StudList;

import java.util.ArrayList;
import java.util.List;

public class StudListMain {
    public static void main(String[] args) {
        StudList stud = new StudList();
        ArrayList<ArrayList<String>> scoolMembers =  stud.getScoolList();
        stud.countTotalAmount(scoolMembers);
        stud.countAmountWithName("Vasil");
        stud.countAmountWithName("Tom");
        stud.countAmountWithName("Daan");
        stud.countAmountWithName("Ognyqn");
        stud.countAmountWithName("Nora");
    }


}
