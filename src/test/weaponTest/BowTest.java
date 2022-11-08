package weaponTest;
import cl.uchile.dcc.finalreality.model.weapon.Axe;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BowTest {
    private Bow bow1;
    private Bow bow2;
    private final String nameBow = "arco";
    @BeforeEach
    public void setUp(){
        bow1 = new Bow(nameBow,12,12);
        bow2 = new Bow("arquito",13,42);
    }

    // --------------------------------------------------------------------------------------
    @Test
    public void equalsAxe(){
        final Bow bowExpected1 = new Bow("arco",12,12);
        assertEquals(bowExpected1,bow1);
        assertNotEquals(bow1,bow2);
    }
    @Test
    public void diferentName(){
        final Bow bowExpected1 = new Bow("arquito",12,12);
        assertNotEquals(bowExpected1,bow1);
    }
    @Test
    public void diferentDamage(){
        final Bow bowExpected1 = new Bow("arco",13,12);
        assertNotEquals(bowExpected1,bow1);
    }
    @Test
    public void diferentWeight(){
        final Bow bowExpected1 = new Bow("arco",12,13);
        assertNotEquals(bowExpected1,bow1);
    }
    //------------------------------------------------------------------------------
    @Test
    public void testHashCode(){
        final Bow bowExpected1 = new Bow("arco",12,12);
        assertEquals(bowExpected1.hashCode(),bow1.hashCode());
        assertNotEquals(bow1.hashCode(),bow2.hashCode());
    }
    @Test
    public void diferentHashCodeName(){
        final Bow bowExpected1 = new Bow("arquito",12,12);
        assertNotEquals(bowExpected1.hashCode(),bow1.hashCode());
    }
    @Test
    public void diferentHashCodeDamage(){
        final Bow bowExpected1 = new Bow("arco",12,12);
        assertNotEquals(bowExpected1.hashCode(),bow1.hashCode());
    }
    @Test
    public void diferentHashCodeWeight(){
        final Bow bowExpected1 = new Bow("arco",12,12);
        assertNotEquals(bowExpected1.hashCode(),bow1.hashCode());
    }
    //-------------------------------------------------------------------------------------
}
