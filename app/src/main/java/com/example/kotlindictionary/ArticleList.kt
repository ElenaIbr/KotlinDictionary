package com.example.kotlindictionary

object ArticleList {

    val articles = listOf(

        Article(
            title="1.1 Package definition and imports",
            des = "Package specification should be at the top of the source file.\\n\\nIt is not required to match directories and packages: source files can be placed arbitrarily in the file system.",
            top="1. Basic syntax",
            code = "package my.demo\n" +
                    "\n" +
                    "import kotlin.text.*\n" +
                    "\n" +
                    "// ...\n",
            link="https://kotlinlang.org/docs/basic-syntax.html#package-definition-and-imports"
        ),
        Article(
            title="1.2  Program entry point",
            des = "An entry point of a Kotlin application is the main function.",
            top="1. Basic syntax",
            code = "fun main() {\n" +
                    "    println(\"Hello world!\")\n" +
                    "}\n +" +
                    "fun main(args: Array<String>) {\n" +
                    "    println(args.contentToString())\n" +
                    "}",
            link="https://kotlinlang.org/docs/basic-syntax.html#program-entry-point"
        ),
        Article(
            title="1.3  Print to the standard output",
            des = "Print prints its argument to the standard output.\\n\\nPrintln prints its arguments and adds a line break, so that the next thing you print appears on the next line.",
            top="1. Basic syntax",
            code = "print(\"Hello \")\n" +
                    "print(\"world!\")\n" +
                    "println(\"Hello world!\")\n" +
                    "println(42)",
            link="https://kotlinlang.org/docs/basic-syntax.html#print-to-the-standard-output"
        ),
        Article(
            title="1.4  Functions",
            des = "Functions in Kotlin are declared using the fun keyword.",
            top="1. Basic syntax",
            code = "fun sum(a: Int, b: Int): Int {\n" +
                    "    return a + b\n" +
                    "}\n" +
                    "fun sum(a: Int, b: Int) = a + b \n" +
                    "fun printSum(a: Int, b: Int): Unit {\n" +
                    "    println(\"sum of \$a and \$b is \${a + b}\")\n" +
                    "}\n" +
                    "fun printSum(a: Int, b: Int) {\n" +
                    "    println(\"sum of \$a and \$b is \${a + b}\")\n" +
                    "}",
            link="https://kotlinlang.org/docs/basic-syntax.html#functions"
        ),
        Article(
            title="1.5  Variables",
            des = "Read-only local variables are defined using the keyword val. They can be assigned a value only once.\\n\\nVariables that can be reassigned use the var keyword.",
            top="1. Basic syntax",
            code = "val a: Int = 1  // immediate assignment\n" +
                    "val b = 2   // `Int` type is inferred\n" +
                    "val c: Int  // Type required when no initializer is provided\n" +
                    "c = 3       // deferred assignment\n" +
                    "var x = 5 // `Int` type is inferred\n" +
                    "x += 1",
            link="https://kotlinlang.org/docs/basic-syntax.html#variables"
        ),
        Article(
            title="1.6  Creating classes and instances",
            des = "To define a class, use the class keyword.\\n\\nProperties of a class can be listed in its declaration or body. \\n\\nThe default constructor with parameters listed in the class declaration is available automatically.\\n\\nInheritance between classes is declared by a colon (: ). Classes are final by default; to make a class inheritable, mark it as open.",
            top="1. Basic syntax",
            code = "open class Shape\n" +
                    "\n" +
                    "class Rectangle(var height: Double, var length: Double): Shape() {\n" +
                    "    var perimeter = (height + length) * 2\n" +
                    "}\n" +
                    "val rectangle = Rectangle(5.0, 2.0)",
            link="https://kotlinlang.org/docs/basic-syntax.html#creating-classes-and-instances"
        ),
        Article(
            title="1.7  Comments",
            des = "Just like most modern languages, Kotlin supports single-line (or end-of-line) and multi-line (block) comments.",
            top="1. Basic syntax",
            code = "// This is an end-of-line comment\n" +
                    "\n" +
                    "/* This is a block comment\n" +
                    "   on multiple lines. */\n" +
                    "/* The comment starts here\n" +
                    "/* contains a nested comment *\u2060/\n" +
                    "and ends here. */",
            link="https://kotlinlang.org/docs/basic-syntax.html#comments"
        ),
        Article(
            title="1.8  String templates",
            des = "<![CDATA[String literals may contain template expressions - pieces of code that are evaluated and whose results are concatenated into the string. A template expression starts with a dollar sign (\$) and consists of either a name:]]>",
            top="1. Basic syntax",
            code = "val i = 10\n" +
                    "println(\"i = \$i\") // prints \"i = 10\"\n" +
                    "val s = \"abc\"\n" +
                    "println(\"\$s.length is \${s.length}\") // prints \"abc.length is 3\"\n" +
                    "val price = \"\"\"\n" +
                    "${'$'}_9.99\n" +
                    "\"\"\"",
            link="https://kotlinlang.org/docs/basic-types.html#string-templates"
        ),
        Article(
            title="1.9  For loop",
            des = "The Kotlin Standard Library provides a comprehensive set of tools for managing collections – groups of a variable number of items (possibly zero) that share significance to the problem being solved and are operated upon commonly.",
            top="1. Basic syntax",
            code = "val items = listOf(\"apple\", \"banana\", \"kiwifruit\")\n" +
                    "for (item in items) {\n" +
                    "    println(item)\n" +
                    "}\n" +
                    "val items = listOf(\"apple\", \"banana\", \"kiwifruit\")\n" +
                    "for (index in items.indices) {\n" +
                    "    println(\"item at \$index is \${items[index]}\")\n" +
                    "}",
            link="https://kotlinlang.org/docs/basic-syntax.html#for-loop"
        ),
        Article(
            title="1.10 While loop",
            des = "While and do-while loops execute their body continuously while their condition is satisfied. The difference between them is the condition checking time:\\n• while checks the condition and, if it\\'s satisfied, executes the body and then returns to the condition check.\\n• do-while executes the body and then checks the condition. If it\\'s satisfied, the loop repeats. So, the body of do-while executes at least once regardless of the condition.",
            top="1. Basic syntax",
            code = "val items = listOf(\"apple\", \"banana\", \"kiwifruit\")\n" +
                    "var index = 0\n" +
                    "while (index < items.size) {\n" +
                    "    println(\"item at \$index is \${items[index]}\")\n" +
                    "    index++\n" +
                    "}",
            link="https://kotlinlang.org/docs/basic-syntax.html#while-loop"
        ),
        Article(
            title="2.1  Create DTOs",
            des = "For example code below provides a Customer class with the following functionality:\\n\\n•getters (and setters in case of var s) for all properties\\n• equals()\\n• hashCode()\\n• toString()\\n• copy()</",
            top="2. Idioms",
            code = "data class Customer(val name: String, val email: String)",
            link="https://kotlinlang.org/docs/idioms.html#create-dtos-pojos-pocos"
        ),
        Article(
            title="2.2  Default values for function parameters",
            des = "See example:",
            top="2. Idioms",
            code = "fun foo(a: Int = 0, b: String = \"\") { ... }",
            link="https://kotlinlang.org/docs/idioms.html#default-values-for-function-parameters"
        ),
        Article(
            title="2.3  Filter a list",
            des = "See example:",
            top="2. Idioms",
            code = "val positives = list.filter { x -> x > 0 }\n" +
                    "val positives = list.filter { it > 0 }\n",
            link="https://kotlinlang.org/docs/idioms.html#filter-a-list"
        ),
        Article(
            title="2.4  Check the presence of an element in a collection",
            des = "See example:",
            top="2. Idioms",
            code = "if (\"john@example.com\" in emailsList) { ... }\n" +
                    "\n" +
                    "if (\"jane@example.com\" !in emailsList) { ... }\n",
            link="https://kotlinlang.org/docs/idioms.html#check-the-presence-of-an-element-in-a-collection"
        ),
        Article(
            title="2.5  String interpolation",
            des = "<![CDATA[In Kotlin, use the dollar sign (\\$) before the variable name to interpolate the value of this variable into your string:]]>",
            top="2. Idioms",
            code = "val name = \"Joe\"\n" +
                    "println(\"Hello, \$name\")\n" +
                    "println(\"Your name is \${name.length} characters long\")",
            link="https://kotlinlang.org/docs/idioms.html#string-interpolation"
        ),
        Article(
            title="2.6  Instance checks",
            des = "See example:",
            top="2. Idioms",
            code = "when (x) {\n" +
                    "    is Foo -> ...\n" +
                    "    is Bar -> ...\n" +
                    "    else   -> ...\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#instance-checks",
        ),
        Article(
            title="2.7   Read-only list",
            des = "See example:",
            top="2. Idioms",
            code = "val list = listOf(\"a\", \"b\", \"c\")",
            link="https://kotlinlang.org/docs/idioms.html#read-only-list",
        ),
        Article(
            title="2.8  Read-only map",
            des = "See example:",
            top="2. Idioms",
            code = "val map = mapOf(\"a\" to 1, \"b\" to 2, \"c\" to 3)",
            link="https://kotlinlang.org/docs/idioms.html#read-only-map",
        ),
        Article(
            title="2.9  Access a map entry",
            des = "See example:",
            top="2. Idioms",
            code = "println(map[\"key\"])\n" +
                    "map[\"key\"] = value",
            link="https://kotlinlang.org/docs/idioms.html#access-a-map-entry",
        ),
        Article(
            title="2.10 Traverse a map or a list of pairs",
            des = "See example:",
            top="2. Idioms",
            code = "for ((k, v) in map) {\n" +
                    "    println(\"\$k -> \$v\")\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#traverse-a-map-or-a-list-of-pairs",
        ),
        Article(
            title="2.11 Iterate over a ranges",
            des = "See example:",
            top="2. Idioms",
            code = "for (i in 1..100) { ... }  // closed range: includes 100\n" +
                    "for (i in 1 until 100) { ... } // half-open range: does not include 100\n" +
                    "for (x in 2..10 step 2) { ... }\n" +
                    "for (x in 10 downTo 1) { ... }\n" +
                    "if (x in 1..10) { ... }",
            link="https://kotlinlang.org/docs/idioms.html#iterate-over-a-range",
        ),
        Article(
            title="2.12 Lazy property",
            des = "See example:",
            top="2. Idioms",
            code = "val p: String by lazy {\n" +
                    "    // compute the string\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#lazy-property",
        ),
        Article(
            title="2.13 Extension functions",
            des = "See example:",
            top="2. Idioms",
            code = "fun String.spaceToCamelCase() { ... }\n" +
                    "\n" +
                    "\"Convert this to camelcase\".spaceToCamelCase()",
            link="https://kotlinlang.org/docs/idioms.html#extension-functions",
        ),
        Article(
            title="2.14 Create a singleton",
            des = "See example:",
            top="2. Idioms",
            code = "object Resource {\n" +
                    "    val name = \"Name\"\n" +
                    "}\n",
            link="https://kotlinlang.org/docs/idioms.html#create-a-singleton",
        ),
        Article(
            title="2.15 Instantiate an abstract class",
            des = "See example:",
            top="2. Idioms",
            code = "abstract class MyAbstractClass {\n" +
                    "    abstract fun doSomething()\n" +
                    "    abstract fun sleep()\n" +
                    "}\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    val myObject = object : MyAbstractClass() {\n" +
                    "        override fun doSomething() {\n" +
                    "            // ...\n" +
                    "        }\n" +
                    "\n" +
                    "        override fun sleep() { // ...\n" +
                    "        }\n" +
                    "    }\n" +
                    "    myObject.doSomething()\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#instantiate-an-abstract-class",
        ),
        Article(
            title="2.16 If-not-null shorthand",
            des = "See example:",
            top="2. Idioms",
            code = "val files = File(\"Test\").listFiles()\n" +
                    "\n" +
                    "println(files?.size) // size is printed if files is not null",
            link="https://kotlinlang.org/docs/idioms.html#if-not-null-shorthand",
        ),
        Article(
            title="2.17 If-not-null-else shorthand",
            des = "See example:",
            top="2. Idioms",
            code = "val files = File(\"Test\").listFiles()\n" +
                    "\n" +
                    "println(files?.size ?: \"empty\") // if files is null, this prints \"empty\"",
            link="https://kotlinlang.org/docs/idioms.html#execute-a-statement-if-null",
        ),
        Article(
            title="2.18 Get first item of a possibly empty collection",
            des = "See example:",
            top="2. Idioms",
            code = "val emails = ... // might be empty\n" +
                    "val mainEmail = emails.firstOrNull() ?: \"\"",
            link="https://kotlinlang.org/docs/idioms.html#get-first-item-of-a-possibly-empty-collection",
        ),
        Article(
            title="2.19 Map nullable value if not null",
            des = "See example:",
            top="2. Idioms",
            code = "val value = ...\n" +
                    "\n" +
                    "val mapped = value?.let { transformValue(it) } ?: defaultValue\n" +
                    "// defaultValue is returned if the value or the transform result is null.",
            link="https://kotlinlang.org/docs/idioms.html#execute-if-not-null",
        ),
        Article(
            title="2.20 Return on when statement",
            des = "See example:",
            top="2. Idioms",
            code = "fun transform(color: String): Int {\n" +
                    "    return when (color) {\n" +
                    "        \"Red\" -> 0\n" +
                    "        \"Green\" -> 1\n" +
                    "        \"Blue\" -> 2\n" +
                    "        else -> throw IllegalArgumentException(\"Invalid color param value\")\n" +
                    "    }\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#return-on-when-statement",
        ),
        Article(
            title="2.21 try-catch expression",
            des = "See example:",
            top="2. Idioms",
            code = "fun test() {\n" +
                    "    val result = try {\n" +
                    "        count()\n" +
                    "    } catch (e: ArithmeticException) {\n" +
                    "        throw IllegalStateException(e)\n" +
                    "    }\n" +
                    "\n" +
                    "    // Working with result\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#try-catch-expression",
        ),
        Article(
            title="2.22 if expression",
            des = "See example:",
            top="2. Idioms",
            code = "fun foo(param: Int) {\n" +
                    "    val result = if (param == 1) {\n" +
                    "        \"one\"\n" +
                    "    } else if (param == 2) {\n" +
                    "        \"two\"\n" +
                    "    } else {\n" +
                    "        \"three\"\n" +
                    "    }\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#if-expression",
        ),
        Article(
            title="2.23 Builder-style usage of methods that return Unit",
            des = "See example:",
            top="2. Idioms",
            code = "fun arrayOfMinusOnes(size: Int): IntArray {\n" +
                    "    return IntArray(size).apply { fill(-1) }\n" +
                    "}\n",
            link="https://kotlinlang.org/docs/idioms.html#builder-style-usage-of-methods-that-return-unit",
        ),
        Article(
            title="2.24 Single-expression functions",
            des = "See example:",
            top="2. Idioms",
            code = "fun theAnswer() = 42 \n" +
                    "fun transform(color: String): Int = when (color) {\n" +
                    "    \"Red\" -> 0\n" +
                    "    \"Green\" -> 1\n" +
                    "    \"Blue\" -> 2\n" +
                    "    else -> throw IllegalArgumentException(\"Invalid color param value\")\n" +
                    "}",
            link="https://kotlinlang.org/docs/idioms.html#single-expression-functions",
        ),
        Article(
            title="2.25 Call multiple methods on an object instance",
            des = "See example:",
            top="2. Idioms",
            code = "class Turtle {\n" +
                    "    fun penDown()\n" +
                    "    fun penUp()\n" +
                    "    fun turn(degrees: Double)\n" +
                    "    fun forward(pixels: Double)\n" +
                    "}\n" +
                    "\n" +
                    "val myTurtle = Turtle()\n" +
                    "with(myTurtle) { //draw a 100 pix square\n" +
                    "    penDown()\n" +
                    "    for (i in 1..4) {\n" +
                    "        forward(100.0)\n" +
                    "        turn(90.0)\n" +
                    "    }\n" +
                    "    penUp()\n" +
                    "}\n",
            link="https://kotlinlang.org/docs/idioms.html#call-multiple-methods-on-an-object-instance-with",
        ),
        Article(
            title="2.26 Configure properties of an object",
            des = "See example:",
            top="2. Idioms",
            code = "val myRectangle = Rectangle().apply {\n" +
                    "    length = 4\n" +
                    "    breadth = 5\n" +
                    "    color = 0xFAFAFA\n" +
                    "}\n",
            link="https://kotlinlang.org/docs/idioms.html#configure-properties-of-an-object-apply",
        ),
        Article(
            title="2.27 Java 7\'s try-with-resources",
            des = "See example:",
            top="2. Idioms",
            code = "val stream = Files.newInputStream(Paths.get(\"/some/file.txt\"))\n" +
                    "stream.buffered().reader().use { reader ->\n" +
                    "    println(reader.readText())\n" +
                    "}\n",
            link="https://kotlinlang.org/docs/idioms.html#java-7-s-try-with-resources",
        ),
        Article(
            title="2.28 Generic function that requires the generic type information",
            des = "See example:",
            top="2. Idioms",
            code = "//  public final class Gson {\n" +
                    "//     ...\n" +
                    "//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {\n" +
                    "//     ...\n" +
                    "\n" +
                    "inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)\n",
            link="https://kotlinlang.org/docs/idioms.html#generic-function-that-requires-the-generic-type-information",
        ),
        Article(
            title="2.29 Nullable Boolean",
            des = "See example:",
            top="2. Idioms",
            code = "val b: Boolean? = ...\n" +
                    "if (b == true) {\n" +
                    "    ...\n" +
                    "} else {\n" +
                    "    // `b` is false or null\n" +
                    "}\n",
            link="https://kotlinlang.org/docs/idioms.html#nullable-boolean",
        ),
        Article(
            title="2.30 Swap two variables",
            des = "See example:",
            top="2. Idioms",
            code = "var a = 1\n" +
                    "var b = 2\n" +
                    "a = b.also { b = a }\n",
            link="https://kotlinlang.org/docs/idioms.html#swap-two-variables",
        ),
        Article(
            title="3.1  Integer types",
            des = "Kotlin provides a set of built-in types that represent numbers. For integer numbers, there are four types with different sizes and, hence, value ranges: \\n\\n• Byte (8 bits: from  -128 to 127) \\n•Short (16 bits: from  -32768 to 32767) \\n•Int (32 bits: from  -2^31 to 2^31- 1) \\n•Long (64 bits: from -2^63 to 2^63- 1)\\n\\nAll variables initialized with integer values not exceeding the maximum value of Int have the inferred type Int. If the initial value exceeds this value, then the type is Long. To specify the Long value explicitly, append the suffix L to the value.\\n",
            top="3. Data types",
            code = "val one = 1 // Int\n" +
                    "val threeBillion = 3000000000 // Long\n" +
                    "val oneLong = 1L // Long\n" +
                    "val oneByte: Byte = 1\n",
            link="https://kotlinlang.org/docs/basic-types.html#integer-types",
        ),
        Article(
            title="3.2  Floating-point types",
            des = "For real numbers, Kotlin provides floating–point types Float and Double. Floating point types differ by their decimal place, that is, how many decimal digits they can store. There are two floating–point types: \\n\\n•Float (32 bits, decimal digits: 6/-7) \\n•Double (64 bits, decimal digits: 15/-16)\\n\\nYou can initialize Double and Float variables with numbers having a fractional part. It is separated from the integer part by a period (.) For variables initialized with fractional numbers, the compiler infers the Double type.\\n",
            top="3. Data types",
            code = "val pi = 3.14 // Double\n" +
                    "// val one: Double = 1 // Error: type mismatch\n" +
                    "val oneDouble = 1.0 // Double \n" +
                    "val e = 2.7182818284 // Double\n" +
                    "val eFloat = 2.7182818284f // Float, actual value is 2.718",
            link="https://kotlinlang.org/docs/basic-types.html#floating-point-types",
        ),
        Article(
            title="3.3  Literal constants",
            des = "There are the following kinds of literal constants for integral values: \\n\\n• Decimals: 123 \\n• Hexadecimals: 0x0F \\n• Binaries: 0b00001011 \\n\\nKotlin also supports a conventional notation for floating-point numbers: \\n\\n• Doubles by default: 123.5, 123.5e10 \\n• Floats are tagged by f or F: 123.5f \\n\\nYou can use underscores to make number constants more readable:\\n",
            top="3. Data types",
            code = "val oneMillion = 1_000_000\n" +
                    "val creditCardNumber = 1234_5678_9012_3456L\n" +
                    "val socialSecurityNumber = 999_99_9999L\n" +
                    "val hexBytes = 0xFF_EC_DE_5E\n" +
                    "val bytes = 0b11010010_01101001",
            link="https://kotlinlang.org/docs/basic-types.html#literal-constants",
        ),
        Article(
            title="3.4  Numbers representation on the JVM",
            des = "On the JVM platform, numbers are stored as primitive types: int, double, and so on. Exceptions are cases when you create a nullable number reference such as Int? or use generics. In these cases numbers are boxed in Java classes Integer, Double, and so on.\\n\\nNote that nullable references to the same number can be different objects:\\n",
            top="3. Data types",
            code = "val a: Int = 100\n" +
                    "val boxedA: Int? = a\n" +
                    "val anotherBoxedA: Int? = a\n" +
                    "\n" +
                    "val b: Int = 10000\n" +
                    "val boxedB: Int? = b\n" +
                    "val anotherBoxedB: Int? = b\n" +
                    "\n" +
                    "println(boxedA === anotherBoxedA) // true\n" +
                    "println(boxedB === anotherBoxedB) // false",
            link="https://kotlinlang.org/docs/basic-types.html#numbers-representation-on-the-jvm",
        ),
        Article(
            title="3.5  Explicit conversions",
            des = "Due to different representations, smaller types are not subtypes of bigger ones. If they were, we would have troubles of the following sort, so equality would have been lost silently, not to mention identity.\\n\\nAs a consequence, smaller types are NOT implicitly converted to bigger types. This means that assigning a value of type Byte to an Int variable requires an explicit conversion. All number types support conversions to other types:\\n\\n• toByte(): Byte\\n• toShort(): Short\\n• toInt(): Int\\n• toLong(): Long\\n• toFloat(): Float\\n• toDouble(): Double\\n• toChar(): Char\\n",
            top="3. Data types",
            code = "// Hypothetical code, does not actually compile:\n" +
                    "val a: Int? = 1 // A boxed Int (java.lang.Integer)\n" +
                    "val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)\n" +
                    "print(b == a) // Surprise! This prints \"false\" as Long's equals() checks whether the other is Long as well\n",
            link="https://kotlinlang.org/docs/basic-types.html#explicit-conversions",
        ),
        Article(
            title="3.6  Operations",
            des = "Kotlin supports the standard set of arithmetical operations over numbers: +, -, *, /, %. They are declared as members of appropriate classes.\\n",
            top="3. Data types",
            code = "println(1 + 2)\n" +
                    "println(2_500_000_000L - 1L)\n" +
                    "println(3.14 * 2.71)\n" +
                    "println(10.0 / 3)",
            link="https://kotlinlang.org/docs/basic-types.html#operations",
        ),
        Article(
            title="3.7  Division of integers",
            des = "Division between integers numbers always returns an integer number. Any fractional part is discarded. This is true for a division between any two integer types.\\n\\nTo return a floating-point type, explicitly convert one of the arguments to a floating-point type.\\n",
            top="3. Data types",
            code = "val x = 5 / 2\n" +
                    "//println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'\n" +
                    "println(x == 2)\n" +
                    "val x = 5L / 2\n" +
                    "println(x == 2L)\n" +
                    "val x = 5 / 2.toDouble()\n" +
                    "println(x == 2.5)",
            link="https://kotlinlang.org/docs/basic-types.html#operations",
        ),
        Article(
            title="3.8  Bitwise operations",
            des = "Kotlin provides a set of bitwise operations on integer numbers. They operate on the binary level directly with bits of the numbers representation. Here is the complete list of bitwise operations:\\n\\n• shl(bits) – signed shift left\\n• shr(bits) – signed shift right\\n• ushr(bits) – unsigned shift right\\n• and(bits) – bitwise and\\n• or(bits) – bitwise or\\n• xor(bits) – bitwise xor\\n• inv() – bitwise inversion\\n",
            top="3. Data types",
            code = "val x = (1 shl 2) and 0x000FF000",
            link="https://kotlinlang.org/docs/basic-types.html#operations",
        ),
        Article(
            title="3.9  Floating-point numbers comparison",
            des = "The operations on floating-point numbers discussed in this section are:\\n\\n•Equality checks: a == b and a != b\\n•Comparison operators: a less than b, a more than b, a less or equal b, a more or equal b\\n•Range instantiation and range checks: a..b, x in a..b, x !in a..b\\n\\nWhen the operands a and b are statically known to be Float or Double or their nullable counterparts (the type is declared or inferred or is a result of a smart cast ), the operations on the numbers and the range that they form follow the IEEE 754 Standard for Floating-Point Arithmetic. However, to support generic use cases and provide total ordering, when the operands are not statically typed as floating point numbers (e.g. Any, Comparable, a type parameter), the operations use the equals and compareTo implementations for Float and Double, which disagree with the standard, so that:\\n\\n·NaN is considered equal to itself\\n·NaN is considered greater than any other element including POSITIVE_INFINITY\\n·-0.0 is considered less than 0.0\\n",
            top="3. Data types",
            code = "",
            link="https://kotlinlang.org/docs/basic-types.html#floating-point-numbers-comparison",
        ),
        Article(
            title="3.10 Unsigned integers",
            des = "In addition to integer types, Kotlin provides the following types for unsigned integer numbers:\\n• UByte: an unsigned 8-bit integer, ranges from 0 to 255\\n• UShort: an unsigned 16-bit integer, ranges from 0 to 65535\\n• UInt: an unsigned 32-bit integer, ranges from 0 to 2^32 - 1\\n• ULong: an unsigned 64-bit integer, ranges from 0 to 2^64 - 1\\nUnsigned types support most of the operations of their signed counterparts.",
            top="3. Data types",
            code = "",
            link="https://kotlinlang.org/docs/basic-types.html#unsigned-integers",
        ),
        Article(
            title="3.11 Booleans",
            des = "The type Boolean represents boolean objects that can have two values: true and false. Boolean has a nullable counterpart Boolean? that also has the null value.Built-in operations on booleans include:\\n\\n• || – disjunction (logical OR)\\n•  – conjunction (logical AND)\\n• !- negation (logical NOT)\\n|| and  work lazily.\\n",
            top="3. Data types",
            code = "val myTrue: Boolean = true\n" +
                    "val myFalse: Boolean = false\n" +
                    "val boolNull: Boolean? = null\n" +
                    "\n" +
                    "println(myTrue || myFalse)\n" +
                    "println(myTrue && myFalse)\n" +
                    "println(!myTrue)",
            link="https://kotlinlang.org/docs/basic-types.html#booleans",
        ),
        Article(
            title="3.12 Characters",
            des = "Characters are represented by the type Char. Character literals go in single quotes: \\'1\\'.\\n\\nSpecial characters start from an escaping backslash \\\\. The following escape sequences are supported: \\\\b, \\\\n, \\\\r, \\\\\", \\\\\\\\ and \\\\\$. To encode any other character, use the Unicode escape sequence syntax \\\\uFF00.",
            top="3. Data types",
            code = "val aChar: Char = 'a'\n" +
                    "\n" +
                    "println(aChar)\n" +
                    "println('\\n') //prints an extra newline character\n" +
                    "println('\\uFF00')",
            link="https://kotlinlang.org/docs/basic-types.html#characters",
        ),
        Article(
            title="3.13 Strings",
            des = "Strings in Kotlin are represented by the type String. Generally, a string value is a sequence of characters in double quotes (\" ).\\n\\nElements of a string are characters that you can access via the indexing operation: s[i]. You can iterate over these characters with a for loop.\\n\\nStrings are immutable. Once you initialize a string, you can not change its value or assign a new value to it. All operations that transform strings return their results in a new String object, leaving the original string unchanged.\\n\\nTo concatenate strings, use the + operator. This also works for concatenating strings with values of other types, as long as the first element in the expression is a string.\\n\\nNote that in most cases using string templates or raw strings is preferable to string concatenation.\\n",
            top="3. Data types",
            code = "val str = \"abcd 123\"\n" +
                    "val str = \"abcd\"\n" +
                    "println(str.uppercase()) // Create and print a new String object\n" +
                    "println(str) // the original string remains the same",
            link="https://kotlinlang.org/docs/basic-types.html#strings",
        ),
        Article(
            title="3.14 String literals",
            des = "Kotlin has two types of string literals:\\n• escaped strings that may contain escaped characters\\n• raw strings that can contain newlines and arbitrary text\\n\\nEscaping is done in the conventional way, with a backslash (\\ ).\\n\\nA raw string is delimited by a triple quote (\"\"\" ), contains no escaping and can contain newlines and any other characters. To remove leading whitespace from raw strings, use the trimMargin() function.\\n",
            top="3. Data types",
            code = "val s = \"Hello, world!\\n\"\n" +
                    "val text = \"\"\"\n" +
                    "    for (c in \"foo\")\n" +
                    "        print(c)\n" +
                    "\"\"\"",
            link="https://kotlinlang.org/docs/basic-types.html#string-literals",
        ),
        Article(
            title="3.15 Arrays",
            des = "Arrays in Kotlin are represented by the Array class. It has get and set functions that turn into [] by operator overloading conventions, and the size property, along with other useful member functions.\\n\\nTo create an array, use the function arrayOf() and pass the item values to it, so that arrayOf(1, 2, 3) creates an array [1, 2, 3]. Alternatively, the arrayOfNulls() function can be used to create an array of a given size filled with null elements.\\n\\nAnother option is to use the Array constructor that takes the array size and the function that returns values of array elements given its index.\\nAs we said above, the [] operation stands for calls to member functions get() and set().\\n\\nArrays in Kotlin are invariant. This means that Kotlin does not let us assign an Array with String to an Array with Any, which prevents a possible runtime failure (but you can use Array with out Any, see Type Projections ).\\n\\nKotlin also has classes that represent arrays of primitive types without boxing overhead: ByteArray, ShortArray, IntArray, and so on. These classes have no inheritance relation to the Array class, but they have the same set of methods and properties. Each of them also has a corresponding factory function.\\n",
            top="3. Data types",
            code = "// Creates an Array<String> with values [\"0\", \"1\", \"4\", \"9\", \"16\"]\n" +
                    "val asc = Array(5) { i -> (i * i).toString() }\n" +
                    "asc.forEach { println(it) }",
            link="https://kotlinlang.org/docs/basic-types.html#arrays",
        ),
        Article(
            title="4.1  If expression",
            des = "In Kotlin, if is an expression: it returns a value. Therefore, there is no ternary operator (condition ? then : else) because ordinary if works fine in this role. Branches of if branches can be blocks.\\n\\nIf you are using if as an expression, for example, for returning its value or assigning it to a variable, the else branch is mandatory.",
            top="4. Conditions and loops",
            code = "var max = a\n" +
                    "if (a < b) max = b\n" +
                    "\n" +
                    "// With else\n" +
                    "var max: Int\n" +
                    "if (a > b) {\n" +
                    "    max = a\n" +
                    "} else {\n" +
                    "    max = b\n" +
                    "}\n" +
                    "\n" +
                    "// As expression\n" +
                    "val max = if (a > b) a else b",
            link="https://kotlinlang.org/docs/control-flow.html#if-expression",
        ),
        Article(
            title="4.2  When expression",
            des = "When defines a conditional expression with multiple branches. It is similar to the switch statement in C-like languages. Its simple form looks like this. when matches its argument against all branches sequentially until some branch condition is satisfied.\\nWhen can be used either as an expression or as a statement. If it is used as an expression, the value of the first matching branch becomes the value of the overall expression. If it is used as a statement, the values of individual branches are ignored. Just like with if, each branch can be a block, and its value is the value of the last expression in the block.\\nThe else branch is evaluated if none of the other branch conditions are satisfied. If when is used as an expression, the else branch is mandatory, unless the compiler can prove that all possible cases are covered with branch conditions, for example, with enum class entries and sealed class subtypes).",
            top="4. Conditions and loops",
            code = "when (x) {\n" +
                    "    1 -> print(\"x == 1\")\n" +
                    "    2 -> print(\"x == 2\")\n" +
                    "    else -> {\n" +
                    "        print(\"x is neither 1 nor 2\")\n" +
                    "    }\n" +
                    "}",
            link="https://kotlinlang.org/docs/control-flow.html#when-expression",
        ),
        Article(
            title="4.3  For loops",
            des = "The for loop iterates through anything that provides an iterator. This is equivalent to the foreach loop in languages like C#. As mentioned before, for iterates through anything that provides an iterator. This means that it:\\n• has a member or an extension function iterator() that returns Iterator\\n• has a member or an extension function next()\\n• has a member or an extension function hasNext() that returns Boolean.\\nAll of these three functions need to be marked as operator.\\nA for loop over a range or an array is compiled to an index-based loop that does not create an iterator object.</",
            top="4. Conditions and loops",
            code = "for (item: Int in ints) {\n" +
                    "    // ...\n" +
                    "}\n" +
                    "for (i in 1..3) {\n" +
                    "    println(i)\n" +
                    "}\n" +
                    "for (i in 6 downTo 0 step 2) {\n" +
                    "    println(i)\n" +
                    "}",
            link="https://kotlinlang.org/docs/control-flow.html#for-loops",
        ),
        Article(
            title="4.4  While loops",
            des = "While and do-while loops execute their body continuously while their condition is satisfied. The difference between them is the condition checking time:\\n•  While checks the condition and, if it is satisfied, executes the body and then returns to the condition check.\\n•  Do-while executes the body and then checks the condition. If it is satisfied, the loop repeats. So, the body of do-while executes at least once regardless of the condition.",
            top="4. Conditions and loops",
            code = "while (x > 0) {\n" +
                    "    x--\n" +
                    "}\n" +
                    "\n" +
                    "do {\n" +
                    "    val y = retrieveData()\n" +
                    "} while (y != null) // y is visible here!",
            link="https://kotlinlang.org/docs/control-flow.html#while-loops",
        ),
        Article(
            title="4.5  Break and continue labels",
            des = "Any expression in Kotlin may be marked with a label. Labels have the form of an identifier followed by the @ sign, for example: abc@, fooBar@. To label an expression, just add a label in front of it. A break qualified with a label jumps to the execution point right after the loop marked with that label. A continue proceeds to the next iteration of that loop.",
            top="4. Conditions and loops",
            code = "loop@ for (i in 1..100) {\n" +
                    "    for (j in 1..100) {\n" +
                    "        if (...) break@loop\n" +
                    "    }\n" +
                    "}",
            link="https://kotlinlang.org/docs/returns.html#break-and-continue-labels",
        ),
        Article(
            title="4.6  Return at labels",
            des = "With function literals, local functions and object expressions, functions can be nested in Kotlin. Qualified return s allow us to return from an outer function. The most important use case is returning from a lambda expression.",
            top="4. Conditions and loops",
            code = "fun foo() {\n" +
                    "    listOf(1, 2, 3, 4, 5).forEach {\n" +
                    "        if (it == 3) return // non-local return directly to the caller of foo()\n" +
                    "        print(it)\n" +
                    "    }\n" +
                    "    println(\"this point is unreachable\")\n" +
                    "}",
            link="https://kotlinlang.org/docs/returns.html#return-at-labels",
        ),
        Article(
            title="5.1  Classes",
            des = "Classes in Kotlin are declared using the keyword class.\\nThe class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor, and some other things), and the class body surrounded by curly braces. Both the header and the body are optional; if the class has no body, the curly braces can be omitted.",
            top="5. Сlasses and objects",
            code = "",
            link="https://kotlinlang.org/docs/classes.html",
        ),
        Article(
            title="5.2  Inheritance",
            des = "All classes in Kotlin have a common superclass, Any, which is the default superclass for a class with no supertypes declared.\\nAny has three methods: equals(), hashCode(), and toString(). Thus, these methods are defined for all Kotlin classes.\\nBy default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword.\\nIf the derived class has a primary constructor, the base class can (and must) be initialized in that primary constructor according to its parameters.\\nIf the derived class has no primary constructor, then each secondary constructor has to initialize the base type using the super keyword or it has to delegate to another constructor which does. Note that in this case different secondary constructors can call different constructors of the base type.",
            top="5. Сlasses and objects",
            code = "class Example // Implicitly inherits from Any\n" +
                    "open class Base // Class is open for inheritance\n" +
                    "open class Base(p: Int)\n" +
                    "\n" +
                    "class Derived(p: Int) : Base(p)",
            link="https://kotlinlang.org/docs/inheritance.html",
        ),
        Article(
            title="5.3  Properties",
            des = "Properties in Kotlin classes can be declared either as mutable, using the var keyword, or as read-only, using the val keyword.",
            top="5. Сlasses and objects",
            code = "class Address {\n" +
                    "    var name: String = \"Holmes, Sherlock\"\n" +
                    "    var street: String = \"Baker\"\n" +
                    "    var city: String = \"London\"\n" +
                    "    var state: String? = null\n" +
                    "    var zip: String = \"123456\"\n" +
                    "}\n" +
                    "fun copyAddress(address: Address): Address {\n" +
                    "    val result = Address() // there's no 'new' keyword in Kotlin\n" +
                    "    result.name = address.name // accessors are called\n" +
                    "    result.street = address.street\n" +
                    "    // ...\n" +
                    "    return result\n" +
                    "}",
            link="https://kotlinlang.org/docs/properties.html",
        ),
        Article(
            title="5.4  Interfaces",
            des = "Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations. What makes them different from abstract classes is that interfaces cannot store state. They can have properties but these need to be abstract or to provide accessor implementations.\\nAn interface is defined using the keyword interface.",
            top="5. Сlasses and objects",
            code = "interface MyInterface {\n" +
                    "    fun bar()\n" +
                    "    fun foo() {\n" +
                    "      // optional body\n" +
                    "    }\n" +
                    "}",
            link="https://kotlinlang.org/docs/interfaces.html",
        ),
        Article(
            title="5.5  Functional (SAM) interfaces",
            des = "An interface with only one abstract method is called a functional interface, or a Single Abstract Method (SAM) interface. The functional interface can have several non-abstract members but only one abstract member.\\nTo declare a functional interface in Kotlin, use the fun modifier.",
            top="5. Сlasses and objects",
            code = "fun interface KRunnable {\n" +
                    "   fun invoke()\n" +
                    "}",
            link="https://kotlinlang.org/docs/fun-interfaces.html",
        ),
        Article(
            title="5.6  SAM conversions",
            des = "For functional interfaces, you can use SAM conversions that help make your code more concise and readable by using lambda expressions. Instead of creating a class that implements a functional interface manually, you can use a lambda expression. With a SAM conversion, Kotlin can convert any lambda expression whose signature matches the signature of the interface single method into the code, which dynamically instantiates the interface implementation. For example, consider the following Kotlin functional interface:",
            top="5. Сlasses and objects",
            code = "//For example, consider the following Kotlin functional interface:\\n\" +\n" +
                    "                    \"fun interface IntPredicate {\\n\" +\n" +
                    "                    \"   fun accept(i: Int): Boolean\\n\" +\n" +
                    "                    \"}\\n\" +\n" +
                    "                    \"If you don't use a SAM conversion, you will need to write code like this:\\n\" +\n" +
                    "                    \"// Creating an instance of a class\\n\" +\n" +
                    "                    \"val isEven = object : IntPredicate {\\n\" +\n" +
                    "                    \"   override fun accept(i: Int): Boolean {\\n\" +\n" +
                    "                    \"       return i % 2 == 0\\n\" +\n" +
                    "                    \"   }\\n\" +\n" +
                    "                    \"}",
            link="https://kotlinlang.org/docs/fun-interfaces.html#sam-conversions",
        ),
        Article(
            title="5.7  Functional interfaces vs. type aliases",
            des = "Functional interfaces and type aliases serve different purposes. Type aliases are just names for existing types – they don\\'t create a new type, while functional interfaces do. You can provide extensions that are specific to a particular functional interface to be inapplicable for plain functions or their type aliases. Type aliases can have only one member, while functional interfaces can have multiple non-abstract members and one abstract member. Functional interfaces can also implement and extend other interfaces. Functional interfaces are more flexible and provide more capabilities than type aliases, but they can be more costly both syntactically and at runtime because they can require conversions to a specific interface. When you choose which one to use in your code, consider your needs:\\n• If your API needs to accept a function (any function) with some specific parameter and return types – use a simple functional type or define a type alias to give a shorter name to the corresponding functional type.\\n• If your API accepts a more complex entity than a function – for example, it has non-trivial contracts and/or operations on it that can\\'t be expressed in a functional type\\'s signature – declare a separate functional interface for it.",
            top="5. Сlasses and objects",
            code = "",
            link="https://kotlinlang.org/docs/fun-interfaces.html#functional-interfaces-vs-type-aliasess",
        ),
        Article(
            title="5.8  Visibility modifiers",
            des = "Classes, objects, interfaces, constructors, functions, properties and their setters can have visibility modifiers. Getters always have the same visibility as the property. There are four visibility modifiers in Kotlin:\\n•  private (it means visible inside this class only (including all its members)) \\n• protected (is the same as private but is also visible in subclasses)\\n• internal (it means that any client inside this module who sees the declaring class sees its internal members)\\n• public (it means that any client who sees the declaring class sees its public members) is the default visibility is public. \\nFunctions, properties and classes, objects and interfaces can be declared at the \"top-level\" directly inside a package:\\n•  If you do not specify any visibility modifier, public is used by default, which means that your declarations will be visible everywhere\\n•  If you mark a declaration private, it will only be visible inside the file containing the declaration\\n•  If you mark it internal, it is visible everywhere in the same module\\n•  protected is not available for top-level declarations.",
            top="5. Сlasses and objects",
            code = "// file name: example.kt\n" +
                    "package foo\n" +
                    "\n" +
                    "private fun foo() { ... } // visible inside example.kt\n" +
                    "\n" +
                    "public var bar: Int = 5 // property is visible everywhere\n" +
                    "    private set         // setter is visible only in example.kt\n" +
                    "\n" +
                    "internal val baz = 6    // visible inside the same module",
            link="https://kotlinlang.org/docs/visibility-modifiers.html",
        ),
        Article(
            title="5.9  Extensions",
            des = "Kotlin provides the ability to extend a class with new functionality without having to inherit from the class or use design patterns such as Decorator. This is done via special declarations called extensions.\\nFor example, you can write new functions for a class from a third-party library that you can\\'t modify. Such functions can be called in the usual way, as if they were methods of the original class. This mechanism is called an extension function. There are also extension properties that let you define new properties for existing classes. To declare an extension function, prefix its name with a receiver type, which refers to the type being extended:",
            top="5. Сlasses and objects",
            code = "fun MutableList<Int>.swap(index1: Int, index2: Int) {\n" +
                    "    val tmp = this[index1] // 'this' corresponds to the list\n" +
                    "    this[index1] = this[index2]\n" +
                    "    this[index2] = tmp\n" +
                    "}\n" +
                    "val list = mutableListOf(1, 2, 3)\n" +
                    "list.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'list'",
            link="https://kotlinlang.org/docs/extensions.html",
        ),
        Article(
            title="5.10 Data classes",
            des = "It is not unusual to create classes whose main purpose is to hold data. In such classes, some standard functionality and some utility functions are often mechanically derivable from the data. In Kotlin, these are called data classes and are marked with data.\\nThe compiler automatically derives the following members from all properties declared in the primary constructor:\\n•equals()/ hashCode() pair\\n•toString() of the form \"User(name=John, age=42)\"\\n•componentN() functions corresponding to the properties in their order of declaration.\\n•copy() function (see below).\\nTo ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:\\n•The primary constructor needs to have at least one parameter.\\n•All primary constructor parameters need to be marked as val or var.\\n•Data classes cannot be abstract, open, sealed or inner.\\nAdditionally, the members generation follows these rules with regard to the members inheritance:\\n•If there are explicit implementations of equals(), hashCode() or toString() in the data class body or final implementations in a superclass, then these functions are not generated, and the existing implementations are used.\\n•If a supertype has the componentN() functions that are open and return compatible types, the corresponding functions are generated for the data class and override those of the supertype. If the functions of the supertype cannot be overridden due to incompatible signatures or being final, an error is reported.\\nProviding explicit implementations for the componentN() and copy() functions is not allowed. Data classes may extend other classes (see Sealed classes for examples).",
            top="5. Classes and objects",
            code = "data class Person(val name: String) {\n" +
                    "    var age: Int = 0\n" +
                    "}\n" +
                    "val jane = User(\"Jane\", 35)\n" +
                    "val (name, age) = jane\n" +
                    "println(\"\$name, \$age years of age\") // prints \"Jane, 35 years of age\"",
            link="https://kotlinlang.org/docs/data-classes.html",
        ),
        Article(
            title="5.11 Sealed classes",
            des = "Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance. All subclasses of a sealed class are known at compile time. No other subclasses may appear after a module with the sealed class is compiled. For example, third-party clients can\\'t extend your sealed class in their code. Thus, each instance of a sealed class has a type from a limited set that is known when this class is compiled.\\nThe same works for sealed interfaces and their implementations: once a module with a sealed interface is compiled, no new implementations can appear.\\nIn some sense, sealed classes are similar to enum classes: the set of values for an enum type is also restricted, but each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple instances, each with its own state.",
            top="5. Сlasses and objects",
            code = "sealed interface Error\n" +
                    "\n" +
                    "sealed class IOError(): Error\n" +
                    "\n" +
                    "class FileReadError(val f: File): IOError()\n" +
                    "class DatabaseError(val source: DataSource): IOError()\n" +
                    "\n" +
                    "object RuntimeError : Error",
            link="https://kotlinlang.org/docs/sealed-classes.html",
        ),
        Article(
            title="5.12 Enum classes",
            des = "The most basic use case for enum classes is the implementation of type-safe enums.\\nEach enum constant is an object. Enum constants are separated by commas. Since each enum is an instance of the enum class, it can be initialized. An enum class can implement an interface (but it cannot derive from a class), providing either a common implementation of interface members for all of the entries, or separate implementations for each entry within its anonymous class. This is done by adding the interfaces you want to implement to the enum class declaration. ",
            top="5. Сlasses and objects",
            code = "enum class Color(val rgb: Int) {\n" +
                    "    RED(0xFF0000),\n" +
                    "    GREEN(0x00FF00),\n" +
                    "    BLUE(0x0000FF)\n" +
                    "}",
            link="https://kotlinlang.org/docs/enum-classes.html",
        ),
        Article(
            title="6.1  Functions",
            des = "Functions in Kotlin are declared using the fun keyword:",
            top="6. Functions",
            code = "fun double(x: Int): Int {\n" +
                    "    return 2 * x\n" +
                    "}",
            link="https://kotlinlang.org/docs/functions.html",
        ),
        Article(
            title="6.2  Parameters",
            des = "Function parameters are defined using Pascal notation - name: type. Parameters are separated using commas. Each parameter must be explicitly typed:",
            top="6. Functions",
            code = "fun powerOf(number: Int, exponent: Int): Int { /*...*/ }\n" +
                    "fun powerOf(\n" +
                    "    number: Int,\n" +
                    "    exponent: Int, // trailing comma\n" +
                    ") { /*...*/ }",
            link="https://kotlinlang.org/docs/functions.html#parameters",
        ),
        Article(
            title="6.3  Default arguments",
            des = "Function parameters can have default values, which are used when you skip the corresponding argument.\\nOverriding methods always use the same default parameter values as the base method. When overriding a method with default parameter values, the default parameter values must be omitted from the signature. If a default parameter precedes a parameter with no default value, the default value can only be used by calling the function with named arguments.",
            top="6. Functions",
            code = "fun read(\n" +
                    "    b: ByteArray,\n" +
                    "    off: Int = 0,\n" +
                    "    len: Int = b.size,\n" +
                    ") { /*...*/ }",
            link="https://kotlinlang.org/docs/functions.html#default-arguments",
        ),
        Article(
            title="6.4  Named arguments",
            des = "When calling a function, you can name one or more of its arguments. This may be helpful when a function has a large number of arguments, and it\\'s difficult to associate a value with an argument, especially if it\\'s a boolean or null value.\\nWhen you use named arguments in a function call, you can freely change the order they are listed in, and if you want to use their default values you can just leave them out altogether. Consider the following function reformat() that has 4 arguments with default values.",
            top="6. Functions",
            code = "fun reformat(\n" +
                    "    str: String,\n" +
                    "    normalizeCase: Boolean = true,\n" +
                    "    upperCaseFirstLetter: Boolean = true,\n" +
                    "    divideByCamelHumps: Boolean = false,\n" +
                    "    wordSeparator: Char = ' ',\n" +
                    ") { /*...*/ }\n" +
                    "reformat(\n" +
                    "    \"String!\",\n" +
                    "    false,\n" +
                    "    upperCaseFirstLetter = false,\n" +
                    "    divideByCamelHumps = true,\n" +
                    "    '_'\n" +
                    ")",
            link="https://kotlinlang.org/docs/functions.html#named-arguments",
        ),
        Article(
            title="6.5  Unit-returning functions",
            des = "If a function does not return any useful value, its return type is Unit. Unit is a type with only one value - Unit. This value does not have to be returned explicitly:",
            top="6. Functions",
            code = "fun printHello(name: String?): Unit {\n" +
                    "    if (name != null)\n" +
                    "        println(\"Hello \$name\")\n" +
                    "    else\n" +
                    "        println(\"Hi there!\")\n" +
                    "    // `return Unit` or `return` is optional\n" +
                    "}",
            link="https://kotlinlang.org/docs/functions.html#unit-returning-functions",
        ),
        Article(
            title="6.6  Single-expression functions",
            des = "When a function returns a single expression, the curly braces can be omitted and the body is specified after a = symbol:</",
            top="6. Functions",
            code = "fun double(x: Int): Int = x * 2",
            link="https://kotlinlang.org/docs/functions.html#single-expression-functions",
        ),
        Article(
            title="6.7  Explicit return types",
            des = "Functions with block body must always specify return types explicitly, unless it\\'s intended for them to return Unit, in which case it is optional. Kotlin does not infer return types for functions with block bodies because such functions may have complex control flow in the body, and the return type will be non-obvious to the reader (and sometimes even for the compiler).",
            top="6. Functions",
            code = "",
            link="https://kotlinlang.org/docs/functions.html#explicit-return-types",
        ),
        Article(
            title="6.8  Variable number of arguments (Varargs)",
            des = "<![CDATA[You can mark a parameter of a function (usually the last one) with the vararg modifier. Inside a function a vararg -parameter of type T is visible as an array of T, i.e. the ts variable in the example above has type Array<out T>. Only one parameter can be marked as vararg. If a vararg parameter is not the last one in the list, values for the following parameters can be passed using the named argument syntax, or, if the parameter has a function type, by passing a lambda outside parentheses. When you call a vararg -function, you can pass arguments one-by-one, for example asList(1, 2, 3). If you already have an array and want to pass its contents to the function, use the spread operator (prefix the array with * ):]]>",
            top="6. Functions",
            code = "fun <T> asList(vararg ts: T): List<T> {\n" +
                    "    val result = ArrayList<T>()\n" +
                    "    for (t in ts) // ts is an Array\n" +
                    "        result.add(t)\n" +
                    "    return result\n" +
                    "}\n" +
                    "val list = asList(1, 2, 3)",
            link="https://kotlinlang.org/docs/functions.html#explicit-return-types",
        ),
        Article(
            title="6.9  Infix notation",
            des = "<![CDATA[Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must meet the following requirements:\\n•They must be member functions or extension functions.\\n•They must have a single parameter.\\n•The parameter must not accept variable number of arguments and must have no default value.\\nInfix function calls have lower precedence than the arithmetic operators, type casts, and the rangeTo operator. The following expressions are equivalent:\\n•1 shl 2 + 3 is equivalent to 1 shl (2 + 3)\\n•0 until n * 2 is equivalent to 0 until (n * 2)\\n•xs union ys as Set<*> is equivalent to xs union (ys as Set<*>)\\nOn the other hand, infix function call\\'s precedence is higher than that of the boolean operators && and ||, is- and in -checks, and some other operators. These expressions are equivalent as well:\\n•a && b xor c is equivalent to a && (b xor c)\\n•a xor b in c is equivalent to (a xor b) in c.]]>",
            top="6. Functions",
            code = "infix fun Int.shl(x: Int): Int { ... }\n" +
                    "\n" +
                    "// calling the function using the infix notation\n" +
                    "1 shl 2\n" +
                    "\n" +
                    "// is the same as\n" +
                    "1.shl(2)\n",
            link="https://kotlinlang.org/docs/functions.html#infix-notation",
        ),
        Article(
            title="6.10 Local functions",
            des = "Kotlin supports local functions, which are functions inside another function.\\nA local function can access local variables of outer functions (the closure). In the case above, the visited can be a local variable.",
            top="6. Functions",
            code = "fun dfs(graph: Graph) {\n" +
                    "    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {\n" +
                    "        if (!visited.add(current)) return\n" +
                    "        for (v in current.neighbors)\n" +
                    "            dfs(v, visited)\n" +
                    "    }\n" +
                    "\n" +
                    "    dfs(graph.vertices[0], HashSet())\n" +
                    "}",
            link="https://kotlinlang.org/docs/functions.html#local-functions",
        ),
        Article(
            title="6.11 Generic functions",
            des = "A member function is a function that is defined inside a class or object:",
            top="6. Functions",
            code = "class Box<T>(t: T) {\n" +
                    "    var value = t\n" +
                    "}",
            link="https://kotlinlang.org/docs/generics.html",
        ),
        Article(
            title="6.12 Tail recursive functions",
            des = "Kotlin supports a style of functional programming known as tail recursion. For some algorithms that would normally use loops you can use a recursive function instead without a risk of stack overflow. When a function is marked with the tailrec modifier and meets the required form, the compiler optimizes out the recursion, leaving behind a fast and efficient loop based version instead.\\nTo be eligible for the tailrec modifier, a function must call itself as the last operation it performs. You cannot use tail recursion when there is more code after the recursive call, and you cannot use it within try/ catch/ finally blocks. Currently, tail recursion is supported by Kotlin for JVM and Kotlin/Native.",
            top="6. Functions",
            code = "val eps = 1E-10 // \"good enough\", could be 10^-15\n" +
                    "\n" +
                    "tailrec fun findFixPoint(x: Double = 1.0): Double =\n" +
                    "    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))\n",
            link="https://kotlinlang.org/docs/functions.html#tail-recursive-functions",
        )
    )
}