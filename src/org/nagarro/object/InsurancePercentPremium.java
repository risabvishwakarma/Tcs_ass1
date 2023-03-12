package org.nagarro.object;

import org.nagarro.enums.Insourance;

public class InsurancePercentPremium extends InsurancePercentBasic{
		private  final float Premium=.20F;

		private static InsurancePercentPremium REF=null;

		private InsurancePercentPremium() {}


		public static InsurancePercentPremium Factory() {
			if(REF!=null) return REF;
				REF=new InsurancePercentPremium();
				return REF;

		}

		@SuppressWarnings("unlikely-arg-type")
		@Override
		public  float calculateInsurance(Car car) {
			float InsuranceValue= super.calculateInsurance(car);
			return Insourance.PREMIUM.equals(car.getCarType())?InsuranceValue:InsuranceValue*(1+Premium);

			}
}
