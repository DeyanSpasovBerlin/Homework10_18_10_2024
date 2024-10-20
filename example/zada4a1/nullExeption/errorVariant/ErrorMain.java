package org.example.zada4a1.nullExeption.errorVariant;

import java.util.Iterator;

public class ErrorMain {
    public static void main(String[] args) {
        ErorStudentList stud = new ErorStudentList();
        System.out.println("Initial ArrayList is:");
        System.out.println(stud.getNames()+" Length: "+stud.getNames().size());
        System.out.println("*************************");

        System.out.println("Remove null and empty with method ");
        System.out.println(stud.removeNullAndEmpty()+" Length: "+stud.getNames().size());
        System.out.println("*************************");
        System.out.print("\tPrint with foreach: \tName:");
        for (String s : stud){
            System.out.print(" \t"+s);
        }
        System.out.print("\t The ArrayList has length: \t"+stud.getNames().size()+"\n");
        System.out.println("*************************");
        Iterator<String> itString = stud.iterator();
        System.out.print("Print with Iterator: \tName:");
        while (itString.hasNext()){
            String s = itString.next();
            System.out.print(" \t"+s);
        }
        System.out.print("\t The ArrayList has length: \t"+stud.getNames().size()+"\n");
        System.out.println("*************************");
        System.out.println("Print with ArrayList: Names: "+stud.getNames()+" Length: "+stud.getNames().size());
        System.out.println("*************************");
        stud.getNamesWith4Char();
        System.out.println("\n*************************");
    }
}
