# Java Development Kit (JDK)
  JDK contains Development tools + JRE
   1. Compiling Java Program (javac)
   2. Debugging or various other tools 
  Once compiled the java program after that 
  we need to executed in our machine So, for execution we need JRE

# Java Runtime Environment (JRE)
  It contains Java Class Library + JVM(Java Virtual Machine)
  For executing java program with all required class file within JVM.

# Java Virtual Machine
  It provides Virtual Machine which actually execute our java program
  JVM consists of three main components or subsystems:
    1. Class Loader Subsystem is responsible for loading, linking, and initializing a Java class file (that is, “Java file”), otherwise known as dynamic class loading.
    2. Runtime Data Areas contain method areas, PC registers, stack areas, and threads.
    3. Execution Engine contains an interpreter, compiler, and garbage collection area.

## cmd command for compiling and executing Java code
   >> javac First.java
   >> java First

# Skeleton of Java Program
    import java.lang.*;
    class MyFirst {
        public static void main(String[] args) {
            System.out.println("Hello Java");
        }
    }
    1. First of all, class name is must be same as file name if class is "public"
    2. lang is language package
    3. public is used in main method cause JVM should be invoke first in whole program then another methods
    4. static: if want to use the all those inside the class without created the object then we use static keyword otherwise JVM cannot find main method
    5. command line argument inside main(String[] args) 
       in C++, it is not necessory every time write in main
       but in Java, you may or may not use but its mendatory to write into main
       "The users can pass the arguments during the execution bypassing the command-line arguments inside the main() method."
#### Java example of CLA: 
        class GFG {
            // Main driver method
            public static void main(String[] args)
            {
                // Printing the first argument
                System.out.println(args[0]);
            }
        }
        >> javac GFG.java
        >> java GFG Rahul
        output : Rahul
#### C++ example of CLA:
        int main(int argc, char *argv[]){
          // Suitable Code
          return 0;
        }
        int args; takes no of arguments

# Scanner Class
  util is utility packages provied in Version 5.
  Scanner class within the util package.
  Scanner works as pipe to read data from keyboard
  System.in represents Keyboard
  Scanner class have different methods:
  1. nextInt()
  2. nextFloat()
  3. nextDouble()
  4. next()
  5. nextLine()
  6. nextByte()
  7. nextShort()
  8. nextLong()
  9. hasNextInt() : to confirm the next given number from keyboard is integer or not (it simply returns true or false)
  10. hasNextFloat() : same as above statement
  etc.
  ### Note: 
  You can use this command javap utility.Scanner to showing all methods in Scanner