package com.transaction.service.transaction;

public class GovernmentTransactionChain extends TransactionSetup {

    @Override
    public void sendMoney(Double money) {
        System.out.println("Government transaction registered");

        if (nextChain != null) {
            nextChain.sendMoney(money);
        }
    }
}
