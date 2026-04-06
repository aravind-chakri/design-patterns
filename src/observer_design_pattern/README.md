# Observer Design Pattern

## Category
**Behavioral Pattern**

## Intent
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Also Known As
- Publish-Subscribe
- Dependents

## Problem
You need to notify multiple objects when an object's state changes, but you don't want tight coupling between the subject and observers. Hard-coding notifications leads to:
- Tight coupling
- Difficult to add/remove observers
- Subject must know all observers
- Not reusable

## Solution
Define a subscription mechanism that lets multiple objects subscribe to events from a subject object. The subject maintains a list of observers and notifies them automatically of state changes.

## Structure

```
┌───────────────┐         ┌──────────────┐
│   Subject     │◆───────▶│  Observer    │
│               │         │              │
│ +attach()     │         │ +update()    │
│ +detach()     │         └──────────────┘
│ +notify()     │                △
└───────────────┘                │
        △                        │
        │                        │
┌───────────────┐         ┌──────────────┐
│ConcreteSubject│         │ConcreteObserv│
│               │         │              │
│ +getState()   │         │ +update()    │
│ +setState()   │         └──────────────┘
└───────────────┘
```

## Implementation

```java
// Subject interface
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

// Observer interface
public interface Observer {
    void update(float temp, float humidity, float pressure);
}

// Concrete Subject
public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}

// Concrete Observer
public class CurrentConditionDisplay implements Observer {
    private float temperature;
    private float humidity;
    
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("Current: " + temperature + "°F, " + humidity + "% humidity");
    }
}
```

## When to Use
- Changes to one object require changing others (unknown number)
- Object should notify others without knowing who they are
- Loose coupling between subject and observers needed

## Benefits
✅ Loose coupling between subject and observers  
✅ Dynamic relationships - add/remove observers at runtime  
✅ Subject and observers can vary independently  
✅ Supports broadcast communication  
✅ Open/Closed Principle  

## Drawbacks
❌ Observers notified in random order  
❌ Memory leaks if observers aren't properly removed  
❌ Can cause performance issues with many observers  
❌ Unexpected updates  

## Real-World Examples
- **Event handling systems** - GUI frameworks (Swing, JavaFX)
- **Model-View-Controller (MVC)** - Model notifies views
- **RSS feeds** - Subscribers get notified of new content
- **Stock market** - Investors notified of price changes
- Java's `java.util.Observer` and `Observable`
- Event listeners in GUI frameworks

## Types
1. **Push Model** - Subject pushes data to observers
2. **Pull Model** - Observers pull data from subject

## Related Patterns
- **Mediator** - Encapsulates complex communications
- **Singleton** - Subject is often a singleton
- **MVC** - Observer is part of MVC

## Code Location
- Problem: `src/observer_design_pattern/problem/`
- Solution: `src/observer_design_pattern/solution/`
- Demo: `WeatherStation.java`

## How to Run
```bash
javac src/observer_design_pattern/solution/WeatherStation.java
java observer_design_pattern.solution.WeatherStation
```

## Key Takeaways
- Strive for loosely coupled designs
- One-to-many dependency
- Automatic notification of state changes
- Push or pull models available
