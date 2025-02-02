# Command Pattern

The Command Pattern allows you to decouple the requester of an action from the object that actually performs the action.

## Overview

In the Command Pattern, the requester would be the remote control, and the object that performs the action would be an instance of one of your classes.

A “command object” encapsulates a request to do something (for example, turn on a light) on a specific object (such as the living room light object). If we store a command object for each operation (e.g., button), when the button is pressed, we ask the command object to do some work. The remote control doesn’t have any idea what the work is; it just has a command object that knows how to communicate with the right object to get the work done.

This pattern decouples the objects that send requests from the objects responsible for executing those requests.

## Class Diagram
![Screenshot 2025-02-03 001050](https://github.com/user-attachments/assets/03986f99-508b-45fe-8694-ea684a0ffdcc)
