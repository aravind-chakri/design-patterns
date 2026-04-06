# Abstract Factory Design Pattern

## Category: Creational Pattern

## Intent
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Problem
Need to create families of related objects without depending on concrete classes. Want to ensure objects from same family are used together.

## Solution
Define abstract factory interface with methods for creating each type of product. Concrete factories implement interface to create specific product families.

## When to Use
- System should be independent of how products are created
- System should be configured with multiple families of products
- Family of related products designed to be used together
- Want to provide class library of products exposing only interfaces

## Benefits
✅ Isolates concrete classes  
✅ Makes exchanging product families easy  
✅ Promotes consistency among products  
✅ Open/Closed Principle  

## Real-World Examples
- UI toolkits (Windows, Mac, Linux themes)
- Database access layers (MySQL, PostgreSQL, Oracle)
- `javax.xml.parsers.DocumentBuilderFactory`

## Code Location
`src/abstract_factory_design_pattern/`
