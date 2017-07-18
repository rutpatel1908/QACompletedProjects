package UniqueSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Profile on 12/05/2017.
 */
public class UniqueSumModelTest {
    @Test
    public void uniqueSumOperation() throws Exception {

        UniqueSumModel uniqueSumModel = new UniqueSumModel();
        assertNotNull(uniqueSumModel.uniqueSumOperation(1,2,3));
        assertNotNull(uniqueSumModel.uniqueSumOperation(2,2,4));
        assertNotNull(uniqueSumModel.uniqueSumOperation(5,2,5));
        assertNotNull(uniqueSumModel.uniqueSumOperation(7,3,3));

    }

}