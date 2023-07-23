# BeanFactory vs ApplicationContext

## XML Configuration

``` XML
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:context="http://www.springframework.org/schema/context"
  xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">

</beans>    
```

# BeanFactory
```java
DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));

Traveler traveler=beanFactory.getBean("traveler",Traveler.class);

traveler.startJourney();
```

# Spring Bean Object life cycle (ApplicationContext)

```JAVA
//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//ApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
//for calling close method on context
ConfigurableApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		
//Traveler traveler=applicationContext.getBean(Traveler.class);
Traveler traveler=applicationContext.getBean("traveler",Traveler.class);
		
traveler.startJourney();
		
applicationContext.close();
```

# Output

- Traveler Object is creating..
- Setting class com.tech2java.springcore.Bike to Traveler Vachile reference
- Inside afterPropertiesSet method
- Bike started moving..
- Inside destroy method      
      