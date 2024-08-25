# Observer Pattern

The Observer Pattern lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

## Overview

In the Observer Pattern, the object that holds the state is called the **Subject**, and the objects that want to be notified of changes to the subject's state are called **Observers**. When the subject changes state, it notifies all of its observers so that they can react accordingly.

## Java Observable & Observer

In Java, the `Observable` class and `Observer` interface provide a built-in way to implement the Observer Pattern. However, there are some limitations with this approach:

1. **Subclassing Limitation**: Since `Observable` is a class, you have to subclass it. This means you cannot add `Observable` behavior to an existing class that already extends another superclass, limiting its reuse potential.

2. **Lack of Interface**: Because there isn’t an `Observable` interface, you cannot create your own implementation that integrates well with Java’s built-in `Observer` API. Additionally, you cannot easily swap out the `java.util` implementation for another, such as a new, multi-threaded implementation.

3. **Protected Method Issue**: The `setChanged()` method in the `Observable` API is protected. This means you can’t call `setChanged()` unless you’ve subclassed `Observable`. As a result, you cannot create an instance of the `Observable` class and compose it with your own objects—you have to subclass it. This design violates the principle of "favor composition over inheritance."

## Class Diagram

![Screenshot 2024-08-25 211831](https://github.com/user-attachments/assets/21b298c0-7bbd-42a9-a748-2965877bd535)



