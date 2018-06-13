package models;

import java.util.HashSet;
import java.util.Set;

public class Marks {
    public String type;
    public Integer marks;
    public Integer weight;

    public Marks(){

    }

    public Marks(String type, Integer mark, Integer weight){
        this.type = type;
        this.marks = marks;
        this.weight = weight;
    }

    public static Set<Marks> allMarks(){
        return null;
    }
    public static void addMarks(Marks marks){
        /*books.add(book);*/
    }
    public static boolean remove(Marks marks){
        /*return books.remove(book);*/
        return true;
    }
}