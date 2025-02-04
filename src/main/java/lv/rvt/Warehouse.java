package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity < 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (amount <= howMuchSpaceLeft()) {
                this.balance += amount;
            } else {
                this.balance = this.capacity;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount > 0) {
            if (amount <= this.balance) {
                this.balance -= amount;
                return amount;
            } else {
                this.balance = 0;
                return this.balance;
            }
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("balance = %.1f, space left %.1f", this.balance, howMuchSpaceLeft());
    }
}
