package Abstraction;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle v1= new ElectricCar();
    v1.start();
    v1.drive();
    v1.accelerate();
    v1.stop();
    System.out.println("=======================================");
    Car c1=(Car)v1;
    c1.start();
    c1.drive();
    c1.accelerate();
    c1.stop();
    System.out.println("=======================================");
    ElectricCar e1=(ElectricCar)v1;
    e1.start();
    e1.drive();
    e1.accelerate();
    e1.charge();
    e1.openGate();
    e1.stop();
	}

}
