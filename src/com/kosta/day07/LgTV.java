package com.kosta.day07;

public class LgTV extends TV {

    @Override
    public void powerOn() {
        System.out.println(getClass().getSimpleName() + " 전원을 켠다.");
    }

    @Override
    public void powerOff() {
        System.out.println(getClass().getSimpleName() + " 전원을 끈다.");
    }

    public void print() {
        System.out.println(getClass().getSimpleName() + " print 추가");
    }
}
