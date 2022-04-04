# SingleTon Pattern

### Definition
creates only one instance globally at the point of access 

Early Initialization : initializes or creates instances at load time

Lazy Initialization : create instance whenever required


### when to use
to control access to some shared resource


************Eager Loading Syntax************

```
Public class SingletonClass{

Private static SingletonClass obj=new SingletonClass();

Private SingleTonClass(){};

	public static SingletonClass getInstance(){
		return obj;
  }

}
```



*********************** Lazy Loading Syntax***********




```
Public class SingletonClass{

Private static SingletonClass obj=null;

Private SingleTonClass(){};

	public static SingletonClass getInstance(){
		if(obj==null){
			obj=new SingletonClass();
  }
		return obj;
  }

}
```




## UseCase:
### Problem Statement 
Conider user  need to get the LoggedIn user Details by fetching data From database  so to create an Loggedinect we need to First connect to database and get details of user so when ever client call  LoggedInUserDetails every time new Object is getting created with same details and making db call which is costly.

### solution 
1.to Avoid multiple object createion we are making LoggedInUser object static and creating instance using get Instance method by checking if object is initialized or not if it is already Initialized no need to create an object otherwise we will create an object
2. user can now only call get Instance Method to create object 





# Multition 
### Definition
Multition is an extension to singleton pattern which allows  more than one instance of a class to be created

### Requirement 
need to Number of object need to be created before hand

###### Syntax
```

Public class MultitionClass{

Private static HashMap multitinobjList<String ,Multitionclass>;

Private SingleTonClass(){};

	public static SingletonClass getInstance(string instance){
		if(multitinobjList.get(instance)==null){
		multitionobjList.put(instance, new MultitionClass())
    }
		multitinobjList.get(instance);
  }

}

```

# UseCase
### Problem Statement
suppose Let us consider any application which need multiple database connection (Consider HR and dev dbs)to perform GET/PUT/POST?PATCH Requests  when ever we need to make request we need connection to appropritate DataBase. when ever propperties of each Db connection Objects are same  and only difference in our Example is endPoint for HR and Dev Db. so, creating  creating object when ever making request is a costly openertaion creating diffrent Object for same DB connection is waste of Memory

### solution
To solve this Issue 
1. Create an static HashMap<DatabaseType, DtatabaseConnectionObject> which will store jbcObject  
2. create static getInstanceMethod(Dtatabasetype)  which will return an object if it is notcreated and add it to hash map if object for given Database Type already exist it will return the Exsisting Object
