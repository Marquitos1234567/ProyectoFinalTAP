# Sistema gestor de actividades complementarias

## Descripción
Un Sistema Gestor de Actividades Complementarias es una plataforma diseñada para organizar y administrar diversas actividades que complementan la formación académica o laboral de las personas. Estas actividades pueden incluir conferencias, talleres, cursos, eventos culturales, voluntariado, prácticas profesionales, entre otros.

1. Gestión de usuarios:

Docentes: El sistema permite registrar y administrar perfiles de docentes, incluyendo información como nombre, especialidad, horario de disponibilidad, y asignación de actividades.
Alumnos: Los alumnos también tienen perfiles dentro del sistema, donde pueden acceder a información sobre las actividades disponibles, inscribirse en ellas, y ver su historial de participación.
Administradores: Existe un rol de administrador que supervisa y gestiona todo el sistema, teniendo acceso a funciones avanzadas como la creación de actividades, la generación de informes y la administración de usuarios.

2. Gestión de actividades:

Los docentes pueden crear nuevas actividades, especificando detalles como el título, la descripción, la fecha, la hora, el lugar y la capacidad máxima de participantes.
Los alumnos pueden explorar las actividades disponibles, filtrarlas por categoría o fecha, e inscribirse en aquellas de su interés.
El sistema gestiona automáticamente las inscripciones, enviando notificaciones a los alumnos confirmados y actualizando el estado de las actividades en tiempo real.

3. Comunicación:

El sistema envía correos electrónicos automáticos a los usuarios para notificarles sobre actividades próximas, cambios en los horarios o actualizaciones importantes.
Los docentes pueden enviar mensajes a los alumnos inscritos en sus actividades, proporcionando información adicional o respondiendo preguntas específicas.

4. Gestión de archivos:

El sistema permite a los docentes y administradores subir archivos relevantes, como horarios de actividades, material didáctico o constancias de participación.
Los alumnos pueden acceder a estos archivos desde sus perfiles, descargándolos según sea necesario.

5. Generación de constancias:

Después de completar una actividad, el sistema genera automáticamente constancias de participación para los alumnos inscritos, que pueden descargar desde sus perfiles.
Los docentes pueden verificar la asistencia de los alumnos y aprobar la emisión de constancias, garantizando la validez y precisión de la documentación.

## Patrón Modelo-Vista-Controlador (MVC) Utilizado y usos
En este sistema de gestión de actividades complementarias, se ha implementado el patrón Modelo-Vista-Controlador (MVC) para organizar y estructurar el código de manera modular y eficiente. A continuación, se describe cómo se aplica este patrón en las diferentes capas del sistema:

Modelo
El modelo se encarga de representar los datos y la lógica de negocio de la aplicación. En este caso, el modelo contiene dos clases principales:

Clase Conexion: Esta clase establece la conexión con la base de datos MySQL y provee métodos para realizar operaciones de consulta, inserción, actualización y eliminación de datos.
Clase Consultas: Aquí se definen las consultas específicas de MySQL para obtener diferentes tipos de datos relacionados con las actividades, usuarios y otros elementos del sistema. Esta clase encapsula las consultas SQL para reutilizarlas fácilmente en diferentes partes de la aplicación.

Vista
La vista se encarga de la presentación de la interfaz de usuario y la interacción con el usuario. En este sistema, la vista está compuesta por varias clases que representan diferentes pantallas y componentes de la interfaz de usuario:

Clase ActividadDocente: Presenta la vista de una actividad para un docente, mostrando detalles y opciones relacionadas con la actividad.
Clase ActividadActualAlumno: Muestra la vista de la actividad actual para un alumno, permitiéndole interactuar con la misma según su rol y estado.
Clase AgregarActividad: Proporciona la interfaz para que un docente pueda agregar una nueva actividad al sistema.
Clase Docente y Alumno: Representan las vistas de perfil para un docente y un alumno respectivamente, mostrando información y opciones relacionadas con cada usuario.
Clase CambiarContraseña: Permite a los usuarios cambiar su contraseña desde la interfaz.
Clase EstadisticaDocente: Presenta estadísticas y métricas relevantes para un docente, ayudándole a evaluar el rendimiento de sus actividades.
Clase EvaluarAlumno: Proporciona la interfaz para que un docente evalúe el desempeño de un alumno en una actividad específica.
Clase GestionarAlumno: Permite a un docente gestionar la participación de un alumno en sus actividades.
Clases de Menú: Se incluyen varias clases que representan menús para diferentes tipos de usuarios, como docentes, alumnos y administradores, proporcionando opciones de navegación y acceso a diferentes funcionalidades del sistema.
Clase Login y Registro: Presentan la vista para iniciar sesión y registrar un nuevo usuario en el sistema.
Clase UnirseActividad: Proporciona la interfaz para que un alumno se una a una actividad disponible en el sistema.

