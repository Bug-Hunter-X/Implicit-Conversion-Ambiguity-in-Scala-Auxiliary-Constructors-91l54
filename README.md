# Implicit Conversion Ambiguity in Scala Auxiliary Constructors

This example demonstrates a subtle bug that can occur in Scala when using auxiliary constructors and implicit conversions. The core issue lies in the ambiguity that can arise when implicit conversions are available for multiple parameter types in an auxiliary constructor.

## The Bug
The `MyClass` class has an auxiliary constructor that initializes `x` to 0. However, if an implicit conversion exists that could transform a different type into an `Int`, the compiler may fail to determine the appropriate conversion.