package com.transaction;

import com.transaction.service.TransactionService;

public class Main {
    public static void main(String[] args) {

        TransactionService transactionService = new TransactionService();

        transactionService.runCommonTransaction();
        transactionService.runGovernmentTransaction();
        transactionService.runInnerTransaction();
        transactionService.runPreferentialTransaction();
    }
}
