package cl.uchile.dcc.finalreality.playerTest;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import static org.junit.jupiter.api.Assertions.*;
class ThiefTest {

    private Thief thief1;
    private final String thief1Name = "Ladronzuelo";
    private Thief thief2;
    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        thief1 = new Thief(thief1Name, 23, 34, queue);
        thief2 = new Thief("HOLA", 23, 34, queue);
    }

    @Test
    public void constructorTest() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Thief thief1Expected = new Thief("Ladronzuelo", 23, 34, queue);
        final Thief thief1notequal = new Thief("Ladron", 43, 23, queue);
        assertEquals(thief1, thief1Expected);
        assertNotEquals(thief1, thief1notequal);
        assertNotEquals(thief1, thief2);

    }
    @Test
    public void equalsTest() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Thief thief3Expected = new Thief("Ladronzuelo", 23, 34, queue);
        assertEquals(true, thief1.equals(thief3Expected));
        assertFalse(thief1.equals(thief2));
    }
    //-----------------------------------------------------------------------------------------------
    //Tests of equipWeapons
    @Test
    public void equipNullTest(){
        assertNull(thief1.getEquippedWeapon());
        assertNull(thief2.getEquippedWeapon());
    }
    @Test
    public void equipSwordTest() {
        Sword sword = new Sword("espada",34,23);
        thief1.equipSword(sword);
        assertNotNull(thief1.getEquippedWeapon());
        assertEquals(sword.hashCode(),(thief1.getEquippedWeapon()).hashCode());
    }
    @Test
    public void equipKnifeTest(){
        Knife knife = new Knife("cuchillo",34,56);
        thief1.equipKnife(knife);
        assertNotNull(thief1.getEquippedWeapon());
        assertEquals(knife.hashCode(),(thief1.getEquippedWeapon()).hashCode());
    }
    @Test
    public void equipBowTest(){
        Bow bow = new Bow("arco",34,23);
        thief1.equipBow(bow);
        assertNotNull(thief1.getEquippedWeapon());
        assertEquals(bow.hashCode(),(thief1.getEquippedWeapon()).hashCode());
    }
    //-----------------------------------------------------------------------------------------------


}
