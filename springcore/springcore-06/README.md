# Annotations

- @Autowired( it uses byType autowiring
- Add `<context:annotation-config/>` in beans.xml

- @Qualifier (use it along with autowired annotation)
- if 2 beans having same type then mention which bean has to be injected.


# JSR-250 annotations
- @PostContruct
- @PreDestroy
- @Resource

```xml
<dependency>
  <groupId>jakarta.annotation</groupId>
  <artifactId>jakarta.annotation-api</artifactId>
  <version>2.1.1</version>
</dependency>
```
-@Resource (it uses byName Autowiring)

```xml
<bean name="address1" class="com.tech2java.springcore.Address">
  <property name="city" value="HYD"></property>
  <property name="state" value="TS"></property>
</bean>
```

```java
@Resource(name = "address1")
private Address address;
```

# Summary

```java
InitializingBean->init-method(attribute)->@PostContsruct
DisposbaleBean->destroy-method(attribute)->@PreDestroy
@Resource(autowired byName) 
@Atowired(autowired byType)
```