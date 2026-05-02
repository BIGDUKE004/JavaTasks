// TRACK PERIOD DATE 
// PREDICT NEXT PERIOD
// ESTIMATE OVULATION
// SAFE PERIODS
// FLOW DATE
//INPUT : First day of her period (VERY important)
//Last day of her period
//Cycle length 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMenstrualApp{

    @Test
    public void testForRegistration(){
   boolean result = MenstrualApp.registration ("sharon mmesoma", "sharon@gmail.com", "sharonmmesoma");
   assertTrue(result);
    
} 

    @Test
        public void testForCycleLength(){
    MenstrualApp.getCycleLength(28);         

}

    @Test
      public void testForCycleLengthTwo(){
        MenstrualApp.isCycleLengthTwo(35);
}

    @Test
        public void testForOvulationPeriod(){
        MenstrualApp.OvulationPeriod(14);
}

}

