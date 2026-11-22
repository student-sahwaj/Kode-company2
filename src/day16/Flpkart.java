package day16;

public class Flpkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product set = new Product("Iphone",180000,"123hks");
		Product set1 = new Product("sumsumg galaxy",200000,"7543hks");
		Product set2 = new Product("Google",180000,"123hkjds");
		Product push[] = new Product[3];
		push[0] = set;
		push[1] = set1;
		push[2] = set2;
		for (int i =0; i<push.length;i++) {
			if (push[i].price == 180000) {
				System.out.println(push[i].name + " , " + push[i].id);
			}
		}


	}

}
