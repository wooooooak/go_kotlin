package kotlinInAction.ch2

import java.awt.Rectangle
import java.util.Random

class Rectangle2_8(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle() : Rectangle2_8 {
    val random = Random()
    return Rectangle2_8(random.nextInt(), random.nextInt())
}