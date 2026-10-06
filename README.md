

Sistema de Control de Profesores con Lista Simplemente Enlazada

Estructura del proyecto

El proyecto está formado por cuatro archivos. El archivo Profesor.java contiene la clase que representa a un profesor con sus atributos nombre, edad y categoría docente. El archivo Nodo.java contiene la clase que representa un nodo individual de la lista enlazada. El archivo ListaProfesores.java contiene la clase que representa la lista enlazada con todos sus métodos y las tres operaciones solicitadas. El archivo Main.java contiene el punto de entrada del programa. Finalmente, este archivo README.md documenta el funcionamiento general del proyecto.

La clase Profesor

La clase Profesor representa a un docente del departamento de Informática. Cada profesor tiene tres atributos: nombre, edad y categoría docente. La categoría puede ser Instructor, Asistente, Auxiliar o Titular. La clase tiene un constructor que recibe los tres valores y los guarda en los atributos correspondientes. También tiene métodos para obtener cada atributo por separado. El método toString devuelve una cadena con el nombre, la edad y la categoría separados por guiones, para que sea fácil de imprimir.

La clase Nodo

La clase Nodo es la pieza fundamental de la lista enlazada. Cada nodo almacena un objeto de tipo Profesor en el atributo dato y guarda una referencia al siguiente nodo de la cadena en el atributo siguiente. Cuando un nodo no apunta a nadie, su atributo siguiente vale null, lo que indica que ese nodo es el último de la lista. La clase tiene un constructor que recibe el profesor a guardar y coloca automáticamente el enlace en null, dejando el nodo listo para ser enlazado cuando la lista lo necesite.

La clase ListaProfesores

La clase ListaProfesores mantiene dos atributos. El atributo cabeza apunta al primer nodo de la cadena, o vale null si la lista está vacía. El atributo size lleva la cuenta de cuántos profesores hay en la lista. El constructor inicializa ambos atributos dejando la lista completamente vacía.

El método agregar recibe un objeto Profesor y crea un nuevo nodo. Si la lista está vacía, ese nodo se convierte en el primero. Si no, recorre la lista con un nodo auxiliar llamado actual hasta llegar al último nodo y enlaza el nuevo nodo al final asignando el siguiente del último nodo al nuevo. Después incrementa el tamaño. Este método se usa principalmente para armar la lista en las pruebas.

Método ProxCambio

El método ProxCambio devuelve un listado con los nombres de los profesores que están próximos a realizar cambio de categoría para asistente. Según las reglas del departamento, esto aplica a los profesores que tienen categoría Instructor y cuya edad es mayor que 26 años. El método recorre la lista con un nodo auxiliar llamado actual. En cada nodo verifica si la categoría del profesor es Instructor y si su edad supera los 26 años. Si se cumplen las dos condiciones, agrega el nombre del profesor a una cadena de texto con un salto de línea al final. Si al terminar el recorrido no se agregó ningún nombre, devuelve un mensaje indicando que no hay profesores próximos a cambiar de categoría.

Método MostrarLista

El método MostrarLista devuelve un listado con la información de todos los profesores ordenados por edad de mayor a menor. Primero verifica si la lista está vacía y, en ese caso, devuelve un mensaje indicándolo. Si hay profesores, copia los objetos Profesor a un arreglo auxiliar recorriendo la lista con un nodo auxiliar. Luego aplica el algoritmo de ordenamiento burbuja sobre el arreglo, comparando las edades de cada par de profesores e intercambiándolos cuando el de la izquierda es menor que el de la derecha, para que queden de mayor a menor. Después recorre el arreglo ya ordenado y arma una cadena de texto con la información de cada profesor, agregando un salto de línea entre cada uno. Finalmente devuelve esa cadena.

Método CantProfesores

El método CantProfesores devuelve en un String la cantidad de profesores por categoría docente. Para lograrlo usa cuatro contadores enteros, uno para cada categoría: instructores, asistentes, auxiliares y titulares. Recorre la lista con un nodo auxiliar y, por cada profesor, compara su categoría con cada una de las cuatro posibles. Cuando coincide con alguna, incrementa el contador correspondiente. Al terminar el recorrido, arma una cadena de texto con los cuatro conteos, cada uno en una línea, y la devuelve.

Adrian Jesus Pelaez Rodriguez
