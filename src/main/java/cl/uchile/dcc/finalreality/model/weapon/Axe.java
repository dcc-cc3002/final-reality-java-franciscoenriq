package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.muggles.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import org.jetbrains.annotations.NotNull;

public class Axe extends AbstractWeapon {
    public Axe(final String name, final int damage, final int weight) {
        super(name, damage, weight);
    }
    public void equipKnight(@NotNull Knight knight){
        knight.equip(this);
    }
    public void equipEngineer(@NotNull Engineer engineer){
        engineer.equip(this);
    }
}
