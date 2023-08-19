# Java Based Configuration
- @Configuration
- @Bean
- @Import({A.class,B.class})
- Life-Cycle callbacks

```
ConfigurableApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

 Employee employee=applicationContext.getBean("emp1",Employee.class);
 System.out.println(employee);
 applicationContext.close();
```

