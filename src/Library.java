import java.util.*;
import java.util.stream.Collectors;

public class Library {
    private Map<String,Set<Book>> catalog;
    private String name;

    public Library(Map<String,Set<Book>> catalog, String name) {
        this.catalog = catalog;
        this.name = name;
    }

    public Map<String,Set <Book>> getCatalog() {
        return catalog;
    }

    public void setCatalog(Map<String,Set<Book>> catalog) {
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return catalog.equals(library.catalog) && name.equals(library.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalog, name);
    }

    @Override
    public String toString() {
        return "Library{" +
                "catalog=" + catalog +
                ", name='" + name + '\'' +
                '}';
    }

    public Map<String,Set<Book>> addBook(Author author,Book book){
        if(catalog.get(author)==null){
            catalog.replace(author.getName(),Set.of(book));
        }else {
            catalog.get(author).add(book);
        }
        return catalog;
    };

    public Map<String,Set<Book>> addAuthor(Author author){
        catalog.put(author.getName(),null);
        return catalog;
    };
    public Set<Book> getAllBooksByAuthorName(String  author){
        Set<Book> result = new HashSet<Book>();
        result = catalog.get(author);
        return result;
    }
}
