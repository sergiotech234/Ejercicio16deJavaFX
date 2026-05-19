# Validación de Campos en un Formulario Java

## Descripción

Este proyecto consiste en desarrollar una aplicación en **Java** con una interfaz gráfica que contiene un **formulario con campos de texto y un botón de validación**. Al pulsar el botón, la aplicación comprueba que todos los campos estén completos. Si alguno está vacío, se muestra un mensaje de error al usuario.

El objetivo del ejercicio es practicar la validación de formularios y el manejo de eventos utilizando **Swing**.

## Objetivos

- Crear una interfaz gráfica con campos de texto.
- Implementar un botón con gestión de eventos.
- Validar que todos los campos contengan información.
- Mostrar mensajes de error cuando existan campos vacíos.
- Mejorar la interacción usuario–aplicación.

## Funcionamiento

1. Se inicia la aplicación.
2. Se muestra un formulario con varios campos de texto.
3. El usuario introduce la información solicitada.
4. Al pulsar el botón de validación:
   - Se revisa cada campo.
   - Si algún campo está vacío, aparece un mensaje de error.
   - Si todos están completos, la validación finaliza correctamente.
## Ejemplo de uso

Formulario:

```text
Nombre:   [____________]

Correo:   [____________]

Edad:     [____________]

        [ Validar ]
```

Si falta algún dato:

```text
Error: Debe completar todos los campos.
```

Si todos los campos están completos:

```text
Formulario validado correctamente.
```
