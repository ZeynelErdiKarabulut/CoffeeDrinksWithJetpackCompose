package com.zerdi.coffeedrinks.ui.screen.order.model

import com.zerdi.coffeedrinks.data.order.OrderCoffeeDrink
import java.math.BigDecimal

data class OrderCoffeeDrinkState(
    val coffeeDrinks: List<OrderCoffeeDrink>,
    val totalPrice: BigDecimal
)