Controlador
El controlador actúa como intermediario entre el modelo y la vista, gestionando las solicitudes del usuario y coordinando las acciones necesarias. En este sistema, el controlador está compuesto por las siguientes clases:

Clase Correo: Contiene un método para enviar correos electrónicos con documentos PDF adjuntos, utilizado para notificar a los usuarios sobre actividades, cambios en su estado, etc.
Clase Documento: Define la estructura y contenido base de los documentos PDF que se adjuntan a los correos electrónicos enviados por el sistema.
Cada componente del patrón MVC cumple un rol específico y contribuye a la modularidad, legibilidad y mantenibilidad del código en el sistema de gestión de actividades complementarias. La separación clara de responsabilidades entre el modelo, la vista y el controlador facilita el desarrollo, la depuración y la evolución continua de la aplicación.

Componente de texto:
1.	Formularios de registro: Se utilizan para recopilar información como nombre, dirección de correo electrónico, carrera, etc.
2.	Búsquedas: Permiten a los usuarios ingresar consultas de búsqueda para encontrar contenido dentro de una aplicación o sitio web.
3.	Comentarios: En aplicaciones y sitios web que permiten a los usuarios dejar comentarios, se utilizan componentes de texto para que ingresen sus comentarios.
4.	Mensajería: En aplicaciones de mensajería, los usuarios pueden ingresar mensajes de texto para enviar a otros usuarios.
5.	Edición de perfil: Permiten a los usuarios actualizar su información personal, como su contraseña, correo, etc.

Componente de contraseña:
1.	Inicio de sesión: Se utiliza para que los usuarios ingresen contraseñas para acceder a sus cuentas protegidas por contraseña.
2.	Registro: Al registrarse en un servicio, los usuarios a menudo deben crear una contraseña para proteger su cuenta.
3.	Cambiar contraseña: Permite a los usuarios cambiar su contraseña actual por una nueva.
4.	Confirmación de identidad: En algunos casos, como al realizar transacciones financieras, se solicita a los usuarios que ingresen su contraseña como medida de seguridad adicional.





## Características
1.	Etiqueta de texto: Permite establecer una etiqueta de texto que se muestra encima del campo de contraseña.
2.	Color de línea: Permite personalizar el color de la línea que aparece debajo del campo de contraseña.
3.	Animación de texto de sugerencia: Realiza una animación suave del texto de sugerencia cuando el campo de contraseña gana o pierde foco.
4.	Animación de línea: Realiza una animación suave de la línea que aparece debajo del campo de texto cuando este gana o pierde foco, proporcionando una experiencia visual agradable y una indicación clara del estado del campo.
5. Gestión de usuarios: Permite registrar y gestionar usuarios, incluyendo docentes, alumnos y administradores, con perfiles personalizados y diferentes niveles de acceso.
6. Gestión de actividades: Permite crear, programar y gestionar diversas actividades complementarias, como conferencias, talleres, cursos, eventos culturales, etc.
7. Inscripciones: Facilita a los usuarios inscribirse en las actividades de su interés y llevar un registro de su participación.
8. Comunicación: Proporciona herramientas de comunicación, como notificaciones por correo electrónico, para informar a los usuarios sobre nuevas actividades, cambios en su estado, recordatorios, etc.
9. Gestión de recursos: Permite asignar y gestionar recursos necesarios para las actividades, como aulas, materiales, equipos, etc.
10. Seguimiento y evaluación: Facilita el seguimiento de la participación de los usuarios en las actividades y la evaluación del impacto y la efectividad de las mismas.
11. Generación de constancias: Permite generar automáticamente constancias de participación para los usuarios que completen satisfactoriamente las actividades.
12. Interfaz intuitiva: Ofrece una interfaz de usuario fácil de usar y navegación intuitiva para facilitar la interacción de los usuarios con el sistema.
13. Personalización: Permite personalizar la experiencia del usuario, mostrando actividades relevantes según intereses, nivel académico, área de estudio, etc.
14. Seguridad: Garantiza la seguridad de los datos y la privacidad de los usuarios mediante medidas como autenticación segura, control de acceso y cifrado de datos.
15. Informes y estadísticas: Proporciona informes y estadísticas sobre la participación de los usuarios para facilitar la toma de decisiones y la mejora continua del sistema.
16. Compatibilidad: Es compatible con diferentes dispositivos y plataformas, como computadoras de escritorio, dispositivos móviles y tablets, para garantizar el acceso a la información en cualquier momento y lugar.
    
