# spring集成mybatis
## (1)编程步骤
1. 导包： spring-webmvc,mybatis,mybatis-spring,spring-jdbc,dbcp,mysql-jdbc,junit

2. 添加springg的配置文件。
	注：mybatis的配置信息可以添加到spring的配置文件当中。
	只需要配置一个bean:  SqlSessionFactoryBean(相当于一个的Mybatis配置文件)

3. 实体类
4. 映射文件
5. Mapper映射器
6. 在spring的配置文件当中，添加MapperScannerConfigurer
			(该bean负责调用SqlSession的getMapper方法，创建符合Mapper映射器要求的对象。)
		注：	该bean会将这个对象添加到spring容器里面。

## （2）只扫描指定的Mapper映射器。
1. 开发一个注解。比如@MyBatisRepository
2. 将该注解添加到需要扫描的映射器。
3. 配置MapperScannerConfigurer,设置annotationClass,指定注解类。

## (3)另外一种集成方式(了解)

1. 导包。
2. 添加spring的配置文件。
	1. 注：删除配置MapperScannerConfigurer的配置
3. 写实体类。
4. 映射文件。
5. Dao接口。
6. 写Dao接口的实现类。
	1. 注：注入SqlSessionTemplate，调用该对象的方法
7. 配置SqlSessionTemplate.
8. 不要忘记添加组件扫描

