# Factory Method Design Pattern

## Category
**Creational Pattern**

## Intent
Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Problem
Creating objects directly using `new` operator leads to tight coupling. Adding new product types requires modifying existing code.

## Solution
Define an abstract method (factory method) for creating objects. Subclasses override this method to create specific types.

## Structure
- **Product**: Interface for objects factory method creates
- **ConcreteProduct**: Implements Product interface
- **Creator**: Declares factory method
- **ConcreteCreator**: Overrides factory method to create ConcreteProduct

## When to Use
- Class can't anticipate type of objects to create
- Class wants subclasses to specify objects to create
- Classes delegate responsibility to helper subclasses

## Benefits
✅ Eliminates tight coupling  
✅ Single Responsibility Principle  
✅ Open/Closed Principle  
✅ More flexible than direct instantiation  

## Drawbacks
❌ Code can become complicated  
❌ Requires subclassing  

## Real-World Examples
- `java.util.Calendar.getInstance()`
- `java.text.NumberFormat.getInstance()`
- `javax.xml.parsers.DocumentBuilderFactory`

## Code Location
- Problem: `src/factory_method_design_pattern/problem/`
- Solution: `src/factory_method_design_pattern/solution/`
- Demo: `FactoryMethodDemo.java`
