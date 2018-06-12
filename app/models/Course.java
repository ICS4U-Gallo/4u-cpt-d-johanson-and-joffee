package models;

import java.util.HashSet;
import java.util.Set;

public class Course {
    public Integer id;
    public String course;

    public Course(){

    }

    public Course(Integer id, String course){
        this.id = id;
        this.course = course;
    }

    public static Set<Course> allClasses(){
        return null;
    }
    public static Course findById(Integer id){
        return null;
    }
    public static void add(Course course){
        /*books.add(book);*/
    }
    public static boolean remove(Course course){
        /*return books.remove(book);*/
        return true;
    }
}