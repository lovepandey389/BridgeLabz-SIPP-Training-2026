import java.util.*;
abstract class CourseType{String name;CourseType(String n){name=n;}public String toString(){return name;}}
class ExamCourse extends CourseType{ExamCourse(String n){super(n);}}
class Course<T extends CourseType>{
T type;
Course(T t){type=t;}
}
public class UniversityCourseManagementSystem{
static void show(List<? extends CourseType> list){for(CourseType c:list)System.out.println(c);}
public static void main(String[] args){
ArrayList<ExamCourse> list=new ArrayList<>();
list.add(new ExamCourse("Java"));
show(list);
}}
