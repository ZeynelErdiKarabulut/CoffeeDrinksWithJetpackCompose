package com.zerdi.coffeedrinks.generator

import com.zerdi.coffeedrinks.data.order.OrderCoffeeDrink
import com.zerdi.coffeedrinks.generator.RandomData.randomDouble
import com.zerdi.coffeedrinks.generator.RandomData.randomInt
import com.zerdi.coffeedrinks.generator.RandomData.randomLong
import com.zerdi.coffeedrinks.generator.RandomData.randomString

object GenerateOrderCoffeeDrink {

    fun generateOrderCoffeeDrink(
        id: Long = randomLong(),
        name: String = randomString(),
        imageUrl: Int = randomInt(),
        ingredients: String = randomString(),
        price: Double = randomDouble(),
        count: Int = randomInt(99)
    ) = OrderCoffeeDrink(
        id = id,
        name = name,
        imageUrl = imageUrl,
        ingredients = ingredients,
        price = price,
        count = count
    )

    fun generateOrderCoffeeDrinks(
        count: Int = 10
    ): List<OrderCoffeeDrink> {
        val orderCoffeeDrinks = mutableListOf<OrderCoffeeDrink>()
        repeat(count) {
            orderCoffeeDrinks.add(generateOrderCoffeeDrink())
        }
        return orderCoffeeDrinks
    }
}
