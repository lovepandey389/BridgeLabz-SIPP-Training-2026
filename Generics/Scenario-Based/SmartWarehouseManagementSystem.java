import java.util.*;
abstract class WarehouseItem{String name;WarehouseItem(String n){name=n;}public String toString(){return name;}}
class Electronics extends WarehouseItem{Electronics(String n){super(n);}}
class Groceries extends WarehouseItem{Groceries(String n){super(n);}}
class Furniture extends WarehouseItem{Furniture(String n){super(n);}}
class Storage<T extends WarehouseItem>{
ArrayList<T> items=new ArrayList<>();
void add(T t){items.add(t);}
List<T> get(){return items;}
}
public class SmartWarehouseManagementSystem{
static void display(List<? extends WarehouseItem> list){for(WarehouseItem i:list)System.out.println(i);}
public static void main(String[] args){
Storage<Electronics> s=new Storage<>();
s.add(new Electronics("Laptop"));
s.add(new Electronics("TV"));
display(s.get());
}}
