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


OJO : el método setCurrentHp quedó publico para que no tirara error , no alcancé a pillar porque no me deja colocarlo privado. 
lo habia dejado publico en un momento en un momento para poder testearlo pero al parecer es mala practica que este 
metodo quede publico. 


**Tarea 3** 
Para esta tarea no tuve mucho tiempo para realizarla pero creo qe iba bien encaminado. 
Primero que todo empecé implemntando los hechizos , los cuales no quedaron del todo implemntados pero tambien iban bien ! 
Al emepzar a querer usar el magicDamage que contenia el baston no me dejaba usarlo , por lo cual la forma de arreglarlo 
fue lo siguiente :
Hice mas extensible las clases de las armas magicas , haciendo un abstractMagicWeapon , cosa que si mas adelante es nece-
sario agregar otra arma magica esta tendría que heredar de la antes clase mencionada . 
A parte de esto tuve que separ la variable equippedWeapon contenida en AbstractPlayerCharacter en dos , una variable para 
armas magicas y otra para armas no magicas , por lo cual a parte de eso tuve que divir el metodo equipWeapon() de la misma
manera . 
De esta manera las armas magicas llaman al método equipMagicWeapon() y las que no a equipWeapon() como se había establecido 
en la entrega anterior . 
Así pude arreglar el uso de hechizos , ya que como hay que usar el magicDamage como comenté ahora me reconoce de buena 
manera el parametro dentro del método. 
Para el uso de hechizos entonces, a parte de aplicarle el daño al enemigo este queda seteado con su respectivo estado, 
el cual se representa a traves de una nueva variable que tienen los enemigos.

Luego de esto empecé a implementar el controlador, basicamente alcancé a implementar el statePatern, con dos estados
implementados parcialmente, GameIncialization y PlayerTurn , ambas clases implementan la interfaz State la cual contiene 
todos los métodos que se utilizarán a lo largo de todo el juego , pero no estarán todos como dije anteriormente. 
Hay métodos los cuales no serán usados en una clase pero si serán de utilidad en otra , a estos metodos que no serán uti-
lizados se les deja con un valor de retorno null para que no molesten y no interfieran con el correcto funcionamiento del 
juego. 
Ahora bien , finalmente el controlador contiene una variable que contiene al estado actual de este , el cual irá cambiando 
a medida que se vayan llamando los diferentes metodos del juego . 
Por ejemplo , el juego parte el en estado GameInitialization, el cual tiene como finalidad setear todos los objetos necesarios 
para el correcto funcioanmiento de la partida. 
Luego existe un metodo llamado starGame() el cual setea la viarble state del controller a player turn, por lo cual 
ahora los metodos utilizados en el estado anterior no funcionan dando paso a la activacion de otros métodos.  

Esto es lo que alcancé a hacer , lo mas probable es que metodos como starGame() no deberia llevaar directamente a playerTurn
ya que como sale el enunciado es necesario una comparación entre pesos entre el personaje del jugador y del enemigo. 
Pero esa es más o menos la idea que alcancé a hacer. 
Saludos :) 
Pd: se me olvidó comentar que tambien cree las clases de uso de magia , cosa que se setea el hechizo a utilizar en una variable 
contenida en AbstractMage. 
