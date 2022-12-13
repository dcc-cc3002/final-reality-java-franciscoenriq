package cl.uchile.dcc.finalreality.weaponTest;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwordTest {
    private Sword sword1;
    private Sword sword2;
    private final String nameBow = "espada";
    @BeforeEach
    public void setUp(){
        sword1 = new Sword("espada",12,12);
        sword2 = new Sword("espadita",13,42);
    }

    // --------------------------------------------------------------------------------------
    /*
    testing of constructors
     */
    @Test
    public void equalsSword(){
        final Sword swordExpected1 = new Sword("espada",12,12);
        assertEquals(swordExpected1,sword1);
        assertNotEquals(sword1,sword2);
    }
    @Test
    public void diferentName(){
        final Sword swordExpected1 = new Sword("espadita",12,12);
        assertNotEquals(swordExpected1,sword1);
    }
    @Test
    public void diferentDamage(){
        final Sword swordExpected1 = new Sword("espada",13,12);
        assertNotEquals(swordExpected1,sword1);
    }
    @Test
    public void diferentWeight(){
        final Sword swordExpected1 = new Sword("espada",12,13);
        assertNotEquals(swordExpected1,sword1);
    }
    //------------------------------------------------------------------------------
    /*
    testing of the hashcode method
     */
    @Test
    public void testHashCode(){
        final Sword swordExpected1 = new Sword("espada",12,12);
        assertEquals(swordExpected1.hashCode(),sword1.hashCode());
        assertNotEquals(swordExpected1.hashCode(),sword2.hashCode());
    }


    //-------------------------------------------------------------------------------------
    //in this point i dicided to do the test more simplificate
    @Test
    public void testEquals(){
        final Sword swordExpected1 = new Sword("espada",1567,1456);
        final Sword swordExpected2= new Sword(nameBow,12,12);
        assertEquals(false, sword1.equals(swordExpected1));
        assertEquals(true,sword1.equals(swordExpected2));

    }


}
