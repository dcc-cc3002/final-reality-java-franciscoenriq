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
     public void axeTest(){
        final Axe axeExpected1 = new Axe("hacha",12,12);
        final Axe axeExpected2 = new Axe("hachitaa",12,345);
        assertEquals(axeExpected1,axe1);
        assertNotEquals(axeExpected2,axe2);
    }


}
