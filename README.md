# spring集成mybatis
## (1)编程步骤
1.导包： spring-webmvc,mybatis,mybatis-spring,spring-jdbc,dbcp,mysql-jdbc,junit

2.添加springg的配置文件。
	注：mybatis的配置信息可以添加到spring的配置文件当中。
	只需要配置一个bean:  SqlSessionFactoryBean(相当于一个的Mybatis配置文件)

3.实体类
4.映射文件
5.Mapper映射器
6.在spring的配置文件当中，添加MapperScannerConfigurer
			(该bean负责调用SqlSession的getMapper方法，创建符合Mapper映射器要求的对象。)
		注：	该bean会将这个对象添加到spring容器里面。

