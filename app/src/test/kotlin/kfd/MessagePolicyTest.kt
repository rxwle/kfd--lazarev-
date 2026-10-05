package kfd

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class MessagePolicyTest {
    @Test
    fun acceptsShortMessage() {
        assertTrue(canSendMessage("Привет"))
    }

    @Test
    fun nullMessage() {
        assertFalse(canSendMessage(null))
    }

    @Test
    fun emptyMessage() {
        assertFalse(canSendMessage(" "))
    }

    @Test
    fun limitOverflowMessage() {
        assertTrue(canSendMessage(text = "safaf", maxLength = 5))
    }
}