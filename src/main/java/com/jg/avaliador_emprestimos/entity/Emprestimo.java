package com.jg.avaliador_emprestimos.entity;

public class Emprestimo {
    private String type;
    private double income;

    public Emprestimo(String type, double income) {
        this.type = type;
        this.income = income;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "loans{" +
                "type='" + type + '\'' +
                ", interest_rate=" + income +
                '}';
    }
}
