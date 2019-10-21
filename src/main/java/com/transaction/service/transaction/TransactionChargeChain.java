package com.transaction.service.transaction;

public class TransactionChargeChain extends TransactionSetup{

    private int tax;

    @Override
    public void sendMoney(Double money) {
        double charges = money * tax / 100;
        System.out.println("Get bank commission charges " + charges);

        if (nextChain != null) {
            nextChain.sendMoney(money - charges);
        }
    }

    public void setTax(int tax) {
        this.tax = tax;
    }
}
