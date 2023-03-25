## Need of Encapsulation

● To the outside world, the data should not be exposed directly.

● In order to provide the controlled access, we need to use “Encapsulation”.



## What is Encapsulation?

● Binding of data and corresponding methods into a single unit is called
"Encapsulation".

● If any java class follows data hiding and abstraction then such class is
referred as "Encapsulated class".

Encapsulation = Data Hiding + Data Abstraction.



## Advantages of Encapsulation

● We can achieve security.

● Enhancement becomes easy.

● Maintainability and modularisation becomes easy.

● It provides flexibility to the user to use the system very easily.



## Private members

● Our internal data should not go to the outside world directly, that is, outside
people should not access our internal data directly.

● By using private modifiers we can implement "data hiding".



## Shadowing Problem and this keyword

● If both local variable and instance variable have the same name inside the
method then it would result in a name-clash and jvm will always give
preference for local variable. This approach is called the
“Shadowing problem”.


## Setters

Setter methods are used to set the value to the instance variables of the class.

Syntax for setter method
a. compulsory the method name should start with set.
b. it should be public.
c. return type should be void.
d. compulsorily it should have some argument.



## Getters

Getter methods are used to get the value from the instance variables of the class.

Syntax for getter method
a. compulsory the method name should start with get.
b. it should be public.
c. return type should not be void.
d. compulsorily it should not have any argument.







## Constructor

● Object creation is not enough, compulsorily we should perform initialization then
only the object is in a position to provide the response properly.

● Whenever we are creating an object some piece of the code will be executed
automatically to perform initialization of an object. This piece of code is nothing
but a constructor.

● Main objective of the constructor is nothing but initialisation of Object.




