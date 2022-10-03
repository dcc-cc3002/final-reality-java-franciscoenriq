package cl.uchile.dcc.finalreality.model.weapon;

public class Staff extends AbstractWeapon{
    /**
     * @param name_weapon name of the weapon
     * @param damage_weapon damage of the weapon
     * @param weight_weapon weight
     */

    private final int magic_damage;
    public Staff(String name_weapon, int damage_weapon ,int weight_weapon,int magic_damage){
        super(name_weapon,damage_weapon,weight_weapon);
        this.magic_damage = magic_damage;
    }


    public int getMagic_damage(){return magic_damage;}



}
