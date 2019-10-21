package com.transaction.service.transaction;

public class CompleteTransactionChain extends TransactionSetup{

    @Override
    public void sendMoney(Double money) {
        System.out.println("Successfully finished transaction. Money transferred: " + money + "$");

        if(nextChain != null){
            nextChain.sendMoney(money);
        }
    }
}
