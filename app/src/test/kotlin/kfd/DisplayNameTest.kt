package kfd

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DisplayNameTest {
    @Test
    fun preservesName() {
        assertEquals("Анна", displayName("Анна"))
    }

    @Test
    fun handlesNull() {
        assertEquals("Гость", displayName(null))
    }

    @Test
    fun spacesStartEnd() {
        assertEquals("Анна", displayName(" Анна "))
    }

    @Test
    fun emptyString() {
        assertEquals("Гость", displayName(""))
    }

    @Test
    fun spaceString() {
        assertEquals("Гость", displayName(" "))
    }
}
