package augustovictor.mockklab.mockklab

import augustovictor.mockklab.mockklab.Direction.*
import io.mockk.*
import org.junit.Test

class CarTest {
    @Test
    fun drive() {
        val car = mockk<Car>()
        every { car.drive(FRONT) } returns false

        car.drive(FRONT)

        verify { car.drive(FRONT) }
        confirmVerified(car)
    }

    @Test
    fun driveSpy() {
        // Mix mock with real object
        val car = spyk(Car(mockk()))
        car.drive(FRONT)
        verify { car.drive(FRONT) }
        confirmVerified(car)
    }

    @Test fun relaxedMock() {
        val car = mockk<Car>(relaxed = true)
        car
    }

    @Test
    fun horn() {
        val car = mockk<Car>(relaxUnitFun = true)
        car.horn()
    }

    @Test
    fun mockClass() {
        val car = mockkClass(Car::class)
        car
    }
}