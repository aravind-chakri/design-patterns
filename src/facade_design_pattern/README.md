# Facade Design Pattern

## Category: Structural Pattern

## Intent
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

## Problem
Complex subsystems with many classes are difficult to use. Clients need to know many classes and their interactions.

## Solution
Create a facade class that provides simple methods that delegate to subsystem classes.

## When to Use
- Provide simple interface to complex subsystem
- Layer your subsystems
- Decouple subsystem from clients

## Benefits
✅ Simplifies interface  
✅ Decouples client from subsystem  
✅ Promotes weak coupling  
✅ Easier to use, understand, test  

## Real-World Examples
- `javax.faces.context.FacesContext`
- Computer startup (facade over complex CPU, memory, HDD operations)
- Home theater system

## Code Location
`src/facade_design_pattern/`
