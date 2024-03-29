/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */

package cl.uchile.dcc.finalreality.model.character.player.mages;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.EnemyStates.Paralyzed;
import cl.uchile.dcc.finalreality.model.character.EnemyStates.Poisoned;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

import cl.uchile.dcc.finalreality.model.character.player.AbstractPlayerCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import org.jetbrains.annotations.NotNull;
import cl.uchile.dcc.finalreality.model.character.Enemy;

/**;
 * A {@link PlayerCharacter} that can equip {@code Staff}s and use <i>white magic</i>.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~Your name~
 */
public class WhiteMage extends AbstractMage {
  /**
   * Creates a new character.
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
  Poisoned poisoned;
  Paralyzed paralyzed;
  public WhiteMage(final @NotNull String name, final int maxHp, final int defense,
                   int maxMp, final @NotNull BlockingQueue<GameCharacter> turnsQueue)
          throws InvalidStatValueException {
    super(name, maxHp, defense, maxMp, turnsQueue);

  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final WhiteMage that)) {
      return false;
    }
    return hashCode() == that.hashCode()
        && maxMp == that.maxMp
        && name.equals(that.name)
        && maxHp == that.maxHp
        && defense == that.defense;
  }

  @Override
  public int hashCode() {
    return Objects.hash(WhiteMage.class, name, maxHp, defense, maxMp);
  }

  @Override
  public String toString() {
    return "WhiteMage{maxMp=%d, maxHp=%d, defense=%d, name='%s'}"
        .formatted(maxMp, maxHp, defense, name);
  }

  /**
   * Sets the current MP of the character to {@code newMp}.
   */



  public void equipStaff(@NotNull Staff staff){
    staff.equipWhiteMage(this);
  }


  public void useHealing(@NotNull AbstractPlayerCharacter jugador) throws InvalidStatValueException {

    this.setCurrentMp(this.getCurrentMp() - 15);
    int a = jugador.getMaxHp()/5;
    if (a + jugador.getCurrentHp() > jugador.getMaxHp()) {
      jugador.setCurrentHp(jugador.getMaxHp());
    }
    else{
      jugador.setCurrentHp(jugador.getCurrentHp()+a);
     }
    }


  public void usePoison(@NotNull Enemy enemy) throws InvalidStatValueException {

    this.setCurrentMp(this.getCurrentMp()-40);
    enemy.setState(poisoned);
  }
  public void useParalis(@NotNull Enemy enemy) throws InvalidStatValueException {
    this.setCurrentMp(this.getCurrentMp() - 25);
    enemy.setState(paralyzed);
  }
}
