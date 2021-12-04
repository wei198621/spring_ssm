b站    编程不良人   
快速入门Spring,          https://www.bilibili.com/video/BV12k4y167jK
Spring 从入门到精通   https://www.bilibili.com/video/BV15E411p7vk

ssm   spring  struts2  mybatis  xml配置文件方式实现控制器反转及依赖注入

地址
https://github.com/wei198621/spring_ssm.git

#############   01 新建项目    #############
Create from archetype
org.apache.maven.archetypes:maven-archetype-webapp
成功后目录结构为
/src
---- main
---- ---- webapp
---- ---- ---- WEB-INF
---- ---- ---- ---- web.xml
---- ---- ---- index.asp

#############   02导入相关jar包   #############


#############   03新建文件目录结构   #############
src/main/java     （make directory as Java SourceCode Root ）
src/main/resources (make directory as Resource Root )

#############   04 完善完整目录结构   #############
src/main/java/com/tz/leo/spring/action
src/main/java/com/tz/leo/spring/service
src/main/java/com/tz/leo/spring/dao
src/main/java/com/tz/leo/spring/entity
src/main/java/com/tz/leo/spring/listener --- 此文件夹 测试用


src/main/resources/spring-basic.xml （new -- XML Configuration File -- Spring Configure ）
src/main/resources/struts.xml   （new -- XML Configuration File -- Struts Configure ）
src/main/resources/log4j.properties  --- 没有验证其用法




#############  05 配置spring-basic.xml    #############

    <!--创建数据源对象-->           <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
    <!--创建sqlSessionFactory-->    <bean class="org.mybatis.spring.SqlSessionFactoryBean" id="sqlSessionFactory">
    <!--创建DAO对象-->              <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    <!--创建事务管理器-->    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <!--根据事务管理器生成一个事务的环绕通知-->    <tx:advice id="txAdvice" transaction-manager="transactionManager">
    <!--组装事务的切面-->
    <!--管理项目中业务层组件-->    <bean id="empService" class="com.baizhi.service.EmpServiceImpl">
    <!--管理Action组件-->          <bean id="empAction" class="com.baizhi.action.EmpAction">




#############   06 完善完整目录结构中具体的类    #############
src/main/java/com/tz/leo/spring/action/UserAction
src/main/java/com/tz/leo/spring/service/UserService  、 userServiceImpl
src/main/java/com/tz/leo/spring/dao/BaseDao  、 userDao
src/main/java/com/tz/leo/spring/entity/User

#############   07 配置struts.xml    #############

<struts>
    <package name="user" extends="struts-default" namespace="/user">
        <action name="findAll" class="userAction" method="findAll">
            <result name="success">/showAll.jsp</result>
        </action>
    </package>
</struts>


#############  08 配置spring-basic.xml (续) 完善action Service  相关bean #############

    <!--管理项目中业务层组件-->    <bean id="empService" class="com.baizhi.service.EmpServiceImpl">
    <!--管理Action组件-->          <bean id="empAction" class="com.baizhi.action.EmpAction">

#############   09 启动tomcat容器启动ssm项目   #############
1. 配置tomcat 容器，启动项目
1.1 状态栏点击 edit Configuration （启动按钮旁边）,弹出Run/Debug Configurations
1.2 点击 + ，新增 tomcat 容器  （本地测试用的是 jdk 1.8/ Tomcat8.0.35 ）
1.3  配置名称如  spring_ssm_annotaion
1.4 shift+F10 启动此项目 http://localhost:8080/ssm
    默认显示webapp/index.jsp 下面的目录
1.5 测试struts路由是否正确
    按照struts.xml配置文件的配置，更改url参数 为 http://localhost:8080/ssm/user/findAll
    resources/struts.xml 中的内容如下所示

#############   相关sql   #############


CREATE DATABASE ssm;

use ssm;

CREATE TABLE user
(
Id int,
name varchar(255),
age int,
bir date
);

use ssm;
insert INTO USER VALUES (1,'zhangsan',11,'2020/11/11');
insert INTO USER VALUES (2,'lisi',22,'2020/12/12');