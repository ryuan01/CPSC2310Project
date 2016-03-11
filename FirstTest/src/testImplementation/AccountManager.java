package testImplementation;

/**
 * This class is used by the security manager to comunicate 
 * with the DataBasemanager to retrieve account information
 * @author Alex Daniels
 * 
 */
public class AccountManager {
	
	
	//A reference to the database manager
	
	DatabaseManager databaseManager;
	
	/**
	 * An account manager is constructed with a reference to 
	 * the database manager
	 * @param dbm a database manager
	 */
	public AccountManager(DatabaseManager dbm) {
		databaseManager = dbm;
	}
	
	/**
	 * This method is used by the security manager to get 
	 * an account objects
	 * @param userName The login name of the user
	 * @return an account object
	 */
	public Account getAccount(String userName) {
		
		return databaseManager.getAccount(userName);
		
	}
	
	

}
