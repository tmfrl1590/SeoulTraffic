package com.seoul.traffic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform