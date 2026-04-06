# Template Method Design Pattern

## Category: Behavioral Pattern

## Intent
Define the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps without changing the algorithm's structure.

## Problem
Multiple classes have similar algorithms with slight variations. Code duplication exists across similar algorithms.

## Solution
Define algorithm skeleton in base class with abstract/hook methods that subclasses implement.

## When to Use
- Common behavior among subclasses should be factored out
- Control subclass extensions
- Implement invariant parts once

## Benefits
✅ Eliminates code duplication  
✅ Controls extension points  
✅ Hollywood Principle: "Don't call us, we'll call you"  

## Real-World Examples
- `java.io.InputStream` (read methods)
- `javax.servlet.http.HttpServlet` (doGet, doPost)
- Spring JdbcTemplate

## Code Location
`src/template_method_design_pattern/`
