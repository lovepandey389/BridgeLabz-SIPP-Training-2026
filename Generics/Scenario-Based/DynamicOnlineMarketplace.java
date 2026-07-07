import java.util.*;
class Product<T>{String name;double price;T category;Product(String n,double p,T c){name=n;price=p;category=c;}public String toString(){return name+" "+price;}}
public class DynamicOnlineMarketplace{
public static <T extends Product<?>> void applyDiscount(T p,double per){p.price=p.price-(p.price*per/100);}
public static void main(String[] args){
Product<String> b=new Product<>("Java Book",500,"Book");
applyDiscount(b,10);
System.out.println(b);
}}
