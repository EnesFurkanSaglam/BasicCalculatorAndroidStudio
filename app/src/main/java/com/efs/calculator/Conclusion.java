package com.efs.calculator;

public class Conclusion {
    private int n1;
    private int n2;

    public Conclusion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int Plus(){
        return n1 + n2;
    }
    public int Minus(){
        return n1 - n2;
    }
    public int Multiply(){
        return n1 * n2;
    }
    public int Divide(){
        return n1 / n2;
    }

}