## Requisitos password-field
+ Java Runtime Environment (JRE) instalado en el sistema.
+ Bibliotecas externas como org.jdesktop.animation.timing.Animator y org.jdesktop.animation.timing.TimingTarget que deben estar disponibles en el classpath durante la compilación y ejecución.

## Requisitos text-field
1.	Java Runtime Environment (JRE): Se requiere tener instalado Java Runtime Environment en el sistema para ejecutar aplicaciones Java que utilicen este componente de campo de texto personalizado.
2.	Bibliotecas externas: El código hace uso de bibliotecas externas como org.jdesktop.animation.timing.Animator y org.jdesktop.animation.timing.TimingTarget para realizar animaciones. Estas bibliotecas deben estar disponibles en el classpath durante la compilación y ejecución del código.
3.	Entorno de desarrollo: Se necesita un entorno de desarrollo Java, como Eclipse, NetBeans o IntelliJ IDEA, para compilar y trabajar con el código fuente de este componente de campo de texto personalizado.
4.	Sistema operativo compatible: Este componente de campo de texto personalizado debería ser compatible con cualquier sistema operativo que admita la ejecución de aplicaciones Java, como Windows, macOS y Linux.

## Requisitos para correo
1.	Java Runtime Environment (JRE): Se requiere tener instalado Java Runtime Environment en el sistema para ejecutar aplicaciones Java que utilicen este componente de campo de texto personalizado.
2.	Bibliotecas externas: El código hace uso de bibliotecas externas como javax.activation y javax.mail para mandar correos. Estas bibliotecas deben estar disponibles en el classpath durante la compilación y ejecución del código.
3.	Entorno de desarrollo: Se necesita un entorno de desarrollo Java, como Eclipse, NetBeans o IntelliJ IDEA, para compilar y trabajar con el código fuente de este componente de campo de texto personalizado.
4.	Sistema operativo compatible: Este componente de campo de texto personalizado debería ser compatible con cualquier sistema operativo que admita la ejecución de aplicaciones Java, como Windows, macOS y Linux.

## Requisitos para documento
1.	Java Runtime Environment (JRE): Se requiere tener instalado Java Runtime Environment en el sistema para ejecutar aplicaciones Java que utilicen este componente de campo de texto personalizado.
2.	Bibliotecas externas: El código hace uso de bibliotecas externas como java.itextpdf para mandar correos. Estas bibliotecas deben estar disponibles en el classpath durante la compilación y ejecución del código.
3.	Entorno de desarrollo: Se necesita un entorno de desarrollo Java, como Eclipse, NetBeans o IntelliJ IDEA, para compilar y trabajar con el código fuente de este componente de campo de texto personalizado.
4.	Sistema operativo compatible: Este componente de campo de texto personalizado debería ser compatible con cualquier sistema operativo que admita la ejecución de aplicaciones Java, como Windows, macOS y Linux.

## Requisito para conexión 
1.	Java Runtime Environment (JRE): Se requiere tener instalado Java Runtime Environment en el sistema para ejecutar aplicaciones Java que utilicen este componente de campo de texto personalizado.
2.	Bibliotecas externas: El código hace uso de bibliotecas externas como mysqlconnector para mandar correos. Estas bibliotecas deben estar disponibles en el classpath durante la compilación y ejecución del código.
3.	Una base de datos funcional con registros en MySql.
4.	Entorno de desarrollo: Se necesita un entorno de desarrollo Java, como Eclipse, NetBeans o IntelliJ IDEA, para compilar y trabajar con el código fuente de este componente de campo de texto personalizado.
5.	Sistema operativo compatible: Este componente de campo de texto personalizado debería ser compatible con cualquier sistema operativo que admita la ejecución de aplicaciones Java, como Windows, macOS y Linux.


