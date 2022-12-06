package cl.uchile.dcc.finalreality;
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

import cl.uchile.dcc.finalreality.model.weapon.AbstractWeapon;
import org.jetbrains.annotations.NotNull;

public class Controller {
    protected final BlockingQueue<GameCharacter> turnsQueue;
    public ScheduledExecutorService scheduledExecutor;
    private val turnsQueue = LinkedBlockingQueue<GameCharacter>();
    private val playerCharacters = mutableListOf<PlayerCharacter>();
    private val enemyCharacters = mutableListOf<Enemy>();

    public void createPlayer(String name, int hp, int defense, AbstractWeapon weapon){

    }
    public void createEnemy(String name, int hp, int defense,int weight){}

    public void attack(AbstractPlayerCharacter jugador, Enemy enemy){
        enemy.setCurrentHp(enemy.getCurrentHp()-jugador.getEquippedWeapon().getWeight());
    }

    public void useMagic(AbstractPlayerCharacter jugador, Enemy enemy){

    }

    public void waitTurn(AbstractCharacter character){
        // TODO: Call the waitTurn method of the character
    }

    public void onPlayerWin(){ }
    public void onEnemyWin(){ }


}
