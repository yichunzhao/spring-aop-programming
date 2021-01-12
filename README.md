# Spring AOP programming

AOP can be implemented by a proxy pattern or by an OOP inheritance; the core idea is to dynamically extend the existing method to have new functionality. Spring AOP only apply on a method level.

## Concept and Terms
AOP involves a lot of concepts and terms.

### JointPoint and PointCut
JointPoint: defines a joint interest point that happens on client-side code, i.e. places across many classes. 

PointCut: selecting a joinpoint, which designates the Aspect a common concern.

### Aspect and Advice
Aspect: defines a common concern across many classes. 

Advice: implementing a common concern by providing a PointCut a block of code that will be re-used across many classes.

### Type of Advice
* Before-Advice: @Before a pointCut,i.e. jontPiont
* After-Advice: @After a pointCut,i.e. jontPiont
* After-Returning-Advice
* After-Throwing-Advice
* Around-Advice: @Around a piontCut,i.e. jontPiont

### Spring AOJ Annotations

* @Configuration and @EnableAspectJAutoProxy must used together to indicating AOJ enabled. 
* @Component and @Aspect must be used together, so that the component scanning may pick it up.


