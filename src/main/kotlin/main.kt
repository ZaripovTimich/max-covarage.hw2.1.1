import java.util.*

fun main() {
    var previous = 0.0
    val scanner = Scanner(System.`in`)

    while (true) {
        println("Выбирите тип карты:")
        println("1.VkPay\n" +
                "2.MasterCard\n" +
                "3.Maestro\n" +
                "4.Visa\n" +
                "5.МИР\n" +
                "0.Выход"
        )

        val typeCard = scanner.nextInt()
        if (typeCard == 0) break

        print("Введите сумму перевода: ")

        val amount = scanner.nextDouble()
        previous += typeCard(typeCard, previous, amount)

        if (previous == 0.0) previous += amount
        println(previous)
    }
}


fun typeCard(typeCard: Int, previous: Double, amount: Double): Double {
    val commissionVisaAndWorld = 0.0075
    var previous2 = 0.0

    when (typeCard) {
        1 -> println("Сумма перевод с комиссией: $amount Руб") //VkPay
        2 -> if (amount > 75000.0 || previous + amount > 75000.0) {     //MasterCard
            println("Сумма комиссии: ${amount * 0.006 + 20.0}")
            println("Сумма перевод с комиссией: " +
                    "${amount - (amount * 0.006 + 20.0)} Руб")
            previous2 = amount - (amount * 0.006 + 20.0)
        } else {
            println("Сумма комиссии: 0.0")
            println("Сумма перевод с комиссией: " +
                    "$amount Руб")
            previous2 = amount
        }
        3 -> if (amount > 75000.0 || previous + amount > 75000.0) {     //Maestro
            println("Сумма комиссии: ${amount * 0.006 + 20.0}")
            println("Сумма перевод с комиссией: " +
                    "${amount - (amount * 0.006 + 20.0)} Руб")
            previous2 = amount - (amount * 0.006 + 20.0)
        } else{
            println("Сумма комиссии: 0.0")
            println("Сумма перевод с комиссией: " +
                    "$amount Руб")
            previous2 = amount
        }
        4 -> if (amount < 35.00) {                             //Visa
            println("Сумма комиссии: 35.00")
            println("Сумма перевод с комиссией: ${amount + 35.00} Руб")
            previous2 = amount + 35.00
        } else {
            println("Сумма комиссии: ${amount * commissionVisaAndWorld}")
            println("Сумма перевод с комиссией: ${amount - (amount * commissionVisaAndWorld)} Руб")
            previous2 = amount - (amount * commissionVisaAndWorld)
        }
        5 -> if (amount < 35.00) {                             //МИР
            println("Сумма комиссии: 35.00")
            println("Сумма перевод с комиссией: ${amount + 35.00} Руб")
            previous2 = amount + 35.00
        } else {
            println("Сумма комиссии: ${amount * commissionVisaAndWorld}")
            println("Сумма перевод с комиссией: ${amount - (amount * commissionVisaAndWorld)} Руб")
            previous2 = amount - (amount * commissionVisaAndWorld)
        }
    }
    return previous2
}