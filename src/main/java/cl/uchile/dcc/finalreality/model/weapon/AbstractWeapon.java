package cl.uchile.dcc.finalreality.model.weapon;

public abstract class AbstractWeapon {
    private final String name_weapon;
    private final int damage_weapon ;
    private final int weight_weapon;


    protected AbstractWeapon(final String name_weapon, final int damage_weapon ,final int weight_weapon){
        this.name_weapon = name_weapon;
        this.damage_weapon =  damage_weapon ;
        this.weight_weapon = weight_weapon;
    }
    public int getDamage_weapon(){return damage_weapon;}
    public int getWeight_weapon() {
        return weight_weapon;
    }
    public String getName_weapon() {
        return name_weapon;
    }

}
