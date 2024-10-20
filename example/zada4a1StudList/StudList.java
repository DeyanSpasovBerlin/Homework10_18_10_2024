package org.example.zada4a1StudList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudList {



    private   ArrayList<ArrayList<String>> studentGrades = new ArrayList<>();
    private   ArrayList<String> class8a = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann","Daan","Nora"));
    private   ArrayList<String> class9b = new ArrayList<>(List.of("Georg", "Vasil", "Ognyqn", "Boiko","Jane","Nora"));
    private   ArrayList<String> class10c = new ArrayList<>(List.of("Daan", "Emma", "Tom", "Tim", "Ognyqn", "Ann","Julia","Nora","Ognyqn","Nora"));
     public ArrayList<ArrayList<String>> getScoolList(){
         studentGrades.add(class8a);
         studentGrades.add(class9b);
         studentGrades.add(class10c);
         return studentGrades;
     }
     public Integer countTotalAmount(ArrayList<ArrayList<String>> arr){
         int bufer = 0;
         System.out.println("This  scoll has "+studentGrades.size()+" classes.");
         System.out.println("In any class are next students:");
         for (ArrayList<String> obj : studentGrades){
             ArrayList<String>   classNameArr = obj;
             System.out.println("\t Name: \t"+classNameArr+"\tnumbers: \t"+classNameArr.size());
             bufer += classNameArr.size();
         }
         System.out.println("\nIn scool stydied "+bufer+" students.\n");
         return bufer;
     }
    public Integer countAmountWithName(String name){
        int bufer = 0;
         for (ArrayList<String> obj : studentGrades){
             for ( int i = 0; i < obj.size(); i++){
                 if(Objects.equals(name,obj.get(i))){
                     bufer++;
                 }
             }
         }
        System.out.println("In scool studied "+bufer+" with name "+name);
         return bufer;
    }
}
