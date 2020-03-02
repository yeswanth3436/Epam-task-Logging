package log;

import org.apache.logging.log.LogManager;
import org.apache.logging.log.Logger;

public class GetPlanFactory {
	private static final Logger LOGGER = LogManager . getLogger(GetPlanFactory. class);
	public Plan getPlan(String planType){  
        if(planType == null){
        	LOGGER . warn("your input is null" );
         return null;  
        }  
      if(planType.equalsIgnoreCase("standard")) {  
             return new Standard();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new Abovestandard();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new Highstandard();  
      }
      else if(planType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighstandardFullautomatic();
      }
  return null;  
}  
}