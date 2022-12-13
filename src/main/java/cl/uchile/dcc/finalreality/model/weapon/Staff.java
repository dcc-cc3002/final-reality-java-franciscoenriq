package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Staff extends AbstractMagicWeapons {


    public Staff(final String name, final int damage, final int weight, final int magicDamage) {
        super(name, damage, weight,magicDamage);

    }
    public void equipWhiteMage(@NotNull WhiteMage whiteMage){ whiteMage.equipMagicWeapon(this);}
    public void equipBlackMage(@NotNull BlackMage blackMage){blackMage.equipMagicWeapon(this);}

}
