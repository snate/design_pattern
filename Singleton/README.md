Singleton
=========

If you want to execute the trial program, type:

    bash play.sh

First output
------------

Both the references to SimpleBoy are to the same instance, so the last
__setName()__ invocation will determine which name is set to that instance.

In my example, the output will be:

> SimpleBoy: My name is Carl
> SimpleBoy: My name is Carl

Second output
-------------

Both the references to CheckBoy are to the same instance, so the last
__setName()__ invocation will determine which name is set to that instance.

In my example, the output will be:

> CheckBoy: My name is Carl
> CheckBoy: My name is Carl

Third output
------------

EnumBoy forces in a native way to operate with the unique instance of this
class; both __setName()__ are clearly referring to the same instance.

In my example, the output will be:

> EnumBoy: My name is Carl
> EnumBoy: My name is Carl
