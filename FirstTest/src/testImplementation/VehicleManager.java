package testImplementation;

/**
 * The VehicleManager is used to search and reserve vehicles
 * @author Alex Daniels
 */
public class VehicleManager {
	
	//Reference to the databasemanager
	DatabaseManager databaseManager;
	
	/**
	 * Creates a new VehicleManagerObject who can communicate
	 * with the given database manager
	 * @param dbm a database manager
	 */
	public VehicleManager(DatabaseManager dbm) {
		databaseManager = dbm;
	}
	
	/**
	 * Takes a single parameter and returns a list of vehicles
	 * that match the parameter
	 * @param criteria
	 * @return
	 */
	public Vehicle[] getVehicles(String criteria) {
		return databaseManager.getVehicles(criteria);
	}
	
	/**
	 * This will modify the reserved property of the given
	 *  vehicle from false to true
	 *  NOTE:THIS IS NOT HOW WE WILL IMPLEMENT THIS IN THE REAL
	 *  WORLD. THIS IS JUST TO TEST OUR DATABASE IMPLEMENTATION
	 * @param vehicle The vehicle to be reserved
	 */
	public void reserveVehicle(Vehicle vehicle) {
		databaseManager.reserveVehicle(vehicle);
	}

}
