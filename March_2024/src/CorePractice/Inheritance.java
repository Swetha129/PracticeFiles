package CorePractice;


class Animal {
    public String Name;
    public int age;

    public Animal(String name, int age) {
        this.Name = name;
        this.age = age;
    }

    public String toString() {
        return "Animal{Name='" + this.Name + "', age=" + this.age + "}";
    }

    public void FoodTime() {
        System.out.println("The animal eats at 1PM");
    }

    public void sleepTime() {
        System.out.println("The animal sleeps at 8PM");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void sleepTime() {
        System.out.println("The cat sleeps at 9PM");
    }
}

class Dog extends Animal {
    public String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String toString() {
        String var10000 = this.breed;
        return "Dog{breed='" + var10000 + "'} " + super.toString();
    }

    public void sleepTime() {
        System.out.println("The dog sleeps at 7PM");
    }

    public void Barks() {
        System.out.println("The dog Barks");
    }
}
public class Inheritance {
    public Inheritance() {
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Snoopy", 3, "Golden Retriever");
        System.out.println(dog.toString());
    }
}