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



## Default Constructor

● For every java class constructor concept is applicable.

● If we don't write any constructor, then the compiler will generate a default
constructor.

● If we write at least one constructor then the compiler won't generate any default
constructor, so we say every java class will have a compiler generated default
constructor or programmer written constructor but not both simultaneously.


## Constructor Overloading/Constructor
Chaining
● A class can contain more than one constructor and all these constructors have
the same name they differ only in the type of argument, hence these
constructors are considered as "Overloaded constructor".


## super() vs this()

1. The first line inside the constructor can be super()/ this().
2. If we are not writing anything then compiler will generate super().


## Difference b/w super(),this()?

super(),this()

● These are constructor calls
● These are used to invoke super class and current class constructor directly
● We should use only inside the constructor that to first line otherwise we
get compile time error.



## Inheritance Introduction
● It is one of the pillars of Object Orientation.
● It always speaks about reusability.
● Using inheritance productivity of the code can be improved.
● If we use inheritance, lines of code can be reduced in the application.
● In java inheritance is achieved through the "extends" keyword


## Extends keyword
● If we use extends keyword, then we can take the properties and behaviours from
parent class to child class.


## Types of Inheritance
● Single-level inheritance
● Multi-level Inheritance
● Hierarchical Inheritance
● Multiple Inheritance


## Types of Methods in Inheritance
● Inherited
● Overridden
● Specialized


## Rules to override method
● Whatever the Parent has by default available to the Child through inheritance, if the
Child is not satisfied with Parent class method implementation then Child is allowed to
redefine that Parent class method in Child class in its own way this process is called overriding.
● The Parent class method which is overridden is called the overridden method.
● The Child class method which is overriding is called the overriding method.
● In overriding method resolution is always takes care by JVM based on runtime
● object hence overriding is also considered as runtime polymorphism or dynamic polymorphism or late binding.
● The process of overriding method resolution is also known as dynamic method dispatch.
● In overriding method names and arguments must be the same.
● That is, method signatures must be the same.


## Constructor Execution in case of
inheritance
● In case of Constructor the Parent class constructor would be executed followed
● by Child class constructor with the help of “super()”.
● It is basically used to make a call to the parent class constructor.
● Internally jvm uses super() to promote constructor chaining in inheritance level.



## What is polymorphism?
If one thing exists in more than one form then it is called Polymorphism.
Polymorphism is a Greek word, where Poly means many and morphism means
structures or forms.
1. Static Polymorphism
2. Dynamic Polymorphism


## How to achieve polymorphism:
Polymorphism in Java can be achieved in two ways i.e., method overloading and
method overriding.
Polymorphism in Java is mainly divided into two types.
1. Static Polymorphism:
If polymorphism exists at compilation time then it is called Static Polymorphism.
Ex: Overloading.
2. Dynamic Polymorphism:
If the polymorphism exists at runtime then that polymorphism is called Dynamic
Polymorphism.
Ex: Overriding



## Method Overriding:
The process of replacing existing method functionality with some new functionality is
called Method Overriding.
● To perform Method Overriding, we must have inheritance relationship classes.
● In Java applications, we will override super class method with sub class method.
● If we want to override super class method with subclass method then both super
class method and sub class method must have the same method prototype.



## Runtime vs Compile time polymorphism
What are the differences between method overloading and method overriding?
method overloading
● The process of extending the existing method functionality with new functionality
is called Method Overloading.
● In the case of method overloading, different method signatures must be
provided to the methods
method overriding
● The process of replacing existing method functionality with new functionality is
called Method Overriding.
● In the case of method overriding, the same method prototypes must be provided
to the methods.
● With or without inheritance we can perform method overloading with inheritance
only we can perform Method overriding



## Abstract keyword and Abstraction:
● The abstract keyword is used to achieve abstraction in Java. It is a
non-access modifier which is used to create abstract class and method.
● The role of an abstract class is to contain abstract methods. However, it may
also contain non-abstract methods.
● The method which is declared with an abstract keyword and doesn't have any
implementation is known as an abstract method.
Syntax:-
abstract class Employee
{
abstract void work();
}



## Abstract Class and Abstract Methods
● In Java applications, if we declare any abstract class with abstract methods,
then it is convention to implement all the abstract methods by taking sub
classes.
● To access the abstract class members, we have to create an object for the
subclass and we have to create a reference variable either for abstract class
or for the subclass.
● If we create reference variables for abstract class then we are able to
access only abstract class members, we are unable to access subclass own
members.
● If we declare a reference variable for subclass then we are able to access
both abstract class members and subclass members.



## final class
● If a class is marked as final, then the class won’t participate in inheritance,if
we try to do so then it would result in “CompileTime Error”.
Eg: String, StringBuffer,Integer,Float,......



## final variable
● If a variable is marked as final, then those variables are treated as compile
time constants and we should not change the value of those variables.
● If we try to change the value of those variables then it would result in
“CompileTimeError”.


## final method
● If a method is declared as final then those methods we can’t override, if we
try to do so it would result in “CompileTimeError”.