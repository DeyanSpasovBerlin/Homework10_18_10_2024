package org.example.zada4aFromSummary18102024.Box;

import org.example.zada4aFromSummary18102024.Rectangle.Less11_1;

public class Main {
    public static void main(String[] args) {
        Less11_1 sub1 = new Less11_1();

        Box myArrayList = new Box("A", "B", "C");

        for (String s : myArrayList) { // revereIterator E --> D --> C --> B --> A
            String element = s;
            System.out.println(element);
        }


    }
}