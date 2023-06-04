package com.jonathanmarquez.runcalculator

class Run (distance: Float, time: Float) {
    var distance: Float = distance
    var time: Float = time

    fun calculateVelocity(): Float {
        return (distance / time).toFloat()
    }
}