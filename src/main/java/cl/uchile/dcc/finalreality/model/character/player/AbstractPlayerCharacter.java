/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */

package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.AbstractCharacter;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.AbstractMagicWeapons;
import cl.uchile.dcc.finalreality.model.weapon.AbstractWeapon;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.jetbrains.annotations.NotNull;
import cl.uchile.dcc.finalreality.model.weapon.Axe;
/**
 * A class that holds all the information of a player-controlled character in the game.
 *
 * <p>All player characters have a {@code name}, a maximum amount of <i>hit points</i>
 * ({@code maxHp}), a {@code defense} value, a queue of {@link GameCharacter}s that are
 * waiting for their turn ({@code turnsQueue}), and can equip a {@link AbstractWeapon}.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~Your name~
 */
public abstract class AbstractPlayerCharacter extends AbstractCharacter implements
    PlayerCharacter {

  private AbstractWeapon equippedWeapon = null;
  private  AbstractMagicWeapons equippedMagicWeapon = null  ;
  /**
   * Creates a new character.
   * This constructor is <b>protected</b>, because it'll only be used by subclasses.
   *
   * @param name
   *     the character's name
   * @param maxHp
   *     the character's max hp
   * @param defense
   *     the character's defense
   * @param turnsQueue
   *     the queue with the characters waiting for their turn
   */



  protected AbstractPlayerCharacter(@NotNull final String name, final int maxHp,
      final int defense, @NotNull final BlockingQueue<GameCharacter> turnsQueue)
      throws InvalidStatValueException {
    super(name, maxHp, defense, turnsQueue);
  }

  @Override
  public void equip(AbstractWeapon weapon) {
    this.equippedWeapon = weapon;
  }
  public void equipMagicWeapon(AbstractMagicWeapons weapon){ this.equippedMagicWeapon =weapon;}

  public AbstractMagicWeapons getEquippedMagicWeapon(){
    return equippedMagicWeapon;
  }


  @Override
  public AbstractWeapon getEquippedWeapon() {
    return equippedWeapon;
  }

  private void addToQueuePlayer() {
    try {
      turnsQueue.put(this);
    } catch (Exception e) {
      e.printStackTrace();
    }
    scheduledExecutor.shutdown();
  }

  public void waitTurn() {
    scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
      scheduledExecutor.schedule(
              /* command = */ this::addToQueuePlayer,
              /* delay = */ this.getEquippedWeapon().getWeight() / 10,
              /* unit = */ TimeUnit.SECONDS);

  }


}
