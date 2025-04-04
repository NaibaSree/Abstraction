package abstraction;

public class axis extends bank {
	int getRateOfInterest() {
		return 5;
	}

}
abstract class bank {
	abstract int getRateOfInterest();

}
public class hdfc extends bank{
	int getRateOfInterest() {
		return 8;
	}
}
public class working_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b=new axis();
		System.out.println("Axis bank rate of Interest is :"+b.getRateOfInterest()+"%");
		b=new hdfc();
		System.out.println("HDFC bank rate of Interest is :"+b.getRateOfInterest()+"%");
	}

}
