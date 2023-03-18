# Why Array?

If we use a traditional approach, then to store 5 values we need to create 5
variables.

Similarly to store 100 values we need to create 100 variables.

The drawback in the traditional approach is that remembering the variables
names is complex, so to avoid this problem we need to use “Arrays”.




# What is an Array?

It refers to index collection of fixed number of homogeneous data elements.

Single variable holding multiple values which improves readability of the
program.





# How to create an array?

Array declarations:

1. 1-Dimensional Array
2. 2-Dimensional Array
3. Jagged Arrays

1-D Array: Declaration of array

● int[] a;//recommended to use as variable is separated from type.
● int a[];
● int []a;
● int[6] a; // compile time error. we cannot specify the size.





# Array Construction:

Every array in java is an object hence we create using a new operator.

Array Initialisation: Since arrays are treated as objects,internally based on the
type of data we keep inside array
JVM will keep default values.

Shortcut way of declaration,construction,initialisation in single line:
int []a = {10,20,30,40};
char [] a= {'a','e','i','o','u'};
String[] a= {"sachin","ramesh","tendulkar","IND"};




# 2-D Array:

Declaration(All are valid)
int[][] a ;
int a[][];
int [][]a;
int[] []a;
int[] a[];
int []a[];

# 2-D Array:

Array Construction:
int[][] a = new int[3][2];
or
int[][] a = new int[3][];
a[0] = new int[5];
a[1] = new int[3];
a[2] = new int[1];

Array Initialization:
a[0][0] = 10;
a[2][3] = 5;




# For-each/Enhanced For loop

The for-each loop in Java go through each element of the array individually. It
runs the body of the loop after holding an element of the array in a variable.

The syntax of the for-each loop is given below:
for(data_type variable:array){
//body of the loop
}




# length vs length()

length: It is a property of the Array type class.

length(): It is a method of String class.




# Anonymous Array

An array without a name is called Anonymous Array.

This type of array is created just for instance use.




# ArrayIndexOutOfBoundsException
In java when we create an array, array index starts from 0 index.
Example:
int[] a = {10,20,30,40};

In the zero index we have 10, similarly in the first index we have 20, third index we
have 30 and in fourth index we have 40.

If we try to access the index which is not in the array range then it would result in
an Exception called “ArrayIndexOutOfBoundsException”.




# Disadvantages of Arrays
once we create the size cannot be increased/decreased.

It stores only homogeneous data elements.


