package org.example.zada4a1.nullExeption.addVariant;

import java.util.ArrayList;

public class AddMembers {
    private ArrayList<String> names = new ArrayList<>();
    public ArrayList<String> addMembersMeth() {
        names.add("Mary");
        names.add("Jane");
        names.add("Tom");
        names.add("Tim");
        names.add("Mark");
        names.add("Ann");
        names.add(null);
        names.add("");
        return names;
    }
}
