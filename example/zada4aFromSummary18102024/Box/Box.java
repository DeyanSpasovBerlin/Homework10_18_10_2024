package org.example.zada4aFromSummary18102024.Box;

import java.util.*;

public class Box implements Iterable<String> {

private     String itemA;
private     String itemB;
private     String itemC;



    public Box(String itemA, String itemB, String itemC) {
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }

    public String getItemA() {
        return itemA;
    }

    public String getItemB() {
        return itemB;
    }

    public String getItemC() {
        return itemC;
    }

    @Override
    public Iterator<String> iterator() {

        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {

        private int count =0;
        @Override
        public boolean hasNext() {
            if(count<3){
            return true;
            }else{
                return false;
            }
        }
        @Override
        public String next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if(count ==0 ){
                count++;
                return getItemA();
            }else if(count ==1)
            {   count++;
                return getItemB();
            }else{
                count++;
                return getItemC();
            }

        }
    }
}
