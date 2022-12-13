package cl.uchile.dcc.finalreality.controller;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.AbstractPlayerCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.AbstractMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import cl.uchile.dcc.finalreality.model.character.player.spellUse.AbstractSpell;
import cl.uchile.dcc.finalreality.model.weapon.*;

import java.util.concurrent.BlockingQueue;

public class PlayerTurn implements State{

    private Controller controller;

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
    @Override
    public Controller getController() {
        return controller;
    }
    //--------------------------------------------------------------
    //metodos que no se usan debido a que en playerturn no es posible
    @Override
    public BlockingQueue<GameCharacter> getTurnsQueue() {
        return null;
    }
    @Override
    public Axe createAxe(String name, int damage, int weight) {
        return null;
    }
    @Override
    public Bow createBow(String name, int damage, int weight) {
        return null;
    }
    @Override
    public Staff createStaff(String name, int damage, int weight, int magicDamage) {
        return null;
    }
    @Override
    public Sword createSword(String name, int damage, int weight) {
        return null;
    }
    @Override
    public Knife createKnife(String name, int damage, int weight) {
        return null;
    }
    @Override
    public WhiteMage createWhiteMage(String name, int hp, int defense, int maxMp) throws InvalidStatValueException {
        return null;
    }
    @Override
    public BlackMage createBlackMage(String name, int hp, int defense, int maxMp) throws InvalidStatValueException {
        return null;
    }
    @Override
    public Knight createKnight(String name, int hp, int defense) throws InvalidStatValueException {
        return null;
    }
    @Override
    public Thief createThief(String name, int hp, int defense) throws InvalidStatValueException {
        return null;
    }
    @Override
    public Engineer createEnginner(String name, int hp, int defense) throws InvalidStatValueException {
        return null;
    }
    @Override
    public Enemy createEnemy(String name, int weight, int hp, int defense) throws InvalidStatValueException {
        return null;
    }
    //--------------------------------------------------------------------------------------------------------------
    @Override
    public void setMagic(AbstractMage abstractMage, AbstractSpell abstractSpell) {
        abstractMage.setSpell(abstractSpell);
    }

    @Override
    public void starGame() {}

    @Override
    public void attackEnemy(AbstractPlayerCharacter playerCharacter, Enemy enemy) {

    }

    @Override
    public void attackEnemyWhithMage(AbstractMage mage, Enemy enemy) {

    }
}
