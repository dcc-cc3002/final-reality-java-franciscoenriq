package cl.uchile.dcc.finalreality.Controller;

import cl.uchile.dcc.finalreality.controller.Controller;
import cl.uchile.dcc.finalreality.controller.GameInitialization;
import cl.uchile.dcc.finalreality.controller.State;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import cl.uchile.dcc.finalreality.model.weapon.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class ControllerTest {

    private Controller controller;
    private WhiteMage whiteMage;
    private BlackMage blackMage;
    private Knight knight;
    private Engineer engineer;
    private Thief thief;
    //---------------------------
    private Enemy enemy;
    //---------------------------
    private Axe axe;
    private Bow bow;
    private Staff staff;
    private Sword sword;
    private Knife knife;
    //---------------------------
    @BeforeEach
    public void setUpController() throws InvalidStatValueException,InterruptedException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        controller = new Controller();
        whiteMage = new WhiteMage("magordito",50,40,80,queue);
        blackMage = new BlackMage("magordito negro",80,80,80,queue);
        knight = new Knight("caballero",70,60,queue);
        engineer = new Engineer("ingeniero",50,40,queue);
        thief = new Thief("ladron",50,40,queue);
        //---------------------------------------------------------------------------------------
        enemy = new Enemy("enemigo",50,40,40,queue);
        //---------------------------------------------------------------------------------------
        axe = new Axe("hacha",50,30);
        bow = new Bow("arco",30,70);
        staff = new Staff("baston",30,20,70);
        sword = new Sword("espada",38,20);
        knife  = new Knife("cuchillo",60,40);
    }

    @Test
    public void inicialStateTest(){
        GameInitialization a = new GameInitialization();

        assertEquals(a.toString(),controller.getState().toString());
    }


    //---------------------------------------------------------------------------------------
    @Test
    public void createBlackMageTest()throws InvalidStatValueException{
        BlackMage a = controller.createBlackMage("magordito negro",80,80,80);
        assertEquals(blackMage,a);
    }
    @Test
    public void createWhiteMageTest()throws InvalidStatValueException{
        WhiteMage a = controller.createWhiteMage("magordito",50,40,80);
        assertEquals(whiteMage,a);
    }
    @Test
    public void createknightTest()throws InvalidStatValueException{
        Knight a = controller.createKnight("caballero",70,60);
        assertEquals(knight,a);
    }
    @Test
    public void createEngineerTest()throws InvalidStatValueException{
        Engineer a = controller.createEnginner("ingeniero",50,40);
        assertEquals(a,engineer);
    }
    @Test
    public void createThiefTest()throws InvalidStatValueException{
        Thief a = controller.createThief("ladron",50,40);
        assertEquals(a,thief);
    }

    //---------------------------------------------------------------------------------------

    @Test
    public void createEnemyTest()throws InvalidStatValueException{
        Enemy a = controller.createEnemy("enemigo",50,40,40);
        assertEquals(a,enemy);
    }

    //---------------------------------------------------------------------------------------

    @Test
    public void createAxeTest(){
        Axe a = controller.createAxe("hacha",50,30);
        assertEquals(a,axe);
    }
    @Test
    public void createBowTest(){
        Bow a = controller.createBow("arco",30,70);
        assertEquals(a,bow);
    }
    @Test
    public void createSwordTest(){
        Sword a = controller.createSword("espada",38,20);
        assertEquals(a,sword);
    }
    @Test
    public void createStaffTest(){
        Staff a = controller.createStaff("baston",30,20,70);
        assertEquals(a,staff);
    }
    @Test
    public void createKnife(){
        Knife a = controller.createKnife("cuchillo",60,40);
        assertEquals(a,knife);
    }
    //---------------------------------------------------------------------------------------

}
