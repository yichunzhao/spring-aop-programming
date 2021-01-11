# Spring AOP programming

AOP can be implemented by a proxy pattern or by an OOP inheritance; the core idea is to dynamically extend the existing method to have new functionality. Spring AOP only apply on a method level.

## Concept and Terms
AOP involves a lot of concepts and terms.

###JointPoint and PointCut
JointPoint: defines a joint interest point that happens on client-side code, i.e. places across many classes. PointCut: selecting a joinpoint, which designates the Aspect a common concern.

### Aspect and Advice
Aspect: defines a common concern across many classes. Advice: a block of code that handles an Aspect, a common concern.

The advice provides PointCut with a solution, i.e. a block of code that will be re-used across many classes.

### Type of Advice
* Before-Advice: @Before
* After-Advice:
* After-Returning-Advice
* After-Throwing-Advice
* Around-Advice
