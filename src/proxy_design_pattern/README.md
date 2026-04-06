# Proxy Design Pattern

## Category: Structural Pattern

## Intent
Provide a surrogate or placeholder for another object to control access to it.

## Problem
Need to control access to an object. Object creation is expensive or access needs restrictions.

## Solution
Create proxy object that controls access to real object. Proxy implements same interface as real object.

## Types
- **Virtual Proxy**: Lazy initialization of expensive objects
- **Protection Proxy**: Access control
- **Remote Proxy**: Represents object in different address space
- **Smart Proxy**: Additional functionality (reference counting, logging)

## When to Use
- Expensive object creation (virtual proxy)
- Access control needed (protection proxy)
- Remote object access (remote proxy)
- Add functionality without modifying object

## Benefits
✅ Controls access to object  
✅ Lazy initialization  
✅ Logging and monitoring  
✅ Caching  

## Real-World Examples
- `java.lang.reflect.Proxy`
- Hibernate lazy loading
- Spring AOP proxies
- Image loading placeholders

## Code Location
`src/proxy_design_pattern/`
