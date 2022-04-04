### Definition : 
 The purpose of the Abstract Factory is to provide an interface for creating families of related objects, without specifying concrete classes. This pattern is found in the sheet metal stamping equipment used in the manufacture of Japanese automobiles.


### When  to use Factory Patter :
A class do not know the type of objects it needs to create beforehand

### Advantages:

+ client need not know what kind of concrete classes that are created

# Use Case
 ###  Problem Statement :
 
  Client need  an  application where agents can request to place an order for a new computer. Developers decided to create an interface of the computer type and its different implementations, such as high-configuration and low-configuration computers using Factory Design Pattern. but  client  various types of configurations other than low and high configurations. For ex:  some computers need high end processors but small monitors and less storage. There were a few requests regarding an average processor but an LCD monitor and SSD storage.`
  
 ###### Problems with Above Configuration
  Now Factory Pattern cannot be used beacuse for above Use case   difference Factories need to be accessed  to instaed of Concreate class to get user Configured System
 
 ### Solution:
 + Create Factory for Processor which return Instance of a Processor  based on client request (client will see only Processor interface to request for proceesor he is unaware of subclass and how object class is created )
 + create Factory for Monitor Type which return Instance of a Monitor  based on client request
 + create factory for Storage which return Instance of a Storsge Type  based on client request
 + Create Abstract factory (IComputer) and which contain Access to all factories and return instances of factory based on client input 
 now ComputerFactor  implements Icomputer  and client will have acess to ComputerFactor and give input to create Computer based on client Input Computer factory will take Responsibility to create Above Factory Instance and return Product (Computer)
 
  
 
  


