import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.jupiter.api.Assertions.*;



public class Thieftest {

    private Thief thief1 ;

    private final String thief1Name = "Ladronzuelo" ;

    private Thief thief2 ;
    private Thief thief3 ;
    private Thief thief4 ;


    @BeforeEach
    public void setUp() throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        thief1 = new Thief(thief1Name,23,34,queue);
        thief1.waitTurn();
        thief2 = new Thief("HOLA",23,34,queue);
        thief2.waitTurn();
        thief3 = new Thief("HOLA",23,34,queue);
        thief3.waitTurn();
        thief4 = new Thief("HOLA",23,34,queue);
        thief4.waitTurn();

    }

    @Test

    public void constructorTest() throws InterruptedException, InvalidStatValueException{
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        final Thief thief1Expected = new Thief("Ladronzuelo",23,34,queue);
        final Thief thief1notequal = new Thief("Ladron",43,23,queue);
        assertEquals(thief1,thief1Expected);
        assertNotEquals(thief1,thief1notequal);
        assertNotEquals(thief1,thief2);


    }


}
