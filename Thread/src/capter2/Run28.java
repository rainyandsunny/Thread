package capter2;

import capter2.PublicClass1.PrivateClass;

/**
 * ¾²Ì¬ÄÚ²¿Àà
 * @author yhp5210
 *
 */
public class Run28 {

	public static void main(String[] args) {

		PublicClass1 publicClass = new PublicClass1();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " " 
				+ publicClass.getPassword());
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());
	}

}
