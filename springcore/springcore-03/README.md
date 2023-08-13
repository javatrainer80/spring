#Dependency Injection(DI)
- Setter Injection
- constructor Injection

# Setter Injection

```xml
	<bean id="emp" class="com.tech2java.springcore.Employee">
		<property name="empNo" value="1000"></property>
		<property name="empName" value="James"></property>
		<property name="empAge" value="45"></property>
	</bean>
```

# Constructor Injection

```xml
<bean id="emp" class="com.tech2java.springcore.Employee">
		<constructor-arg>
			<value>1000</value>
		</constructor-arg>
		<constructor-arg>
			<value>Ramesh</value>
		</constructor-arg>
		<constructor-arg>
			<value>35</value>
		</constructor-arg>
	</bean>
```

# Spring Bean Referencing

```xml
<bean id="emp" class="com.tech2java.springcore.Employee">
		<constructor-arg>
			<value>1000</value>
		</constructor-arg>
		<constructor-arg>
			<value>Ramesh</value>
		</constructor-arg>
		<constructor-arg>
			<value>35</value>
		</constructor-arg>
		
		<constructor-arg>
			<ref bean="address"/>
		</constructor-arg>
		
	</bean>
	
	
	<bean id="address" class="com.tech2java.springcore.Address">
		<property name="city" value="HYD"></property>
		<property name="state" value="TS"></property>
	</bean>
Note: we can use setter injection also	

<bean id="emp" class="com.tech2java.springcore.Employee">
		<property name="empNo" value="1000"></property>
		<property name="empName" value="James"></property>
		<property name="empAge" value="45"></property>
		<property name="address" ref="address"></property
	</bean>
	
	
	<bean id="address" class="com.tech2java.springcore.Address">
		<property name="city" value="HYD"></property>
		<property name="state" value="TS"></property>
	</bean>
	
```

# Inject values into bean properties
- Normal way
- Shortcut
- "p" Schema - for setter injection 

```xml 
xmlns:p="http://www.springframework.org/schema/p"
```
- "c" schema - for constructor injection 
```xml
xmlns:c="http://www.springframework.org/schema/c"```
org.springframework.core.LocalVariableTableParameterNameDiscoverer inspectClass  
WARNING: Using deprecated '-debug' fallback for parameter name resolution. Compile the affected code with '-parameters' instead or avoid its introspection: com.tech2java.springcore.Customer

Due to these changes in Spring Framework 6.0, the use of the -parameters compiler option is now strongly encouraged. It allows the names of constructor and methods parameters to be discovered without having to resort to extracting them from debug information in .class files.
# Loading multiple configuration files
```xml
beans.xml
<import resource="beans1.xml" />
<import resource="beans2.xml" />
```

# Spring InnerBeann- if a bean is only used for a particular bean- then we can use spring inner bean concept.

```xml
<bean id="customer" class="com.tech2java.springcore.Customer">
		<property name="custId" value="200"/>
		<property name="custName" value="Ravi"/>
		<property name="custAge" value="34"/>
		<property name="address">
			<bean class="com.tech2java.springcore.Address" p:city="HYD" p:state="TS"/>
		</property>
	</bean>
```
 


