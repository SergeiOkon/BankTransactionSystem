package com.transaction.service;

import com.transaction.service.transaction.*;

import java.util.Scanner;

public class TransactionService {

    private Scanner scanner;

    public TransactionService() {
        scanner = new Scanner(System.in);
    }

    private double scanUserMoney() {
        System.out.println("Money value to transfer: ");
        return scanner.nextDouble();
    }

    public void runCommonTransaction() {
        Double money = scanUserMoney();

        TransactionSetup commonTransaction = new CommonTransactionChain();
        TransactionChargeChain transactionCharge = new TransactionChargeChain();
        CompleteTransactionChain complete = new CompleteTransactionChain();
        transactionCharge.setTax(10);

        commonTransaction.setNext(transactionCharge);
        transactionCharge.setNext(complete);
        commonTransaction.sendMoney(money);
    }

    public void runGovernmentTransaction() {
        Double money = scanUserMoney();

        TransactionSetup governmentTransaction = new GovernmentTransactionChain();
        TransactionChargeChain transactionCharge = new TransactionChargeChain();
        CompleteTransactionChain complete = new CompleteTransactionChain();
        transactionCharge.setTax(0);

        governmentTransaction.setNext(transactionCharge);
        transactionCharge.setNext(complete);
        governmentTransaction.sendMoney(money);
    }

    public void runInnerTransaction() {
        Double money = scanUserMoney();

        TransactionSetup innerTransaction = new InnerTransactionChain();
        TransactionChargeChain transactionCharge = new TransactionChargeChain();
        CompleteTransactionChain complete = new CompleteTransactionChain();
        transactionCharge.setTax(11);

        innerTransaction.setNext(transactionCharge);
        transactionCharge.setNext(complete);
        innerTransaction.sendMoney(money);
    }

    public void runPreferentialTransaction() {
        Double money = scanUserMoney();

        TransactionSetup preferentialTransaction = new PreferentialTransactionChain();
        TransactionChargeChain transactionCharge = new TransactionChargeChain();
        CompleteTransactionChain complete = new CompleteTransactionChain();
        transactionCharge.setTax(7);

        preferentialTransaction.setNext(transactionCharge);
        transactionCharge.setNext(complete);
        preferentialTransaction.sendMoney(money);
    }
}
