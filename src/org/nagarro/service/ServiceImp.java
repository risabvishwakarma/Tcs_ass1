package org.nagarro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.nagarro.enums.CType;
import org.nagarro.enums.Insourance;
import org.nagarro.enums.YesNO;
import org.nagarro.exception.CarInsuranceTypeException;
import org.nagarro.exception.CarModelException;
import org.nagarro.exception.CarPriceException;
import org.nagarro.exception.CarTypeException;
import org.nagarro.object.Car;
import org.nagarro.object.InsurancePercentPremium;

public class ServiceImp implements Service {
	Scanner sc = new Scanner(System.in);
	final float PERCENT = .01F;

	List<Car> list = new ArrayList<>();

	public ServiceImp() {
	}

	private void insertValue(Car car) throws CarModelException, CarTypeException, CarInsuranceTypeException,
			CarPriceException, NumberFormatException, Exception {

		if (null == car.getCarModel()) {
			String MODEL = sc.next().trim();
			try {
				car.setCarModel(MODEL);
			} catch (Exception e) {
				throw new CarModelException();
			}
		} else
			System.out.println(car.getCarModel());


		if (null == car.getCarType()) {
			String CARTYPE = sc.next().trim();
			try {
				car.setCarType(CType.valueOf(CARTYPE));
			} catch (Exception e) {
				throw new CarTypeException();
			}

		} else
			System.out.println(car.getCarType());

		if (null == car.getInsourenceType()) {
			String InsurenceType = sc.next().trim();
			try {
				car.setInsourenceType(Insourance.valueOf(InsurenceType));
			} catch (Exception e) {
				throw new CarInsuranceTypeException();
			}

		} else
			System.out.println(car.getInsourenceType());

		String price = sc.next();
		if (!isValidPrice(price))
			throw new CarPriceException();
		else
			car.setCarCostPrice(Integer.parseInt(price));

	}

	private boolean isValidPrice(String s) throws Exception {
		for (int i = 0; i < s.length(); i++)
			if (!Character.isDigit(s.charAt(i)))
				return false;

		return Integer.parseInt(s) > 0 ? true : false;
	}

	@Override
	public void createCar() {
		YesNO FLAG = YesNO.y;

		Car car = new Car();
		do {

			System.out.println("Enter MODEL, TYPE, INSURANCE, COST");
			try {
				insertValue(car);
				list.add(car);

				do {
					System.out.print("Do You Want To Enter Details Of Any Other Car (y/n):");
					try {
						FLAG = YesNO.valueOf(String.valueOf(sc.next().charAt(0)));
						break;
					} catch (Exception e) {
					}
				} while (true);
				if (FLAG.equals(YesNO.y))
					car = new Car();

			} catch (CarTypeException | CarInsuranceTypeException | CarPriceException | CarModelException
					| Exception e) {

				System.out.println("Error : " + e.getMessage());
			}
			System.out.println(list.size());
		} while (FLAG.equals(YesNO.y));

	}

	@Override
	public void getCars() {

		if (list.size() <= 0) {
			System.out.println("No Car");
			return;
		}

		list.forEach(i -> System.out.println(i.toString()));

	}

	@Override
	public void calculateInsurance() {
		for (Car car : list)
			System.out.println("Insurance for" + car.getCarModel() + " : "
					+ InsurancePercentPremium.Factory().calculateInsurance(car));
	}

}
