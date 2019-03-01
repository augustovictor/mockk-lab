package augustovictor.mockklab.mockklab

import augustovictor.mockklab.mockklab.Direction.*

enum class Direction {
    FRONT, RIGHT, REAR, LEFT
}

class Car {
    var x: Int = 0
    var y: Int = 0

    fun drive(dir: Direction): Boolean {
        when (dir) {
            FRONT -> y++
            RIGHT -> x++
            REAR -> y--
            LEFT -> x--
        }
        return true
    }
}