# Singleton Design Pattern

## Category
**Creational Pattern**

## Intent
Ensure a class has only one instance and provide a global point of access to it.

## Problem
Sometimes you need exactly one instance of a class (e.g., database connection, logger, configuration manager). Creating multiple instances wastes resources and can cause inconsistent state.

## Solution
Make the class responsible for keeping track of its sole instance. The class ensures no other instance can be created and provides a way to access the instance.

## Implementation Approaches

### 1. Eager Initialization
```java
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {}
    
    public static EagerSingleton getInstance() {
        return instance;
    }
}
```
- ✅ Thread-safe
- ❌ Creates instance even if never used

### 2. Lazy Initialization
```java
public class LazySingleton {
    private static LazySingleton instance;
    
    private LazySingleton() {}
    
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```
- ✅ Creates instance only when needed
- ❌ Not thread-safe

### 3. Thread-Safe (Synchronized)
```java
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton() {}
    
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
```
- ✅ Thread-safe
- ❌ Performance overhead (synchronized every time)

### 4. Double-Checked Locking (Recommended)
```java
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;
    
    private DoubleCheckedLockingSingleton() {}
    
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
```
- ✅ Thread-safe
- ✅ Lazy initialization
- ✅ Good performance

### 5. Bill Pugh (Best for most cases)
```java
public class BillPughSingleton {
    private BillPughSingleton() {}
    
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
```
- ✅ Thread-safe without synchronization
- ✅ Lazy initialization
- ✅ Best performance

### 6. Enum (Most robust)
```java
public enum EnumSingleton {
    INSTANCE;
    
    public void doSomething() {
        // ...
    }
}
```
- ✅ Thread-safe
- ✅ Protects against reflection attacks
- ✅ Protects against serialization issues

## When to Use
- Database connections
- Logger instances
- Configuration managers
- Thread pools
- Cache
- File managers

## Benefits
✅ Controlled access to sole instance  
✅ Reduced namespace pollution  
✅ Permits refinement of operations and representation  
✅ Permits variable number of instances (can be modified)  
✅ More flexible than class operations  

## Drawbacks
❌ Difficult to unit test (global state)  
❌ Violates Single Responsibility Principle  
❌ Can hide poor design  
❌ Requires special handling in multithreaded environments  

## Real-World Examples
- `java.lang.Runtime` - JVM runtime environment
- `java.awt.Desktop` - Desktop integration
- Spring Framework beans (default scope is singleton)
- Loggers in logging frameworks

## Related Patterns
- **Abstract Factory, Builder, Prototype** can use Singleton
- **Facade** often implemented as Singleton
- **State** objects often implemented as Singleton

## Code Location
- Problem: `src/singleton_design_pattern/problem/`
- Solution: `src/singleton_design_pattern/solution/`
- Demo: `SingletonDemo.java`

## How to Run
```bash
javac src/singleton_design_pattern/solution/SingletonDemo.java
java singleton_design_pattern.solution.SingletonDemo
```
