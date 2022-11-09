package cl.uchile.dcc.finalreality.weaponTest;
import cl.uchile.dcc.finalreality.model.weapon.Axe;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WeaponTest {

    private Axe axe1;
    private Axe axe2;
    private Sword sword1;
    private Sword sword2;
    private Bow bow1;
    private Bow bow2;
    private Knife knife1;
    private Knife knife2;

    @BeforeEach
    public void setUp(){
        axe1 = new Axe("hacha",12,13);
        axe2 = new Axe("hachita",12,13);
        sword1 = new Sword("espada",14,15);
        sword2 = new Sword("espadita",14,15);
        bow1 = new Bow("arco",16,17);
        bow2 = new Bow("arquito",16,17);
        knife1 = new Knife("cuchillo",18,19);
        knife2 = new Knife("cuchillito",18,19);
    }
    @Test
    public void toStringTest(){
        assertEquals("Weapon{name='hacha', damage=12, weight=13}",axe1.toString());
        assertEquals("Weapon{name='espada', damage=14, weight=15}",sword1.toString());
        assertEquals("Weapon{name='arco', damage=16, weight=17}",bow1.toString());
        assertEquals("Weapon{name='cuchillo', damage=18, weight=19}",knife1.toString());

    }

    @Test
    public void hashCodeTest(){
        Axe axeExpected1 = new Axe("hacha",12,13);
        assertEquals(axeExpected1.hashCode(),axe1.hashCode());
        Sword swordExpected1 = new Sword("espada",14,15);
        assertEquals(swordExpected1.hashCode(),sword1.hashCode());
        Bow bowExpected1 = new Bow("arco",16,17);
        assertEquals(bowExpected1.hashCode(),bow1.hashCode());
        Knife knife1 = new Knife("cuchillo",18,19);
        assertEquals(knife1.hashCode(),knife1.hashCode());
    }

    @Test
    public void equalsTest(){
        Axe axeExpected1 = new Axe("hacha",12,13);

    }


}
