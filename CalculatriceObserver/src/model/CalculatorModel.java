

package model;


import java.util.Observable;

public class CalculatorModel extends Observable {
    private double number1;
    private double number2;
    private double result;

    public void setNumber1(double number1) {
        this.number1 = number1;
        calculate();
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
        calculate();
    }

    public void add() {
        result = number1 + number2;
        setChanged();
        notifyObservers();
    }

    public double getResult() {
        return result;
    }

    private void calculate() {
        add();
    }
}
