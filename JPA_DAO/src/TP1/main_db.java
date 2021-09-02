package TP1;

public class main_db {

	public static void main(String[] args) {
		// declare data
		Address address_0 = new Address("Tandil", "Chacabuco 930");
		Address address_1 = new Address("BJ", "Tucumán 31");
		Person seba = new Person(1, "Sebastián", 41, address_0);
		Person celia = new Person(2, "Celia", 38, address_1);
		
		// run queries
		Insert insertAddress_0 = new Insert(address_0);
		Insert insertSeba = new Insert(seba);
		//Delete delete = new Delete("DELETE FROM Person");
		//Delete delete_1 = new Delete("DELETE FROM Address");
		
		
	

	}

}
