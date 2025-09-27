package es.unizar.webeng.lab2

import org.springframework.stereotype.Service
import java.time.LocalDateTime

// DTO
data class TimeDTO(
    val time: LocalDateTime,
)

// Interfaz
interface TimeProvider {
    fun now(): LocalDateTime
}

// Servicio
@Service
class TimeService : TimeProvider {
    override fun now(): LocalDateTime = LocalDateTime.now()
}

// Función de extensión
fun LocalDateTime.toDTO(): TimeDTO = TimeDTO(time = this)
