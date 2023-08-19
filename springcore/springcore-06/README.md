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

# Summary

```java
InitializingBean->init-method(attribute)->@PostContsruct
DisposbaleBean->destroy-method(attribute)->@PreDestroy
@Resource(autowired byName) 
@Atowired(autowired byType)
```