## API
### PasswordField

#### Descripción
Con la clase `passwordfield` los desarrolladores pueden crear campos de contraseña que ofrecen una experiencia de usuario más atractiva, personalizada y funcional. 

#### Constructor
| Constructor | Descripción |
|-------------|-------------|
| `PasswordField()` | Constructor por defecto que inicializa un campo de contraseña con configuraciones predeterminadas. |


#### Métodos
| Nombre | Tipo de Dato que Retorna | Tipo de dato que recibe | Descripción |
|--------|--------|-------------------------|-------------|
| `setLabelText(String labelText)` | ninguno | `labelText`: El texto de la etiqueta. | Establece la etiqueta de texto que se mostrará encima del campo de contraseña. |
| `setLineColor(Color lineColor)` | ninguno | `lineColor`: El color de la línea. | Establece el color de la línea que aparece debajo del campo de contraseña. |
| `getText()` | 'String' | void | Devuelve el texto actualmente ingresado en el campo de contraseña. |
| `setText(String text)` | String | `text`: El texto que se establecerá. | Devuelve el texto actualmente ingresado en el campo de contraseña. |

---

### TextField

#### Descripción
`TextField` es un componente personalizado de Java Swing diseñado para manejar campos de texto en interfaces de usuario. Este componente extiende la funcionalidad básica proporcionada por el JTextField estándar al agregar características adicionales de estilo y animación.


#### Constructores
| Constructor | Descripción |
|-------------|-------------|
| `TextField()` | Constructor por defecto que inicializa un campo de texto con configuraciones predeterminadas. |

#### Métodos
| Nombre                    | Tipo de Dato que Retorna | Tipo de dato que recibe                    | Descripción                                                                                                |
| ------------------------- | ------------------------ | ------------------------------------------ | ---------------------------------------------------------------------------------------------------------- |
| `setLabelText(String labelText)`    | void                  | `labelText` | Establece la etiqueta de texto que se mostrará encima del campo de texto.                              |
| `setLineColor(Color lineColor)`                   | void                 |  `lineColor`                           | Establece el color de la línea que aparece debajo del campo de texto.              |
| `setText` | Ninguno                | `text`           | Establece el texto del campo de texto y realiza animaciones según sea necesario. |


### Clase login:
### Constructores:

public login(): Constructor que inicializa la interfaz de inicio de sesión y configura los componentes visuales como los campos de texto y los botones.
### Métodos Públicos:

public static void main(String args[]): Método principal que inicia la aplicación. Tipo de dato que retorna: void.
private void initComponents(): Método generado automáticamente que inicializa todos los componentes de la interfaz de usuario. Tipo de dato que retorna: void.
private void checkCMouseClicked(java.awt.event.MouseEvent evt): Método que maneja el evento de clic en el checkbox para mostrar u ocultar la contraseña. Tipo de dato que retorna: void.
private void registrarseMouseClicked(java.awt.event.MouseEvent evt): Método que maneja el evento de clic en el enlace "Registrarse". Tipo de dato que retorna: void.
private void seccionAMouseClicked(java.awt.event.MouseEvent evt): Método que maneja el evento de clic en la sección de alumno. Tipo de dato que retorna: void.
private void seccionBMouseClicked(java.awt.event.MouseEvent evt): Método que maneja el evento de clic en la sección de docente. Tipo de dato que retorna: void.
private void seccionCMouseClicked(java.awt.event.MouseEvent evt): Método que maneja el evento de clic en la sección de administrador. Tipo de dato que retorna: void.
private void ingresarMouseClicked(java.awt.event.MouseEvent evt): Método que maneja el evento de clic en el botón de "Ingresar". Tipo de dato que retorna: void.
private void ingresarMouseClicked(): Método que maneja el evento de clic en el botón de "Ingresar" cuando se presiona la tecla Enter. Tipo de dato que retorna: void.
Atributos:

