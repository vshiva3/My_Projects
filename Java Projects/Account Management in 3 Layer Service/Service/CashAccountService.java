package Service;

import java.math.BigDecimal;

import Pojo.CashAccount;

import Repository.TradeAccountRepository;

public class CashAccountService implements TradeAccountService{
    private TradeAccountRepository repository;

    public CashAccountService(TradeAccountRepository repository){
        this.repository = repository;
    }

    @Override
    public void deposit(String id, BigDecimal amount){
        CashAccount account = (CashAccount)retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().add(amount));
        updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount){
        CashAccount account = (CashAccount) retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().subtract(amount));
        updateTradeAccount(account);
    }

    public void createTradeAccount(CashAccount account){
        this.repository.createTradeAccount(account);
    }

    public CashAccount retrieveTradeAccount(String id){
        return (CashAccount)this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(CashAccount account){
        this.repository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id){
        this.repository.deleteTradeAccount(id);
    }
}
