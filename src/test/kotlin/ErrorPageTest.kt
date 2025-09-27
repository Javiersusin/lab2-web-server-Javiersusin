import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ErrorPageTest {
    @Test // Miramos que existe la plantilla de error
    fun `existe la plantilla de error`() {
        val url = javaClass.getResource("/templates/error.html")
        assertNotNull(url, "No se encontró `src/main/resources/templates/error.html`")
    }

    @Test // Aquí comprobamos que la plantilla contiene un enlace a la pantalla principal, home
    fun `la plantilla contiene enlace a la home`() {
        val url = javaClass.getResource("/templates/error.html")
        assertNotNull(url, "No se encontró `src/main/resources/templates/error.html`")
        // Añadimos a lo anterior
        val html = url!!.readText()
        assertTrue(html.contains("href=\"/\""), "La plantilla debe incluir un enlace a la pantalla principal, home")
    }
}
