package log;

import org.apache.logging.log.LogManager;
import org.apache.logging.log.Logger;


public class Generatecost {
	private static final Logger LOGGER = LogManager . getLogger(Generatecost. class);
	public double Cost(String name,double Sqrfoot)
	{
		GetPlanFactory planFactory = new GetPlanFactory();
		Plan p = planFactory.getPlan(name);  
		p.getRate();
		double d=p.calculateBill(Sqrfoot);
		LOGGER . debug("Total price"+d );
		return d;
	}

}