package Abstraction;

public class ElectricCar extends Car{
	@Override
	public  void start() {
		System.out.println("Start Electric Car ");
	}
	@Override
	public  void drive() {
		System.out.println("Drive the Electric Car");
	}
	@Override
	public void openGate() {
		System.out.println("Open the Electric car gate");
		}
		public void charge(){
			System.out.println("Charge the Electric car");
		}
		public void accelerate() {
			System.out.println("Accelerate the Electric Car");
			
		}
		public void stop() {
			System.out.println("Stop the ElectricCar");
			
		}
		
	}


