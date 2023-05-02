## Input and Output Stream

I/O (Input and Output) is used to process the input and produce the output.
Java uses the concept of a stream to make I/O operation fast. 
The java.io package contains all the classes required for input and output operations.
We can perform file handling in Java by Java I/O API.


## Input Stream

The InputStream class of the java.io package is an abstract superclass that represents an input stream of bytes.
InputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.



## Output Stream

The OutputStream class of the java.io package is an abstract superclass that represents an output stream of bytes.
OutputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.



## File Operation in Java


We can perform the following operation on a file:
Create a File
Get File Information
Write to a File
Read from a File
Delete a File


## Serialization(1.1v)

The process of saving (or) writing state of an object to a file is called serialization but strictly speaking it is the process of converting an object from java supported  form to either network supported form (or) file supported form.
By using FileOutputStream and ObjectOutputStream classes we can achieve serialization process.
                              writeObject(Object obj)



## Deserialization

The process of reading state of an object from a file is called DeSerialization but strictly speaking it is the process of converting an object from file supported form (or) network supported form to java supported form.
By using FileInputStream and ObjectInputStream classes we can achieve DeSerialization.
                      readObject()


