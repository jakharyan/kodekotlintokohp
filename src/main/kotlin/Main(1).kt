fun main() {
    print("Masukkan Nama  : ")
    val name = readln()
    val merk = mutableListOf<String>()
    val harga = mutableListOf<Int>()

    var lanjutan = true

    while (lanjutan) {
        val menu = """
            1. HP
            2. Aksesoris HP
            3. Keluar
        """.trimIndent()

        println(menu)
        print("Pilihan yang anda inginkan : ")
        var pilihMenu = readln()
        println()

        if (pilihMenu == "1") {
            val hp = """
        ------------------------------ Penjualan HP ------------------------------
        ------------------------------- Pilih Merk -------------------------------
        1. Iphone
        2. Samsung
        3. Vivo
    """.trimIndent()
            println(hp)

            println()
            print("Pilihan yang anda inginkan : ");
            var pilihan = readln()
            println()

            if (pilihan == "1") {
                iphone()
                println()
                print("Apakah anda ingin menambah produk ke keranjang (Ya/Tidak)? ")
                var jawaban = readLine()
                if (jawaban!!.uppercase() == "YA") {
                    merk.add("Iphone")
                    harga.add(12099000)
                    println()
                } else if (jawaban!!.uppercase() == "TIDAK") {
                    lanjutan = true
                } else {
                    println("Input salah")
                }
            } else if (pilihan == "2") {
                samsung()
                println()
                print("Apakah anda ingin menambah produk (Ya/Tidak)? ")
                var jawaban = readLine()
                if (jawaban!!.uppercase() == "YA") {
                    merk.add("Samsung")
                    harga.add(16499000)
                    println()
                    print("Apakah anda ingin menambah aksesoris ke keranjang (Ya/Tidak)? ")
                    var acc = readLine()
                    if (acc!!.uppercase() == "YA") {
                        merk.add("Aksesoris Samsung")
                        harga.add(20000)
                        lanjutan = true
                    } else if (acc!!.uppercase() == "TIDAK") {
                        lanjutan = true
                    } else {
                        println("Input salah")
                    }
                } else if (jawaban!!.uppercase() == "TIDAK") {
                    lanjutan = true
                } else {
                    println("Input salah")
                }
            } else if (pilihan == "3") {
                oppo()
                println()
                print("Apakah anda ingin menambah produk (Ya/Tidak)? ")
                var jawaban = readLine()
                if (jawaban!!.uppercase() == "YA") {
                    merk.add("Oppo")
                    harga.add(12999000)
                    println()
                    print("Apakah anda ingin menambah aksesoris ke keranjang (Ya/Tidak)? ")
                    var acc = readLine()
                    if (acc!!.uppercase() == "YA") {
                        merk.add("Aksesoris Oppo")
                        harga.add(20000)
                        lanjutan = true
                    } else if (acc!!.uppercase() == "TIDAK") {
                        lanjutan = true
                    } else {
                        println("Input salah")
                    }
                } else if (jawaban!!.uppercase() == "TIDAK") {
                    lanjutan = true
                } else {
                    println("Input salah")
                }
            } else {
                println("Pilihan tidak ada")
            }
        } else if (pilihMenu == "2") {
            val acc = """
        ----------------------------- Pilih Aksesoris -----------------------------
        1. Tempered Glass
        2. Earphone
        3. Soft case
    """.trimIndent()
            println(acc)

            print("Pilihan yang anda inginkan : ");
            var pilihan = readln()
            println()

            if (pilihan == "1") {
                println("Harga Tempred Glass Rp. 20.000")
                print("Apakah anda ingin menambah aksesoris ke keranjang (Ya/Tidak)? ")
                var acc1 = readLine()
                if (acc1!!.uppercase() == "YA") {
                    merk.add("Tempered Glass")
                    harga.add(20000)
                    lanjutan = true
                } else if (acc1!!.uppercase() == "TIDAK") {
                    lanjutan = true
                } else {
                    println("Input salah")
                }
            } else if (pilihan == "2") {
                println("Harga Earphone Rp. 50.000")
                print("Apakah anda ingin menambah aksesoris ke keranjang (Ya/Tidak)? ")
                var acc2 = readLine()
                if (acc2!!.uppercase() == "YA") {
                    merk.add("Earphone")
                    harga.add(50000)
                    lanjutan = true
                } else if (acc2!!.uppercase() == "TIDAK") {
                    lanjutan = true
                } else {
                    println("Input salah")
                }
            } else if (pilihan == "3") {
                println("Harga Soft Case Rp. 10.000")
                print("Apakah anda ingin menambah aksesoris ke keranjang (Ya/Tidak)? ")
                var acc3 = readLine()
                if (acc3!!.uppercase() == "YA") {
                    merk.add("Soft case")
                    harga.add(10000)
                    lanjutan = true
                } else if (acc3!!.uppercase() == "TIDAK") {
                    lanjutan = true
                } else {
                    println("Input salah")
                }
            }
        } else if (pilihMenu == "3") {
                println("Total Pembelian oleh $name dengan merk ${merk} berjumlah Rp.  ${harga.sum()}")
                println("Terima Kasih telah menggunakan aplikasi ini")
                break
        } else {
            println("Pilihan yang anda pilih tidak ada")
            lanjutan = true
        }
    }
}
fun iphone(){
    println("""
        |--------------------------------------------------------------------------
        |Tipe           : Iphone 12
        |Spesifikasi    : Ram 4/64 GB, Apple A14 Bionic, Dual Kamera
        |Harga          : Rp. 12.099.000
    """.trimMargin())

}

fun samsung(){
    println("""
        |--------------------------------------------------------------------------
        |Tipe           : Samsung S22 Ultra
        |Spesifikasi    : Ram 8/128 GB, Qualcomm Snapdragon 8 Gen 1, 4 Kamera
        |Harga          : Rp. 16.499.000
    """.trimMargin())
}

fun oppo(){
    println("""
        |--------------------------------------------------------------------------
        |Tipe           : Oppo Find X
        |Spesifikasi    : Ram 8/256 GB, Qualcomm Snapdragon 845, Dual Kamera
        |Harga          : Rp. 12.999.000
    """.trimMargin())
}