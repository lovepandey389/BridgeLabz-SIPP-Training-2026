import java.util.*;

class Pair<T,U>{
    T first;
    U second;
    Pair(T first,U second){
        this.first=first;
        this.second=second;
    }
    void display(){
        System.out.println(first+" "+second);
    }
}

class Stack<T>{
    ArrayList<T> list=new ArrayList<>();
    void push(T value){list.add(value);}
    T pop(){return list.remove(list.size()-1);}
}

class Repository<T>{
    ArrayList<T> data=new ArrayList<>();
    void add(T value){data.add(value);}
    void display(){System.out.println(data);}
}

public class GenericsBasics{

    public static <T extends Comparable<T>> T findMax(T[] arr){
        T max=arr[0];
        for(T value:arr){
            if(value.compareTo(max)>0){
                max=value;
            }
        }
        return max;
    }

    public static void printList(List<?> list){
        for(Object obj:list){
            System.out.println(obj);
        }
    }

    public static void main(String[] args){
        Pair<String,Integer> p=new Pair<>("Rahul",101);
        p.display();

        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());

        Integer[] arr={5,9,3,1};
        System.out.println(findMax(arr));

        Repository<String> repo=new Repository<>();
        repo.add("Java");
        repo.add("Python");
        repo.display();

        List<String> list=Arrays.asList("A","B","C");
        printList(list);
    }
}
