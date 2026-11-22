package day16;

public class Branch {
	public static void main(String args[]) {
		Student set = new Student("Ankit",150,"1234566");
		Student set1 = new Student("Sahwaj",145,"0177CS211142");
		Student set2 = new Student("Pardhu", 140,"7890fghj");
		Student people[] = new Student[3];
		people[0] = set;
		people[1] = set1;
		people[2] = set2;
		for (int i =0; i<people.length;i++) {
			if (people[i].margs > 146) {
				System.out.println(people[i].name + " " + people[i].rollNumber);
			}
		}
		
	}

}
