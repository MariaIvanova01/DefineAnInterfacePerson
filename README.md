# DefineAnInterfacePerson

Define an interface Person with methods getName and getAge. Define a class Citizen which implements Person and has a constructor which takes a String name and an int age.

For MultipleImplementationBranch
----------------------------------------

Using the code from the previous task, define an interface Identifiable with a String method getId and an interface Birthable with a String method getBirthDate and implement them in the Citizen class. Rewrite the Citizen constructor to accept the new parameters.


Input  |	Output
-------|---------
Peter  | 1
25     | String
9105152287 | 1
15/05/1991  | String

For
----------------------

It is a well-known fact that people celebrate birthdays, it is also known that some people also celebrate their pet's birthdays. Extend the program from your last task to add birthdates to citizens and include a class Pet, pets have a name and a birthdate. Also, create a class Robot that has an id and model. Encompass repeated functionality into interfaces and implement them in your classes.

You will receive from the console an unknown amount of lines until the command "End" is received,  each line will contain information in one of the following formats "Citizen {name} {age} {id} {birthdate}" for citizens, 

"Robot {model} {id}" for robots or "Pet {name} {birthdate}" for pets. After the end command on the next line, you will receive a single number representing a specific year, your task is to print all birthdates (of both citizens and pets) in that year in the format "{day}/{month}/{year}" (the order of printing doesn’t matter).

