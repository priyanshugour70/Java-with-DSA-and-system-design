### Date and Time API in java
Date and Time API: (Joda-Time API)
● Until Java 1.7 version the classes present in Java.util package to handle Date and Time
(like Date, Calendar,TimeZone etc) are not up to the mark with respect to convenience
and performance.
● To overcome this problem in the 1.8 version oracle people introduced Joda-Time API.
● This API developed by joda.org and available in Java in the form of "java.time"
package.



### Stream API in Java

Stream represents a sequence of objects from a source, which supports aggregate
operations.


### Enums

We can use enum to define a group of named constants.

Example 1:

enum Month
{
JAN,FEB,MAR, --. DEC; -/; -->optional
}

Example 2:
enum Color
{
RED,BLUE,GREEN;
}

● Enum concept introduced in 1.5 versions.
● When compared with old languages enum java's enum is more powerful.
● By using enum we can define our own data types which are also come
enumerated data types.


### What is Annotation?

● In Java, an annotation is a type of metadata that can be added to a class,
method, field, parameter, or other program element to provide additional
information about the element.
● Annotations are used by the compiler, runtime, and other tools to generate
code, perform runtime checks, and provide documentation and other
information.
● Annotations are represented using the "@" symbol followed by the name of the
annotation, and they can take parameters that provide additional information.


### Custom Annotation

● The built-in annotations in Java, developers can also define their own custom
annotations to provide additional metadata about code elements.
● Custom annotations can be used to mark specific program elements, define
constraints or requirements, or provide configuration information for
frameworks and tools.
● To create a custom annotation in Java, you define a new annotation type using
the "@interface" keyword.


### Reflection API in Java

● Reflection is a process of examining or modifying the run time behavior of a
class at run time.
● The java.lang.Class class provides many methods that can be used to get
metadata, examine and change the run time behavior of a class.
● The java.lang and java.lang.reflect packages provide classes for java reflection.