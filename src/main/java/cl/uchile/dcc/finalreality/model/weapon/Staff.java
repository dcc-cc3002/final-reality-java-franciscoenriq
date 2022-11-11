package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.mages.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.mages.WhiteMage;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Staff extends AbstractWeapon {
    private final int magicDamage;

    public Staff(final String name, final int damage, final int weight, final int magicDamage) {
        super(name, damage, weight);
        this.magicDamage = magicDamage;
    }

    public int getMagicdamage() {
        return magicDamage;
    }



    @Override
    public int hashCode() {
        return Objects.hash(AbstractWeapon.class, getName(), getDamage(), getWeight(), getMagicdamage());
    }

    @Override
    public String toString(){
        return "Weapon{name='%s', damage=%d, weight=%d, magicDamage=%d}"
                .formatted(getName(), getDamage(), getWeight(),magicDamage);
    }
    public void equipWhiteMage(@NotNull WhiteMage whiteMage){ whiteMage.equip(this);}
    public void equipBlackMage(@NotNull BlackMage blackMage){blackMage.equip(this);}

}
