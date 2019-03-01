package augustovictor.mockklab.mockklab

import augustovictor.mockklab.mockklab.Direction.FRONT
import io.mockk.confirmVerified
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class CarTest {

    @Test
    fun drive() {
        val car = mockk<Car>()
        every { car.drive(any()) } returns false

        car.drive(FRONT)

        verify { car.drive(FRONT) }
        confirmVerified(car)
    }
}