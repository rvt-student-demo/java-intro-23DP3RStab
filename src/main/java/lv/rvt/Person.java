package lv.rvt;

public class Person {
    private String name;
    private SimpleDate birthday;
    private String address;
    private int age;
    private int weight;
    private int height;
    
    public Person(String name) {
        this(name, 0, 0, 0);
    }
    
    public Person(String name, SimpleDate birthday, int weight, int age) {
        this(name, age, 0, weight);
        this.birthday = birthday;
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String address) {
        this(name, 0, 0, 0);
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name) &&
            this.age == comparedPerson.age &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height && this.birthday.equals(comparedPerson.birthday)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + " \n  " + this.address;
    }
}