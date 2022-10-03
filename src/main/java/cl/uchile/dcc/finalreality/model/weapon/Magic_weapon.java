package cl.uchile.dcc.finalreality.model.weapon;

public class Magic_weapon extends AbstractWeapon{
    private int magic_damage;
    public Magic_weapon(String name_weapon, int damage_weapon ,int weight_weapon,int magic_damage){
       super(name_weapon,damage_weapon,weight_weapon);
       this.magic_damage = magic_damage;
    }

}
