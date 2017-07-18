package TooHot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Profile on 12/05/2017.
 */
public class TooHotModelTest {
    @Test
    public void summerCheck() {

        TooHotModel tooHotModel = new TooHotModel();
        assertNotNull(tooHotModel.summerCheck(65,true));
        System.out.println();

        assertNotNull(tooHotModel.summerCheck(40,false));
        System.out.println();

        assertNotNull(tooHotModel.summerCheck(100,true));

    }

}