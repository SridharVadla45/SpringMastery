# Spring Core
  
### Topics 
    1. Constructor injection : Injection dependecies via contructor 
    2. bean : Java object which is managed by spring IOC Container 
    3. Spring IOC Container : Logical partitioned memory (registry or context ) which maintains the references of the beans ,responsible for managing and lifecyclce of the beans from instantiation to death of object
    4. Dependency Lookup : Developer manually created the dependency object 
    5. Dependency Injection : it is design pattern for automatically creating the beans and injecting the beans into the depedent or source object/class

    6 When to use Constructor based injection and Setter based injection ?  
| Constructor Dependency      | Setter Dependency |
|-----------------------------|---|
| if dependency  is mandatory | when object is optional|
 ||@Required annotation is used if dependency is mandatory|

### Drawback of XML based Configuration

    1. need to learn xml 
    2. no typesafety  : xml cannot recognize the error during the compile time 
    3. readability 
    4 maintaince : if too much configuration ,it will be difficult to maintain 
 -- > To overcome the above drawbacks ,we should use java configuration

