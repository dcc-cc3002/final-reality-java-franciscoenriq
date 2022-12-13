/*
 * "Final Reality" (c) by R8V and ~Your name~
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */

package cl.uchile.dcc.finalreality.model.character.player.mages;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.exceptions.Require;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import org.jetbrains.annotations.NotNull;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
/**
 * A Black Mage is a type of player character that can cast black magic.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~Your name~
 * @version 2.0
 */
public class BlackMage extends AbstractMage {
  /**
   * Creates a new Black Mage.
   *
   * @param name
   *     the character's name
   * @param maxHp
   *     the character's max hp
   * @param defense
   *     the character's defense
   * @param turnsQueue
   *     the queue with the characters waiting for their turn
   * @param maxMp
   *
   */
  public BlackMage(final @NotNull String name, final int maxHp, final int defense,
                           int maxMp, final @NotNull BlockingQueue<GameCharacter> turnsQueue)
          throws InvalidStatValueException {
    super(name, maxHp, defense, maxMp, turnsQueue);

  }

  // region : ACCESSORS
  /**
   * Sets the character's current MP.
   */
  // endregion

  // region : UTILITY METHODS
  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final BlackMage that)) {
      return false;
    }
    return hashCode() == that.hashCode()
        && name.equals(that.name)
        && maxHp == that.maxHp
        && defense == that.defense
        && maxMp == that.maxMp;
  }

  @Override
  public String toString() {
    return "BlackMage{currentMp=%d, maxMp=%d, maxHp=%d, defense=%d, name='%s'}"
        .formatted(currentMp, maxMp, maxHp, defense, name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BlackMage.class, name, maxHp, defense, maxMp);
  }

  // endregion

  public void equipStaff(@NotNull Staff staff){
    staff.equipBlackMage(this);
  }

  public void equipKnife(@NotNull Knife knife){knife.equipBlackMage(this); }
  //methods to use the magic
  public void useThunder(@NotNull Enemy enemy)  throws InvalidStatValueException{
    this.setCurrentMp(this.getCurrentMp()-15);
    enemy.setCurrentHp(enemy.getCurrentHp() - this.getEquippedMagicWeapon().getMagicDamage() );
    //TODO falta ver la probabilidad de quedar paralizado

  }
  public void useFire(@NotNull Enemy enemy)  throws InvalidStatValueException {
    this.setCurrentMp(this.getCurrentMp()-15);
    enemy.setCurrentHp(enemy.getCurrentHp()-this.getEquippedMagicWeapon().getMagicDamage());

    //TODO falta ver la probabilidad de quedar quemado
  }


}
