Lets you define a subscription mechanism to notify multiple objects
about any events that happen to the object they’re observing.

## Tags

    Publish-Subscribe

## Java Observable & Observer

First, because Observable is a class, you have to subclass it. That means you can’t add
on the Observable behavior to an existing class that already extends another superclass.
This limits its reuse potential.

Second, because there isn’t an Observable interface, you can’t even create your own
implementation that plays well with Java’s built-in Observer API. Nor do you have
the option of swapping out the java.util implementation for another (say, a new, multi-threaded implementation).

If you look at the Observable API, the setChanged() method is protected. So what? Well,
this means you can’t call setChanged() unless you’ve subclassed Observable. This means
you can’t even create an instance of the Observable class and compose it with your own
objects, you have to subclass. The design violates a second design principle here…favor
composition over inheritance.
