# Data Types:
  Java is statically typed and also a strongly typed language because,
  In Java, each type of data (such as integer, character, hexadecimal, packed decimal, and so forth) is predefined as part of the programming language.
  And all constants or variables defined for a given program must be described with one of the different Java data types.

## Different types of Data:
   1. Primitive Type
      1. Integral [byte {1byte, -128 to 127, 0}, short {2byte, -32768 to 32767, 0}, int {4byte, -2147483648 to 2147483647, 0}, long {8byte,,0}]: all these are interal type but has differ sizes and ranges 
      2. Floating Point [float {4byte,,0.0}, double{8byte,,0.0}]: all these are floating point type
      3. Char {2byte, 0 to 65535, \u0000} : 
         Note: In C/C++[0 to 255](it follow ASCII standards), only support English language, and java support other natural language apart support english such as Arabic, chinease, Japanese etc.
         So, increase the range of characters
         Java follow unicode(Superset of ASCII cause it has English + others) standards
      4. Boolean {,true/false,false}
   2. Non-Primitive Type or Object Type

### Note
   For every primitive data types, there is class to wrapped this primitive type.
   And every Class have members are method and data member
   For example: int => Integer
               public static final int MIN_VALUE;
               public static final int MAX_VALUE;
               public static java.lang.String toString(int, int);
               public static java.lang.String toUnsignedString(int, int);
   you can see all members by using this command "javap java.lang.Integer"

# Variables
  variable is a container where store the data of declared type.

### Variable Naming - Rule: 
    1. Case Sensitive
    2. Contains alphabets, numbers,_ or $
    3. Should not be a keyword
    4. Should not be a class name, if class name currently used
    5. No limit on length of name
    6. Follow CamelCase