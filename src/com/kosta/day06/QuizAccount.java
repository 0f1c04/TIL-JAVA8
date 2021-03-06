package com.kosta.day06;

//19 & 20.
public class QuizAccount {
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    private String ano;
    private String owner;
    private int balance;

    public QuizAccount() {
    }

    public QuizAccount(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > MIN_BALANCE && balance < MAX_BALANCE)
            this.balance = balance;
    }

    //@Override : 컴파일러에게 전달
    //재정의가 맞는지?
    @Override
    public String toString() {
        return ano + "  " + owner + "  " + balance;
    }
}
