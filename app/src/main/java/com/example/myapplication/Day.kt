package com.example.myapplication

import java.util.concurrent.locks.Condition

data class Day(
    val city: String,
    val time: String,
    val condition: String,
    val image:String,
    val tempMax: String,
    val tempMin: String,
    val tempCurrent: String,
    val hours:String
)
