package com.kosta.day06;

import java.util.Scanner;

/**
 * @author f1c04
 * Application
 */

public class QuizBankApplication {
    static Scanner sc = new Scanner(System.in);
    static QuizAccount[] quizAccountArray = new QuizAccount[100];

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");

            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    //계좌생성하기
    private static void createAccount() {
        String ano;
        String owner;
        int balance;

        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");

        System.out.print("계좌번호: ");
        ano = sc.next();
        System.out.print("계좌주: ");
        owner = sc.next();
        System.out.print("초기입금: ");
        balance = sc.nextInt();

        for (int i = 0; i < quizAccountArray.length; i++) {
            if (quizAccountArray[i] == null) {
                quizAccountArray[i] = new QuizAccount(ano, owner, balance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    //계좌목록보기
    private static void accountList() {
        System.out.println("------");
        System.out.println("계좌목록");
        System.out.println("------");
        for (QuizAccount quizAccount : quizAccountArray) {
            if (quizAccount != null) {
                System.out.println(quizAccount.toString());
            }
        }
    }

    //예금하기
    private static void deposit() {
        System.out.println("------");
        System.out.println("예금");
        System.out.println("------");
        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("예금액: ");
        int depositAmount = sc.nextInt();

        QuizAccount quizAccount = findAccount(ano);

        if (quizAccount == null) {
            System.out.println("계좌가 없습니다.");
        }

        if (quizAccount != null) {
            quizAccount.setBalance(quizAccount.getBalance() + depositAmount);
        }
        System.out.println("예금이 성공되었습니다.");
    }

    //출금하기
    private static void withraw() {
        System.out.println("------");
        System.out.println("출금");
        System.out.println("------");
        System.out.print("계좌번호: ");
        String ano = sc.next();
        System.out.print("출금액: ");
        int depositAmount = sc.nextInt();

        QuizAccount quizAccount = findAccount(ano);

        if (quizAccount == null) {
            System.out.println("계좌가 없습니다.");
        }

        if (quizAccount != null) {
            quizAccount.setBalance(quizAccount.getBalance() - depositAmount);
        }
        System.out.println("출금이 성공되었습니다.");
    }

    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static QuizAccount findAccount(String ano) {
        for (QuizAccount quizAccount : quizAccountArray) {
            if (quizAccount.getAno().equals(ano)) {
                return quizAccount;
            }
        }
        return null;
    }
}
