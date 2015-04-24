Command
=======

If you want to execute the trial program, type:

    bash play.sh

The expected behavior of this program is:

* You can quit the program submitting the string "quit" as input
* You can increment the counter submitting the string "up" as input
* Every other input will produce garbage

You can always add functionalities and make your own tests:

* Subclassing Command and providing new commands
* Storing this new commands in the Client class. (N.B. every command will be
  registered in the map with the input string that you provide in the Client
  code)

