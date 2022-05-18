package com.zerdi.coffeedrinks.ui.screen.coffeedetails.mapper

import com.zerdi.coffeedrinks.data.CoffeeDrink
import com.zerdi.coffeedrinks.ui.screen.coffeedetails.model.CoffeeDrinkDetail

class CoffeeDrinkDetailMapper {

    fun map(coffeeDrink: CoffeeDrink?): CoffeeDrinkDetail? {
        if (coffeeDrink == null) {
            return null
        }

        return CoffeeDrinkDetail(
            id = coffeeDrink.id,
            name = coffeeDrink.name,
            imageUrl = coffeeDrink.imageUrl,
            ingredients = coffeeDrink.ingredients,
            description = coffeeDrink.description,
            isFavourite = coffeeDrink.isFavourite
        )
    }
}
