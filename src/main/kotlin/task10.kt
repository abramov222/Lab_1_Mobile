package org.example

open class Vehicle {
    open var name: String = "Транспортное средство"
    open var speed: Int = 0

    open fun start() {
        println(name + " начал движение со скоростью " + speed + " км/ч")
    }

    open fun stop() {
        println(name + " остановился")
    }
}

class Boat : Vehicle() {
    override var name: String = "Лодка"
    override var speed: Int = 30

    override fun start() {
        println(name + " отплыла со скоростью " + speed + " км/ч")
    }

    override fun stop() {
        println(name + " пришвартовалась")
    }
}

class Plane : Vehicle() {
    override var name: String = "Самолет"
    override var speed: Int = 850

    override fun start() {
        println(name + " взлетел со скоростью " + speed + " км/ч")
    }

    override fun stop() {
        println(name + " приземлился")
    }
}

class Tank : Vehicle() {
    override var name: String = "Танк"
    override var speed: Int = 60

    override fun start() {
        println(name + " поехал со скоростью " + speed + " км/ч")
    }

    override fun stop() {
        println(name + " заглушил двигатель")
    }
}

fun main() {
    val boat = Boat()
    val plane = Plane()
    val tank = Tank()

    boat.start()
    boat.stop()

    plane.start()
    plane.stop()

    tank.start()
    tank.stop()
}