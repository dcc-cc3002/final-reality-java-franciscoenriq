package cl.uchile.dcc.finalreality.model.weapon;

import java.util.Objects;

public class Staff extends Weapon {
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
        return Objects.hash(Weapon.class, getName(), getDamage(), getWeight(), getMagicdamage());
    }

    @Override
    public String toString(){
        return "Weapon{name='%s', damage=%d, weight=%d, magicDamage=%d}"
                .formatted(getName(), getDamage(), getWeight(),magicDamage);
    }

}
