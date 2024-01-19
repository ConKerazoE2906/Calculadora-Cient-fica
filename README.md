# Calculadora-Cient-fica
Creacion de calculadora cientifica con minimo 17 operaciones

--------------> MATEO BERNAL
POTENCIA
El botón de potenciación, nos permite elevar un numero al exponente que el usuario desee. Para poder trabajar con potencias se hizo uso de la 
función “Math” y del método pow.

RAIZ
El botón de raíz, nos permite sacar la raíz de un numero previamente ingresado por el usuario. Para poder trabajar con raíz se hizo uso de la 
función “Math” y de la siguiente formula donde usa el método pow, Math.pow(base,(1.0/n)).

PORCENTAJE
El botón de porcentaje, nos permite sacar el porcentaje entre dos números previamente ingresado por el usuario. Para poder sacar el porcentaje 
se hace uso de la siguiente formula ((n_uno*100)/n_dos).

RANDOM
El botón de numero random, nos permite generar un numero al azar donde el usuario tiene la posibilidad de poner al límite y el alcance del número 
que se generara. Para la generación del numero se usa la función “Math” y el método random.

------------------------> MARCELO PINZÓN <br>
Nota: **Todos los botnones que se describen abajo pueden verificar si uno o los 2 campos de entrada tienen valores ingresados y los opera adecuadamente, ademas, se manejan posibles excepciones que se generen en las ejecuciones de esos botones**

PI <br>
_El boton **Pi** permite obtener el valor del numero o numeros ingresados, multiplicado el numero por la constante PI de la clase **Math**, por ejemplo si se ingresa el 5, este botón retorara "5*Math.PI"._

 SENO <br>
_El boton **Seno** permite obtener el seno del numero o numeros ingresados convirtiéndolos a radianes, se hace uso del metodo **sin** de la clase **Math**, por ejemplo, si se ingresa 32, este botón lo convertira a radianes para obtener el valor correcto en el metodo **sin**(Math.toRadians(32)) y retorna dicho valor._

COSENO <br>
_El boton **Coseno** permite obtener el coseno del numero o numeros ingresados convirtiéndolos a radianes, se hace uso del metodo **cos** de la clase **Math**, por ejemplo, si se ingresa 26, este botón lo convertira a radianes para obtener el valor correcto em el metodo **cos**(Math.toRadians(26)) y retorna dicho valor._

Tangente <br>
_El boton **Tangente** permite obtener la tangente del numero o numeros ingresados convirtiéndolos a radianes, se hace uso del metodo **tan** de la clase **Math**, por ejemplo, si se ingresa 14, este botón lo convertira a radianes para obtener el valor correcto em el metodo **tan**(Math.toRadians(14)) y retorna dicho valor._