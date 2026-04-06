# Command Design Pattern

## Category
**Behavioral Pattern**

## Intent
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## Problem
Need to issue requests without knowing the receiver or the operation being performed. Want to support undo/redo, queuing, and logging.

## Solution
Encapsulate requests as command objects. Commands contain all information needed to execute an action.

## Structure
- **Command**: Interface with execute() method
- **ConcreteCommand**: Implements Command, binds action to Receiver
- **Invoker**: Asks command to execute request
- **Receiver**: Knows how to perform operations

## When to Use
- Parameterize objects with operations
- Specify, queue, and execute requests at different times
- Support undo operations
- Support logging changes
- Structure system around high-level operations

## Benefits
✅ Decouples invoker from receiver  
✅ Easy to add new commands  
✅ Supports undo/redo  
✅ Can assemble commands into composite command  
✅ Supports queuing and logging  

## Drawbacks
❌ Increased number of classes  
❌ More complex code  

## Real-World Examples
- GUI buttons and menu items
- Transactional systems
- Thread pools
- Job queues
- `Runnable` interface in Java

## Code Location
- Problem: `src/command_design_pattern/problem/`
- Solution: `src/command_design_pattern/solution/`
- Demo: `CommandDemo.java`