private consultas validar: Objeto de la clase consultas utilizado para realizar validaciones de inicio de sesión. Tipo de dato que retorna: void.
public static String usuario: Variable estática que almacena el tipo de usuario (alumno, docente, administrador). Tipo de dato que retorna: String.
public static String ncontrol: Variable estática que almacena el número de control del usuario. Tipo de dato que retorna: String.

### Actividad actual alumno
### Paquete y Clase Principal:

El código está contenido en el paquete Vista.
La clase principal se llama menuAlumno, que representa el menú principal para los alumnos.
Atributos de Clase:

private consultas consultar;: Objeto de la clase consultas utilizado para realizar consultas a la base de datos. Tipo de dato que retorna: void.
private login metodo;: Objeto de la clase login utilizado para acceder a la información de inicio de sesión del alumno.

### Constructor:

El constructor menuAlumno() inicializa la interfaz del menú principal del alumno y configura los componentes visuales, como los botones y los enlaces.
También inicializa los objetos de consulta y obtiene información específica del alumno, como su saludo personalizado y su estado de inscripción en actividades.
Métodos:

initComponents(): Método generado automáticamente que inicializa todos los componentes de la interfaz de usuario.
Métodos privados que manejan eventos de clic en diferentes secciones del menú, como ver la actividad actual, unirse a una actividad o ver constancias.
perfilMouseEntered(): Maneja el evento de entrada del ratón en el icono de perfil, mostrando un menú emergente con opciones como cambiar la contraseña o cerrar sesión.
Métodos que manejan acciones específicas como cambiar la contraseña o cerrar sesión.
### Interfaz de Usuario:

La interfaz incluye un icono de perfil, un saludo personalizado para el usuario, secciones para ver la actividad actual, unirse a una actividad y ver constancias.
También incluye un menú emergente para acciones adicionales como cambiar la contraseña o cerrar sesión.
Eventos de Interfaz de Usuario:

Los eventos de clic en los componentes de la interfaz de usuario se manejan utilizando métodos específicos que realizan acciones como abrir nuevas ventanas para ver la actividad actual, unirse a actividades o ver constancias.
El evento de entrada del ratón en el icono de perfil muestra un menú emergente con opciones adicionales.

### Clase menu admin:
### Componentes Principales
Consultas y Login

La clase tiene dos variables privadas: consultar y metodo, que son instancias de las clases consultas y login, respectivamente.
El constructor de menuAdmin inicializa estos objetos y llama a un método saludo de consultas para mostrar un saludo en la GUI.
Menú Popup

Un JPopupMenu llamado jPopupMenu1 que contiene dos elementos de menú (JMenuItem): cambiarContra y cerrarSesion. Estos permiten al usuario cambiar su contraseña o cerrar sesión.
Panel Principal

Un JPanel principal (jPanel1) que contiene varios componentes:
Un icono de perfil (perfil).
Un logo de la aplicación (jLabel1).
Un título del menú (jLabel2).
Una etiqueta para mostrar un saludo (lblsaludo).
Paneles de Gestión

Tres paneles (gestionarAlumnos, gestionarActividades y gestionarDocentes) que representan diferentes secciones del menú donde el administrador puede gestionar alumnos, actividades y docentes.
### Eventos y Listeners
Acciones del Menú Popup

cambiarContraActionPerformed: Muestra la ventana para cambiar la contraseña y cierra la ventana actual.
cerrarSesionActionPerformed: Cierra la sesión actual y vuelve a la pantalla de login.
Acción del Perfil

perfilMouseEntered: Muestra el menú popup cuando el ratón pasa sobre el icono del perfil.
Acciones de Gestión

Cada uno de los paneles de gestión tiene un evento de clic (mouseClicked) que abre la ventana correspondiente y cierra la ventana actual.

### Clase menu docente

Descripción General
Esta clase, menuDocente, extiende javax.swing.JFrame y define la interfaz gráfica para el menú principal que usan los docentes en la aplicación. La interfaz permite a los docentes ver las actividades que imparten, generar estadísticas y realizar otras acciones como cambiar la contraseña o cerrar sesión.

### Componentes Principales
Consultas y Login

