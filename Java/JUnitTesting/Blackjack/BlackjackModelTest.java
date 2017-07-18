package Blackjack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Profile on 12/05/2017.
 */
public class BlackjackModelTest {
    @Test
    public void blackjackOperation() throws Exception {

        BlackjackModel blackjackModel = new BlackjackModel();
        assertNotNull(blackjackModel.blackjackOperation(12,5));
        assertNotNull(blackjackModel.blackjackOperation(15,15));

    }

}