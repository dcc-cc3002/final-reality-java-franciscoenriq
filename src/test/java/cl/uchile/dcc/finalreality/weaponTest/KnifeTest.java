package cl.uchile.dcc.finalreality.weaponTest;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class KnifeTest {
    private Knife knife1;
    private Knife knife2;
    private final String nameKnife = "cuchilla";
    @BeforeEach
    public void setUp(){
        knife1 = new Knife(nameKnife,12,12);
        knife2 = new Knife("cuchillita",13,42);
    }

    // --------------------------------------------------------------------------------------
    @Test
    public void equalsAxe(){
        final Knife knifeExpected1 = new Knife("cuchilla",12,12);
        assertEquals(knifeExpected1,knife1);
        assertNotEquals(knife1,knife2);
    }
    @Test
    public void diferentName(){
        final Knife KnifeExpected1 = new Knife("cuchillito",12,12);
        assertNotEquals(KnifeExpected1,knife1);
    }
    @Test
    public void diferentDamage(){
        final Knife knifeExpected1 = new Knife("cuchilla",13,12);
        assertNotEquals(knifeExpected1,knife1);
    }
    @Test
    public void diferentWeight(){
        final Knife knifeExpected1 = new Knife("cuchilla",12,13);
        assertNotEquals(knifeExpected1,knife1);
    }
    //------------------------------------------------------------------------------
    @Test
    public void testHashCode(){
        final Knife knifeExpected1 = new Knife("cuchilla",12,12);
        assertEquals(knifeExpected1.hashCode(),knife1.hashCode());
        assertNotEquals(knife1.hashCode(),knife2.hashCode());
    }
    @Test
    public void diferentHashCodeName(){
        final Knife knifeExpected1 = new Knife("cuchillito",12,12);
        assertNotEquals(knifeExpected1.hashCode(),knife1.hashCode());
    }
    @Test
    public void diferentHashCodeDamage(){
        final Knife knifeExpected1 = new Knife("cuchilla",13,12);
        assertNotEquals(knifeExpected1.hashCode(),knife1.hashCode());
    }
    @Test
    public void diferentHashCodeWeight(){
        final Knife knifeExpected1 = new Knife("cuchilla",12,13);
        assertNotEquals(knifeExpected1.hashCode(),knife1.hashCode());
    }
    //-------------------------------------------------------------------------------------

    @Test
    public void testEquals(){
        final Knife knifeExpected1 = new Knife(nameKnife,12,12);
        assertEquals(false, knife1.equals(knife2));
        assertEquals(true,knife1.equals(knifeExpected1));

    }
}
