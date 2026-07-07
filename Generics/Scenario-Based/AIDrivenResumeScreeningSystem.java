import java.util.*;
abstract class JobRole{String name;JobRole(String n){name=n;}public String toString(){return name;}}
class SoftwareEngineer extends JobRole{SoftwareEngineer(){super("Software Engineer");}}
class Resume<T extends JobRole>{T role;Resume(T r){role=r;}}
public class AIDrivenResumeScreeningSystem{
static void screen(List<? extends JobRole> list){for(JobRole r:list)System.out.println(r);}
public static void main(String[] args){
ArrayList<SoftwareEngineer> roles=new ArrayList<>();
roles.add(new SoftwareEngineer());
screen(roles);
}}
