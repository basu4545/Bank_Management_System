package Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Basu");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = new Bank();
		bank.setId(1);
		bank.setName("BOI");
		
		Account account1 = new Account();
		account1.setNo(1234);
		account1.setName("Raghu");
		account1.setBank(bank);
		
		Account account2 = new Account();
		account2.setNo(2369);
		account2.setName("Irayya");
		account2.setBank(bank);
		
		Account account3 = new Account();
		account3.setNo(1472);
		account2.setName("Mahesh");
		account2.setBank(bank);
		
		transaction.begin();
		manager.persist(account1);
		manager.persist(account2);
		manager.persist(account3);
		manager.persist(bank);
		transaction.commit();
	}
}
