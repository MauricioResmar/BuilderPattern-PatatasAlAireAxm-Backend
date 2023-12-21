
**CÓDIGO FUENTE BACKEND DOMINIO: PatatasAlaireAxm.com**

**Patrón de diseño: Builder**

El siguiente es el código fuente del lado servidor o Backend diseñado para la creación de objetos
dinámicos referentes a una tienda de comidas rápidas. Para ello esta App implementa un patrón de diseño
creacional llamado Builder, el cual a través de un constructor abstracto nos permite definir y elegir
según sea la necesidad un constructor o varios constructores concretos a la hora de generar nuestro objeto.

**Descripción del Patrón Builder:**

El patrón de diseño Builder es una solución creacional que se utiliza para construir objetos complejos
paso a paso. Proporciona una forma de construir un objeto con una estructura compleja sin exponer los
detalles internos de su construcción. En lugar de tener un constructor con numerosos parámetros, el
patrón Builder utiliza una interfaz abstracta (Builder) con métodos para configurar cada parte del
objeto y una clase concreta (Concrete Builder) para implementar esos métodos y construir el objeto.

**Características Principales.**

    **Construcción Paso a Paso:** Permite la construcción de un objeto complejo paso a paso, delegando la 
    responsabilidad de cada paso a un conjunto de métodos en el Builder.

    **Interfaz Abstracta (Builder):** Define los métodos necesarios para construir cada parte del objeto.
    Puede incluir métodos como construirParteA, construirParteB, y un método final build para obtener
    el objeto completo.

    **Builder Concreto:** Implementa la interfaz Builder y proporciona la lógica específica para construir
    el objeto. Puede haber múltiples Builder concretos que construyen objetos con variaciones específicas.

    **Director:** Coordina el proceso de construcción utilizando un objeto Builder. Se encarga de llamar a los
    métodos del Builder en el orden correcto para obtener el objeto final.

    --Posteriormente, agregaré aquí otros detalles, así como el respectivo diagrama de Clases UML con el esquema  del proyecto...