package weaponTest;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StaffTest {
    private Staff staff1;
    private Staff staff2;
    private final String nameStaff = "baston";
    @BeforeEach
    public void setUp(){
        staff1 = new Staff(nameStaff,12,12,12);
        staff2 = new Staff("bastoncito",13,42,34);
    }

    // --------------------------------------------------------------------------------------
    @Test
    public void equalsStaff(){
        final Staff staffExpected1 = new Staff("baston",12,12,12);
        assertEquals(staffExpected1,staff1);
        assertNotEquals(staff2,staff2);
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
}
