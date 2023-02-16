package lesson_12_1;

import lesson_12_1.Engine;
import lesson_12_1.SteeringWheel;

public class Car {

	int horsePower;
	int prodYear;
	SteeringWheel steeringWheel;
	Engine engine;

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getProdYear() {
		return prodYear;
	}

	public void setProdYear(int prodYear) {
		this.prodYear = prodYear;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(int horsePower, int prodYear, SteeringWheel steeringWheel, Engine engine) {
		super();
		this.horsePower = horsePower;
		this.prodYear = prodYear;
		this.steeringWheel = steeringWheel;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car horsePower = " + horsePower + ", prodYear = " + prodYear + ", steeringWheel = " + steeringWheel
				+ ", engine = " + engine;
	}

}

class SteeringWheel {

	double diameter;
	String material;

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public SteeringWheel(double diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}

	@Override
	public String toString() {
		return "SteeringWheel [diameter=" + diameter + ", material=" + material + "]";
	}

}

class Engine {

	int cylinders;

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public Engine(int cylinders) {
		super();
		this.cylinders = cylinders;
	}

	@Override
	public String toString() {
		return "Engine [cylinders=" + cylinders + "]";
	}

}
