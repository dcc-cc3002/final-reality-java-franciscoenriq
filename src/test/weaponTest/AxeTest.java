package weaponTest;

import cl.uchile.dcc.finalreality.model.weapon.Axe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import static org.junit.jupiter.api.Assertions.*;
 class AxeTest {
    private Axe axe1;
    private Axe axe2;
    private final String nameAxe = "hacha";
    @BeforeEach
    public void setUp(){
        axe1 = new Axe(nameAxe,12,12);
        axe2 = new Axe("hachita",13,42);
    }
    @Test
     public void equalsAxe(){

        final Axe axeExpected2 = new Axe("hacha",12,12);
        assertEquals(axeExpected2,axe1);
        assertNotEquals(axeExpected2,axe2);
    }
    @Test
     public void diferentName(){
        final Axe axeExpected2 = new Axe("hachitaa",12,12);
        assertNotEquals(axeExpected2,axe1);
    }
     @Test
     public void diferentDamage(){
         final Axe axeExpected2 = new Axe("hacha",13,12);
         assertNotEquals(axeExpected2,axe1);
     }
     @Test
     public void diferentWeight(){
         final Axe axeExpected2 = new Axe("hacha",12,13);
         assertNotEquals(axeExpected2,axe1);
     }
     @Test
     public void testHashCode(){
        final Axe axeExpected = new Axe("hacha",12,12);
        assertEquals(axeExpected.hashCode(),axe1.hashCode());
        assertNotEquals(axe1.hashCode(),axe2.hashCode());
     }
     @Test
     public void diferentHashCodeName(){
         final Axe axeExpected2 = new Axe("hachitaa",12,12);
         assertNotEquals(axeExpected2.hashCode(),axe1.hashCode());
     }
     @Test
     public void diferentHashCodeDamage(){
         final Axe axeExpected2 = new Axe("hacha",13,12);
         assertNotEquals(axeExpected2.hashCode(),axe1.hashCode());
     }
     @Test
     public void diferentHashCodeWeight(){
         final Axe axeExpected2 = new Axe("hacha",12,13);
         assertNotEquals(axeExpected2,axe1);
     }


}
