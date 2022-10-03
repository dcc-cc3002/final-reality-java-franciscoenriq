
package cl.uchile.dcc.finalreality;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.AbstractCharacter;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.Thief;
import cl.uchile.dcc.finalreality.model.character.player.WhiteMage;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;
import cl.uchile.dcc.finalreality.model.weapon.WeaponType;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Main     {
    public static void main(String[] args) throws InterruptedException, InvalidStatValueException {
        BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
        Random rng = new Random();
        Weapon cuchillo =  new Weapon("cuchillo_pulento",100,20,WeaponType.KNIFE);
        Weapon baston = new Weapon("baston_de_Gandalf",20,20,WeaponType.STAFF);
        Weapon espada1 = new Weapon("espadita",20,20,WeaponType.SWORD);
        Weapon baston2 = new Weapon("baston_de_Gandalf_blanco",40,25,WeaponType.STAFF);

        BlackMage Gandalf = new BlackMage("Gandalf",200 ,50,300,queue);
        Gandalf.equip(baston);
        Gandalf.waitTurn();
        while (!queue.isEmpty()) {
            // Pops and prints the names of the characters of the queue to illustrate the turns
            // order
            System.out.println(queue.poll().toString());
        }
        WhiteMage Gandalf_blanco = new WhiteMage("Gandalf_blanco",250,75,300,queue);






    }



}



