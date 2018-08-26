package com.example.Kalkulator;

public class Calculator {

    private int a;
    private int b;
    private String operation;

    public Calculator(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int min(int a, int b){
        return a-b;
    }

    public int tim(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if (b != 0){return a/b;}
        else return 0;
    }
}
