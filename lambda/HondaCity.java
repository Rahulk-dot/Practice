package lambda;

public class HondaCity {//implements Vehicle {

	public static void main(String[] args) {
		
//		//Normal Method
//		Vehicle hCity = new HondaCity();
//		hCity.Drive();
		
		//Using Lambda Functions
		Vehicle vehicle = () -> System.out.println("I am driving");
		Vehicle vehicle2 = () ->{
			System.out.println("hi");
			System.out.println("Driver");
		};
		vehicle.Drive();
		System.out.println("**********");
		vehicle2.Drive();
	}

//	@Override
//	public void Drive() {
//				 
//		System.out.println("I am driving!");
//		
//	}

}
