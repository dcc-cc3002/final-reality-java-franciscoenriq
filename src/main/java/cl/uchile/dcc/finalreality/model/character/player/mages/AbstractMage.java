package cl.uchile.dcc.finalreality.model.character.player.mages;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.exceptions.Require;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.AbstractPlayerCharacter;
import cl.uchile.dcc.finalreality.model.character.player.spellUse.AbstractSpell;
import cl.uchile.dcc.finalreality.model.weapon.AbstractMagicWeapons;
import cl.uchile.dcc.finalreality.model.weapon.AbstractWeapon;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BlockingQueue;

public class AbstractMage extends AbstractPlayerCharacter {

    public int currentMp;
    public final int maxMp;

    public AbstractSpell spell;

    protected AbstractMage(final @NotNull String name, final int maxHp, final int defense,
                        int maxMp, final @NotNull BlockingQueue<GameCharacter> turnsQueue)
            throws InvalidStatValueException {
        super(name, maxHp, defense, turnsQueue);
        Require.statValueAtLeast(0, maxMp, "Max MP");
        this.maxMp = maxMp;
        this.currentMp = maxMp;
        this.spell = null;
    }

    /**
     * The nexts methods are the getters of current and max Mp
     * Returns the current MP of the character.
     * Returns the max MP of the character.
     */

    public int getCurrentMp() {
        return currentMp;
    }
    public int getMaxMp() {
        return maxMp;
    }
    public AbstractSpell getSpell(){return spell;}

    public void setSpell(AbstractSpell spell){this.spell = spell;}
    public void setCurrentMp(int mana) throws InvalidStatValueException{
        Require.statValueAtLeast(0,mana,"Current Mp");
        Require.statValueAtMost(maxMp,mana,"Current Mp");
        currentMp = mana;
    }
}
