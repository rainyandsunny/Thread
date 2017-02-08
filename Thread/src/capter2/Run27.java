package capter2;

import capter2.PublicClass.PrivateClass;

public class Run27 {

	public static void main(String[] args) {
		
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());
		
	}

}
