package cl.uchile.dcc.finalreality.model.weapon;



import java.util.Objects;



public abstract class   AbstractMagicWeapons extends AbstractWeapon{


    private final int magicDamage;
    /**
     * Creates a weapon with a name, a base damage, speed, and it's type.
     */
    public AbstractMagicWeapons(final String name, final int damage, final int weight, int magicDamage) {
        super(name, damage, weight);
        this.magicDamage = magicDamage;
    }
    public int getMagicDamage(){
        return magicDamage;
    }
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final AbstractMagicWeapons weapon)) {
            return false;
        }
        return hashCode() == weapon.hashCode()
                && getDamage() == weapon.getDamage()
                && getWeight() == weapon.getWeight()
                && magicDamage == weapon.magicDamage
                && getName().equals(weapon.getName());

    }

    @Override
    public int hashCode() {

        return Objects.hash(AbstractMagicWeapons.class, getName(), getDamage(), getWeight(),magicDamage);
    }

    @Override
    public String toString() {
        return "Weapon{name='%s', damage=%d, weight=%d, magicDamage=%d}"
                .formatted(getName(), getDamage(), getWeight(),magicDamage);
    }
}



