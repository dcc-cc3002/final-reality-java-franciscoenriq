package cl.uchile.dcc.finalreality.playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.AbstractMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractMageTest {
    private AbstractMage abstractMage1 ;


    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        abstractMage1 = new WhiteMage("mago",12,34,45,queue);
    }
    @Test
    public void gettersTest(){
        final int maxMpExpected = 45;
        assertEquals(maxMpExpected,abstractMage1.getMaxMp());
        assertEquals(maxMpExpected,abstractMage1.getCurrentMp());
    }

}
