package oop1.ex;

public class Account {
    int balance; // 잔액

    void deposit(int amount){
        balance += amount;
        System.out.println("현재 잔액"+balance);
    }


    void widthdraw(int amount){
        if(balance >= amount){
        balance -= amount;
            System.out.println("현재 잔액:"+balance);
        }else {
            System.out.println("잔액이 부족합니다");
        }
    }
}
