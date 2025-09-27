# Lab 2 Web Server -- Project Report

## Description of Changes
Se creó el archivo error.html en src/main/resources/templates para reemplazar la Whitelabel Error Page por defecto de Spring Boot.
Se añadieron tests que validan el correcto funcionamiento tanto del endpoint de tiempo como de la página de error.Se generó un certificado autofirmado y un keystore PKCS12 (localhost.p12).
Se configuró application.yml para habilitar SSL y HTTP/2 en el puerto 8443.
Se verificó con curl que el servidor acepta conexiones HTTPS y negocia HTTP/2.
## Technical Decisions

Para la página de error decidí incluir un enlace a la página anterior. Tomé esta decisión porque considero que, en una aplicación web grande, lo más probable es que el usuario haya llegado a ese punto desde otra página previa.
## Learning Outcomes

Comprendí cómo Spring Boot maneja las páginas de error por defecto y cómo reemplazarlas con plantillas personalizadas.
Aprendí a crear y exponer un endpoint REST en Kotlin con Spring Boot.
Practiqué la generación de certificados y la configuración de SSL en una aplicación web.
Experimenté con HTTP/2 y cómo verificar su funcionamiento en un entorno local.
Mejoré mis habilidades de prueba usando curl y tests automatizados para asegurar el correcto comportamiento de la aplicación.
## AI Disclosure
### AI Tools Used

ChatGPT
### AI-Assisted Work

Utilicé la IA principalmente para la generación del certificado y la redacción de este archivo REPORT.md.
También la usé para preguntar cómo ejecutar ciertos comandos y para resolver errores puntuales.
### Original Work
La implementación final del endpoint /time, el archivo error.html, las pruebas automáticas y la integración de SSL fueron realizadas de manera manual.
Para este archivo utilicé la IA para la generación de las 4 líneas de css.
La comprensión del funcionamiento de Spring Boot, Kotlin y SSL se adquirió a través de la práctica, revisando documentación oficial y ejecutando pruebas locales.

El informe REPORT.md fue editado y completado con reflexiones personales y detalles reales del trabajo.