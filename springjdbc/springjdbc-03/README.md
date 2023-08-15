# Batch Update
- BatchPreparedStatementSetter

# JdbcDaoSupport
- If we use JdbcDaoSupport - no need to  declare jdbcTemplate- it finds the dataSource from the beans.xml .
- use getJdbcTemplate() method instead of jdbcTemplate
- Remove jdbcTemplate config from beans.xml
- Add dataSource to DaoImpl
# Executing stored procedures

```sql

CREATE DEFINER=`root`@`localhost` PROCEDURE `SAVE_PRODUCT`(IN productId integer, 
 IN productName varchar(40),
 IN productDesc varchar(400))
BEGIN
  INSERT INTO product values(productId,productName,productDesc);

END

-call SAVE_PRODUCT(1,'product1','desc');

```

# SimpleJdbcTemplate

# NamedParameterJdbcTemplate