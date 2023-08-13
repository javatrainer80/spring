# Spring Bean scopes

- singleton
- prototype
- request
- session
- application
- websocket

# singleton  Annotation-> @scope(BeanDefination.SCOPE_SINGLETON)

```xml
<bean id="prodService" class="com.tech2java.springcore.ProductService" scope="singleton" lazy-init="default"></bean>

lazy-init(default,true,false)

default initialization-> default(eager initialization)
default scope=> scope="singleton"
```

# lazy-init=false
```java
ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
System.out.println("Before getBean() method..");
ProductService productService=applicationContext.getBean("prodService",ProductService.class);
System.out.println("After getBean() method..");
applicationContext.close();

output:  
ProductService object is created by Container..
Before getBean() method..
After getBean() method..

```

# lazy-init=true
```java
ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
System.out.println("Before getBean() method..");
ProductService productService=applicationContext.getBean("prodService",ProductService.class);
System.out.println("After getBean() method..");
applicationContext.close();

output:  
Before getBean() method..
ProductService object is created by Container..
After getBean() method..

```

# prototype

```xml
<bean id="prodService" class="com.tech2java.springcore.ProductService" scope="prototype"/>
```


# Event Handling in Spring.

- ApplicaitonEvent(C)
- ApplicationListener(I)

- Spring built-in events  
  ContextRefreshedEvent  
  ContextStartedEvent  
  ContextStoppedEvent  
  ContextClosedEvent  
  RequestHandledEvent  
  
```java
public class Message implements ApplicationListener<ContextStartedEvent>{

@Override
   public void onApplicationEvent(ContextStartedEvent event) {
	  System.out.println("Inside ContextStartedEvent..");
	}
}

Test:  
applicationContext.start();
System.out.println(msg);
applicationContext.close();
```


# Collections in spring.

```xml
<bean id="cust" class="com.tech2java.springcore.CustomerBean">
	   <!--LIST  -->
	   <property name="addressList">
		   <list>
			   <value>HYDERABAD</value>
			   <ref bean="address"/>
			   <bean class="com.tech2java.springcore.Address" p:city="HYD" p:state="TS"></bean>
		   </list>
	   </property>
</bean> 

util:  
Using util:list (and util:set) you can create a separate bean for the list or set and  
then wire it as a reference in the required bean    


<util:set id="addrSet" set-class="java.util.HashSet">
	    <value>HYDERABAD</value>
		<ref bean="address"/>
		<bean class="com.tech2java.springcore.Address" p:city="HYD" p:state="TS"></bean>
	</util:set>
	
   <bean id="custUtil" class="com.tech2java.springcore.CustomerBean">
	   <property name="addressList" ref="addrList"></property>
	    <property name="addressSet" ref="addrSet"></property>
   </bean>
```