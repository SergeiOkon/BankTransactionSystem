package com.transaction.service.transaction;

public class InnerTransactionChain extends TransactionSetup {

    @Override
    public void sendMoney(Double money) {
        System.out.println("Inner transaction registered");

        if (nextChain != null) {
            nextChain.sendMoney(money);
        }
    }
}
