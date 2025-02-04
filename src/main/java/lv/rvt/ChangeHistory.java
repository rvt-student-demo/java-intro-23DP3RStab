package lv.rvt;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> records;

    public ChangeHistory() {
        this.records = new ArrayList<>();
    }

    public void add(double status) {
        this.records.add(status);
    }

    public void clear() {
        this.records.clear();
    }

    public double maxValue() {
        if (this.records.isEmpty()) {
            return 0;
        } else {
            return Collections.max(this.records);
        }
    }

    public double minValue() {
        if (this.records.isEmpty()) {
            return 0;
        } else {
            return Collections.min(this.records);
        }
    }

    public double average() {
        if (this.records.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (double record : this.records) {
                sum += record;
            }
            return sum / this.records.size();
        }
    }

    @Override
    public String toString() {
        return this.records.toString();
    }
}