consultar y metodo son instancias de las clases consultas y login, respectivamente.
El constructor de menuDocente inicializa estos objetos y llama al método saludo de consultas para mostrar un saludo personalizado en la GUI.
Menú Popup

jPopupMenu1 es un menú emergente que contiene dos elementos (cambiarContra y cerrarSesion) que permiten al usuario cambiar su contraseña o cerrar sesión.
Panel Principal

jPanel1 es el panel principal que contiene:
Un icono de perfil (perfil).
Un logo de la aplicación (jLabel1).
Un título del menú (jLabel2).
Una etiqueta de saludo (lblsaludo).
Paneles de Gestión

actividadesAdministro y historialActividades son paneles que permiten a los docentes ver las actividades que imparten y generar estadísticas, respectivamente.
### Eventos y Listeners
Acciones del Menú Popup

cambiarContraActionPerformed: Abre la ventana para cambiar la contraseña y cierra la ventana actual.
cerrarSesionActionPerformed: Cierra la sesión actual y vuelve a la pantalla de inicio de sesión.
Acciones de Gestión

actividadesAdministroMouseClicked: Abre la ventana de actividades administradas por el docente.
historialActividadesMouseClicked: Abre la ventana de estadísticas del docente.
Acción del Perfil

perfilMouseEntered: Muestra el menú popup cuando el ratón pasa sobre el icono del perfil.

### Uso de Métodos y Componentes
Componentes de Swing

Utiliza varios componentes de Swing (JPanel, JLabel, JMenuItem, etc.) para construir la interfaz gráfica.
Métodos de Acción

Métodos como cambiarContraActionPerformed, cerrarSesionActionPerformed, actividadesAdministroMouseClicked, etc., manejan las interacciones del usuario

## Instalación
Para utilizar este componente en tu proyecto, sigue estos pasos:

1. Obtener el repositorio
   Clona con el siguiente comando

   ```bash
      git clone https://github.com/Marquitos1234567/ITO_TAP_U2_COMPONENTE_PASSWORD-FIELD_TEXT-FIELD
   ```

   Otra opción es descargar `ZIP`.
   ![Descargar ZIP](Anexos/imagen1.png)
   
3. Importa el proyecto en tu IDE preferido (NetBeans o VS code).

4. Asegúrate de que el proyecto se compila sin errores para crear el `.jar` según la versión de tu Java.

## Uso
1. Compila tu proyecto para crear el archivo `.jar`

   ![Compilar proyecto](Anexos/imagen2.PNG)
   Posteriormente presiona `SHIFT + F11`

2. Agrega el componente a tu paleta de componentes.
   Da click derecho en la clase con el codigo para el componente, luego en *Tools* y *add to palette*

   ![Agregar desde JAR 1](Anexos/imagen3.png)
   seleccionamos la categoria en la que queremos que este
   ![Agregar desde JAR 2](Anexos/imagen4.png)
   

4. Ya está listo para usar y arrastrar a tus componentes
   ![Agregar desde JAR 3](Anexos/imagen5.png)

## Funcionamiento
Ingresamos los datos del alumno que serán su número de control y contraseña.
![imagen6](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/83621850-3fa2-43fa-a276-306d5c307736)
Desde el menú podemos ver los distintas opciones del usuario.

![imagen7](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/d42d9373-e5c7-4b9a-8cce-74d139c42330)
La actividad actual, donde podemos descargar nuestro horario en formato PDF.
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/4d647ec2-caad-4fc4-8e66-d528cfa52a99)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/73018eca-3610-4299-91af-8a3c5070571b)
El cuál se almacena en nuestra carpeta de decargas.
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/141911f8-6f84-4779-9518-e22a5a635c1d)
En el caso de no pertenecer a alguna actividad nos mostrará el siguiente mensaje:
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/adb7de63-a66d-4aa8-9074-d2ee0e165377)
En el apartado de unirse a actvidad el usuario puede selecionar la actividad que desee.
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/594983e1-39b2-4be0-94c2-4e05e4a8fd4b)
Al presionar el botón incribirse nos unimos en la actividad y el horario será enviado a su correo. 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/d9feba39-e4b1-4077-ac43-8cc7e72c0af8)
Aquí algunos ejemplos:
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/71f8c5b1-a4fb-4193-823c-00756e0a69e8)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/7bd44fe7-6b7a-4649-bdd6-1b74ebd3df64)
Al pasar el mouse por el logo del usuario podemos cambiar la contraseña y cerrar sesión: 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/0e674fa6-38af-4b88-9a8f-f719200dd66e)
Tendremos que ingresar nuestra contraseña anterior y la nueva.
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/a4258ca6-e7ad-4f53-ad0b-a9677e158168)
Cerramos sesión y comprobamos.
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/f7b93cb7-3d57-4c16-a502-b1150eee1948)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/317ab55a-f9b5-4304-aa93-28de94b7dbbd)

