fun main() {
    // 1. Fungsi tanpa parameter
    displayWelcome()
    showSeparator()

    // 2. Fungsi dengan parameter wajib
    printWeather("Jakarta", 32)
    calculateSquare(5)

    // 3. Fungsi dengan parameter default
    logger(message = "System started") // Menggunakan default "INFO"
    logger("Database error", "ERROR") // Menimpa nilai default
    
    setAlarm(7) // Menggunakan default "Daily"
    setAlarm(10, "Weekend")
}

// --- FUNGSI TANPA PARAMETER ---
// Fungsi yang melakukan tugas tanpa input tambahan 
fun displayWelcome() {
    println("Welcome to the Assignment App")
}

fun showSeparator() {
    println("----------------------------")
}

// --- FUNGSI DENGAN PARAMETER WAJIB ---
// Argumen harus diisi saat dipanggil agar tidak error
fun printWeather(city: String, temp: Int) {
    println("City: $city, Temperature: $temp°C")
}

fun calculateSquare(number: Int) {
    val result = number * number
    println("Square of $number is $result")
}

// --- FUNGSI DENGAN PARAMETER DEFAULT ---
// Memiliki nilai cadangan jika argumen tidak diberikan
fun logger(message: String, level: String = "INFO") {
    println("[$level] $message")
}

fun setAlarm(time: Int, type: String = "Daily") {
    println("Alarm set for $time:00 ($type mode)")
}
