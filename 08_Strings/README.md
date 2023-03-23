# String Introduction

String it refers to an Object in java present in package called java.lang.String

String refers to collection of characters

In Java String object is by default immutable,meaning once the object is created
we cannot change the value of the object, if we try to change then those changes
will be reflected on the new object not on the existing object.




# Types of String

In java Strings are classified into 2 types

1. Mutable String
2. Immutable String



# Mutable String

Once if we create a String, on that String if we try to perform any operation and
if those changes get reflected in the same object then such strings are called
“Mutable String”.

Example: StringBuffer, StringBuilder





# Immutable String

Once if we create a String, on that String if we try to perform any operation
then those changes won’t be reflected in the same object, rather a new object
will be created.Such type of String is called as “Immutable String”.

Example: String




# String class Constructor
String s =new String()
Creates an Empty String Object

String s =new String(String literals)
Creates an Object with String literals on Heap

String s =new String(StringBuffer sb)
Creates an equivalent String object for StringBuffer

String s =new String(char[] ch)
Creates an equivalent String object for character array

String s =new String(byte[] b)
Creates an equivalent String object for byte array




# Different ways of Comparison
To compare 2 Strings in java we use following approach
● == operator
It compares the reference of the Object.

● equals()
It compares the contents of two Object.




# Important methods of String
● public char charAt(int index)
● public String concat(String str)
● public boolean equals(Object o)
● public boolean equalsIgnoreCase(String s)
● public String subString(int begin)
● public String subString(int begin,int end)
● public int length()
● public String replace(char old, char new)
● public String toLowerCase()
● public String toUpperCase()
● public int indexOf(char ch)
● public int lastIndexOf(char ch)

## Concatenation
The technique of connecting two or more strings together to create a new string
is known as string concatenation. Various approaches to concatenating a string
in Java include the following:

● + operator
● String.concat() method




# Mutable String
Mutable String
Once if we create a String, on that String if we try to perform any operation and if
those changes get reflected in the same object then such strings are called
“Mutable String”.

Example: StringBuffer, StringBuilder




# StringBuffer and StringBuilder
### StringBuffer
● If the content will change frequently then it is not recommended to go for
String object becoz for every new change a new Object will be created.
● To handle this type of requirement, we have a StringBuffer/StringBuilder
concept.

1.StringBuffer sb=new StringBuffer();
● Creates an empty StringBuffer object with default initial capacity of "16".
● Once StringBuffer reaches its maximum capacity a new StringBuffer Object
will be created.
new capacity = (current capacity+1) * 2;


## Important methods of StringBuffer
● public int length()
● public int capacity()
● public char charAt(int index)
● public void setCharAt(int index,char ch)
● public StringBuffer append(String s)
● public StringBuffer append(int i)
● public StringBuffer append(long l)
● public StringBuffer append(boolean b)
● public StringBuffer append(double d)
● public StringBuffer append(float f)
● public StringBuffer append(int index,Object o)


## StringBuilder(1.5v)
StringBuilder is same as StringBuffer(1.0V) with few differences

StringBuilder

● No methods are synchronized
● At a time more than one thread can operate so it is not ThreadSafe.
● Threads are not required to wait so performance is high.
● Introduced in jdk1.5 version



# String vs StringBuffer vs StringBuilder
### String
we opt if the content is fixed and it wont change frequently

### StringBuffer
we opt if the content changes frequently but ThreadSafety is required

### StringBuilder
we opt if the content changes frequently but ThreadSafety is not required

