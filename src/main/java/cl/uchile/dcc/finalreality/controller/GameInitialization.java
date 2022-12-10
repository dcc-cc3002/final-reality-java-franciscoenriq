package cl.uchile.dcc.finalreality.controller;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import cl.uchile.dcc.finalreality.model.weapon.*;

import java.util.concurrent.BlockingQueue;

public class GameInitialization implements State{
    private BlockingQueue<GameCharacter> turnsQueue;

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    public BlockingQueue<GameCharacter> getTurnsQueue() {
        return turnsQueue;
    }


    @Override
    public BlackMage createBlackMage(String name, int hp, int defense,int maxMp)throws InvalidStatValueException{
        return new BlackMage(name,hp,defense,maxMp,turnsQueue);

    }
    @Override
    public Knight createKnight(String name, int hp, int defense) throws InvalidStatValueException {
        return new Knight(name,hp,defense,turnsQueue);
    }

    @Override
    public Thief createThief(String name, int hp, int defense) throws InvalidStatValueException {
        return new Thief(name,hp,defense,turnsQueue);
    }

    @Override
    public Engineer createEnginner(String name, int hp, int defense) throws InvalidStatValueException {
        return new Engineer(name,hp,defense,turnsQueue);
    }
    @Override
    public WhiteMage createWhiteMage(String name, int hp, int defense,int maxMp)throws InvalidStatValueException{
        return new WhiteMage(name,hp,defense,maxMp,turnsQueue);
    }
    @Override
    public Enemy createEnemy(String name,int weight, int hp, int defense)throws InvalidStatValueException{
        return new Enemy(name,weight,hp,defense,turnsQueue);
    }
    @Override
    public Axe createAxe(String name, int damage, int weight){
        return new Axe(name, damage, weight);
    }

    @Override
    public Bow createBow(String name, int damage, int weight) {
        return new Bow(name, damage, weight);
    }

    @Override
    public Staff createStaff(String name, int damage, int weight,int magicDamage) {
        return new Staff(name, damage, weight, magicDamage);
    }

    @Override
    public Sword createSword(String name, int damage, int weight) {
        return new Sword(name, damage, weight);
    }
    @Override
    public Knife createKnife(String name, int damage, int weight) {
        return new Knife(name, damage, weight);
    }
}
