# State Design Pattern

## Category: Behavioral Pattern

## Intent
Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Problem
Object behavior depends on state. Large conditional statements based on state make code hard to maintain.

## Solution
Encapsulate state-specific behavior in separate state classes. Context delegates to current state object.

## When to Use
- Object behavior depends on state
- Large conditional statements based on state
- State transitions are explicit

## Benefits
✅ Eliminates large conditionals  
✅ Each state encapsulated in class  
✅ Easy to add new states  
✅ Single Responsibility Principle  

## Real-World Examples
- Vending machines
- TCP connection states
- Document workflow systems
- Game character states

## Code Location
`src/state_design_pattern/`
