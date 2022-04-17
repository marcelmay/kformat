# KFormat

[![Maven Central](https://img.shields.io/maven-central/v/de.m3y.kformat/kformat.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22de.m3y.kformat%22%20AND%20a%3A%22kformat%22)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
![Pure Java + Kotlin](https://img.shields.io/badge/100%25-java%2bkotlin-orange.svg)

KFormat is a tiny Kotlin library for formatted text output such as printing values in a structured table.
Typical use cases include CLI tool development.

* Table ([doc](docs/dokka/kformat/de.m3y.kformat/-table/index.md)/[source](src/main/kotlin/de/m3y/kformat/Table.kt))
  * Grid-based like a HTML table
  * Auto-sizing of cell widths
  * Formatting hints, such as for alignment, floating precision rendering or border rendering

## Examples

Format a table including cell resizing:
```kotlin
table {
    header("A", "B", "C", "Long_Header")

    row(10, "b...1", 2.1f, "foo")
    row(20, "b2", 1/3f, "bar")

    hints {
        alignment("A", Hints.Alignment.LEFT)
        precision("C", 2)
        postfix("C", "%")
        borderStyle = Table.BorderStyle.SINGLE_LINE // or NONE
    }
}.render(StringBuilder())
```
Generated output:
```
A  |     B |     C | Long_Header
---|-------|-------|------------
10 | b...1 | 2.10% |         foo
20 |    b2 | 0.33% |         bar
```
For further examples, see [test cases](src/test/kotlin/de/m3y/kformat/TableTest.kt)
## Downloading
Download from [Maven Central](https://search.maven.org/search?q=g:de.m3y.kformat%20AND%20a:kformat) or use GAV de.m3y.kformat:kformat:VERSION

```xml
<dependency>
    <groupId>de.m3y.kformat</groupId>
    <artifactId>kformat</artifactId>
    <version>VERSION</version>
</dependency>
```

## Building
```bash
mvn install
mvn dokka:dokka -Pgithub-pages
```
## Copyright

Copyright 2019-2022 [Marcel May](https://github.com/marcelmay)
