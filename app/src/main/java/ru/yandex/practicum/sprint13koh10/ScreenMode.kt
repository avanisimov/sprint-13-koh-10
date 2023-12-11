package ru.yandex.practicum.sprint13koh10

import androidx.annotation.StringRes

enum class ScreenMode(
    @StringRes
    val titleResId: Int
) {
    CATALOG(R.string.catalog_title),
    CART(R.string.cart_title)
}