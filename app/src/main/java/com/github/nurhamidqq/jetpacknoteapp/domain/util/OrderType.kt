package com.github.nurhamidqq.jetpacknoteapp.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
