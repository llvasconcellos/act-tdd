package exercise3;

import java.util.HashMap;
import java.util.Map;

public class AccountCache implements AccountDAO {

  private AccountDAO db;
  private Map<String, Account> cache = new HashMap<>();

  public AccountCache(AccountDAO db) {
    this.db = db;
  }

  @Override
  public Account getAccountById(String id) {
    if (!this.cache.containsKey(id)) {
      Account acc = this.db.getAccountById(id);
      this.cache.put(id, acc);
    }
    return this.cache.get(id);
  }

  @Override
  public Account store(Account account) {
    // TODO Auto-generated method stub
    return null;
  }

}
