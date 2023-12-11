package com.kodnest.oops;

abstract class Vehicle{
	//common method for all vehicles
	public void start() {
		System.out.println("Vehicle has started");
	}
	public void stop() {
		System.out.println("Vehicle has stopped");
	}
	//Abstract method for refueling (implementation will differ for each vehicle)
	abstract void refuel();
}

class ElectricCar extends Vehicle{
	@Override
	void refuel() {
		System.out.println("Charging the car's battery.");
	}
}

class PetrolCar extends Vehicle{
	@Override
	void refuel() {
		System.out.println("Filling up with petrol.");
	}
}

class DieselCar extends Vehicle{
	@Override
	void refuel() {
		System.out.println("Filling up with diesel.");
	}
}

public class VehicleApp {
	public static void main(String[] args) {
		ElectricCar eCar = new ElectricCar();
		PetrolCar pCar = new PetrolCar();
		DieselCar dCar = new DieselCar();
		
		VehicleApp va = new VehicleApp();
		va.drive(eCar);
		va.drive(pCar);
		va.drive(dCar);
	}
	public void drive(Vehicle v) {
		v.start();
		v.refuel();
		v.stop();
	}
}
