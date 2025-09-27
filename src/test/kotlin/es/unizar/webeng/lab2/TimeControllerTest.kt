package es.unizar.webeng.lab2

import org.junit.jupiter.api.Test
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import java.time.LocalDateTime

@WebMvcTest(TimeController::class)
class TimeControllerTest {
    @Autowired
    private lateinit var mvc: MockMvc

    @MockBean
    private lateinit var service: TimeProvider

    @Test
    fun getTimeReturnsJson() {
        val fixed = LocalDateTime.of(2025, 6, 1, 12, 0)
        whenever(service.now()).thenReturn(fixed)

        mvc.get("/time").andExpect {
            status { isOk() }
            jsonPath("$.time") { value("2025-06-01T12:00:00") }
        }
    }
}
