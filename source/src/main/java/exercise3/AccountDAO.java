package exercise3;

public interface AccountDAO {

  public Account getAccountById(String id);

  public Account store(Account account);
}
