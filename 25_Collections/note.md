# Collection Framework
  It is nothing but Data Structure. It is very useful for devolop application.

## requirement of Collections
   Array has fixed size. Can't increase or decrease size of array during runtime
   int A[] = int A[10];
   A -> [3,5,7,10,6,9,2,8, , ,]

   The solution of above problem, Collection famework provide ArrayList and LinkedList
   Wroking: When we required more than size of List, It increae by 2 times of existing size

   1. Variable Size Collection: ArrayList, LinkedList
   2. Distinct Collection: Set, SortedSet
   3. Insert
   4. Delete
   5. Search -> Linear Search, Binary Search

## Collection Framework
   Java provides Collection Framework in the form of Interfaces and Classes.
   And those Interfaces and Classes organized in the form of Heirarchy.
    Iterable:
    Collection(Interface): collection of objects:
        1. List(Interface)
            1. ArrayList(Class)
            2. LinkedList(Class)
            3. Vector(Class)
                1. Stack
        2. Queue(Interface)
            1. Deque
                1. ArrayDeque
            2. PriorityQueue
        3. Set(Interface)
            1. SortedSet
                1. TreeSet
            2. HashSet
            3. LinkedHashSet
    Another seperate heirarchy
    1. Map [key : value]
        1. SortedMap
           1. TreeMap
        2. HashMap
        3. LinkedHashMap
        4. HashTable

    Note: The Collection framework classes and interfaces all of them are present in the java.util package.
### Collection interface
1. add(E e)
2. addAll(Collection<E> e)
3. remove(Object o) 
4. removeAll(Collection<E> c)
5. retainAll(Collection<E> c)
6. clear()
7. isEmpty()
8. contains(Object o)
9. containsAll(Collection<E> c)
10. equals(Object c)
11. size()
12. iterator()
13. toArray()