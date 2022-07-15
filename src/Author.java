import java.util.Date;
import java.util.Objects;

public class Author {
    private final String name;
    private final String bd;
    private String info;

    public Author(String name, String bd, String info) {
        this.name = name;
        this.bd = bd;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getBd() {
        return bd;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && bd.equals(author.bd) && info.equals(author.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bd, info);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", bd=" + bd +
                ", info='" + info + '\'' +
                '}';
    }
}
