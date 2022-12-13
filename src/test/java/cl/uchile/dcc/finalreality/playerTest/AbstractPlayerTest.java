package cl.uchile.dcc.finalreality.playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.AbstractPlayerCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;
public class AbstractPlayerTest {

    private AbstractPlayerCharacter abstractPlayer1;
    private AbstractPlayerCharacter abstractPlayerCharacter2;
    private BlockingQueue<GameCharacter> queue;

    private Knife cuchillo;
    private Sword espada ;

    @BeforeEach
    public void setUp()  throws InterruptedException, InvalidStatValueException{
    queue = new LinkedBlockingQueue<>();
        abstractPlayer1 =  new Engineer("ingeniero",123,324,queue);
        abstractPlayerCharacter2 = new Knight("caballero",34,23,queue);
        cuchillo = new Knife("cuchillo",23,34);
        espada = new Sword("espada",34,67);
        abstractPlayer1.equip(cuchillo);
        abstractPlayer1.equip(espada);
    }
    @Test
    public void gettersTests(){
        final int maxHpEngineer = 123 ;
        final String nameEnginer = "ingeniero";
        final int defense = 324 ;
        assertEquals(nameEnginer,abstractPlayer1.getName());
        assertEquals(maxHpEngineer,abstractPlayer1.getMaxHp());
        assertEquals(defense,abstractPlayer1.getDefense());
    }
    @Test
    public void equipMagicWeapon() throws  InvalidStatValueException{
        Staff bastonmagico = new Staff("baston",34,45,34);
        BlackMage magonegro = new BlackMage("magonegro",12,34,45,queue);
        assertNull(magonegro.getEquippedMagicWeapon());
        magonegro.equipMagicWeapon(bastonmagico);
        assertEquals(bastonmagico,magonegro.getEquippedMagicWeapon());
    }

}
