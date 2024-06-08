# Componente para ocultar contraseñas en Java

## Descripción
El código proporcionado define una clase PasswordField que extiende la clase JPasswordField de Java Swing. Esta clase personalizada proporciona características adicionales de estilo y animación para campos de contraseña en aplicaciones de interfaz de usuario. La clase TextField define un componente de campo de texto personalizado que extiende la clase JTextField de Java Swing. Este componente proporciona funcionalidades adicionales de estilo y animación para campos de texto en aplicaciones de interfaz de usuario.

## Usos
Componente de texto:
1. Formularios de registro: Se utilizan para recopilar información como nombre, dirección de correo electrónico, número de teléfono, etc.
2. Búsquedas: Permiten a los usuarios ingresar consultas de búsqueda para encontrar contenido dentro de una aplicación o sitio web.
3. Comentarios: En aplicaciones y sitios web que permiten a los usuarios dejar comentarios, se utilizan componentes de texto para que ingresen sus comentarios.
4. Mensajería: En aplicaciones de mensajería, los usuarios pueden ingresar mensajes de texto para enviar a otros usuarios.
5. Edición de perfil: Permiten a los usuarios actualizar su información personal, como su biografía, foto de perfil, etc.

Componente de contraseña:
1. Inicio de sesión: Se utiliza para que los usuarios ingresen contraseñas para acceder a sus cuentas protegidas por contraseña.
2. Registro: Al registrarse en un servicio, los usuarios a menudo deben crear una contraseña para proteger su cuenta.
3. Cambiar contraseña: Permite a los usuarios cambiar su contraseña actual por una nueva.
4. Confirmación de identidad: En algunos casos, como al realizar transacciones financieras, se solicita a los usuarios que ingresen su contraseña como medida de seguridad adicional.


## Características
1. Etiqueta de texto: Permite establecer una etiqueta de texto que se muestra encima del campo de contraseña.
2. Color de línea: Permite personalizar el color de la línea que aparece debajo del campo de contraseña.
3. Animación de texto de sugerencia: Realiza una animación suave del texto de sugerencia cuando el campo de contraseña gana o pierde foco.
4. Animación de línea: Realiza una animación suave de la línea que aparece debajo del campo de texto cuando este gana o pierde foco, proporcionando una experiencia visual agradable y una indicación clara del estado del campo.
5. Interacción de mouse: Cambia el color de la línea debajo del campo de texto cuando el mouse entra o sale del área del campo, lo que ayuda a resaltar la interactividad del campo y proporciona retroalimentación visual al usuario.

## Requisitos password-field
+ Java Runtime Environment (JRE) instalado en el sistema.
+ Bibliotecas externas como org.jdesktop.animation.timing.Animator y org.jdesktop.animation.timing.TimingTarget que deben estar disponibles en el classpath durante la compilación y ejecución.

## Requisitos text-field
1. Java Runtime Environment (JRE): Se requiere tener instalado Java Runtime Environment en el sistema para ejecutar aplicaciones Java que utilicen este componente de campo de texto personalizado.
2. Bibliotecas externas: El código hace uso de bibliotecas externas como org.jdesktop.animation.timing.Animator y org.jdesktop.animation.timing.TimingTarget para realizar animaciones. Estas bibliotecas deben estar disponibles en el classpath durante la compilación y ejecución del código.
3. Entorno de desarrollo: Se necesita un entorno de desarrollo Java, como Eclipse, NetBeans o IntelliJ IDEA, para compilar y trabajar con el código fuente de este componente de campo de texto personalizado.
4. Sistema operativo compatible: Este componente de campo de texto personalizado debería ser compatible con cualquier sistema operativo que admita la ejecución de aplicaciones Java, como Windows, macOS y Linux.

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
| `getText()` | 'String' | Ninguno | Devuelve el texto actualmente ingresado en el campo de contraseña. |
| `setText(String text)` | Ninguno | `text`: El texto que se establecerá. | Devuelve el texto actualmente ingresado en el campo de contraseña. |

---

### TextField

#### Descripción
`TextField` es un componente personalizado de Java Swing diseñado para manejar campos de texto en interfaces de usuario. Este componente extiende la funcionalidad básica proporcionada por JTextField al agregar características adicionales de estilo y animación.


#### Constructores
| Constructor | Descripción |
|-------------|-------------|
| `TextField()` | Constructor por defecto que inicializa un campo de texto con configuraciones predeterminadas. |

#### Métodos
| Nombre                    | Tipo de Dato que Retorna | Tipo de dato que recibe                    | Descripción                                                                                                |
| ------------------------- | ------------------------ | ------------------------------------------ | ---------------------------------------------------------------------------------------------------------- |
| `setLabelText(String labelText)`    | Ninguno                  | `labelText` | Establece la etiqueta de texto que se mostrará encima del campo de texto.                              |
| `setLineColor(Color lineColor)`                   | Ninguno                 |  `lineColor`                           | Establece el color de la línea que aparece debajo del campo de texto.              |
| `setText` | Ninguno                | `text`           | Establece el texto del campo de texto y realiza animaciones según sea necesario. |

## Instalación
Para utilizar este componente en tu proyecto, sigue estos pasos:

1. Obtener el repositorio
   Clona con el siguiente comando

   ```bash
      git clone https://github.com/Marquitos1234567/ITO_TAP_U2_COMPONENTE_PASSWORD-FIELD_TEXT-FIELD
