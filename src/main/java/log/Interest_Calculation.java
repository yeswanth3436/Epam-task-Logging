package log;

import org.apache.logging.log.LogManager;
import org.apache.logging.log.Logger;

public class Interest_Calculation {
	private static final Logger LOGGER = LogManager . getLogger(Interest_Calculation. class);
	public double Simple_Interest(double principal_balance,double annual_interest_rate, double time_in_years )
	{
		double amount=principal_balance*(1+(annual_interest_rate/100)*time_in_years);
		LOGGER . debug("Simple_Interest"+ amount);
		return amount;
	}
	public double Compound_Interest(double principal_balance,double annual_interest_rate, double no_of_times_interest_applied, double no_of_time_periods_elapsed )
	{
		 double power=Math.pow((1+((annual_interest_rate/100)/no_of_times_interest_applied)), (no_of_times_interest_applied*no_of_time_periods_elapsed));
		 double amount =principal_balance* power;
		 LOGGER . debug("Simple_Interest"+ amount);
		return amount;
	}

}