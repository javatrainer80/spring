# create product table.

```sql
use eis;
CREATE TABLE `product` (
  `productId` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(100) NOT NULL,
  `productDesc` varchar(100) NOT NULL,
   PRIMARY KEY (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

# DataSource
- DriverMmanagerDataSource(spring jdbc)
- org.apache.commons.dbcp.BasicDataSource

# Types of template classes(follows template design pattern)
- JdbcTemplate
- NamedParameterJdbcTemplate
- SimpleJdbcTemplate

# JdbcTemplate
- update()
- execute()
- query()  

- PreparedStatementSetter
- PreparedStatementCreator
- ResultSetExtractor
- RowMapper
- CRUD operations

# DAO methods
```java
void saveProduct(Product product) throws SQLException;
Product getProductById(Integer productId)throws SQLException;
List<Product> getAllProducts() throws SQLException;
String findProductNameById(Integer productId)throws SQLException;
void deleteProductById(Integer productId) throws SQLException;
void updateProduct(Integer productId,Product updatedProduct) throws SQLException;
```



# Bean configurations
```xml
<bean id="productDao" class="com.tech2java.springjdbc.ProductDaoImpl">
		<constructor-arg>
			<ref bean="jt"/>
		</constructor-arg>
	</bean>
	
	<bean id="jt" class="org.springframework.jdbc.core.JdbcTemplate">
		<property name="dataSource" ref="ds"></property>
	</bean>

	<bean id="ds" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
	   <property name="url" value="jdbc:mysql://localhost:3306/eis"></property>
	   <property name="username" value="root"></property>
	   <property name="password" value="root"></property>
	  <!-- <property name="driverClassName" value="com.mysql.cj.jdbc.Driver"></property>-->
   </bean>
```
