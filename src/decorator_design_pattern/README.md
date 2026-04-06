# Decorator Design Pattern

## Category
**Structural Pattern**

## Intent
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Problem
Need to add behavior to individual objects without affecting other objects. Inheritance creates static behavior and class explosion.

## Solution
Wrap objects in decorator objects that add new behavior. Decorators implement same interface as wrapped object.

## Structure
- **Component**: Interface for objects
- **ConcreteComponent**: Object to add behavior to
- **Decorator**: Maintains reference to Component
- **ConcreteDecorator**: Adds responsibilities

## When to Use
- Add responsibilities to objects dynamically
- Responsibilities can be withdrawn
- Extension by subclassing is impractical

## Benefits
✅ More flexible than static inheritance  
✅ Avoids feature-laden classes  
✅ Add/remove responsibilities at runtime  
✅ Combine several decorators  

## Drawbacks
❌ Many small objects  
❌ Complexity in instantiation  
❌ Hard to remove specific decorator from stack  

## Real-World Examples
- Java I/O streams (`BufferedReader`, `FileReader`)
- `java.util.Collections.synchronizedList()`
- GUI component decorators (scroll bars, borders)

## Code Location
- Problem: `src/decorator_design_pattern/problem/`
- Solution: `src/decorator_design_pattern/solution/`
- Demo: `OrderDemo.java`
