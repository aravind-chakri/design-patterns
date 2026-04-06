# Builder Design Pattern

## Category: Creational Pattern

## Intent
Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## Problem
Constructors with many parameters (telescoping constructor) are hard to use and maintain.

## Solution
Use builder object to construct complex object step by step. Builder provides fluent interface.

## When to Use
- Object construction is complex
- Many constructor parameters (especially optional ones)
- Need immutable objects
- Object creation requires multiple steps

## Benefits
✅ Fluent interface  
✅ Immutable objects  
✅ Clear object construction  
✅ Avoids telescoping constructors  

## Real-World Examples
- `StringBuilder` and `StringBuffer`
- `java.util.Calendar.Builder`
- `java.util.stream.Stream.Builder`
- Lombok's `@Builder`

## Code Location
`src/builder_design_pattern/`
