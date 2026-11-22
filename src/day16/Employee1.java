package day16;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company set = new Company("Amazone",200000,"Backend Engineer");
		Company set1 = new Company("Flipkart",300000,"Tester");
		Company set2 = new Company("Visa",400000,"Developer");
		Company rear[] = new Company[3];
		rear[0] = set;
		rear[1] = set1;
		rear[2] = set2;
		for (int i =0; i<rear.length;i++) {
			if (rear[i].salry > 200000) {
				System.out.println(rear[i].name + " , " + rear[i].type);
			}
		}
		
		

	}

}
