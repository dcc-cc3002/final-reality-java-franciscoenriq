package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.muggles.Knight;
import cl.uchile.dcc.finalreality.model.character.player.muggles.Thief;
import org.jetbrains.annotations.NotNull;

public class Sword extends AbstractWeapon {

    public Sword(final String name, final int damage, final int weight){
        super(name,damage,weight);
    }

    public void equipKnight(@NotNull Knight knight){
        knight.equip(this);
    }
    public void equipThief(@NotNull Thief thief){thief.equip(this);}


}
