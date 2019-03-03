package augustovictor.mockklab.mockklab

import io.mockk.*
import org.junit.Assert.assertEquals
import org.junit.Test

class StackKata {

    @Test
    fun `should start with size 0`() {
        val stack = Stack()
        assertEquals(0, stack.size)
    }

    @Test
    fun `should push item and increase size`() {
        val stack = Stack()
        stack.push(1)
        assertEquals(1, stack.size)
    }

    @Test
    fun `should have 1 as top when 1 is pushed`() {
        val stack = mockk<Stack>()
        val slot = slot<Int>()
        every { stack.push(capture(slot)) } just Runs

        stack.push(22)
        verify(exactly = 1) { stack.push(slot.captured) }
        assertEquals(22, slot.captured)
    }
}