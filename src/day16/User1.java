package day16;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SbiBank user1 = new SbiBank("Sahwaj", 2345,"98765431");
		SbiBank user2 = new SbiBank("Ankit", 123,"53783628");
		SbiBank user3 = new SbiBank("Pardhu",6789,"76543234");
		SbiBank use[] = new SbiBank[3];
		use[0] = user1;
		use[1]  =user2;
		use[2]   = user3;
		for (int i =0; i<use.length;i++) {
			if (use[i].balance < 2000) {
				System.out.println(use[i].name + " " +  use[i].name.startsWith("S"));
				
			}
		}
		
	}

}
