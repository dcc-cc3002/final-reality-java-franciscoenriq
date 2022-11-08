package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import org.jetbrains.annotations.NotNull;

public class Bow extends Weapon{
    public Bow(final String name, final int damage, final int weight) {
        super(name, damage, weight);
    }

    public void equipThief(@NotNull Thief thief){
        thief.equip(this);
    }
    public void equipEngineer(@NotNull Engineer engineer){
        engineer.equip(this);
    }
}
