# Bases de datos
Una base de datos es un conjunto de datos que nos provee de información para nuestras aplicaciones.

# Enfoques de archivos vs Enfoque bases de datos (DB No Relacional y DB relacional)
## Relacional
Estas están basadas en la formación de tablas y la relacion entre ellas.

<img src="img/Screenshot_2.png">

## No relacional
Están basadas en documentos

<img src="img/Screenshot_3.png">

# Nomenclatura Boyce Codd
Relación entre tablas

<img style="width:550px" src="img/Screenshot_5.png">

<img style="width:550px" src="img/Screenshot_6.png">

# Modelo de datos
Estructura lógica que adopta la base de datos incluyendo las relaciones y limitaciones que determinn cómo se almacenaan, organizan y cómo se accede a los datos.

## Tipos de modelo de base de datos

### Datos relacional
Es uno de los más comunes, se ordena mediante tablas que se relacionan entre si, compuests por columnas y filas

<img style="width:550px" src="img/Screenshot_12.png">

### Modelo jerárquico
Se caracteriza por presentar los datos en una estructura como un árbol, donde cada registro tiene su nodo raíz (nodo padre), del que surgen nuevos nodos (nodos hijos)

<img style="width:550px" src="img/Screenshot_13.png">

### Modelo de red
Este parte del modelo jerárquico, pero a diferencia del modelo jerárquico, en el modelo de red se permite las relaciones de uno a muchos o de muchos a muchos.

<img style="width:550px" src="img/Screenshot_14.png">

### Modelo orientado a objetos
Se define como una colección de objetos usados en POO, este modelo usa tablas (como el modelo relacional) pero no se limita a ellas, es decir, permite almacenar información detallada de cada objeto

<img style="width:550px" src="img/Screenshot_15.png">

### Modelo relacional de objetos
Este modelo toma características del modelo relacional y el modelo orientado a objetos, de manera que funciona de manera similar al relacional, pero incorpora funciones del mdoelo orientado a objetos (Objetos, clases, herencia, polimorfisfo). Esto permite una mejor escalabilidad.

### Modelo entidad-relación
Permite representar las entidades relevantes de una DB así como sus integraciones y propiedades. Se representa mediante símbiolos definidos. Básicamente es el paso previo a un modelo de DB relacional ya que se trata de un diagrama elaborado con elementos básicos:

- Entidades: Objetos que representan en la DB
- Atributos: El contenido de la entidad u objeto, sus características.
- Relación: El vínculo que define la dependenci de un objeto y otro
- Cardinalidad: Como prticipan los objetos entre si (uno muchos, uno a uno, muchos a uno, muchos a muchos)

<img style="width:550px" src="img/Screenshot_16.png">

# Claves o llaves en las entidades
Las llaves son los identificadores únicos de cada registro, es decir, si se hace una compra, esa compra tiene su ID de venta para esa venta.

- Llaves primrias (PK): Representan al ID único de cada registro
- Llaves foráneas (FK): Representan las llaves primarias en otra tabla

  <img src="img/Screenshot_10.png">
  
  <img style="width:550px" src="img/Screenshot_11.png">
  
  ### Según la imagen
  - PK: Llave primaria
  - FK Llave foránea
  
# Normalizar
Serie de reglas par evitar consultas complejas. Está enfocado en eliminar redundancias en las tablas. En pocas palabras nos permite evitar la duplicidad de información.

- Evitar redundancia de datos
- Proteger integridad de datos
- Evitar problemas de actualizacion de datos

Tomemos como ejemplo una tabla cliente que almena algunos datos, entre ellos el número de ceulular del cliente...

<img src="img/Screenshot_17.png">

<img src="img/Screenshot_18.png">

Todo está bien si sólo tiene 1 celular, ¿Pero qué pasa si tiene más de 1 celular? ¿Donde se registra esa información?, bueno... se podría poner los dos celulares separados por un guión:

<img src="img/Screenshot_19.png">

Pero eso serí muy mala práctica.
En esos casos cuando se pasa a normlizar una DB el campo teléfono se convierte en una nueva tabla:

<img src="img/Screenshot_20.png">

<img src="img/Screenshot_21.png">

