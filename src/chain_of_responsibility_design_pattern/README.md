# Chain of Responsibility Design Pattern

## Category: Behavioral Pattern

## Intent
Avoid coupling sender of request to receiver by giving more than one object a chance to handle request. Chain receiving objects and pass request along until an object handles it.

## Problem
Need to process requests without coupling sender to specific receiver. Multiple objects may handle request but sender doesn't know which one.

## Solution
Create chain of handler objects. Each handler decides whether to process request or pass it to next handler in chain.

## When to Use
- More than one object may handle request
- Don't want to specify receiver explicitly
- Set of objects determined dynamically
- Want to issue request to several objects without specifying receiver

## Benefits
✅ Decouples sender from receiver  
✅ Easy to add/remove responsibilities  
✅ Flexible chain configuration  
✅ Single Responsibility Principle  

## Real-World Examples
- Event handling in GUI frameworks
- Logging frameworks (handlers chain)
- Exception handling
- Servlet filters in Java EE

## Code Location
`src/chain_of_responsibility_design_pattern/`
