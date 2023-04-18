package com.restfql.ktor.example

import com.restfql.ktor.RestFQL
import io.ktor.server.application.*
import io.ktor.server.netty.*
import com.restfql.ktor.example.plugins.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
    install(RestFQL)
}