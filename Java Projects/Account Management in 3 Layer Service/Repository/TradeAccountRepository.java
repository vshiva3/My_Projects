package Repository;

import java.util.HashMap;
import java.util.Map;

import Pojo.TradeAccount;

public class TradeAccountRepository {
    private Map<String, TradeAccount> dataStore = new HashMap<>();

    public void createTradeAccount(TradeAccount account){
        this.dataStore.put(account.getId(), account.clone());
    }

    public TradeAccount retrieveTradeAccount(String id){
        return this.dataStore.get(id).clone();
    }

    public void updateTradeAccount(TradeAccount account){
        this.dataStore.put(account.getId(), account.clone());
    }

    public void deleteTradeAccount(String id){
        this.dataStore.remove(id);
    }
}
