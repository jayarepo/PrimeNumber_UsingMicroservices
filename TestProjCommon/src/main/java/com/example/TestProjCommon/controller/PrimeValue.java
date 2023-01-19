package com.example.TestProjCommon.controller;

public class PrimeValue {
    private int Pvno;

    public int getName(Integer Pvno) {
        return Pvno;
    }

    public void setName(Integer Pvno) {
        this.Pvno = Pvno;
    }

    @Override
    public String toString() {
        return "PrimeValue{" +
                "Pvno='" + Pvno + '\'' +
                '}';
    }
}

