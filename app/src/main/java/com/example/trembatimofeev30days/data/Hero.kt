package com.example.trembatimofeev30days.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.trembatimofeev30days.R

data class Hero(
    val day: String,
    val title: String,
    val description: String,
    val imageRes: Int
)

val heros = listOf(
    Hero("День 1", "Frieren", "Эльфийка изучает человеческие эмоции после победы над демоном", R.drawable.m1),
    Hero("День 2", "Fate", "Битвы магов за Святой Грааль в современном мире", R.drawable.m2),
    Hero("День 3", "Lycoris Recoil", "Девушки-агенты под прикрытием в кофейне", R.drawable.m3),
    Hero("День 4", "Chainsaw Man", "Парень с бензопилой вместо головы охотится на демонов", R.drawable.m4),
    Hero("День 5", "Hunter x Hunter", "Мальчик ищет отца в мире охотников за сокровищами", R.drawable.m5),
    Hero("День 6", "Demon slayer", "Юноша становится убийцей демонов ради сестры", R.drawable.m6),
    Hero("День 7", "Bluelock", "Экстремальный футбол в поисках лучшего нападающего", R.drawable.m7),
    Hero("День 8", "MHA", "Школьник без способностей в мире супергероев", R.drawable.m8),
    Hero("День 9", "Dandaanda", "Магия через танцы и музыку в фэнтези-мире", R.drawable.m9),
    Hero("День 10", "Mashle: Magic and Muscles", "Волшебник решает всё мышцами в магической академии", R.drawable.m10),
    Hero("День 11", "Katchikuta", "Приключения в мире говорящих механизмов", R.drawable.m11),
    Hero("День 12", "Solo Leveling", "Слабый охотник становится сильнейшим воином", R.drawable.m12),
    Hero("День 13", "Black Butler", "Демон-дворецкий служит юному аристократу", R.drawable.m13),
    Hero("День 14", "Jujutsu kaisen", "Школьники сражаются с проклятиями с помощью магии", R.drawable.m14),
    Hero("День 15", "Cyberpunk", "Хакеры в неоновом мегаполисе будущего", R.drawable.m15),
    Hero("День 16", "Re: zero", "Парень застревает в временной петле в другом мире", R.drawable.m16),
    Hero("День 17", "Let This Grieving Soul Retire", "Сильный охотник хочет спокойной жизни на пенсии", R.drawable.m17),
    Hero("День 18", "Konosuba", "Богиня и неудачник в комедийном фэнтези-мире", R.drawable.m18),
    Hero("День 19", "Overlord", "Геймер становится повелителем тьмы в MMORPG", R.drawable.m19),
    Hero("День 20", "The Eminence in Shadow", "Парень притворяется скрытой силой в фэнтези-мире", R.drawable.m20),
    Hero("День 21", "Song Night Owl", "Ночные приключения с загадочной совой", R.drawable.m21),
    Hero("День 22", "Star Child", "Ребенок со звездной судьбой и космическими силами", R.drawable.m22),
    Hero("День 23", "Rimuru", "Офисный работник перерождается в слизь в другом мире", R.drawable.m23),
    Hero("День 24", "Berserk", "Мрачное фэнтези о воине с гигантским мечом", R.drawable.m24),
    Hero("День 25", "Goblin Slayer", "Воин посвятил жизнь истреблению гоблинов", R.drawable.m25),
    Hero("День 26", "Attack Titan", "Люди сражаются с титанами за выживание", R.drawable.m26),
    Hero("День 27", "OnePice", "Пираты ищут величайшее сокровище в мире", R.drawable.m27),
    Hero("День 28", "Pokemon", "Тренеры и их покемоны в захватывающих приключениях", R.drawable.m28),
    Hero("День 29", "Tokyo Ghoul", "Студент становится гулем в жестоком мире", R.drawable.m29),
    Hero("День 30", "Naruto", "Ниндзя-изгой мечтает стать лидером деревни", R.drawable.m30)
)