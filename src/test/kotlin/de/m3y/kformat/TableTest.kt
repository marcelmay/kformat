package de.m3y.kformat

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import de.m3y.kformat.Table.Hints
import org.junit.Test
import java.time.LocalDateTime
import java.time.Month

class TableTest {
    @Test
    fun testRenderTable() {
        assertThat(table {
            // Add the header labels
            header("A", "B12345", "C1", "Dddddddd", "Foo", "Bar")

            // Add some data rows
            for (i in 0 until 10) {
                row(i, 10 * i, 100 * i, "v$i", i / 10f, LocalDateTime.of(2019, Month.DECEMBER, 10, 21, i))
            }

            // Hints tune rendering by adding additional formatting instructions
            hints {
                // Use a precission of two for formatting floats of column 'Foo'
                precision("Foo", 2)
                // Align header and values to the lef
                alignment("Dddddddd", Hints.Alignment.LEFT)
                alignment("Bar", Hints.Alignment.LEFT)
                // Append a '%' to the formatted values of column 'Foo'
                postfix("Foo", "%")
            }
        }.render().trim()).isEqualTo(
            """
            A B12345  C1 Dddddddd   Foo Bar             
            0      0   0 v0       0.00% 2019-12-10T21:00
            1     10 100 v1       0.10% 2019-12-10T21:01
            2     20 200 v2       0.20% 2019-12-10T21:02
            3     30 300 v3       0.30% 2019-12-10T21:03
            4     40 400 v4       0.40% 2019-12-10T21:04
            5     50 500 v5       0.50% 2019-12-10T21:05
            6     60 600 v6       0.60% 2019-12-10T21:06
            7     70 700 v7       0.70% 2019-12-10T21:07
            8     80 800 v8       0.80% 2019-12-10T21:08
            9     90 900 v9       0.90% 2019-12-10T21:09
            """.trimIndent()
        )
    }

    @Test
    fun testRenderAlignment() {
        // Smaller headers
        assertThat(table {
            header("A", "B", "C")

            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                assertThat(specification["0.alignment"]).isNull()
                alignment("A", Hints.Alignment.LEFT)
                assertThat(specification["0.alignment"]).isEqualTo(Hints.Alignment.LEFT)

                assertThat(specification["1.alignment"]).isNull()
                alignment("B", Hints.Alignment.RIGHT)
                assertThat(specification["1.alignment"]).isEqualTo(Hints.Alignment.RIGHT)
            }
        }.render().trim()).isEqualTo(
            """
            A   B  C
            10 b1 c1
            20 b2 c2
            """.trimIndent()
        )

        // Longer headers
        assertThat(table {
            header("__A", "B__", "__C")

            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                alignment("__A", Hints.Alignment.LEFT)
                alignment("B__", Hints.Alignment.RIGHT)
            }
        }.render().trim()).isEqualTo(
            """
            __A B__ __C
            10   b1  c1
            20   b2  c2
            """.trimIndent()
        )
    }

    @Test
    fun testTableDefaultAlignment() {
        // Default alignment (= RIGHT)
        assertThat(table {
            header("__A", "B__", "__C")

            row(10, "b1", "c1")
            row(20, "b2", "c2")
        }.render().trim()).isEqualTo(
            """
            __A B__ __C
             10  b1  c1
             20  b2  c2
            """.trimIndent()
        )

        // Default alignment (RIGHT)
        assertThat(table {
            header("__A", "B__", "__C")

            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                defaultAlignment = Hints.Alignment.RIGHT
            }
        }.render().trim()).isEqualTo(
            """
            __A B__ __C
             10  b1  c1
             20  b2  c2
            """.trimIndent()
        )

        // Default align set to LEFT
        assertThat(table {
            header("__A", "B__", "__C")

            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                defaultAlignment = Hints.Alignment.LEFT
            }
        }.render().trim()).isEqualTo(
            """
            __A B__ __C
            10  b1  c1 
            20  b2  c2
            """.trimIndent()
        )
    }

    @Test
    fun testTableWithoutHeader() {
        assertThat(table {
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                assertThat(specification["0.alignment"]).isNull()
                alignment(0, Hints.Alignment.LEFT)
                assertThat(specification["0.alignment"]).isEqualTo(Hints.Alignment.LEFT)

                assertThat(specification["1.alignment"]).isNull()
                alignment(1, Hints.Alignment.RIGHT)
                assertThat(specification["1.alignment"]).isEqualTo(Hints.Alignment.RIGHT)
            }
        }.render().trim()).isEqualTo(
            """
            10 b1 c1
            20 b2 c2
            """.trimIndent()
        )
    }

    @Test
    fun testTableWithBorder() {
        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                alignment(0, Hints.Alignment.LEFT)
                alignment(1, Hints.Alignment.RIGHT)
                borderStyle = Table.BorderStyle.SINGLE_LINE
            }
        }.render().trim()).isEqualTo(
            """
            A  |  B |  C
            ---|----|---
            10 | b1 | c1
            20 | b2 | c2
            """.trimIndent()
        )
    }

    @Test
    fun testPrefix() {
        assertThat(table {
            header("A", "B", "C", "D")
            row(10, "b1", "c1", "d1")
            row(20, "b2", "c2", "d2")

            hints {
                alignment(0, Hints.Alignment.LEFT)
                alignment(1, Hints.Alignment.RIGHT)
                borderStyle = Table.BorderStyle.SINGLE_LINE
                prefix(3, "±")
            }
        }.render().trim()).isEqualTo(
            """
            A  |  B |  C |   D
            ---|----|----|----
            10 | b1 | c1 | ±d1
            20 | b2 | c2 | ±d2
            """.trimIndent()
        )
    }
}

fun main() {
    // Example
    println(
        table {
            header("A", "B", "C", "Long_Header")

            row(10, "b...1", 2.1f, "foo")
            row(20, "b2", 1 / 3f, "bar")

            hints {
                alignment("A", Hints.Alignment.LEFT)
                precision("C", 2)
                postfix("C", "%")
                borderStyle = Table.BorderStyle.SINGLE_LINE
            }
        }.render(StringBuilder())
    )
}
