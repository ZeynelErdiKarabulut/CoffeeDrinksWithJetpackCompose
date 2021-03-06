package com.zerdi.coffeedrinks.ui.screen.order.mapper

import androidx.compose.runtime.mutableStateOf
import com.zerdi.coffeedrinks.data.CoffeeDrink
import com.zerdi.coffeedrinks.ui.screen.order.model.OrderCoffeeDrink

class OrderCoffeeDrinkMapper {

    fun map(coffeeDrink: CoffeeDrink): OrderCoffeeDrink {
        return OrderCoffeeDrink(
            id = coffeeDrink.id,
            name = coffeeDrink.name,
            imageRes = coffeeDrink.imageUrl,
            description = coffeeDrink.orderDescription,
            price = coffeeDrink.price,
            count = mutableStateOf(0)
        )
    }
}
