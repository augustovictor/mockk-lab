package augustovictor.mockklab.mockklab

import augustovictor.mockklab.mockklab.Direction.*

enum class Direction {
    FRONT, RIGHT, REAR, LEFT
}

class Engine(val maxPower: Int)

class Car(val engine: Engine) {
    var x: Int = 0
    var y: Int = 0
    var pointedTo: Direction = FRONT

    fun horn() {
        println("PAAAAAAM")
    }

    fun drive(dir: Direction): Boolean {
        when (dir) {
            FRONT -> {
                y++
                pointedTo = FRONT
            }
            RIGHT -> {
                x++
                pointedTo = RIGHT
            }
            REAR -> {
                y--
                pointedTo = REAR
            }
            LEFT -> {
                x--
                pointedTo = LEFT
            }
        }
        return true
    }
}