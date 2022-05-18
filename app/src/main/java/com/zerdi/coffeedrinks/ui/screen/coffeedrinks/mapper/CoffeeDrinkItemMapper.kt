package com.zerdi.coffeedrinks.ui.screen.coffeedrinks.mapper

import com.zerdi.coffeedrinks.data.CoffeeDrink
import com.zerdi.coffeedrinks.ui.screen.coffeedrinks.model.CoffeeDrinkItem

class CoffeeDrinkItemMapper {

    fun map(coffeeDrink: CoffeeDrink): CoffeeDrinkItem {
        return CoffeeDrinkItem(
            id = coffeeDrink.id,
            name = coffeeDrink.name,
            imageUrl = coffeeDrink.imageUrl,
            ingredients = coffeeDrink.ingredients,
            description = coffeeDrink.description,
            isFavourite = coffeeDrink.isFavourite
        )
    }
}
