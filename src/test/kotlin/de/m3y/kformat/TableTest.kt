package de.m3y.kformat

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isFalse
import assertk.assertions.isNull
import assertk.assertions.isTrue
import de.m3y.kformat.Table.Hints
import org.junit.Test
import java.text.DecimalFormatSymbols
import java.time.LocalDateTime
import java.time.Month

class TableTest {
    private val decimalSeparatorChar = DecimalFormatSymbols.getInstance().decimalSeparator

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
                // Use a precision of two for formatting floats of column 'Foo'
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
            """.replace('.',decimalSeparatorChar).trimIndent()
        )
        assertThat(table {
            // Add the header labels
            header("A", "B12345", "C1", "Dddddddd", "Foo", "Bar")

            row(9, 900, 900, "v9", -99.98167968734772, LocalDateTime.of(2019, Month.DECEMBER, 10, 21, 10))
            row(9, 900, 900, "v9", 20.23486145693435, LocalDateTime.of(2019, Month.DECEMBER, 10, 21, 10))

            // Hints tune rendering by adding additional formatting instructions
            hints {
                // Use a precision of two for formatting floats of column 'Foo'
                precision("Foo", 1)
                // Align header and values to the lef
                alignment("Dddddddd", Hints.Alignment.LEFT)
                alignment("Bar", Hints.Alignment.LEFT)
                // Append a '%' to the formatted values of column 'Foo'
                postfix("Foo", "%")
            }
        }.render().trim()).isEqualTo(
            """
A B12345  C1 Dddddddd     Foo Bar             
9    900 900 v9       -100.0% 2019-12-10T21:10
9    900 900 v9         20.2% 2019-12-10T21:10
            """.replace('.',decimalSeparatorChar).trimIndent()
        )
    }

    @Test
    fun testRenderAlignment() {
        // Smaller headers
        assertThat(table {
            header("A", "B", "C", "D", "F")

            row(10, "b1", "c1", "ddd1", "fff")
            row(20, "b2", "c2", "d2", "f")

            hints {
                alignment("A", Hints.Alignment.LEFT)
                assertThat(specification[Hints.Key.Alignment.ofColumn(0)]).isEqualTo(Hints.Alignment.LEFT)

                alignment("B", Hints.Alignment.RIGHT)
                assertThat(specification[Hints.Key.Alignment.ofColumn(1)]).isEqualTo(Hints.Alignment.RIGHT)

                alignment("C", Hints.Alignment.CENTER)
                assertThat(specification[Hints.Key.Alignment.ofColumn(2)]).isEqualTo(Hints.Alignment.CENTER)

                alignment("D", Hints.Alignment.CENTER)
                assertThat(specification[Hints.Key.Alignment.ofColumn(3)]).isEqualTo(Hints.Alignment.CENTER)

                alignment("F", Hints.Alignment.CENTER)
                assertThat(specification[Hints.Key.Alignment.ofColumn(4)]).isEqualTo(Hints.Alignment.CENTER)
            }
        }.render().trim()).isEqualTo(
            """
            A   B  C   D   F 
            10 b1 c1 ddd1 fff
            20 b2 c2  d2   f
            """.trimIndent()
        )

        // Longer headers
        assertThat(table {
            header("A__", "__B", "_C_", "__D_", "__E__", "___F__")

            row(10, "b1", "c1", "d1", "e1", "f1")
            row(20, "b2", "c2", "d2", "e2", "f2")

            hints {
                alignment("A__", Hints.Alignment.LEFT)
                alignment("__B", Hints.Alignment.RIGHT)
                alignment("_C_", Hints.Alignment.CENTER)
                alignment("__D_", Hints.Alignment.CENTER)
                alignment("__E__", Hints.Alignment.CENTER)
                alignment("___F__", Hints.Alignment.CENTER)
            }
        }.render().trim()).isEqualTo(
            """
            A__ __B _C_ __D_ __E__ ___F__
            10   b1  c1  d1    e1    f1  
            20   b2  c2  d2    e2    f2
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

