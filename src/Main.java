import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Car обьекть тузуп конструктор менен толтурдум
        Car car1 = new Car(1,"138АВ");
        //Dannyi обьекть тузуп конструктор менен толтурдум
        Dannyi dannyi1 = new Dannyi(2003,"BMW",200000,"Черный");
//HashMap тузуп,ключ = Car.Balues = Dannyi
        Map<Car,Dannyi>avto = new HashMap<>(Map.of(car1,dannyi1));
        //Entryset жардамы менен данныйларды консльго чыгардым!
        for (Map.Entry a: avto.entrySet()){
        System.out.println(a.getKey()+"\n"+a.getValue());

    }
}}