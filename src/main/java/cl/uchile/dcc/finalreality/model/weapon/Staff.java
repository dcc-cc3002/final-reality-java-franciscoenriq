package cl.uchile.dcc.finalreality.model.weapon;

public class Staff extends Weapon{
    private final int magicDamage;

    public Staff(final String name,final int damage,final int weight, final int magicDamage){
        super(name, damage, weight);
        this.magicDamage= magicDamage;
    }
    public int getMagicdamage() {
        return magicDamage;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Weapon weapon)) {
            return false;
        }
        return hashCode() == weapon.hashCode()
                && damage == weapon.damage
                && weight == weapon.weight
                && name.equals(weapon.name)
                && magicDamage == weapon.magicDamage;


    }
}
