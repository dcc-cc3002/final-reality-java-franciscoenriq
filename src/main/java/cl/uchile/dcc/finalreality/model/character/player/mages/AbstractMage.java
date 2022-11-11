package cl.uchile.dcc.finalreality.model.character.player.mages;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.exceptions.Require;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.AbstractPlayerCharacter;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BlockingQueue;

public class AbstractMage extends AbstractPlayerCharacter {

    public int currentMp;
    public final int maxMp;

    protected AbstractMage(final @NotNull String name, final int maxHp, final int defense,
                        int maxMp, final @NotNull BlockingQueue<GameCharacter> turnsQueue)
            throws InvalidStatValueException {
        super(name, maxHp, defense, turnsQueue);
        Require.statValueAtLeast(0, maxMp, "Max MP");
        this.maxMp = maxMp;
        this.currentMp = maxMp;
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

}
