import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static List<Product> getUserInput(){
        System.out.println("Введите название товара одним словом и его стоимость через пробел. Например, \"Чай 25.50\"");
        Scanner scanner = new Scanner(System.in);
        List<Product> values = new ArrayList<Product>();

        String inputValue;
        while(true){
            inputValue = scanner.nextLine();

            if (inputValue.equalsIgnoreCase("завершить")){
                return values;
            }
            try{
                String[] inputProduct = inputValue.trim().split(" ");
                double productPrice;
                productPrice = Double.parseDouble(inputProduct[1].trim());
                if (productPrice<=0){
                    throw  new Exception();
                }
                values.add(new Product(inputProduct[0].trim(), productPrice));
                System.out.println("Товар успешно добавлен в корзину! Ввведите следующий товар.\nДля окончания ввода товаров напишите \"завершить\"");
            }
            catch(Exception e){
                System.out.println("Ввведено некорректное значение. Введите название товара и его стоимость через \" \". Например, \"Чай 25.50\"");
            }
        }
    }
    public  static int getCountPerson(){
        Scanner scanner = new Scanner(System.in);
        int inputCountPerson = 0;
        try{
            inputCountPerson = scanner.nextInt();
            if(inputCountPerson <= 1) {
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("Ввведено некорректное значение для подсчёта. Попробуйте ещё раз.");
            inputCountPerson = getCountPerson();
        }
        return inputCountPerson;
    }

}
