import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun typeCard_VKPay() {
        val typeCard = 1
        val previous = 0.0
        val amount = 76000.0
        val expected = 0.0
        val delta = 0.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_MasterCardTrue() {
        val typeCard = 2
        val previous = 0.0
        val amount = 74000.0
        val expected = 76000.0
        val delta = 1000.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_MasterCardTrue2() {
        val typeCard = 2
        val previous = 75000.0
        val amount = 1000.0
        val expected = 1000.0
        val delta = 1000.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_MasterCardFalse() {
        val typeCard = 2
        val previous = 0.0
        val amount = 10000.0
        val expected = 10000.0
        val delta = 0.100

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_MaestroTrue() {
        val typeCard = 3
        val previous = 0.0
        val amount = 76000.0
        val expected = 76000.0
        val delta = 1000.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_MaestroTrue2() {
        val typeCard = 3
        val previous = 75000.0
        val amount = 1000.0
        val expected = 1000.0
        val delta = 1000.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_MaestroFalse() {
        val typeCard = 3
        val previous = 0.0
        val amount = 10000.0
        val expected = 10000.0
        val delta = 0.100

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_VisaTrue() {
        val typeCard = 4
        val previous = 0.0
        val amount = 34.0
        val expected = 70.0
        val delta = 100.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_VisaFalse() {
        val typeCard = 4
        val previous = 0.0
        val amount = 100.0
        val expected = 150.0
        val delta = 100.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_WorldTrue() {
        val typeCard = 5
        val previous = 0.0
        val amount = 34.0
        val expected = 70.0
        val delta = 100.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }

    @Test
    fun typeCard_WorldFalse() {
        val typeCard = 5
        val previous = 0.0
        val amount = 100.0
        val expected = 150.0
        val delta = 100.0

        val result = typeCard(
            typeCard = typeCard,
            previous = previous,
            amount = amount
        )

        assertEquals(expected, result, delta)
    }
}