package cl.uchile.dcc.finalreality.model.weapon;

import java.util.Objects;

/**
 * A class that holds all the information of a weapon.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author ~Your name~
 */
public abstract class AbstractWeapon {

  private final String name;
  private final int damage;
  private final int weight;
  /**
   * Creates a weapon with a name, a base damage, speed, and it's type.
   */
  public AbstractWeapon(final String name, final int damage, final int weight) {
    this.name = name;
    this.damage = damage;
    this.weight = weight;

  }
  /**
   * The nexts methods are the getters of name, damage and weight of the weapon
   */
  public String getName() {
    return name;
  }
  public int getDamage() {
    return damage;
  }

  public int getWeight() {
    return weight;
  }


  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final AbstractWeapon weapon)) {
      return false;
    }
    return hashCode() == weapon.hashCode()
        && damage == weapon.damage
        && weight == weapon.weight
        && name.equals(weapon.name);

  }

  @Override
  public int hashCode() {
    return Objects.hash(AbstractWeapon.class, name, damage, weight);
  }

  @Override
  public String toString() {
    return "Weapon{name='%s', damage=%d, weight=%d}"
        .formatted(name, damage, weight);
  }


}
