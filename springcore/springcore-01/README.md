# Spring Core

# Dependency Injection(DI)
- It's basic design principle/technique.
- Spring framework built on DI. 
- It promotes loose coupling.
- It is also known as Inversion Of Control(IOC)
- IOC refers the creating and injecting objects into application is taken care by the Spring Container.
  
# Spring Container
- It manages the life cycle of the beans in the applications & responsible for wiring the these beans.

# Life Cycle of Bean
- Instantiate Bean->Populate properties->SetBeanFactory/SetApplicationContext()->init method->Ready to use->destroy-method

# Wiring
- Associating different beans together is known as Wiring.
- Spring provides 2 interfaces that act as containers
  1. `BeanFactory`
  2. `ApplicationContext`
  
  
      