Antes de poder iniciar sesión se debe de estar registrado, proceso que solo puede hacer por si solo el alumno, en caso del docente un administrador debe de
registrarlo y el propio administrador ya debe de registrarse con anticipación directamente en la base de datos. En la siguiente pantalla tenemos los campos de
texto que se tiene que rellenar con nuestros datos reales para poder hacer el registro
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/96305aa1-b915-4763-9ef9-7868fd148d77)

Para asegurarnos de que los datos más importantes, como lo son el número de control y la contraseña, sean validos se muestran avisos en caso de haber ingresado mal algún valor como los siguientes: 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/bed8dc17-d806-40e3-b89d-dff806b18e37)
  
Si sale alguno de estos avisos u otro deberemos de revisar que los datos ingresados sean correctos y corregir en donde haga falta. Si ese no es el caso nuestro registro se completará sin problemas y se nos notificará que hemos sido registrados correctamente y ahora podremos iniciar sesión. 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/03fa48be-27bb-43c0-895e-1de21723d462)
  
Para regresar al login solo debemos de dar clic al botón de cancelar 

La tercera opción del menú es ver las constancias de las actividades que se han cursado y aprobado, en caso de no tener constancias nos dará el aviso 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/6be695d3-d9eb-490e-b214-df5f213e24f3)
  
En caso de si tener actividades cursadas y aprobadas se mostraran en una tabla como la que se ve a continuación  
 ![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/71fa9769-1438-40f0-b1b2-2164911ca596)
 
En está tabla podremos seleccionar la actividad de la que queramos descargar nuestra constancia: 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/ae087da9-6c7b-40bd-b51c-fc5ca4535232) 

Una vez que el sistema la descargó nos da el aviso que se descargó correctamente 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/727b6144-f639-49f6-833c-7a87b5a2351d)

Y la constancia se guardará en formato PDF en las descargas de nuestro equipo
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/a764364e-1345-4231-a0fb-e7da2842c505)

Una vez que ya tenemos nuestros datos de registro proporcionados por el administrador podremos iniciar sesión como docente en la pantalla de login como se muestra a continuación, recordado que debemos de seleccionar el tipo de usuario docente 
 ![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/49df7860-39b9-4138-9635-af1a8508e15b)
 
Los datos que serán necesarios para nuestro inicio de sesión deberán de ser una clave de trabajo y una contraseña segura, que como ya se menciono debe de proporcionar el administrador dado que el propio docente no puede registrarse a si mismo.  
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/de93a1c1-a79d-4d90-9f63-e56720100351)

Si los datos ingresados son correctos nos avisará y si no son correctos también nos dará el aviso para que corrijamos e iniciemos sesión correctamente 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/884b058d-2874-4341-b0e6-1965b9c06113)
   
Menú 
Una vez que iniciamos sesión se nos mostrará el menú del docente, el cual podrá: ver las actividades que imparte y generar estadísticas 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/b46fa573-f38d-471b-a8c0-1b933830b57c)

Al seleccionar la primera opción, ver actividades que imparto, mostrará una tabla con los datos de las actividades que el docente imparte ![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/c8c47032-219e-4e7f-811c-f21a16821917)

Para seleccionar alguna de las acciones de los botones de la parte inferior debemos de seleccionar el grupo con el cursor de lo contrario nos dará el siguiente aviso 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/5fa4c07b-f54f-4414-bac1-c8e2c5ec780e)
 
Descargar lista de asistencia 
Si seleccionamos el grupo podremos descargar la lista de asistencia del mismo 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/e9cd2e9d-443d-400c-b436-a5906554c285)

