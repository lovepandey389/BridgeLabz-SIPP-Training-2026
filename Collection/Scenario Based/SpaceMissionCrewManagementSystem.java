import java.util.*;

class Astronaut{
    int astronautId;
    String name;
    String specialization;

    Astronaut(int astronautId,String name,String specialization){
        this.astronautId=astronautId;
        this.name=name;
        this.specialization=specialization;
    }

    public String toString(){
        return astronautId+" "+name+" ("+specialization+")";
    }
}

public class SpaceMissionCrewManagementSystem{
    static HashMap<String,ArrayList<Astronaut>> missions=new HashMap<>();
    static HashMap<String,HashSet<String>> assigned=new HashMap<>();

    static void addMission(String mission){
        missions.putIfAbsent(mission,new ArrayList<>());
        assigned.putIfAbsent(mission,new HashSet<>());
    }

    static void assign(String mission,Astronaut a){
        addMission(mission);
        if(assigned.get(mission).contains(a.name)){
            System.out.println(a.name+" already assigned to "+mission);
            return;
        }
        missions.get(mission).add(a);
        assigned.get(mission).add(a.name);
        System.out.println(a.name+" assigned to "+mission);
    }

    static void display(){
        for(String mission:missions.keySet()){
            System.out.println("\nMission: "+mission);
            for(Astronaut a:missions.get(mission)){
                System.out.println(a);
            }
            System.out.println("Total Astronauts: "+missions.get(mission).size());
        }
    }

    public static void main(String[] args){
        assign("Chandrayaan",new Astronaut(1,"Rahul","Pilot"));
        assign("Chandrayaan",new Astronaut(2,"Amit","Scientist"));
        assign("Chandrayaan",new Astronaut(1,"Rahul","Pilot"));
        assign("Gaganyaan",new Astronaut(3,"Neha","Engineer"));
        display();
    }
}
