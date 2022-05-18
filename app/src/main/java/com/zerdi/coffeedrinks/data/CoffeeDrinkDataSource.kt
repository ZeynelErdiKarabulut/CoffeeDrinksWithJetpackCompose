package com.zerdi.coffeedrinks.data

interface CoffeeDrinkDataSource {

    fun getCoffeeDrinks(): List<CoffeeDrink>
}
