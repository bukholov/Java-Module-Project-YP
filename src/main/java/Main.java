import java.util.List;

public class Main {
      public static void main(String[] args) {
        System.out.println("На сколько человек разделить счёт?");
        int countPerson = Calculator.getCountPerson();
        List<Product> acceptedProducts = Calculator.getUserInput();
        System.out.println("Добавленные товары:");
        for(Product p : acceptedProducts){
            System.out.println(p.getName());
        }
        System.out.println(Formatter.getFinalSum(countPerson, acceptedProducts));
    }



}
