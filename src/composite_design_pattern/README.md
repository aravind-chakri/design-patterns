# Composite Design Pattern

## Category: Structural Pattern

## Intent
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions uniformly.

## Problem
Need to represent tree structures. Want to treat individual objects and groups uniformly without checking types.

## Solution
Define common interface for both simple and complex objects. Complex objects (composites) can contain simple objects (leafs) or other composites.

## When to Use
- Represent part-whole hierarchies
- Want clients to ignore difference between compositions and individual objects
- Tree structure representation

## Benefits
✅ Uniform treatment of individual and composite objects  
✅ Easy to add new component types  
✅ Simplifies client code  
✅ Recursive composition  

## Real-World Examples
- File systems (files and directories)
- GUI component hierarchies
- Organization structures
- `java.awt.Container` (add Component)

## Code Location
`src/composite_design_pattern/`
