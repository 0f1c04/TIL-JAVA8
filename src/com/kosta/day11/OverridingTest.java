package com.kosta.day11;

public class OverridingTest {
    public static void main(String args[]){
        int i = 10;
        int j = 20;

        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);
        String s1 = "30";

        System.out.println(ms1);
        System.out.println(ms2);

        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");
        else
            System.out.println("ms1과 ms2의 합계는 동일하지 않습니다.");

        if(ms1.equals(s1))
            System.out.println("ms1과 s1의 합계는 동일합니다.");
        else
            System.out.println("ms1과 s1의 합계는 동일하지 않습니다.");
    }
}
