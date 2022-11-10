Final Reality
=============

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

This work is licensed under a 
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/)

Context
-------

This project's goal is to create a (simplified) clone of _Final Fantasy_'s combat, a game developed
by [_Square Enix_](https://www.square-enix.com)
Broadly speaking for the combat the player has a group of characters to control and a group of 
enemies controlled by the computer.

---

**The rest of the documentation is left for the users of this template to complete**

**Arreglos tarea 1**

Para esta tarea arreglé un par de cosas que me faltaron de la t1 ,creé una clase abstracta para los magos , cambié de 
lugar el método waitTurn dado como estaba construido el if y else que tenía , así el metodo quedó en enemy y en abstrac-
PlayerCharacter. De esta manera me aseguro de que el método no pregunte con instanceOf para ver que hace. 
Lo ultimo que hice fue separar las armas de tal forma que cada una tenga su clase propia. Impelemnté la clase abstract-
Weapon con todos los metodos comunes a todas las armas, mientras que en clases como Staff cree la variable magicDamage 
que es propia de este tipo de armas.

**Double Dispatch para implementación de equipamiento de armas**

Luego de esto para implementar lo pedido con respecto a equipar armas usé doubleDispatch.Esto se logró debido a que para 
cada personaje se le crearon metodos como equipTalArma dependiendo del tipo de arma que un tipo de player pueda usar . 
Es decir , por ejemplo la clase caballero tiene implementado el metodo equipSword para poder equipar su espada. 
A su vez se hizo lo mismo para todas las armas , ya que dado el flujo de ejecucion que tendrá esta implementación , es la arma la
que finalmente termina llamando a equipWeapon para equipar al player así el arma en cuestión tendrá un me-
todo llamado equipKnight para así completar el flujo de ejecución que tendrá el doubleDispatch .
El problema que acaece este es que el metodo equipWeapon tendrá que quedar publico así que de todas formas si uno quisiera
hacer "trampa" podría hacer knight.equipWeapon(Staff) sin nungún problema .Por lo que hablé con el aux y con un amigo 
concordaron en que esto es uno de los poblemas que puede tener el doubleDispatch, pero a la hora de implemnetar e juego 
esto podía ser controlado con la interfaz gráfica que al final tendrá el juego , impidiendo que se pueda usar equipWeapon 
directamente. 

**Tests** 

Para los tests se hicieron clases para cada una de los entes del juego(o en su mayoría) en un principio se me fue la on-
da con los tests , testeando cada variable para cada metodo, como para el equals o el hashCode. Luego de eso empecé a
hacer menos extensivos los códigos. 
