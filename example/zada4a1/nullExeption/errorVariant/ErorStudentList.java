package org.example.zada4a1.nullExeption.errorVariant;

import org.example.zada4a1.nullExeption.grundVariant.StudentsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ErorStudentList implements Iterable<String> {
    public ErorStudentList() {}
    private ArrayList<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

    public ErorStudentList(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public ArrayList<String> getNamesWith4Char() {
        ArrayList<String> names4Char = new ArrayList<>();
        Iterator<String> itString = names.iterator();
        while (itString.hasNext()) {
            String s = itString.next();
            if (s.length() == 4) {
                names4Char.add(s);
            }
        }
        System.out.println("The names wit 4 letter are " + names4Char.size());
        System.out.print(names4Char);
        return names4Char;
    }


    public ArrayList<String> removeNullAndEmpty() {
        Iterator<String> itString = names.iterator();
        while (itString.hasNext()) {
            String s = itString.next();
            if (s == null || s.equals("")) {
                itString.remove();
            }
        }
        return names;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }



    private class MyIterator implements Iterator<String> {
        private int count = 0;
        private String bufer = "";

        @Override
        public boolean hasNext() {
            if (count < names.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            if (count < names.size()) {

                if (names.get(count) == null) {
                    names.remove(count);
                    bufer = "This name = null!";
                    count++;
                } else if (names.get(count) == "") {
                    names.remove(count);
                    bufer = "This name = \"\"";
                    count++;
                }
                else {
                    bufer = (String) names.get(count);
                    count++;
                }
            }
            return bufer;
        }
    }

}
