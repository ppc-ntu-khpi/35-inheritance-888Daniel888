package domain;

public class Animal {

    protected String name;

    protected int weight;

    public void Animal() {
        name="generic animal";
        weight=10;
    }

    public void eat() {
        System.out.println("Animal eating");
    }

    public void speak() {
        System.out.println("Animal speaking");
    }

    @Override
    public String toString() {
        return "Animal:" + "\name:\t" + name + "\nweight\t" + weight + '}';
    }

   
}
