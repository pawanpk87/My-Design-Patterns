The Command Pattern allows you to decouple the requester of an action from the object
that actually performs the action.

The Requester would be the remote control and the object that performs the action would
be an instance of one of your <T> classes.

A “command object” encapsulates a request to do something (ex: like turn on a light) on
a specific object (ex: say, the living room light object). So, if we store a command object
for each operation (ex: button), when the button is pressed we ask the command object to do
some work. The remote doesn’t have any idea what the work is, it just has a command object
that knows how to talk to the right object to get the work done.

It decouples the objects that send requests from the objects responsible for executing those requests.
