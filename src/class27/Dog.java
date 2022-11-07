package class27;
//งง
public class Dog {
    //var  = can be use for local variable

    private String name;       //Instance field
    private String color;
    private String breed;


    public Dog(String name, String color, String breed) {
        setName(name);
        setColor(color);
        setBreed(breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
