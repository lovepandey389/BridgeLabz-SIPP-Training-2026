interface MealPlan{}
class VegetarianMeal implements MealPlan{}
class Meal<T extends MealPlan>{T plan;Meal(T p){plan=p;}}
public class PersonalizedMealPlanGenerator{
public static <T extends MealPlan> void generate(T plan){
System.out.println("Meal Generated: "+plan.getClass().getSimpleName());
}
public static void main(String[] args){
generate(new VegetarianMeal());
}}
