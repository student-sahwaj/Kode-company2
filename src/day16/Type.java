package day16;

public class Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee set1 = new Employee("Sahwaj",40000,"Bangalore");
		Employee set2 = new Employee("Ankit",30000,"Chennai");
		Employee set3 = new Employee("Pardhu",35000,"Kolkata");
		Employee put[] = new Employee[3];
		 put[0] = set1;
		 put[1] = set2;
		 put[2] = set3;
		for(int i =0; i<put.length; i++) {
			if (put[i].salry > 35000) {
				System.out.println(put[i].name + " , " + put[i].adress );
			}
		}
		
		

	}

}
