package com.sist.abstractclass;
/*
 * 추상 클래스 Vehicle을 정의하고, 다음의 멤버 변수와 메서드를 포함하세요.

	protected String licensePlate (차량 번호)
	protected String model (모델명)
	생성자: 차량 번호와 모델명을 초기화
	public abstract double calculateFuel(double distance) (추상 메서드, 주유량 계산)
	Vehicle 클래스를 상속받는 Car 클래스, Truck 클래스, Motorcycle 클래스를 작성하세요.

	각 클래스는 고유한 연료 효율을 가집니다.
	calculateFuel 메서드를 구현하여 주행 거리(distance)와 연료 효율(fuelEfficiency)을 사용해 주유량을 계산합니다.
	테스트 클래스를 작성하여 다양한 차량 객체를 생성하고, 특정 주행 거리에서 필요한 주유량을 출력하세요.
 */
abstract class Vehicle {
	protected String licensePlate;
	protected String model;
	
	public Vehicle (String licensePlate, String model) {
		this.licensePlate = licensePlate;
		this.model = model;
	}
	public abstract double calculateFuel(double distance);
}
class Car extends Vehicle { 
	private double fuelEfficiency;
	
	public Car(String licensePlate, String model, double fuelEfficiency) {
		super(licensePlate, model);
		this.fuelEfficiency = fuelEfficiency;
	}
	@Override
	public double calculateFuel(double distance) {
		return 10 / fuelEfficiency;
	}
	
}
class Truck extends Vehicle {
	
	private double fuelEfficiency;
	
	public Truck(String licensePlate, String model, double fuelEfficiency) {
		super(licensePlate, model);
		this.fuelEfficiency = fuelEfficiency;
	}

	@Override
	public double calculateFuel(double distance) {
		return 10 / fuelEfficiency;
	}
	
	
	
}
class Motorcycle extends Vehicle {
	private double fuelEfficeincy;
	
	public Motorcycle(String licensePlate, String model, double fuelEfficiency) {
		super(licensePlate, model);
	}

	@Override
	public double calculateFuel(double distance) {
		return 10 / fuelEfficeincy;
	}
	
}
public class Vehicletest {

	public static void main(String[] args) {
		Truck truck = new Truck("153하2252", "Doodonebahn", 1.0);	
		double fuelNeeded = truck.calculateFuel(10);
		
		System.out.println("Truck license plate: " + truck.licensePlate);
		System.out.println("Truck model: " + truck.model);
		System.out.println("Fuel needed for 10km: " + fuelNeeded + " liters");
		
	}

}
