package cl.uchile.dcc.finalreality.playerTest;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.weapon.Axe;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EngineerTest {

    private  Engineer engineer1;
    private  Engineer engineer2;
    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        engineer1 = new Engineer("ingeniero",100,20,queue);
        engineer2 = new Engineer("ingenierito",99,21,queue);
    }

    @Test
    public void HashCodeTest()throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        Engineer engineerExpected= new Engineer("ingeniero",100,20,queue);

        assertEquals(engineerExpected.hashCode(),engineer1.hashCode());

    }


    @Test
    public void equipNullTest(){
        assertNull(engineer1.getEquippedWeapon());
        assertNull(engineer2.getEquippedWeapon());
    }
    @Test
    public void equipAxeTest(){
        Axe axe = new Axe("hacha",12,12);
        engineer1.equipAxe(axe);
        assertNotNull(engineer1.getEquippedWeapon());
        assertEquals(axe.hashCode(),(engineer1.getEquippedWeapon()).hashCode());
    }
    @Test
    public void equipBowTest(){
        Bow bow = new Bow("arco",12,12);
        engineer1.equipBow(bow);
        assertNotNull(engineer1.getEquippedWeapon());
        assertEquals(bow.hashCode(),(engineer1.getEquippedWeapon()).hashCode());
    }

    @Test
    public void equalsTest()throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        Engineer engineerExpected1 = new Engineer("ingeniero",100,20,queue);
        assertTrue(engineer1.equals(engineerExpected1));
        assertFalse(engineer1.equals(engineer2));
    }

    @Test
    public void toStringTest()throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        Engineer engineerExpected1 = new Engineer("ingeniero",100,20,queue);
        assertEquals(engineerExpected1.toString(),engineer1.toString());
        assertNotEquals(engineerExpected1.toString(),engineer2.toString());
    }

}
