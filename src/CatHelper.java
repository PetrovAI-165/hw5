import java.util.List;
import java.util.Random;

public class CatHelper{

    public static Cat generateRandomCat(){
        List<String> names = List.of("Murzik","Monya","Nala","Simba","Matroskin");
        List<String> colors = List.of("Yellow","Black","White","Grey","Red");
        List<String> cities = List.of("Odesa","Lviv","Kyiv","Chernomorsk","Mykolayv");
        int rand = new Random().nextInt(5);
        Cat cat = new Cat(names.get(rand),colors.get(rand),cities.get(rand));
        return cat;
    };

    public static void catsMove(List<Cat> cats , String address){
        for (Cat cat: cats) {
            cat.setAddress(address);
        }
    }
}