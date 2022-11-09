package cl.uchile.dcc.finalreality.playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.weapon.Axe;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.assertNull;

public class KnightTest {
    private Knight knight1;
    private Knight knight2;
    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        knight1 = new Knight("caballero",12,12,queue);
        knight2 = new Knight("caballerito",12,34,queue);
    }

    @Test
    public void equipNullTest(){
        assertNull(knight1.getEquippedWeapon());
        assertNull(knight2.getEquippedWeapon());
    }
    @Test
    public void equipSwordTest(){
        Sword sword = new Sword("espada",34,23);
        knight1.equipSword(sword);
        assertNotNull(knight1.getEquippedWeapon());
        assertEquals(sword.hashCode(),(knight1.getEquippedWeapon()).hashCode());
    }
    @Test
    public void equipAxeTest() {
        Axe axe = new Axe("hacha",12,12);
        knight1.equipAxe(axe);
        assertNotNull(knight1.getEquippedWeapon());
        assertEquals(axe.hashCode(),(knight1.getEquippedWeapon()).hashCode());
    }
    @Test
    public void equipKnife(){
        Knife knife = new Knife("cuchillo",34,23);
        knight1.equipKnife(knife);
        assertNotNull(knight1.getEquippedWeapon());
        assertEquals(knife.hashCode(),(knight1.getEquippedWeapon()).hashCode());
    }

}
