package com.brillio.tande.q1;

public abstract class Arithmetic {
    private int num1, num2, num3;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void setData(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void display(){
        System.out.println(String.format("Num1 = %s\nNum2 = %s\nResult = %s", getNum1(), getNum2(), getNum3()));
    }

    public abstract void calculate();
}
