package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import org.jetbrains.annotations.NotNull;

public class Knife extends AbstractWeapon {

    public Knife(final String name, final int damage, final int weight){
        super(name, damage, weight);
    }

    public void equipThief(@NotNull Thief thief){
        thief.equip(this);
    }
    public void equipKnight(@NotNull Knight knight){
        knight.equip(this);
    }
    public void equipWhiteMage(@NotNull WhiteMage whiteMage){
        whiteMage.equip(this);
    }
}
