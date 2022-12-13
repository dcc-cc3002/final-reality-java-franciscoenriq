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

public interface State {
    public void setController(Controller controller);

    public BlockingQueue<GameCharacter> getTurnsQueue();
    public Controller getController();
    public Axe createAxe(String name, int damage, int weight);

    public Bow createBow(String name, int damage, int weight);

    public Staff createStaff(String name, int damage, int weight,int magicDamage);

    public Sword createSword(String name, int damage, int weight);

    public Knife createKnife(String name, int damage, int weight);

    public WhiteMage createWhiteMage(String name, int hp, int defense, int maxMp) throws InvalidStatValueException;

    public BlackMage createBlackMage(String name, int hp, int defense, int maxMp) throws InvalidStatValueException;

    public Knight createKnight(String name, int hp, int defense) throws InvalidStatValueException;

    public Thief createThief(String name, int hp, int defense) throws InvalidStatValueException;

    public Engineer createEnginner(String name, int hp, int defense) throws InvalidStatValueException;

    public Enemy createEnemy(String name,int weight, int hp, int defense) throws InvalidStatValueException;


    public void setMagic(AbstractMage abstractMage, AbstractSpell abstractSpell);

    public void starGame();

    public void attackEnemy(AbstractPlayerCharacter playerCharacter,Enemy enemy);

    public void attackEnemyWhithMage(AbstractMage mage,Enemy enemy);
}
