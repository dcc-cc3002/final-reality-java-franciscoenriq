package cl.uchile.dcc.finalreality.playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;
public class WhiteMageTest {

    private WhiteMage whiteMage1;
    private WhiteMage whiteMage2;
    private WhiteMage whiteMage3;
    private Enemy enemy;

    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        whiteMage1 = new WhiteMage("magoblanco",34,45,23,queue);
        whiteMage2 = new WhiteMage("magoblanquito",45,23,12,queue);
        whiteMage3 = new WhiteMage("magorditoblanco",100,30,80,queue);
        enemy = new Enemy("soymalo",30,80,40,queue);
    }

    @Test
    public void equipNullTest(){
        assertNull(whiteMage1.getEquippedWeapon());
        assertNull(whiteMage2.getEquippedWeapon());
    }

    @Test
    public void equipStaff(){
        Staff staff = new Staff("bastonsete",56,23,45);
        whiteMage1.equipStaff(staff);
        assertNotNull(whiteMage1.getEquippedMagicWeapon());
        assertEquals(staff.hashCode(),(whiteMage1.getEquippedMagicWeapon()).hashCode());
    }

    @Test
    public void equalsTest()throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        WhiteMage whiteMageExpected1 = new WhiteMage("magoblanco",34,45,23,queue);
        assertTrue(whiteMage1.equals(whiteMageExpected1));
        assertFalse(whiteMage2.equals(whiteMageExpected1));
    }
    @Test
    public void toStringTest()throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        WhiteMage whiteMageExpected1 = new WhiteMage("magoblanco",34,45,23,queue);
        assertEquals(whiteMage1.toString(),whiteMageExpected1.toString());
        assertNotEquals(whiteMage2.toString(),whiteMageExpected1.toString());
    }
    public void usingMagic() throws InvalidStatValueException{
        Staff staff = new Staff("baston",34,23,65);
        whiteMage3.equipStaff(staff);
        whiteMage3.usePoison(enemy);
        assertNotEquals(enemy.getState(),null);
    }

}
