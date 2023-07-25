import java.util.List;

public class Formatter {
    public static String getCaseRub(double sumRub){
        if(sumRub%10 == 1){
            return "рубль";
        }
        else if(sumRub%10 >= 2 &&  sumRub%10 <= 4){
            return "рубля";
        }
        else{
            return "рублей";
        }
    }

    public static String getFinalSum(int countPerson, List<Product> products){
        double sumPerPerson = 0;
        double sumAllProducts = 0;
        for(Product p : products){
            sumAllProducts += p.getPrice();
        }
        sumPerPerson = sumAllProducts / countPerson;

        return String.format("Каждый должен заплатить %.2f %s", sumPerPerson, getCaseRub(sumPerPerson));
    }
}
