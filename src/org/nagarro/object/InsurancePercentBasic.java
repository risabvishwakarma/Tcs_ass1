package org.nagarro.object;

import java.util.HashMap;

import org.nagarro.enums.CType;



public class InsurancePercentBasic {
	private  final  HashMap<CType,Float> map=new HashMap<>();
	public InsurancePercentBasic() {
		map.put(CType.HATCHBACK, 0.05F);
		map.put(CType.SEDAN, 0.08F);
		map.put(CType.SUV, 0.1F);
	}


	protected  float calculateInsurance(Car car){
		return car.getCarCostPrice()*map.get(car.getCarType());
		}

}
