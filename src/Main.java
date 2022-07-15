import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat(),CatHelper.generateRandomCat());
        System.out.println(cats);
        CatHelper.catsMove(cats,"Vinnitsa");
        System.out.println(cats);

        Author auth1 = new Author("Simon R. Green","25-08-1955","SOme info");
        Author auth2 = new Author("Rick Riordan","05-06-1964","Some Info");
        Book book1 = new Book("Hok & Fisher","21323213");
        Book book2 = new Book("Something from the Nightside ","2213213e21");
        Book book3 = new Book("The Lightning Thief","s22e3121");
        Book book4 = new Book("The Sea of Monsters","2312312dsdss");
        Library library = new Library(Map.of(auth1.getName(),Set.of(book1,book2),auth2.getName(),Set.of(book3,book4)),"lovecraft Memorial Library");
        System.out.println(library.getAllBooksByAuthorName(auth1.getName()));
    }
}