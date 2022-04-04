### Definition 
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### When  to use Factory Pattern :
A class do not know the type of objects it needs to create beforehand and class is of single Responsibility class

### Advantages:

1 .client need not know what kind of concrete classes that are createdase

# UseCase
### problem Statement

To create a logistic App and not sure that what are the types of transportation I am using first I am using truck to deliver Item and later got an transport Request from seaways so  to expand  businness Logistic App also Supports seayway Transportation


##### problem

``` 
interface TransportationImpl{                                                                                                                                         
  public void delivery();

}

class Transportaion implements TransportationImpl{

  public void delivery(type){                                                                                  
  
      if (type== "Roadwya"){
      }
      
      else{
    //functionality
    }

} 
```


if we don't know how to   implementation we create  abstract fuction and allow the subclass to implement the fuctionality

but From the above class Transportaion  delivering of item  through Roadways will be different from Delevering I tems through WaterWays implementing  
delivery fuction using If else will be difficult to handle

### Solution 
1 . to make the  single Responsiblity class create Two Separate Classes Roadwyas and waterWays.

2. now after  implementing different subclasses another Problem that comes is creating Object  so to create an Object User need to Know what are the subclasses  and allowing user to create object using new  keyword will not be maintainable as User cal create Object at any where in the application,so we need to keep object Creation Logic at one place so Created Transport Factory to keep  Object creation Logic at one Place and allowing user to  user Interface and Fatcory class to create an Object



