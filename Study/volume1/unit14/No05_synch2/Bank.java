package com.volume1.unit14.No05_synch2;

import java.util.Arrays;

/**
 * @author littlecorgi_a1203991686@126.com
 * @data 2018/08/10
 */
public class Bank {
    private final double[] accounts;

    public Bank(int n, double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
        while (accounts[from] < amount){
            wait();
        }
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        notify();
    }

    public synchronized double getTotalBalance(){
        double sum = 0;
        for (double account : accounts) {
            sum += account;
        }
        return sum;
    }

    public int size(){
        return accounts.length;
    }
}
