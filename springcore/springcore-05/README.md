# PropertyPlaceHolder
- PropertyPlaceholderConfigurer (Deprecated)

```xml
<bean class="org.springframework.context.support.PropertySourcesPlaceholderConfigurer">
 <property name="location">
	<value>database_dev.properties</value>
  </property>
</bean>
```
# InitializingBean & DisposableBean

```xml
<bean  id="empService" class="com.tech2java.springcore.EmployeeService" init-method="init" destroy-  method="destroy">
   <property name="message" value="Welcome!"></property>
</bean>
```

# BeanPostPorcessor

- It allows to add some custom logic before & after spring bean creation.
- These are common for all beans.
- init-method & destroy methods are specific to bean.

```
BeforeInitialization...empService
Inside init method..
AfterInitialization...empService
```


# Spring Bean properties Dependency checking

#Spring Auto wiring Beans

#  