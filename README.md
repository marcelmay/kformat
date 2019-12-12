# KFormat

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.m3y.kformat/kformat/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.m3y.kformat/kformat)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
![Pure Java + Kotlin](https://img.shields.io/badge/100%25-java%2bkotlin-orange.svg)

KFormat is a tiny Kotlin library for formatted text output such as printing values in a structured table.
Typical use cases include CLI tool development.

* [Table](src/main/kotlin/de/m3y/kformat/Table.kt)
  * Auto-sizing of cell widths
  * Formatting hints, such as for alignment or floating precision rendering

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
    }
}.render(StringBuilder())
```
Generated output:
```
A      B     C Long_Header
10 b...1 2.10%         foo
20    b2 0.33%         bar
```
For further examples, see [test cases](src/test/kotlin/TableTest.kt)
## Downloading
Download from [Maven Central](https://search.maven.org/search?q=g:de.m3y.kformat%20AND%20a:kformat) or use GAV de.m3y.kformat:kformat:VERSION

```xml
<groupId>de.m3y.kformat</groupId>
<artifactId>kformat</artifactId>
<version><!--Replace version--></version>
```

## Building
```bash
mvn install dokka:dokka
```
## Copyright

Copyright 2019 Marcel May <marcel.may.de@gmail.com>
