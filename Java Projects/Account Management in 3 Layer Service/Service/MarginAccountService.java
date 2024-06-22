package Service;

import java.math.BigDecimal;

import Pojo.MarginAccount;

import Repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService{
    
    private TradeAccountRepository repository;

    public MarginAccountService(TradeAccountRepository repository){
        this.repository = repository;
    }
    @Override
    public void deposit(String id, BigDecimal amount){
        MarginAccount account = (MarginAccount) retrieveTradeAccount(id);
        account.setMargin(account.getMargin().add(amount));
        updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount){
        MarginAccount account = (MarginAccount)retrieveTradeAccount(id);
        account.setMargin(account.getMargin().subtract(amount));
        updateTradeAccount(account);
    }

    public void createTradeAccount(MarginAccount account){
        this.repository.createTradeAccount(account);
    }

    public MarginAccount retrieveTradeAccount(String id){
        return (MarginAccount)this.repository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount account){
        this.repository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id){
        this.repository.deleteTradeAccount(id);
    }
}
