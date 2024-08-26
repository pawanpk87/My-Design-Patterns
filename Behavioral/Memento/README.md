# Memento Pattern

Memento is a behavioural design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

The Memento pattern delegates creating the state snapshots to the actual owner of that state, the originator object. Hence, instead of other objects trying to copy the editor’s state from the “outside,” the editor class itself can make the snapshot since it has full access to its state.

Keeping the single responsibility principle in mind, it’s also a good idea to keep the state that you’re saving separate from the key object. This separate object that holds the state is known as the Memento object.

## Class Diagram

TODO
