package playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;
public class BlackMageTest {
    private BlackMage blackMage1;
    private BlackMage blackMage2;


    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        blackMage1 = new BlackMage("magonegro",12,34,45,queue);
        blackMage2 = new BlackMage("magonegrito",45,23,14,queue);

    }


    @Test
    public void equipNullTest(){
        assertNull(blackMage2.getEquippedWeapon());
        assertNull(blackMage1.getEquippedWeapon());
    }
    @Test
    public void equipStaff(){
        Staff staff = new Staff("baston",34,23,65);
        blackMage1.equipStaff(staff);
        assertNotNull(blackMage1.getEquippedWeapon());
        assertEquals(staff.hashCode(),(blackMage1.getEquippedWeapon()).hashCode());

    }
}
