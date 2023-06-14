package com.jonathanmarquez.runcalculator

class Run (val distanceKilometers: Float,val timeMinutes: Float){

    var velocityMetersSeconds = conversionMetersSeconds()
    fun conversionMetersSeconds(): Float {
        var distanceMeters: Float = distanceKilometers * 1000
        var timeSeconds: Float = timeMinutes * 60

        return distanceMeters / timeSeconds
    }
    fun conversionKilometersHour(): Double {
        //3.6 es el factor de conversión de m/s a km/h
        return conversionMetersSeconds() * 3.6
    }

    //fun calculateVelocity(){}

    //fun printRun(){}
}