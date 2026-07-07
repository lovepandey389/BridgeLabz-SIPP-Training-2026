import java.util.*;

public class SmartCityTrafficMonitoringSystem{
    static HashMap<String,Integer> traffic=new HashMap<>();

    static void update(String road,int count){
        traffic.put(road,traffic.getOrDefault(road,0)+count);
    }

    static void report(){
        TreeMap<String,Integer> sorted=new TreeMap<>(traffic);
        String busy="";
        int max=-1;
        System.out.println("Traffic Report:");
        for(String road:sorted.keySet()){
            int c=sorted.get(road);
            System.out.println(road+" : "+c);
            if(c>max){
                max=c;
                busy=road;
            }
        }
        System.out.println("Busiest Road: "+busy);
        System.out.println("Total Roads: "+sorted.size());
    }

    public static void main(String[] args){
        update("MG Road",120);
        update("Ring Road",200);
        update("Station Road",150);
        update("MG Road",30);
        report();
    }
}
