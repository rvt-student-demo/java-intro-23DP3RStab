package lv.rvt;

public class HealthStation {
    private int weighings;

    public int weigh(Person person) {
        // double heightPerHundred = person.getHeight() / 100.0;
        // double weight = person.bodyMassIndex() * (heightPerHundred * heightPerHundred);
        // return (int) weight;
        this.weighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.weighings;
    }
}
