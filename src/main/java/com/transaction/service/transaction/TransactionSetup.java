package com.transaction.service.transaction;

public abstract class TransactionSetup implements TransactionChain {

    TransactionChain nextChain;

    @Override
    public void setNext(TransactionChain transactionChain) {
        nextChain = transactionChain;
    }

    @Override
    abstract public void sendMoney(Double money);
}
