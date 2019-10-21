package com.transaction.service.transaction;

public interface TransactionChain {

    void setNext(TransactionChain transactionSetup);

    void sendMoney(Double money);
}
