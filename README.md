# Design Patterns in Java

A comprehensive collection of **17 Design Patterns** implemented in Java, demonstrating both problems and solutions with clear examples.

## 📚 Table of Contents

- [About](#about)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Project Structure](#project-structure)
- [How to Use](#how-to-use)
- [Pattern Categories](#pattern-categories)

## About

This project provides educational implementations of classic design patterns. Each pattern includes:
- **Problem demonstration** - Shows issues without the pattern
- **Solution implementation** - Clean pattern implementation
- **Demo application** - Working examples
- **Documentation** - Detailed README explaining the pattern

## Design Patterns Implemented

### Creational Patterns (5)
1. [Singleton Pattern](src/singleton_design_pattern/README.md) - Ensure a class has only one instance
2. [Factory Method Pattern](src/factory_method_design_pattern/README.md) - Define interface for object creation
3. [Abstract Factory Pattern](src/abstract_factory_design_pattern/README.md) - Create families of related objects
4. [Builder Pattern](src/builder_design_pattern/README.md) - Construct complex objects step by step
5. [Prototype Pattern](src/prototype_design_pattern/README.md) - Clone objects instead of creating new ones

### Structural Patterns (6)
6. [Adapter Pattern](src/adapter_design_pattern/README.md) - Make incompatible interfaces work together
7. [Decorator Pattern](src/decorator_design_pattern/README.md) - Add behavior to objects dynamically
8. [Facade Pattern](src/facade_design_pattern/README.md) - Provide simplified interface to complex subsystem
9. [Proxy Pattern](src/proxy_design_pattern/README.md) - Control access to objects
10. [Composite Pattern](src/composite_design_pattern/README.md) - Treat individual and composite objects uniformly
11. [Bridge Pattern](src/bridge_design_pattern/README.md) - Separate abstraction from implementation *(Coming soon)*

### Behavioral Patterns (6)
12. [Strategy Pattern](src/strategy_design_pattern/README.md) - Define family of algorithms
13. [Observer Pattern](src/observer_design_pattern/README.md) - Subscribe to and receive notifications
14. [Command Pattern](src/command_design_pattern/README.md) - Encapsulate requests as objects
15. [Template Method Pattern](src/template_method_design_pattern/README.md) - Define algorithm skeleton
16. [State Pattern](src/state_design_pattern/README.md) - Change behavior based on internal state
17. [Chain of Responsibility Pattern](src/chain_of_responsibility_design_pattern/README.md) - Pass request along chain of handlers

## Project Structure

```
design-patterns/
├── src/
│   ├── <pattern_name>_design_pattern/
│   │   ├── problem/              # Problem demonstration
│   │   ├── solution/             # Pattern implementation
│   │   └── README.md             # Pattern documentation
│   └── ...
└── README.md
```

## How to Use

### Running Examples

Each pattern has a demo class you can run:

```bash
# Example: Run Strategy Pattern Demo
javac src/strategy_design_pattern/solution/StrategyDemo.java
java strategy_design_pattern.solution.StrategyDemo

# Example: Run Singleton Pattern Demo
javac src/singleton_design_pattern/solution/SingletonDemo.java
java singleton_design_pattern.solution.SingletonDemo
```

### Learning Approach

1. **Read the pattern README** - Understand when and why to use it
2. **Study the problem** - See what happens without the pattern
3. **Review the solution** - Learn the pattern implementation
4. **Run the demo** - See the pattern in action
5. **Experiment** - Modify and extend the examples

## Pattern Categories

### When to Use Each Pattern

#### Creational Patterns
Use when you need control over object creation:
- **Singleton**: Global access point (Logger, Configuration)
- **Factory Method**: Delegate instantiation to subclasses
- **Abstract Factory**: Create families of related objects
- **Builder**: Construct complex objects with many parameters
- **Prototype**: Copy existing objects efficiently

#### Structural Patterns
Use when you need to compose objects:
- **Adapter**: Connect incompatible interfaces
- **Decorator**: Add responsibilities dynamically
- **Facade**: Simplify complex system interface
- **Proxy**: Control access or add functionality
- **Composite**: Tree structures with uniform treatment

#### Behavioral Patterns
Use when you need flexible communication:
- **Strategy**: Switch algorithms at runtime
- **Observer**: Notify multiple objects of changes
- **Command**: Encapsulate actions with undo support
- **Template Method**: Define algorithm structure
- **State**: Object behavior based on state
- **Chain of Responsibility**: Process request through chain

## Design Principles

These patterns demonstrate SOLID principles:
- **S**ingle Responsibility Principle
- **O**pen/Closed Principle
- **L**iskov Substitution Principle
- **I**nterface Segregation Principle
- **D**ependency Inversion Principle

## Contributing

Feel free to:
- Add new patterns
- Improve existing implementations
- Fix bugs
- Enhance documentation

## License

This project is for educational purposes.

## Author

Chakri Durga Aravind Dangeti

---

**⭐ Star this repository if you find it helpful!**
