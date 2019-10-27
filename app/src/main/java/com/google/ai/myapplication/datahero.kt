package com.google.ai.myapplication

object HeroesData {
    private val namaMenu = arrayOf(
        "Pengeluaran",
        "Tabungan",
        "List Keinginan",
        "List Kebutuhan")

    private val heroDetails = arrayOf(
        "http://data.magelangkota.go.id/uploads/group/2017-09-15-025151.829704icon-rupiah.png",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2DRsOQFrhiEPS_Lq4XB-fLEcErTEi9AAmE3Ba5tX8lxRoQ8voRA&s",
        "https://icon-icons.com/icons2/1358/PNG/512/if-advantage-deliver-1034356_88842.png",
        "https://icon-icons.com/icons2/281/PNG/256/Turkey-icon_30265.png")

    val listData: ArrayList<Menu>
    get() {
        val list = arrayListOf<Menu>()
        for (position in namaMenu.indices) {
            val hero = Menu()
            hero.Menu = namaMenu[position]
            hero.Gambar = heroDetails[position]
            list.add(hero)
        }
        return list
    }
}