package domain;

public class Cat extends Predator {

    private String kind;

    public Cat(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Cat() {
        this("Boddy", 5, "Azian");
    }

    public Cat(String name) {
       this(name,5, "Azian");
    }

    
    public void play() {
        System.out.println("Cat is playing");
    }

    /**
     *
     */
    public void hunt() {
      System.out.println("Cat hunting a mouse");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" +this.kind+"\n\nThus is Cat!";
    }

    @Override
    public void speak() {
         System.out.println("Meow");
    }

    @Override
    public void eat() {
         System.out.println("Cat eat meet");
    }

    @Override
    public void Animal() {
        super.Animal(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
