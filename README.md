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
Nota: **Todos los botones que se describen abajo pueden verificar si uno o los 2 campos de entrada tienen valores ingresados y los opera adecuadamente, ádemas, se manejan posibles excepciones que se generen en las ejecuciones de esos botones**

PI <br>
_El boton **Pi** permite obtener el valor del numero o numeros ingresados, multiplicando el numero por la constante PI de la clase **Math**, por ejemplo si se ingresa el 5, este botón retornara "5*Math.PI" como cadena formateada y lo ubica en el label **resultadoLbl**._

 SENO <br>
_El boton **Seno** permite obtener el seno del numero o numeros ingresados convirtiéndolos a radianes, se hace uso del metodo **sin** de la clase **Math**, por ejemplo, si se ingresa 32, este botón lo convertira a radianes para obtener el valor correcto en el metodo **sin**(Math.toRadians(32)) y retorna dicho valor como cadena formateada y lo ubica en el label **resultadoLbl**._

COSENO <br>
_El boton **Coseno** permite obtener el coseno del numero o numeros ingresados convirtiéndolos a radianes, se hace uso del metodo **cos** de la clase **Math**, por ejemplo, si se ingresa 26, este botón lo convertira a radianes para obtener el valor correcto en el metodo **cos**(Math.toRadians(26)) y retorna dicho valor como cadena formateada y lo ubica en el label **resultadoLbl**._

TANGENTE <br>
_El boton **Tangente** permite obtener la tangente del numero o numeros ingresados convirtiéndolos a radianes, se hace uso del metodo **tan** de la clase **Math**, por ejemplo, si se ingresa 14, este botón lo convertira a radianes para obtener el valor correcto en el metodo **tan**(Math.toRadians(14)) y retorna dicho valor como cadena formateada y lo ubica en el label **resultadoLbl**._

----------------------------> SILVIA CHALUISA <br>
-Logaritmo común (base 10): 
log10(x), x es el numero del cual se esta calculando el logaritmo, este logaritmo calcula a que exponente debe elevarse 10 para obtener el resultado.

-Logaritmo natural (base e):
ln(x) o  logx(x), se refiere al logaritmo en base e, la base del logaritmo natural, donde x es el numero del cual se desea calcular el logaritmo. El número  e es una constante aproximada igual a 2.711828.

-Logaritmo en cualquier base (base b):
logb(x), se refiere al logaritmo con una base arbitraria b, donde x es el número del cual se esta calculando el logaritmo y b es la base  la formula general es logb(x)=logc(x)/logc(b), log c, es el logaritmo de la base c.

-Logaritmo doble (base 2):
log2(x), calcula a que exponente debe elevarse 2 para obtener el número dado. Ejemplo log2(8)=3, ya que 2elevador a 3=2

-------------------------> Emilio Erazo
Suma (+)
n + n, Calcula la suma de dos números enteros o decimales. Ejemplo 256 + 24.3 = 280.3
Resta (-)
n - n, Calcula la resta de dos números enteros o decimales. Ejemplo 256.32 - 250.12 = 6.20
Multiplicación (*)
n * n, Calcula la multiplicación de dos números enteros o decimales. Ejemplo 256.3 * 2 = 512.6
División (/)
n / n, Calcula la división de dos números enteros o decimales. Ejemplo  857967 / 3 = 285989
