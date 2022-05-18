package com.zerdi.coffeedrinks.di

import com.zerdi.coffeedrinks.data.CoffeeDrinkDataSource
import com.zerdi.coffeedrinks.data.CoffeeDrinkRepository
import com.zerdi.coffeedrinks.data.DummyCoffeeDrinksDataSource
import com.zerdi.coffeedrinks.data.RuntimeCoffeeDrinkRepository
import com.zerdi.coffeedrinks.data.order.OrderCoffeeDrinksRepository
import com.zerdi.coffeedrinks.data.order.RuntimeOrderCoffeeDrinksRepository
import com.zerdi.coffeedrinks.ui.screen.coffeedetails.CoffeeDrinkDetailsViewModel
import com.zerdi.coffeedrinks.ui.screen.coffeedetails.mapper.CoffeeDrinkDetailMapper
import com.zerdi.coffeedrinks.ui.screen.coffeedrinks.CoffeeDrinksViewModel
import com.zerdi.coffeedrinks.ui.screen.coffeedrinks.mapper.CoffeeDrinkItemMapper
import com.zerdi.coffeedrinks.ui.screen.order.OrderCoffeeDrinkViewModel
import com.zerdi.coffeedrinks.ui.screen.order.mapper.OrderCoffeeDrinkMapper
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dataModule = module {
    factory<CoffeeDrinkDataSource> { DummyCoffeeDrinksDataSource() }
    single<CoffeeDrinkRepository> { RuntimeCoffeeDrinkRepository }
    single<OrderCoffeeDrinksRepository> {
        RuntimeOrderCoffeeDrinksRepository(
            coffeeDrinkDataSource = get(),
            orderCoffeeDrinkMapper = get()
        )
    }
}

val mapperModule = module {
    factory { CoffeeDrinkItemMapper() }
    factory { CoffeeDrinkDetailMapper() }
    factory { OrderCoffeeDrinkMapper() }

    factory { com.zerdi.coffeedrinks.data.order.OrderCoffeeDrinkMapper() }
}

val viewModelModule = module {
    viewModel {
        OrderCoffeeDrinkViewModel(
            repository = get()
        )
    }
    viewModel {
        CoffeeDrinksViewModel(
            repository = get(),
            mapper = get()
        )
    }
    viewModel {
        CoffeeDrinkDetailsViewModel(
            repository = get(),
            mapper = get()
        )
    }
}
