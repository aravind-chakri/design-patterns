# Adapter Design Pattern

## Category: Structural Pattern

## Intent
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Problem
Need to use an existing class but its interface doesn't match what you need. Rewriting the class or client code isn't feasible.

## Solution
Create an adapter class that wraps the incompatible class and implements the expected interface.

## When to Use
- Use existing class with incompatible interface
- Create reusable class that cooperates with unrelated classes
- Need to use several existing subclasses but impractical to adapt by subclassing

## Benefits
✅ Single Responsibility - separate interface conversion  
✅ Open/Closed Principle - introduce new adapters without breaking code  
✅ Integrates legacy code with new code  

## Real-World Examples
- `java.io.InputStreamReader` (adapts InputStream to Reader)
- `java.io.OutputStreamWriter`
- `java.util.Arrays.asList()`

## Code Location
`src/adapter_design_pattern/`
