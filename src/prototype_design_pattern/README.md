# Prototype Design Pattern

## Category: Creational Pattern

## Intent
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

## Problem
Object creation is expensive (time/resources). Creating many similar objects from scratch is inefficient.

## Solution
Clone existing objects (prototypes) instead of creating new ones from scratch. Object implements clone method.

## When to Use
- Object creation is expensive
- Avoid subclasses just to create objects
- Need to create objects dynamically
- Classes to instantiate specified at runtime

## Benefits
✅ Avoids expensive creation  
✅ Reduces subclasses  
✅ Dynamic object creation  
✅ Hides complexity of creating new instances  

## Drawbacks
❌ Cloning complex objects with circular references is tricky  
❌ Each subclass must implement clone  

## Real-World Examples
- `Object.clone()` in Java
- Copy/Paste functionality
- Database connection pool
- Object caching

## Code Location
`src/prototype_design_pattern/`
