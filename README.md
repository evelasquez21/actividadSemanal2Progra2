===========\
Diseño de clases\
===========\
*Mascota*\
En esta clase se implementa abstracción y se define los siguientes métodos:\
hacerSonido() -> un método abstracto para implementar abstracción en las clases que tendran herencia.\
descansar() -> un método publico para dar la salida que la mascota esta descansando.

*Perro*\
Esta clase extiende a la clase Mascota e implementa la interfaz de Vacunable, sobreescribe los siguientes métodos:\
hacerSonido() -> método heredado de clase Mascota.\
vacunar() -> método sheredado de la interfaz Vacunable y tendra una salida que indicará que la mascota esta vacunada.

*Gato*\
Esta clase extiende a la clase Mascota y sobreescribe el método:\
hacerSonido() -> método heredado de clase Mascota.

*Conejo*\
Esta clase extiende a la clase Mascota e implementa la interfaz de AtencionEspecial, sobreescribe los siguientes métodos:\
hacerSonido() -> método heredado de clase Mascota.\
recibirAtencionEspecial() -> método sheredado de la interfaz AtencionEspecial y tendra una salida que indicará que la mascota esta recibiendo atención especial.

*Tortuga*\
Esta clase extiende a la clase Mascota y sobreescribe el método:\
hacerSonido() -> método heredado de clase Mascota.

*ConsultaVeterinaria*\
Esta es la clase principal; se declara una lista con el tipo de dato de Mascota.\
Se instancia las clases:\
	*Perro\
 	*Gato\
  	*Conejo

Se agrega la instancia de cada clase a la lista previamente creada.\
Se recorre la lista y se invoca a los métodos:\
hacerSonido() y descansar().

Dentro del recorrido se hace uso del operador binario instanceof para determinar en cada reccorrido si la clase es de tipo Conejo y en el caso de que lo sea se invoca al método recibirAtencionEspecial().\
Luego se hace uso nuevamente del operador binario instanceof para determinar dentro del mismo recorrido si la clase es de tipo Perro y en el caso de que lo sea se invoca al método vacunar() y si no, tendra la salida de que la mascota no puede vacunarse.
