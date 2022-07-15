import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat());
        System.out.println(cats);
        CatHelper.catsMove(cats,"Vinnitsa");
        System.out.println(cats);
    }
}