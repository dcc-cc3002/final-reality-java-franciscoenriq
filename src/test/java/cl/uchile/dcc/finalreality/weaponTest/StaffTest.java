package cl.uchile.dcc.finalreality.weaponTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StaffTest {
    private Staff staff1;
    private Staff staff2;
    private final String nameStaff = "baston";
    private WhiteMage whiteMage1;
    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        whiteMage1 = new WhiteMage("magoblanco",34,45,23,queue);
        staff1 = new Staff("baston",12,12,12);
        staff2 = new Staff("bastoncito",13,42,34);
    }

    // --------------------------------------------------------------------------------------
    @Test
    public void equalsStaff(){
        final Staff staffExpected1 = new Staff("baston",12,12,12);
        assertEquals(staffExpected1,staff1);
        assertNotEquals(staff1,staff2);
    }
    @Test
    public void diferentName(){
        final Staff staffExpected1 = new Staff("bastincito",12,12,12);
        assertNotEquals(staffExpected1,staff1);
    }
    @Test
    public void diferentDamage(){
        final Staff staffExpected1 = new Staff("baston",13,12,12);
        assertNotEquals(staffExpected1,staff1);
    }
    @Test
    public void diferentWeight(){
        final Staff staffExpected1 = new Staff("baston",12,13,12);
        assertNotEquals(staffExpected1,staff1);
    }
    @Test
    public void diferentMagicDamage(){
        final Staff staffExpected1 = new Staff("baston",12,12,13);
        assertNotEquals(staffExpected1,staff1);
    }
    //------------------------------------------------------------------------------
    @Test
    public void testHashCode(){
        final Staff staffExpected1 = new Staff("baston",12,12,12);
        assertEquals(staffExpected1.hashCode(),staff1.hashCode());
        assertNotEquals(staff1.hashCode(),staff2.hashCode());
    }
    @Test
    public void diferentHashCodeName(){
        final Staff staffExpected1 = new Staff("bastoncito",12,12,12);
        assertNotEquals(staffExpected1.hashCode(),staff1.hashCode());
    }
    @Test
    public void diferentHashCodeDamage(){
        final Staff staffExpected1 = new Staff("baston",13,12,12);
        assertNotEquals(staffExpected1.hashCode(),staff1.hashCode());
    }
    @Test
    public void diferentHashCodeWeight(){
        final Staff staffExpected1 = new Staff("baston",12,13,12);
        assertNotEquals(staffExpected1.hashCode(),staff1.hashCode());
    }
    @Test
    public void diferentHashCodeMagicDamage(){
        final Staff staffExpected1 = new Staff("baston",12,12,13);
        assertNotEquals(staffExpected1.hashCode(),staff1.hashCode());
    }
    //-------------------------------------------------
    @Test
    public void testEquals(){
        final Staff staffExpected1 = new Staff(nameStaff,12,12,12);
        assertEquals(false, staff1.equals(staff2));
        assertEquals(true,staff1.equals(staffExpected1));

    }
    //-------------------------------------------------
    //test toString
    @Test
    public void testToString(){
        assertEquals("Weapon{name='baston', damage=12, weight=12, magicDamage=12}",staff1.toString());
    }
}