        // Default align set to LEFT, one col right
        assertThat(table {
            header("A__", "__B", "__C")

            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                defaultAlignment = Hints.Alignment.LEFT
                alignment("__C", Hints.Alignment.RIGHT)
                alignment(1 /* __B */, Hints.Alignment.RIGHT)
            }
        }.render().trim()).isEqualTo(
            """
            A__ __B __C
            10   b1  c1
            20   b2  c2
            """.trimIndent()
        )
    }

    @Test
    fun testTableWithoutHeader() {
        assertThat(table {
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                assertThat(specification[Hints.Key.Alignment.ofColumn(0)]).isNull()
                alignment(0, Hints.Alignment.LEFT)
                assertThat(specification[Hints.Key.Alignment.ofColumn(0)]).isEqualTo(Hints.Alignment.LEFT)

                assertThat(specification[Hints.Key.Alignment.ofColumn(1)]).isNull()
                alignment(1, Hints.Alignment.RIGHT)
                assertThat(specification[Hints.Key.Alignment.ofColumn(1)]).isEqualTo(Hints.Alignment.RIGHT)
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

    @Test
    fun testLine() {
        assertThat(table {
            header("A", "B", "C")
            line("An unformatted line between")
            row(10, "b1", "c1")
            row(20, "b2", "c2")
            line("Another unformatted line between")
            line("Again, another unformatted line between")
            row(30, "b3", "c3")

            hints {
                alignment(0, Hints.Alignment.LEFT)
                alignment(1, Hints.Alignment.RIGHT)
                borderStyle = Table.BorderStyle.SINGLE_LINE
                prefix(3, "±")
            }
        }.render().trim()).isEqualTo(
            """
            A  |  B |  C
            ---|----|---
            An unformatted line between
            10 | b1 | c1
            20 | b2 | c2
            Another unformatted line between
            Again, another unformatted line between
            30 | b3 | c3
            """.trimIndent()
        )

        assertThat(table {
            line("An unformatted line between")
        }.render().trim()).isEqualTo(
            """
                    An unformatted line between
                    """.trimIndent()
        )
    }

    @Test
    fun testHasRows() {
        assertThat(table {
            line("An unformatted line between")
        }.hasRows()).isFalse()
        assertThat(table {
            line("An unformatted line between")
            line("An unformatted line between")
        }.hasRows()).isFalse()
        assertThat(table {
            row("An unformatted line between")
        }.hasRows()).isTrue()
        assertThat(table {
            line("An unformatted line between")
            row("An unformatted line between")
            line("An unformatted line between")
        }.hasRows()).isTrue()
    }

    @Test
    fun testMargin() {
        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
                leftMargin(".  ")
            }
        }.render().trim()).isEqualTo(
            """
            .   A |  B |  C
            .  ---|----|---
            .  10 | b1 | c1
            .  20 | b2 | c2
            """.trimIndent()
        )
    }

    @Test
    fun testProvidedHints() {
        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints(mapOf(Hints.Key.LeftMargin.ofAnyColumn() to ">")) {
                borderStyle = Table.BorderStyle.SINGLE_LINE
            }
        }.render().trim()).isEqualTo(
            """
            > A |  B |  C
            >---|----|---
            >10 | b1 | c1
            >20 | b2 | c2
            """.trimIndent()
        )

        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
            } + mapOf(Hints.Key.LeftMargin.ofAnyColumn() to ">>>")
        }.render().trim()).isEqualTo(
            """
            >>> A |  B |  C
            >>>---|----|---
            >>>10 | b1 | c1
            >>>20 | b2 | c2
            """.trimIndent()
        )

        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", "c1")
            row(20, "b2", "c2")

            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
            } + (Hints.Key.LeftMargin.ofAnyColumn() to ">>>")
        }.render().trim()).isEqualTo(
            """
            >>> A |  B |  C
            >>>---|----|---
            >>>10 | b1 | c1
            >>>20 | b2 | c2
            """.trimIndent()
        )
    }

    @Test
    fun testSparseHeaderAndRows() {
        assertThat(table {
            header("A", "B")
            row(10, "b1", 1.5F)
            row(20)
            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
                alignment(0, Hints.Alignment.LEFT)
                precision(2, 2)
            }
        }.render().trim()).isEqualTo(
            """
                    A  |  B |     
                    ---|----|-----
                    10 | b1 | 1.50
                    20 |    |
                    """.replace('.',decimalSeparatorChar).trimIndent()
        )
        assertThat(table {
            header("A", "B")
            row(10, "b1", 1.5F)
            row(20)
            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
                alignment(0, Hints.Alignment.LEFT)
            }
        }.render().trim()).isEqualTo(
            """
                    A  |  B |         
                    ---|----|---------
                    10 | b1 | 1.500000
                    20 |    |
                    """.replace('.',decimalSeparatorChar).trimIndent()
        )
    }

    @Test
    fun testFormatFlags() {
        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", 1.5F)
            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
                alignment(0, Hints.Alignment.LEFT)
                precision(2, 2)
                formatFlag(2, "+")
            }
        }.render().trim()).isEqualTo(
            """
                    A  |  B |     C
                    ---|----|------
                    10 | b1 | +1.50
                    """.replace('.',decimalSeparatorChar).trimIndent()
        )

        assertThat(table {
            header("A", "B", "C")
            row(10, "b1", 1.5F)
            row(1, "b1", -1.3333F)
            hints {
                borderStyle = Table.BorderStyle.SINGLE_LINE
                alignment(0, Hints.Alignment.LEFT)
                precision(2, 2)
                formatFlag(2, "+")
            }
        }.render().trim()).isEqualTo(
            """
                    A  |  B |     C
                    ---|----|------
                    10 | b1 | +1.50
                    1  | b1 | -1.33
                    """.replace('.',decimalSeparatorChar).trimIndent()
        )
    }

    @Test
    fun testRepeatingHeader() {
        assertThat(
            table {
                header("A1", "B1")
                row("a1", "b1")
                row("a2", "b2")
                line()
                header("A3", "B3")
                row("a4", "b4")
                hints {
                    borderStyle = Table.BorderStyle.SINGLE_LINE
                }
            }.render().trim()
        ).isEqualTo(
            """
                A1 | B1
                ---|---
                a1 | b1
                a2 | b2
                
                A3 | B3
                ---|---
                a4 | b4
            """.trimIndent()
        )

        // With variable widths
        assertThat(
            table {
                header("A1", "B1")
                row("a1", "b1")
                line()
                header("A3", "B3", "C3")
                row("a4", "b4", "c3")
                hints {
                    borderStyle = Table.BorderStyle.SINGLE_LINE
                }
            }.render().trim()
        ).isEqualTo(
            """
                A1 | B1 |   
                ---|----|---
                a1 | b1 |   
                
                A3 | B3 | C3
                ---|----|---
                a4 | b4 | c3
            """.trimIndent()
        )
    }

    @Test
    fun testAnyRowType() {
        data class Dummy(val a: Long)

        assertThat(table {
            row(10L, true, false, Dummy(1))

            hints {
                alignment(0, Hints.Alignment.LEFT)
                alignment(1, Hints.Alignment.RIGHT)
                borderStyle = Table.BorderStyle.SINGLE_LINE
            }
        }.render().trim()).isEqualTo(
            """
            10 | true | false | Dummy(a=1)
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
