# Empresa Taxista


## Proyecto de segundo semestre de la carrera Ingeniería Informática
## Proyecto Final de Curso “TaxiExpress”.
### “TaxiExpress” es un proyecto para crear e implementar fácilmente un sistema de transporte capacitado y especializado en el transporte de personas, a través de agentes conocidos como taxistas, logrando que el cliente llegue a su destino con gran rapidez, alcanzando así la satisfacción de nuestros clientes. Nuestra aplicación está desarrollada para brindarles a los usuarios que decidan escoger nuestros servicios, un fácil acceso, un servicio de excelencia y unas tarifas asequibles.


# Medios:


- Lenguaje de programacion:Java


- Arquitecturas:Capas


- IDE:Netbeans

# Integrantes:
* [Alejandro Sánchez González](https://github.com/AleSGXRD/)
* [Alejandro Javier Arevalo Millian](https://github.com/AlejandroXRD)
* [Carlos Erick Rodríguez de la Cruz](https://github.com/KzMikha)
* [Ernesto Quesada](https://github.com/ernestoQG)
* [Yordan David Bell Caballero](https://github.com/yordanbell)

# Informacion del proyecto:

## Alejandro Sánchez González

El módulo a desarrollar por mí fue el del administrador.

El administrador contiene un rol excepcional en la empresa ya que, gracias a él, se controla tanto la información que el orden dentro de ella y el orden de turnos de los trabajadores, y así no dejar este orden a los usuarios o trabajadores.

El modulo administrador se desarrolla en otro plano de la aplicación donde solo puede acceder quienes tengan control de la aplicación y el tráfico por parte de la empresa. En la carpeta aplicación esta diferenciadas, a través de sus respectivas carpetas, la app para el administrador y para los clientes u trabajadores.

Al entrar abrir la app para administrador se le mostrara una interfaz con el nombre de la empresa, el dinero recaudado hasta ese momento, y tres botones:

1-Crear una nueva sesión Trabajador:

Para controlar la cantidad de usuarios trabajadores, y no dejarle un libre tratamiento de ello a cualquier persona, se hace necesario que la información de los trabajadores sea controlada por un administrador de la misma empresa, para ello, es desarrollada esta interfaz para poder crear usuario a los respectivos trabajadores contratados por la empresa y así que ellos puedan interactuar con los usuarios y trabajar cómodamente.

Al pulsar dicho botón, mostrara una nueva interfaz con un formulario para llenar, con el nombre, apellido, carnet de identidad y dirección del trabajador.

Al introducir su carnet de identidad deberá fijarse si esta correcto o en el caso contrario no permitirá crear su usuario.

Usted deberá seguir estas limitaciones:
-El carnet de identidad este compuesto por solo números.
-Este está formado por únicamente 11 dígitos (ni más, ni menos).
-Cada persona tiene su Carnet de identidad propio, asegúrese de que no coincida con otro usuario.

Además, tendrá que rellenar una cuenta de usuario para ese trabajador y asignarle que tipo de trabajador es el que registra.

Para salir de esta pestaña solo deberá pulsar el botón X en la esquina superior derecha (OJO no me refiero al botón en de la pestaña de la aplicación).

2-Dar de alta Usuario:

En determinados momentos habrá trabajadores o clientes que se saldrán de la empresa, en este caso se desarrollo una interfaz para eliminar sus datos y no estar sobrecargando la empresa con tanta información innecesaria, y para ello la interfaz a la que conducirá este botón.

Al pulsar el botón se accederá a una nueva ventana de interfaz donde podrás seleccionar el tipo de usuario q desea expulsar, seleccionar un tipo, la lista debajo que son los usuarios de este tipo cambiaran dependiendo del tipo seleccionado, y a la derecha usted tiene un botón para expulsar al usuario, pero CUIDADO, una vez borrada la información no habrá vuelta atrás.

Para salir de esta pestaña solo deberá cerrarla.

3-Modificar turnos Trabajador:

Que los trabajadores tengan un turno por los que estén obligados a trabajar es de vital importancia, ya que sin un orden la empresa tendría horarios muertos y no podemos dejar que esto ocurra, los clientes deben sentirse contentos con nuestra atención, así que es muy importante que cuando un cliente quiera pedir un taxi haiga siempre una disponibilidad para todos. Por este motivo es creada esta interfaz en la que el administrador podrá registrar los turnos de cada, así como eliminar los turnos de días pasados para que no se acumulen sin necesidad, es importante tener en cuenta que los turnos están compuestos por 3 elementos (Dia, Hora de Comienzo, Hora de Culminación).

Al pulsar el botón se accederá a una nueva ventana de interfaz donde primero deberá escoger el tipo de trabajador, después el trabajador que desea asignarle turnos, y después la interfaz contiene un botón para agregar turno, una vez añadido este usted debe rellenarlo, asegúrese dejar todos rellenados y seguir el formato indicado hh:mm en cada una de las casillas referentes a horarios, y en cuanto a los días simplemente escribir un día de la semana en él.

Como podrá ver cada turno tiene una última casilla donde puedes marcar y desmarcar, ¿cómo funciona ello? Debajo de la tabla podrá ver un botón de borrar turnos, al tocar este botón se borrarán todos aquellos turnos que contengan la última casilla marcada, de esta manera podrá borrar aquellos turnos de días pasados, y de esta manera no acumular tantos turnos.

Una vez terminado de introducir todos los turnos deseados, asegúrese de pulsar el botón de guardar (no cambie de trabajador sin pulsar este botón o no se le guardara ningún cambio que haiga hecho).
Para salir de esta pestaña solo deberá cerrarla.


# Enlaces:
## Diagrama UML:
- https://cacoo.com/diagrams/pKzQeZv4A1JZYpcH/60E47
## GitHub:
- https://github.com/AleSGXRD/ProyectoDPOO/
