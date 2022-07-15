import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Example for cats
        List<Cat> cats = List.of(CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat());
        System.out.println(cats);
        CatHelper.catsMove(cats,"Vinnitsa");
        System.out.println(cats);

        //Example for books
        Author auth1 = new Author("Simon R. Green","25-08-1955","SOme info");
        Author auth2 = new Author("Rick Riordan","05-06-1964","Some Info");
        Book book1 = new Book("Hok & Fisher","21323213");
        Book book2 = new Book("Something from the Nightside ","2213213e21");
        Book book3 = new Book("The Lightning Thief","s22e3121");
        Book book4 = new Book("The Sea of Monsters","2312312dsdss");

        Library library = new Library(Map.of(auth1.getName(),Set.of(book1,book2),auth2.getName(),Set.of(book3,book4)),"lovecraft Memorial Library");
        System.out.println(library.getAllBooksByAuthorName(auth1.getName()));

        //Example for driver license
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Driver driver1 = new Driver("Ivan","e32sd3131sd2312","dsa23212d211",dateFormat.parse("15.07.2021"));
        Driver driver2 = new Driver("Dmytro",null,"ds21321wew32ead232111",dateFormat.parse("11.02.2015"));
        Driver driver3 = new Driver("Oleksandr","e32ss22ds32131sd",null,dateFormat.parse("11.02.2015"));
        Driver driver4 = new Driver("Oleg","e321212sds2313sd","ds31231ad21321311",dateFormat.parse("16.07.2021"));

        System.out.println(Inspector.driveAccess(driver1));
        System.out.println(Inspector.driveAccess(driver2));
        System.out.println(Inspector.driveAccess(driver3));
        System.out.println(Inspector.driveAccess(driver4));


    }
}