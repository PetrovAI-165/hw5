import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Cat {

    private String name;
    private String color;
    private String address;

    public Cat(String name, String color, String address) {
        this.name = name;
        this.color = color;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name) && color.equals(cat.color) && address.equals(cat.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, address);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


