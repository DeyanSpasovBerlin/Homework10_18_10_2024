package org.example.zada4aFromSummary18102024.Rectangle;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SquareArrayLis implements Iterable<Integer> {
    Less11_1 matr = new Less11_1();
    private int[][] data = matr.generateMatrix();

    public SquareArrayLis(int[][] data) {
        this.data = data;

    }
    public SquareArrayLis(){};


    @Override
    public Iterator<Integer> iterator() {
        matr.print2DArray(data);
        System.out.println("\nThe matrix printed with Iterator is:");
        return  new MyIterator();
    }
    private class MyIterator implements Iterator<Integer> {

        private int countRow =0;
        private int countCol =0;
        private int bufer = 0;

        public boolean hasNext() {
            if((countRow < (data.length)) && (countCol < (data[countRow].length))){
                return true;
            }else{
                return false;
            }
        }

        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if(countRow<data.length && countCol<data[countRow].length-1){
                bufer = data[countRow][countCol];
                countCol++;
            } else if (countRow<data.length && countCol == data[countRow].length-1) {
                bufer = data[countRow][data[countRow].length-1];
                countCol =0;
                countRow++;
            }
            return bufer;
        }
    }
}
