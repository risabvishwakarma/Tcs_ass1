package org.nagarro.object;
import org.nagarro.enums.CType;

public class Car {

	private String CarModel;

	private CType carType;
	private int carCostPrice;

	private org.nagarro.enums.Insourance insourenceType;

	public Car() {}

	public Car( String carModel, CType carType, org.nagarro.enums.Insourance insourenceType, int carCostPrice) {
		super();
		this.CarModel = carModel;
		this.carType = carType;
		this.carCostPrice = carCostPrice;
		this.insourenceType = insourenceType;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		this.CarModel = carModel;
	}

	public CType getCarType() {
		return carType;
	}

	public void setCarType(CType carType) {
		this.carType = carType;
	}

	public int getCarCostPrice() {
		return carCostPrice;
	}

	public void setCarCostPrice(int carCostPrice) {
		this.carCostPrice = carCostPrice;
	}

	public org.nagarro.enums.Insourance getInsourenceType() {
		return insourenceType;
	}

	public void setInsourenceType(org.nagarro.enums.Insourance insourenceType) {
		this.insourenceType = insourenceType;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + CarModel + ", carType=" + carType + ", carCostPrice=" + carCostPrice
				+ ", insourenceType=" + insourenceType + "]";
	}




}
