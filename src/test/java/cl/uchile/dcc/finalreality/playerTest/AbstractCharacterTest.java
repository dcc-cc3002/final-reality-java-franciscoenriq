package cl.uchile.dcc.finalreality.playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.AbstractCharacter;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;
public class AbstractCharacterTest {
    private AbstractCharacter abstractCharacter1;
    private AbstractCharacter abstractCharacter2;

    @BeforeEach

    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        abstractCharacter1 = new BlackMage("magonegro", 12, 34, 45, queue);

    }

    @Test
    public void gettersTests(){
        final int maxHpExpected = 12 ;
        final String nameExpected = "magonegro";
        final int defenseExpected = 34;
        assertEquals(maxHpExpected,abstractCharacter1.getMaxHp());
        assertEquals(nameExpected,abstractCharacter1.getName());
        assertEquals(defenseExpected,abstractCharacter1.getDefense());
        assertEquals(maxHpExpected,abstractCharacter1.getCurrentHp());
    }


}
