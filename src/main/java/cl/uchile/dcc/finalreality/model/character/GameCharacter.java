package cl.uchile.dcc.finalreality.model.character;
import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;

/**
 * This represents a character from the game.
 * A character can be controlled by the player or by the CPU (an enemy).
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~Your name~
 */
public interface GameCharacter {
  /**
   * Sets a scheduled executor to make this character (thread) wait for {@code speed / 10}
   * seconds before adding the character to the queue.
   */
  void waitTurn();
  /**
   * Returns this character's name.
   */

  /**
   * Returns this character's current HP.
   */

  /**
   * Returns this character's max HP.
   */

  /**
   * Returns this character's defense.
   */



  /**
   * Sets this character's current HP to {@code newHp}.
   */
  void setCurrentHp(int hp) throws InvalidStatValueException;

}
