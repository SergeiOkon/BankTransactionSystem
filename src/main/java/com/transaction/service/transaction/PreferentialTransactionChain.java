package com.transaction.service.transaction;

public class PreferentialTransactionChain extends TransactionSetup{

    @Override
    public void sendMoney(Double money) {
        System.out.println("Preferential transaction registered");

        if (nextChain != null) {
            nextChain.sendMoney(money);
        }
    }
}
