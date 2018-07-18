package exercise3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class AccountCacheTest {

  @Test
  public void getAccountById_miss() {
    AccountDAO dbMock = mock(AccountDAO.class);
    AccountDAO cache = new AccountCache(dbMock);
    Account expected = cache.getAccountById("inexistent");
    assertThat(expected).isNull();
  }

  @Test
  public void getAccountById_miss_callsDAO() {
    AccountDAO dbMock = mock(AccountDAO.class);
    when(dbMock.getAccountById("inexistent")).thenReturn(null);
    AccountDAO cache = new AccountCache(dbMock);

    cache.getAccountById("inexistent");

    verify(dbMock).getAccountById("inexistent");
  }

  @Test
  public void getAccountById_cacheMiss_getsFromDAO() {
    AccountDAO dbMock = mock(AccountDAO.class);
    when(dbMock.getAccountById("existent")).thenReturn(new Account("existent"));
    AccountDAO cache = new AccountCache(dbMock);

    Account result = cache.getAccountById("existent");

    assertThat(result.getId()).isEqualTo("existent");
  }
  
  @Test
  public void getAccountById_cacheMiss_getsFromDAOAndPopulatesCache() {
    AccountDAO dbMock = mock(AccountDAO.class);
    when(dbMock.getAccountById("existent")).thenReturn(new Account("existent"));
    AccountDAO cache = new AccountCache(dbMock);

    cache.getAccountById("existent");
    cache.getAccountById("existent");

    verify(dbMock, times(1)).getAccountById("existent");
  }
}
