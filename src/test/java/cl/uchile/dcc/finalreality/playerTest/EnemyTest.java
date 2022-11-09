package cl.uchile.dcc.finalreality.playerTest;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import static org.junit.jupiter.api.Assertions.*;
public class EnemyTest {

    private Enemy monster1 ;
    private Enemy monster2;

    @BeforeEach

    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        monster1 = new Enemy("enemy1",12,34,45,queue);
        monster2 = new Enemy("enemy2",12,34,45,queue);
    }


    /*
    This tests , tell us how the objects should be compared.
    For example , two objects whith the same parameters but the weight is diferent must be diferent
     */
    @Test
    public void equalEnemy() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",12,34,45,queue);
        assertEquals(monster1,expectedMonster1);
    }
    @Test
    public void diferentName() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("monster1",12,34,45,queue);
        assertNotEquals(monster1,expectedMonster1);
    }
    @Test
    public void diferentWeight() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",13,34,45,queue);
        assertNotEquals(monster1,expectedMonster1);
    }
    @Test
    public void diferentMaxHp() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",12,35,45,queue);
        assertNotEquals(monster1,expectedMonster1);
    }
    @Test
    public void diferentDefense() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",12,34,46,queue);
        assertNotEquals(monster1,expectedMonster1);
    }

    /*------------------

     */
    @Test
    public void testHasCode() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",13,34,45,queue);
        assertEquals(expectedMonster1.hashCode(),monster1.hashCode());
    }
    @Test
    public void diferentHashCodeName() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("monster1",12,34,45,queue);
        assertNotEquals(expectedMonster1.hashCode(),monster1.hashCode());
    }
    @Test
    public void diferentHashCodeWeight() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",13,34,45,queue);
        assertNotEquals(expectedMonster1.hashCode(),monster1.hashCode());
    }
    @Test
    public void diferentHashCodeMaxHp() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",12,35,45,queue);
        assertNotEquals(expectedMonster1.hashCode(),monster1.hashCode());
    }
    @Test
    public void diferentHashCodeDefense() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Enemy expectedMonster1 = new Enemy("enemy1",12,34,46,queue);
        assertNotEquals(expectedMonster1.hashCode(),monster1.hashCode());
    }


}
