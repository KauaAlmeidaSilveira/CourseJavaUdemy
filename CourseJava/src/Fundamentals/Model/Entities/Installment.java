package Fundamentals.Model.Entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private Double value;

    public Installment(LocalDate dueDate, Double value) {
        this.dueDate = dueDate;
        this.value = value;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
