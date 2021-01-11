# spring-aop-programming
Spring AOP programming

AOP can be implemented by a proxy pattern or by an OOP inheritance;  the core idea is to dynamically extending the existing method to have a new functionalities. Spring AOP
only apply on a method level. 

## Concept and Terms

AOP involves a lot of concepts and terms. 

### JointPoint and PointCut
JointPoint: defines a joint interest point that happends on client side code, i.e. places accross many classes. 
PointCut: selecting a jointPoint, which designates the Aspect a common concern. 

### Aspect and Advice
Aspect: defines a common concern accross many classes.
Advice: a block of code that handles an Aspect, a common concern. 

Advice provides PointCut a solution, i.e. a block of code that will re-usedd accoross many classes.

### Type of Advices

* Before-Advice: @Before
* After-Advice: 
* After-Returning-Advice
* After-Throwing-Advice
* Around-Advice
