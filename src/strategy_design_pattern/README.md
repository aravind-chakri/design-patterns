# Strategy Design Pattern

## Category
**Behavioral Pattern**

## Intent
Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Problem
You have multiple ways to perform an operation, and you want to switch between them at runtime. Using inheritance or conditionals leads to:
- Code duplication
- Difficult to add new algorithms
- Violates Open/Closed Principle
- Tight coupling

## Solution
Extract algorithms into separate classes that implement a common interface. The context delegates the work to one of these strategy objects instead of implementing multiple versions itself.

## Structure

```
┌─────────────┐
│   Context   │
│             │◆───────▶ ┌──────────────┐
│  strategy   │          │  <<interface>>│
└─────────────┘          │   Strategy   │
                         └──────────────┘
                                △
                     ┌──────────┼──────────┐
                     │          │          │
              ┌─────────┐ ┌─────────┐ ┌─────────┐
              │Strategy │ │Strategy │ │Strategy │
              │   A     │ │   B     │ │   C     │
              └─────────┘ └─────────┘ └─────────┘
```

## Implementation

```java
// Strategy interface
public interface FlyingBehaviour {
    void fly();
}

// Concrete strategies
public class FlyWithWings implements FlyingBehaviour {
    public void fly() {
        System.out.println("Flying with wings!");
    }
}

public class FlyNoWay implements FlyingBehaviour {
    public void fly() {
        System.out.println("Can't fly!");
    }
}

// Context
public abstract class Duck {
    protected FlyingBehaviour flyingBehaviour;
    
    public void performFly() {
        flyingBehaviour.fly();
    }
    
    public void setFlyingBehaviour(FlyingBehaviour fb) {
        this.flyingBehaviour = fb;
    }
}

// Concrete context
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyingBehaviour = new FlyWithWings();
    }
}
```

## When to Use
- Many related classes differ only in behavior
- You need different variants of an algorithm
- Algorithm uses data that clients shouldn't know about
- Class defines many behaviors as multiple conditional statements

## Benefits
✅ Open/Closed Principle - can add strategies without changing context  
✅ Runtime switching between algorithms  
✅ Isolates algorithm implementation from code that uses it  
✅ Eliminates conditional statements  
✅ Composition over inheritance  

## Drawbacks
❌ Clients must be aware of different strategies  
❌ Increased number of objects  
❌ Communication overhead between strategy and context  

## Real-World Examples
- **Sorting algorithms** - QuickSort, MergeSort, BubbleSort
- **Payment methods** - CreditCard, PayPal, Bitcoin
- **Compression** - ZIP, RAR, TAR
- **Route calculation** - Shortest, Fastest, Scenic
- Java's `Comparator` interface
- `java.util.Collections.sort()` with Comparator

## Design Principles
1. **Identify aspects that vary** and separate from what stays the same
2. **Program to an interface**, not an implementation
3. **Favor composition** over inheritance

## Related Patterns
- **State** - Similar structure but different intent (State changes behavior based on internal state)
- **Template Method** - Defines skeleton in superclass; Strategy changes entire algorithm
- **Decorator** - Changes object's skin; Strategy changes its guts

## Code Location
- Problem: `src/strategy_design_pattern/problem/`
- Solution: `src/strategy_design_pattern/solution/`
- Demo: `StrategyDemo.java`

## How to Run
```bash
javac src/strategy_design_pattern/solution/StrategyDemo.java
java strategy_design_pattern.solution.StrategyDemo
```

## Key Takeaways
- Encapsulate what varies
- Favor composition over inheritance
- Program to interfaces, not implementations
- Enables runtime behavior changes
