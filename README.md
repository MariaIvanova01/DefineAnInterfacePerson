# DefineAnInterfacePerson

Define an interface Person with methods getName and getAge. Define a class Citizen which implements Person and has a constructor which takes a String name and an int age.

![image](https://user-images.githubusercontent.com/81368587/181784265-c7417c23-223f-4495-88d6-78448d9e08e5.png)


For MultipleImplementationBranch
----------------------------------------

Using the code from the previous task, define an interface Identifiable with a String method getId and an interface Birthable with a String method getBirthDate and implement them in the Citizen class. Rewrite the Citizen constructor to accept the new parameters.

![image](https://user-images.githubusercontent.com/81368587/181784353-a7143594-07a0-4327-96bb-734d2b3f2ee4.png)



Input  |	Output
-------|---------
Peter  | 1
25     | String
9105152287 | 1
15/05/1991  | String

For BirthdayCelebrationBranch
----------------------

It is a well-known fact that people celebrate birthdays, it is also known that some people also celebrate their pet's birthdays. Extend the program from your last task to add birthdates to citizens and include a class Pet, pets have a name and a birthdate. Also, create a class Robot that has an id and model. Encompass repeated functionality into interfaces and implement them in your classes.

You will receive from the console an unknown amount of lines until the command "End" is received,  each line will contain information in one of the following formats "Citizen {name} {age} {id} {birthdate}" for citizens, 

"Robot {model} {id}" for robots or "Pet {name} {birthdate}" for pets. After the end command on the next line, you will receive a single number representing a specific year, your task is to print all birthdates (of both citizens and pets) in that year in the format "{day}/{month}/{year}" (the order of printing doesn’t matter).

![image](https://user-images.githubusercontent.com/81368587/181784491-023ff8bd-0047-4855-8abe-0d0c11887310.png)


Input | Output
-----|-----------
Citizen Peter 22 9010101122 10/10/1990 | 10/10/1990
Pet Sharo 13/11/2005 |
Robot MK-13 558833251 |
End |
1990	|

Input | Output
-----|-----------
Citizen Stamo 16 0041018380 01/01/2000 | 01/01/2000
Robot MK-10 12345678 | 24/12/2000
Robot PP-09 00000001 |
Pet Topcho 24/12/2000 |
Pet Kosmat 12/06/2002  |
End |
2000 |

Input | Output
-----|-----------
Robot VV-XYZ 11213141 | <no output>
Citizen Penk 35 7903210713 21/03/1979 |
Citizen Kane 40 7409073566 07/09/1974 |
End |
1975	 |

For FoodShortagBranch
---------------------------------

Your totalitarian dystopian society suffers a shortage of food, so many rebels appear. Extend the code from your previous (Problem 2. Multiple Implementation) tasks with new functionality to solve this task.

Define a class Rebel which has a name, age, and group (String), names are unique - there will never be 2 Rebels/Citizens or a Rebel and Citizen with the same name.

Define an interface Buyer which defines the methods buyFood() and a getFood(). Implement the Buyer interface in the Citizen and Rebel class, both Rebels and Citizens start with 0 food, when a Rebel buys food his food increases by 5, when a Citizen buys food his food increases by 10.

On the first line of the input you will receive an integer N - the number of people, on each of the next N lines you will receive information in one of the following formats "{name} {age} {id} {birthdate}" for a Citizen or "{name} {age}{group}" for a Rebel. After the N lines, until the command "End" is received, you will receive names of people who bought food, each on a new line.

Note that not all names may be valid, in the case of an incorrect name - nothing should happen.

On the only line of output, you should print the total amount of food purchased.

![image](https://user-images.githubusercontent.com/81368587/181794590-5ad1e550-011e-463d-89a0-540415a1729f.png)

Input |	Output
------|--------
2 | 	20
Peter 25 8904041303 04/04/1989 |
Stan 27 WildMonkeys |
Peter |
George |
Peter|
End |

nput |	Output
------|--------
4 | 25
Stam 23 TheSwarm |
Tony 44 7308185527 18/08/1973 |
Joro 31 Terrorists |
Peny 27 881222212 22/12/1988 |
Jaguar |
Joro |
Jaguar |
Joro |
Stam |
Peny |
End	 |

