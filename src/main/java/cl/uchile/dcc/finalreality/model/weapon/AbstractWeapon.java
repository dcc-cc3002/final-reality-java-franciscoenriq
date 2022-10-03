package cl.uchile.dcc.finalreality.model.weapon;

import java.util.Objects;

public abstract class AbstractWeapon  {
    private final String name_weapon;
    private final int damage_weapon ;
    private final int weight_weapon;




    protected AbstractWeapon(final String name_weapon, final int damage_weapon ,final int weight_weapon){
        this.name_weapon = name_weapon;
        this.damage_weapon =  damage_weapon ;
        this.weight_weapon = weight_weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractWeapon that = (AbstractWeapon) o;
        return damage_weapon == that.damage_weapon && weight_weapon == that.weight_weapon && Objects.equals(name_weapon, that.name_weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name_weapon, damage_weapon, weight_weapon);
    }
}
