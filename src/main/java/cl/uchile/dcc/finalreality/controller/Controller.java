package cl.uchile.dcc.finalreality.controller;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.exceptions.Require;
import cl.uchile.dcc.finalreality.model.character.AbstractCharacter;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.AbstractPlayerCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import java.util.concurrent.BlockingQueue;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.weapon.*;
import org.jetbrains.annotations.NotNull;
import cl.uchile.dcc.finalreality.controller.GameInitialization;
public class Controller  {

    public BlockingQueue<Enemy>enemies;
    public BlockingQueue<AbstractPlayerCharacter>players;

    //-----------------------------------------------------------------------------------
    private State state;
    public Controller(){
        setState(new GameInitialization());
    }
    public void setState(State state) {
        this.state = state;
        this.state.setController(this);
    }
    public State getState(){return state;}
    
    //-------------------------------------------------------------------------------------

    public Knight createKnight(String name, int hp, int defense) throws InvalidStatValueException{
        return state.createKnight(name, hp, defense);
    }
    public Thief createThief(String name, int hp, int defense) throws InvalidStatValueException {
        return state.createThief(name, hp, defense);
    }
    public Engineer createEnginner(String name, int hp, int defense) throws InvalidStatValueException {
        return state.createEnginner(name, hp, defense);
    }
    public BlackMage createBlackMage(String name, int hp, int defense,int maxMp)throws InvalidStatValueException{
        return state.createBlackMage(name, hp, defense, maxMp);
    }
    public WhiteMage createWhiteMage(String name, int hp, int defense,int maxMp)throws InvalidStatValueException{
        return state.createWhiteMage(name, hp, defense, maxMp);
    }

    //----------------------------------------------------------------------------------------

    public Enemy createEnemy(String name,int weight, int hp, int defense)throws InvalidStatValueException{
        return state.createEnemy(name,weight,hp,defense);
    }
    //----------------------------------------------------------------------------------------

    public Axe createAxe(String name, int damage, int weight){
        return state.createAxe(name, damage, weight);
    }
    public Bow createBow(String name, int damage, int weight) {
        return state.createBow(name,damage,weight);
    }
    public Staff createStaff(String name, int damage, int weight,int magicDamage) {
        return state.createStaff(name, damage, weight,magicDamage);
    }
    public Sword createSword(String name, int damage, int weight) {
        return state.createSword(name, damage, weight);
    }
    public Knife createKnife(String name, int damage, int weight) {
        return state.createKnife(name, damage, weight);
    }

    //_----------------------------------------------------------------------------------------

}
