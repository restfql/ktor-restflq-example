package com.restfql.ktor.example.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import kotlinx.serialization.Serializable

@Serializable
data class Tags(val mandatory: List<String>, val optional: List<String>)
@Serializable
data class MyResponse(val message: String, val description: String, val tags: Tags)
fun Application.configureRouting() {
    routing {
        get("/") {
            call.respond(HttpStatusCode.OK, MyResponse("awesome", "awesome description", Tags(listOf("mandatory_1","mandatory_2"), listOf())))
        }
    }
}