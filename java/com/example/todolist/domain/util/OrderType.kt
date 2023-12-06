package com.example.todo.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
