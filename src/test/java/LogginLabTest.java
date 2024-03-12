import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class LogginLabTest {
    private final static Logger logger = Logger.getLogger(LogginLab.class.getName());

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void thresholdExceeds() {
        Integer finalLimit = 5;

        LogginLab lab = new LogginLab();
        lab.setThreshold(finalLimit);

        for (Integer i = 1; i <= finalLimit; i++) {
            if (lab.thresholdExceeds(i)) {
                logger.log(Level.INFO, "Threshold not reached! It is "+i);
                assertTrue(lab.thresholdExceeds(i));
            } else {
                logger.log(Level.INFO, "Threshold finally reached!");
                assertFalse(lab.thresholdExceeds(i));
            }
        }
    }
    @org.junit.Test
    public void thresholdReached() {
        //given
        //we know that the limit is 5
        Integer finalThreshold =5;
        //when
        //we are creating a new logger object setting threshold to(finalLimit)
        //2 methods are here.
        // 1)creating a new object called lab that is a newLogginlab.
        // 2)calling the setThreshold from constructor in the class and putting in the parameter the integer 5 in the word finalThreshold.
        LogginLab lab = new LogginLab();
        lab.setThreshold(finalThreshold);
    }
    // we need to repeat a specific block of code using a for loop. Always to be written like this
    //we are going through 1-5 from Integer 5, which is our threshold.
        for (Integer i = 1; i <= finalThreshold; i++) {

            if (lab.thresholdReached exceeds(i)) {
                logger.log(Level.INFO, "limit is over the threshold!");
        } else{
                
        }

    }

}