Nos dará el aviso de que se descargó correctamente 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/af05fbf8-72a2-4fbc-bf53-c7a2562687c9)
  
Y la lista se guardará en formato pdf en las descargas de nuestro equipo 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/b974b365-5dcd-41c4-8205-f6a0db15035f)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/da798508-905a-4bba-9e2a-53c6ad862199)

Evaluar alumnos 
Al seleccionar el grupo también se podrán evaluar los alumnos de inscritos en la actividad durante el periodo escolar cursando  
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/49ee9f87-7335-4b84-b8ec-9a218222187c)
Para evaluar a los alumnos uno por uno será necesario seleccionarlo haciendo clic sobre el mismo y en la columna de estatus de la tabla se desplegarán dos opciones de estatus, aprobado y no aprobado 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/25768bda-1f55-418f-880c-1aacbbe20a72)

Una vez que todos los alumnos han sido evaluados podremos guardar los cambios con el botón azul de la esquina inferior derecha 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/d706b58e-8ec3-4266-ac4a-4b636d8d102c)

Antes de guardarse los cambios nos saldrá un aviso donde nos pregunta si estamos seguros de guardar los cambios pues la acción es irreversible 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/a234a61b-15ac-4071-96e4-aa6e5b4e0023)

Si aun no estamos seguros damos clic en no y podremos seguir evaluando a los alumnos o corregir la evaluación, si ya estamos seguros damos clic en si y nos avisará que se guardaron los cambios exitosamente
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/754d5077-11e3-4999-a39d-e584a40ea552)

Generar estadísticas  
Al regresar al menú tenemos la opción de generar estadísticas, al hacer clic en esta opción tendremos que seleccionar el departamento de cual necesitamos sus estadísticas 
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/512642cb-97b5-470f-a027-075569013eb8)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/4c1d3c56-01ce-4745-80a3-1f551e52fc16)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/71eefb1c-d76e-4c18-a6ad-5b33f775e88f)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/40b09c71-f626-4fce-b6ba-d389b5964f6a)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/8ef3248c-53dc-471f-b807-aaada7f3d31f)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/6673af1b-a194-4c27-8f9a-5e55fad3b210)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/5b4cf84e-1b69-452d-aa3e-b6d786997cd4)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/0e536946-90fe-4c3d-9e1c-79d0ed647b0d)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/0f66d106-0c0f-4066-9f49-9c075afdebe4)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/d6746214-0cb6-4330-b560-536ae62347a0)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/09c57139-598f-4759-94c8-f089a2a09ee7)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/b90a943f-4497-47ce-aad8-870dc870e1b1)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/f3898c47-61d8-42ad-ae6b-10b6493c686b)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/31ba19b3-ce3b-4683-a1a0-dee118be87d9)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/b8e82ef9-a5b0-42ef-bc3c-65fd75d32f7a)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/5ea617af-b47b-4df2-8080-6b6639bf7650)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/2da80d92-776c-486e-915a-1be867297e9e)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/ccda1c3e-1576-47fe-b68b-804dc8934bea)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/b1b36de9-9060-4a26-a009-b68cf50a6629)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/7dca9f0e-ba72-4b30-9d9b-4f9d38abaa4b)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/98d7549d-28e6-4094-a36d-65e5685f1eb6)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/c130c25b-21cd-4b7a-9bd3-27cbebe9d411)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/ab0ef122-3bd6-41b2-9e5e-8c5356f6fb7c)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/13b083ec-63b2-4e05-9f2b-9ed0aaa0ada7)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/b0ad0da7-98d0-464f-9210-c34407f265a6)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/0399f552-b6b6-46a6-81dc-cbbf54b99422)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/5ac953bc-6f04-4a9f-a385-e0ef883ed1cc)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/d40284e1-6c35-4b9b-b21a-33e1a10cbe81)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/5218de9d-f545-4fb0-bf61-fc06dc808f54)
![image](https://github.com/Marquitos1234567/ProyectoFinalTAP/assets/168498871/2bb043e3-e437-41d0-a082-b2e6b5c2035c)
## Autores
+ Cuevas Estevez Marcos Gabriel - Estudiante del ITO 
+ Ruiz Garcia Itzi Mariana - Estudiante del ITO  
