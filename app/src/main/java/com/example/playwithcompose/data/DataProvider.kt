package com.example.playwithcompose.data

import androidx.compose.runtime.Immutable

object DataProvider {
    fun getCategoryCollection() = categoryCollections
}

@Immutable
data class CategoryCollection(
    val id: Long,
    val name: String,
    val categories: List<Category>
)

@Immutable
data class Category(
    val name: String,
    val imageUrl: String
)

private val categoryCollections = listOf(
    CategoryCollection(
        id = 0L,
        name = "Categories",
        categories = listOf(
            Category(
                name = "Chips & crackers",
                imageUrl = "https://source.unsplash.com/UsSdMZ78Q3E"
            ),
            Category(
                name = "Fruit snacks",
                imageUrl = "https://source.unsplash.com/SfP1PtM9Qa8"
            ),
            Category(
                name = "Desserts",
                imageUrl = "https://source.unsplash.com/_jk8KIyN_uA"
            ),
            Category(
                name = "Nuts ",
                imageUrl = "https://source.unsplash.com/UsSdMZ78Q3E"
            )
        )
    ),
    CategoryCollection(
        id = 1L,
        name = "Lifestyles",
        categories = listOf(
            Category(
                name = "Organic",
                imageUrl = "https://source.unsplash.com/7meCnGCJ5Ms"
            ),
            Category(
                name = "Gluten Free",
                imageUrl = "https://source.unsplash.com/m741tj4Cz7M"
            ),
            Category(
                name = "Paleo",
                imageUrl = "https://source.unsplash.com/dt5-8tThZKg"
            ),
            Category(
                name = "Vegan",
                imageUrl = "https://source.unsplash.com/ReXxkS1m1H0"
            ),
            Category(
                name = "Vegitarian",
                imageUrl = "https://source.unsplash.com/IGfIGP5ONV0"
            ),
            Category(
                name = "Whole30",
                imageUrl = "https://source.unsplash.com/9MzCd76xLGk"
            )
        )
    )
)