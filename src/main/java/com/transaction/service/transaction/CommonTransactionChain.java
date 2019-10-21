package com.transaction.service.transaction;

public class CommonTransactionChain extends TransactionSetup {

    @Override
    public void sendMoney(Double money) {
        System.out.println("Common transaction registered");

        if (nextChain != null) {
            nextChain.sendMoney(money);
        }
    }
}
