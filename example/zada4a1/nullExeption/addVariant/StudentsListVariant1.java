package org.example.zada4a1.nullExeption.addVariant;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsListVariant1 implements Iterable<String> {
    public StudentsListVariant1() {
    }
    AddMembers addmem = new AddMembers();
    ArrayList<String> names = addmem.addMembersMeth();
    public StudentsListVariant1(ArrayList<String> names) {
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
        return new StudentsListVariant1.MyIterator();
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
