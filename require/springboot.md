





# Springboot +MP 课程                         覃老师        班级：20204122

# 前言

java开发包括JavaSE(Java Standard Edition，Java 标准版)。是Java技术的核心和基础，是Java ME和Java EE编程的基础。

javaME [Java](又称为J2ME（Java Platform，Micro Edition），是为机顶盒、移动电话和PDA之类嵌入式消费[电子设备](https://baike.baidu.com/item/电子设备/4393826?fromModule=lemma_inlink)提供的Java语言平台，包括[虚拟机](https://baike.baidu.com/item/虚拟机/104440?fromModule=lemma_inlink)和一系列标准化的Java API。在08年之前特别火，08年之后随着智能手机的普及，逐渐被Android和IOS代替。

## JavaEE工程师

JavaEE 之前叫 J2EE  在 是java企业级应用开发。主要包含技术有：

**javaSE 包括：**（java基础、 运算符、控制流程、面向对象、异常处理、集合、IO流、常见的类、多线程、网络编程、泛型、JDBC编程、反射等……）

**javaWeb 技术：**

一、前端技术：（**了解为主**）

**前端工程师：**

 HTML（Hyper Text Markup Language）超文本标记语言，包含一系列标签，可以用浏览器直接打开。

CSS （英文全称：Cascading Style Sheets）层叠样式表 只要是用来**静态网页**的美观。

JS （JavaScript）是一种具有函数优先的[轻量级](https://baike.baidu.com/item/轻量级/10002835?fromModule=lemma_inlink)，解释型或即时编译型的[编程语言]。可以通过浏览器直接解析。

jQuery是一个快速、简洁的[JavaScript](https://baike.baidu.com/item/JavaScript/321142?fromModule=lemma_inlink)框架。

Node.JS + Vue 渐进式 javaScript 框架。

react React是用于构建[用户界面](https://baike.baidu.com/item/用户界面/6582461?fromModule=lemma_inlink)的[JavaScript](https://baike.baidu.com/item/JavaScript/321142?fromModule=lemma_inlink)库。起源于[Facebook](https://baike.baidu.com/item/Facebook/7449587?fromModule=lemma_inlink)的内部项目，该公司对市场上所有 JavaScript [MVC](https://baike.baidu.com/item/MVC/85990?fromModule=lemma_inlink)框架都不满意，决定自行开发一套，用于架设[Instagram](https://baike.baidu.com/item/Instagram/8550544?fromModule=lemma_inlink)的网站。于2013年5月开源。

 一、servlet  jsp

二、java web服务器**tomcat** 、JBoss、WebSphere、WebLogic

[Java中常见的服务器_竖子敢尔的博客-CSDN博客](https://blog.csdn.net/m0_72345017/article/details/127345928)

咱们以tomcat做教学讲解。

后端技术：（**全部掌握**）

#### 后端框架篇（重点中的重点）

spring6 框架   全部掌握 

Spring MVC 全部掌握

mybatis 全部掌握

mybatis puls 全部掌握

springboot 全部掌握

springcloud （重点掌握） springcloud alibaba （掌握）

#### 关系型数据库（MySQL、Oracle、SQLServer DB2等）需要掌握MySQL 

#### 非关系型数据库 如：redis 需要掌握

**拓展知识**

Linux 命令

Docker 容器技术

K8S集群

云原生开发。





### Springboot 入门开发：

springboot 是由Pivotal 团队开发的全新框架，为了简化Spring应用的繁琐配置，设计简化Spring 应用的初始化搭建的开发过程。

官网：[Getting Started | Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)



![image-20230227122239298](img\image-20230227122239298.png)

springboot 3以后要求JDK 必须是17版本，Spring必须是6.0以上版本，所以按照2.7.9讲解。

下面看案例：

![image-20230227122603647](img\image-20230227122603647.png)

![image-20230227122714261](img\image-20230227122714261.png)

面试问题①

### restcontroller和controller区别

RestController的作用相当于Controller加ResponseBody共同作用的结果，但采用RestController请求方式一般会采用Restful风格的形式。

Controller的作用：声明该类是Controller层的Bean，将该类声明进入Spring容器中进行管理

ResponseBody的作用：表明该类的所有方法的返回值都直接进行提交而不经过视图解析器，且返回值的数据自动封装为json的数据格式

RestController的作用：包含上面两个的作用，且支持Restful风格的数据提交方式

Restful风格：

get:获取数据时用的请求方式

post：增加数据时的请求方式

put：更新数据时的请求方式

delete：删除数据时的请求方式



### 通过maven创建Springboot工程



![image-20230228101409238](D:\项目录屏\三峡大学科技学院\javaEE课程体系\springboot\笔记\img\image-20230228101409238.png)

![image-20230228101203614](D:\项目录屏\三峡大学科技学院\javaEE课程体系\springboot\笔记\img\image-20230228101203614.png)



### 通过阿里云创建springboot工程



### springboot配置

![image-20230228110745517](D:\项目录屏\三峡大学科技学院\javaEE课程体系\springboot\笔记\img\image-20230228110745517.png)



![image-20230228111047636](D:\项目录屏\三峡大学科技学院\javaEE课程体系\springboot\笔记\img\image-20230228111047636.png)

Springboot 有三种配置文件：分别是 *.properties, *yml,*yaml

三种配置文件的优先级  **properties > yml > yaml**



![image-20230228111638523](D:\项目录屏\三峡大学科技学院\javaEE课程体系\springboot\笔记\img\image-20230228111638523.png)



yml中配置信息如下：

字符串：

```
country: 中国

```

![image-20230228140951925](C:\Users\jiazhixian\AppData\Roaming\Typora\typora-user-images\image-20230228140951925.png)



数组：

```
likes:
  - game
  - music
  - sleep
```

对象一

```
users:
  - name: zhangsan
    age: 18
  - name: lisi
    age: 17
```

对象二

```
users3: [{name:zhangsan,age:18},{name:lisi,age:17}]
```

![image-20230228144720063](\img\image-20230228144720063.png)



Springboot整合mybatis 



pom文件：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.9</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.example</groupId>
    <artifactId>mybatis-springboot</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>mybatis-springboot</name>
    <description>mybatis-springboot</description>
    <properties>
        <java.version>1.8</java.version>
    </properties>
    <dependencies>
        <!--springboot-web-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
       <!-- mybatis-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>2.3.0</version>
        </dependency>
        <!--mysql-->
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <!--lombok-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>

```

yml配置

```xml
#2.配置相关信息
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    password: mysqlroot
    url: jdbc:mysql://localhost:3306/sanxia?serverTimezone=GMT%2B8&useSSL=FALSE
    username: root
mybatis:
  mapper-locations: 'classpath:mybatis/mapper/*.xml '
  type-aliases-package: com.example.mybatisspringboot.domain
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
	
  
    
```

domain

```java
package com.example.mybatisspringboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:Users
 * Package:com.example.mybatisspringboot.domain
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 16:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private int id;
    private String name;
    private String sex;


}

```

mapper

```java
package com.example.mybatisspringboot.mapper;

/**
 * ClassName:UsersMapper
 * Package:com.example.mybatisspringboot.mapper
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 16:46
 */

import com.example.mybatisspringboot.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
@Mapper
public interface UsersMapper {


    List<Users> queryUserList();

    Users queryUserById(int id);

    int addUser(Users user);

    int updateUser(Users user);

    int deleteUser(int id);

}

```

UsersMapper.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.example.mybatisspringboot.mapper.UsersMapper">
     <resultMap id="listUsers" type="com.example.mybatisspringboot.domain.Users">
        <result property="id" column="id"/>
        <result property="name" column="name"/>
        <result property="sex" column="sex"/>
    </resultMap>
    <select id="queryUserList" resultType="Users">
        select * from users

    </select>

    <select id="queryUserById" resultType="Users">
        select *
        from users
        where id=#{id};
    </select>

    <insert id="addUser" parameterType="Users">
        insert into users(id,name,sex)
        values(#{id},#{name},#{sex});

    </insert>

    <update id="updateUser" parameterType="Users">
        update users
        set name=#{name},sex=#{sex}
        where id=#{id};
    </update>

    <delete id="deleteUser" parameterType="int">
        delete
        from users
        where id=#{id};

    </delete>

</mapper>

```

controller

```java
package com.example.mybatisspringboot.controller;

import com.example.mybatisspringboot.domain.Users;
import com.example.mybatisspringboot.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:UsersController
 * Package:com.example.mybatisspringboot.controller
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 18:27
 */
@RestController
public class UsersController {
    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/queryUserList")
    public List<Users> queryUserList(){
        List<Users> userList = usersMapper.queryUserList();

        for(Users user:userList){
            System.out.println(user);
        }

        return userList;
    }

    @GetMapping("/queryUserById")
    public Users queryUserById(){

        Users user = usersMapper.queryUserById(1);
        return user;



    }


    @GetMapping("/addUser")
    public String addUser(){
        usersMapper.addUser(new Users(3,"小霸王1111","男"));
        return "添加成功";

    }

    @GetMapping("/updateUser")
    public String updateUser(){
        usersMapper.updateUser(new Users(3,"秃驴","女"));
        return "更改成功";
    }


    @GetMapping("/deleteUser")
    public String deleteUser(){
        usersMapper.deleteUser(1);
        return "删除成功";

    }


}

```

![image-20230228164017542](C:\Users\jiazhixian\AppData\Roaming\Typora\typora-user-images\image-20230228164017542.png)

### mybitis plus学习

官网：[MyBatis-Plus (baomidou.com)](https://baomidou.com/)

![image-20230301150331660](\img\image-20230301150331660.png)





### springboot整合mybitis plus

项目创建第一步：



![image-20230228204945932](img\image-20230228204945932.png)



![image-20230228205120162](\img\image-20230228205120162.png)

第二步：添加mybitis plus 依赖：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.9</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.sanxia</groupId>
    <artifactId>springboot-mp</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>springboot-mp</name>
    <description>springboot-mp</description>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <!--重点添加-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.5.2</version>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <encoding>UTF-8</encoding>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>

```

第三步 配置yml 文件

```yml
server:
  port: 10086
spring:
  #配置数据源信息
  datasource:
    type: com.zaxxer.hikari.HikariDataSource
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/sanxia?serverTimezone=GMT%2B8&useSSL=FALSE
    username: root
    password: mysqlroot

mybatis:
  mapper-locations: 'classpath:mybatis/mapper/*.xml '
  type-aliases-package: com.sanxia.springbootmp.domian
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl

```

第四步 编写实体类：

```java
@Data
public class Users {
    private int id;
    private String name;
    private String sex;

}

```

第五步 编写mapper

```java
package com.sanxia.springbootmp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sanxia.springbootmp.domian.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:UsersMapper
 * Package:com.sanxia.springbootmp.mapper
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 21:03
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}

```

第六步 添加启动类  注解

```java
@SpringBootApplication
@MapperScan("com.sanxia.springbootmp.mapper")
public class SpringbootMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMpApplication.class, args);
    }

}
```

第七步 创建测试

```java
@SpringBootTest
public class MpSpringBootTest {
    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testMpspringboot(){
        List<Users> users = usersMapper.selectList(null);
        users.forEach(System.out::println);

    }
}
```

第八步 编写 controller

```java
package com.sanxia.springbootmp.controller;

import com.sanxia.springbootmp.domian.Users;
import com.sanxia.springbootmp.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UsersController
 * Package:com.sanxia.springbootmp.controller
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 21:15
 */
@RestController
public class UsersController {
    @Resource
    private UsersMapper usersMapper;

    @GetMapping("/listUser")
    public String getUsersAll(){
        List<Users> usersList = usersMapper.selectList(null);
        for(Users user:usersList){
            System.out.println(user);
        }
        return "查询成功！";
    }
}

```

### 统一返回结果

```java
package com.example.mybatisspringboot.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * cow-core
 *
 * @author : axian
 * @date : 2022-08-25 17:38
 **/
public class R <T>{
    private Integer code; //编码：200成功，0和其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 200;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }


}

```

改造之前Springboot整合mybatis 统一返回统一测试。

controller

```java
package com.example.mybatisspringboot.controller;

import com.example.mybatisspringboot.domain.Users;
import com.example.mybatisspringboot.mapper.UsersMapper;
import com.example.mybatisspringboot.tools.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:UsersController
 * Package:com.example.mybatisspringboot.controller
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 18:27
 */
@RestController
public class UsersController {
    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/queryUserList")
    public R queryUserList(){
        List<Users> userList = usersMapper.queryUserList();

       if(userList != null){
           return R.success(userList);
       }

        return R.error("未查到你要的数据");
    }

    @GetMapping("/queryUserById/{id}")
    public R queryUserById(@PathVariable Integer id){

        Users user = usersMapper.queryUserById(id);
        if(user != null){
            return R.success(user);
        }

        return R.error("未查到你要的数据");
    }
    @PostMapping("/addUser")
    public R addUser(@RequestBody Users users){
            return R.success(usersMapper.addUser(users));
    }

    @PutMapping ("/updateUser")
    public R updateUser(@RequestBody Users users){
        return R.success(usersMapper.updateUser(users));
    }


    @DeleteMapping("/deleteUser/{id}")
    public R deleteUser(@PathVariable Integer id){
       return R.success(usersMapper.deleteUser(id));

    }


}

```

### mybatis puls 学习

mapper测试

```java
package com.sanxia.springbootmp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sanxia.springbootmp.domian.Users;
import com.sanxia.springbootmp.mapper.UsersMapper;
import com.sanxia.springbootmp.tools.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UsersController
 * Package:com.sanxia.springbootmp.controller
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-2-28 - 21:15
 */
@RestController
public class UsersController {
    @Resource
    private UsersMapper usersMapper;
    //查询所有
    @GetMapping("/listUser")
    public R getUsersAll(){
        List<Users> users = usersMapper.selectList(null);

        if(users == null){
            R.error("未插到你要的数据");
        }
        return R.success(users);
    }
    //按照ID查询
    @GetMapping("/getById/{id}")
    public R getById(@PathVariable Integer id){
        Users users = usersMapper.selectById(id);
        if(users == null){
          return   R.error("未插到你要的数据");
        }
        return R.success(users);
    }
    @PutMapping("/updateById")
    public R updateById(@RequestBody Users users){
        int num = usersMapper.updateById(users);
       if(num > 0){
          return R.success("修改成功");
       }
       return R.error("未修改成功！");
    }
    //添加操作
    @PostMapping("/addUser")
    public R addUsers(@RequestBody Users users){
        int num = usersMapper.insert(users);
        if(num > 0){
            return R.success("添加成功");
        }
        return R.error("添加不成功！");
    }
    //删除操作
    @DeleteMapping("/del/{id}")
    public R delUsers(@PathVariable Integer id){

        int num = usersMapper.deleteById(id);
        if(num > 0){
            return R.success("删除成功");
        }
        return R.error("删除成功！");
    }

    //按照条件查询
    @GetMapping("/whereUser/{name}")
    public R getWhereUsers(@PathVariable String name){
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();

        queryWrapper.like("name",name);

        List<Users> usersList = usersMapper.selectList(queryWrapper);

        if(usersList == null){
           return R.error("未查到数据");
        }
        return R.success(usersList);
    }
}

```

打印SQL日志：

```yml
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
```

yml基本配置：

```yml
server:
  port: 10086
spring:
  #配置数据源信息
  datasource:
    type: com.zaxxer.hikari.HikariDataSource
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/sanxia?serverTimezone=GMT%2B8&useSSL=FALSE
    username: root
    password: mysqlroot
```

```java
@Data
public class Users {
    private int id;
    private String name;
    private String sex;
    private Integer age;
    private Integer height;

}
```

![image-20230301200033633](\img\image-20230301200033633.png)



### Service CRUD 讲解。

 继承extends IService （接口）

ServiceImpl<Mapper,Entity> 类 

添加方法：

```java
// 插入一条记录（选择字段，策略插入）
boolean save(T entity);
// 插入（批量）
boolean saveBatch(Collection<T> entityList);
```



查询方法：

```java
// 查询所有
List<T> list();
// 查询列表
List<T> list(Wrapper<T> queryWrapper);
```

### Count

```java
// 查询总记录数
int count();
// 根据 Wrapper 条件，查询总记录数
int count(Wrapper<T> queryWrapper);
```

修改方法：

```java
// 根据 UpdateWrapper 条件，更新记录 需要设置sqlset
boolean update(Wrapper<T> updateWrapper);
// 根据 whereWrapper 条件，更新记录
boolean update(T updateEntity, Wrapper<T> whereWrapper);
// 根据 ID 选择修改
boolean updateById(T entity);
// 根据ID 批量更新
boolean updateBatchById(Collection<T> entityList);
// 根据ID 批量更新
boolean updateBatchById(Collection<T> entityList, int batchSize);
```

删除方法：

![image-20230302193634628](\img\image-20230302193634628.png)

```java
// 根据 entity 条件，删除记录
boolean remove(Wrapper<T> queryWrapper);
// 根据 ID 删除
boolean removeById(Serializable id);
// 根据 columnMap 条件，删除记录
boolean removeByMap(Map<String, Object> columnMap);
// 删除（根据ID 批量删除）
boolean removeByIds(Collection<? extends Serializable> idList);
```

```java
package com.xiange.mpboot03.comtroller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiange.mpboot03.domain.Users;
import com.xiange.mpboot03.service.UserService;
import com.xiange.mpboot03.tools.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserMapper
 * Package:com.xiange.mpboot03.comtroller
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-2 - 10:29
 */
@CrossOrigin
@RestController
public class UserComtroller {
    @Resource
    private UserService userService;

    @GetMapping("/UserAll")
    public R getUserAll(){
        List<Users> list = userService.list();

        if(list == null){
          return   R.error("没有查到数据");
        }
        return R.success(list);
    }

    @GetMapping("/Users/getById/{id}")
    public R getById(@PathVariable Integer id){
        Users user = userService.getById(id);
        if(user == null){
            return   R.error("没有查到数据");
        }
        return R.success(user);
    }

    @GetMapping("Users/getlikes/{age}")
    public R getLis(@PathVariable Integer age){
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age",age);
        List<Users> usersList = userService.list(queryWrapper);
        if(usersList == null){
            return   R.error("没有查到数据");
        }
        return R.success(usersList);

    }

    @PostMapping("/add/user")
    public R addUser(@RequestBody Users users){
        boolean save = userService.save(users);

        if(save){
            return R.success("添加成功！");
        }
        return R.error("添加失败！");
    }

    @PutMapping("/update/User")
    public  R update(@RequestBody Users users){
        boolean b = userService.updateById(users);

        if(b){
            return R.success("修改成功！");
        }
        return R.error("修改失败！");
    }

    @DeleteMapping("/user/del/{id}")
    public R del(@PathVariable Integer id){
        boolean b = userService.removeById(id);
        if(b){
            return R.success("删除成功！");
        }
        return R.error("删除失败！");
    }

}

```





### mybatis Puls 注解讲解

学习官网：

### 多表查询练习

**第一步：创建数据库表：**

![image-20230303093200606](\img\image-20230303093200606.png)

**第二步：写实体类**

①

```java
package com.xiange.mpboot03.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName:classify
 * Package:com.xiange.mpboot03.domain
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 8:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classify {
    @TableId(value = "classifyId" ,type = IdType.AUTO)
    private Integer id;
     private String classifyName;
    private Date createTime;
    private Date  updateTime;

}

```

②

```java
package com.xiange.mpboot03.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName:content
 * Package:com.xiange.mpboot03.domain
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 8:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {
    @TableId(value = "contentId" ,type = IdType.AUTO)
   private Integer id;
    private String  title;
    private String author;
    private String content;
    private Integer classifyId;
    private Date createTime;
    private Date updateTime;
    @TableField(exist = false)
    private Classify classify;



}

```

**第三步：写Mapper**

①

```java
package com.xiange.mpboot03.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiange.mpboot03.domain.Classify;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:Classify
 * Package:com.xiange.mpboot03.mapper
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 8:39
 */
@Mapper
public interface ClassifyMapper extends BaseMapper<Classify> {

}

```

②

```java
package com.xiange.mpboot03.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiange.mpboot03.domain.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:ContentMapper
 * Package:com.xiange.mpboot03.mapper
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 8:44
 */
@Mapper
public interface ContentMapper extends BaseMapper<Content> {

    public List<Content> gatContentAll();

    public Content getById(Integer id);
}

```

**第四步 配置Mapper.xml**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<mapper namespace="com.xiange.mpboot03.mapper.ContentMapper">
    <resultMap type="com.xiange.mpboot03.domain.Content" id="listContent">
        <result property="id" column="content_id"/>
        <result property="title" column="title"/>
        <result property="author" column="author"/>
        <result property="content" column="content"/>
        <result property="classifyId" column="classify_id"/>
        <result property="createTime" column="create_time"/>
        <result property="updateTime" column="update_time"/>

        <association property="classify"  javaType="com.xiange.mpboot03.domain.Classify" >
            <result property="id" column="classify_id" />
            <result property="classifyName" column="classify_name" />
        </association>


    </resultMap>

    <select id="gatContentAll" resultMap="listContent">
        select c.content_id,
                   c.title,
            c.author,
            c.content,
            c.classify_id,
            c.create_time,
            c.update_time,
            c1.classify_id,
            c1.classify_name
            from content c left join classify c1
                on c.classify_id = c1.classify_id


    </select>

    <select id="getById" resultMap="listContent">
        select c.content_id,
               c.title,
               c.author,
               c.content,
               c.classify_id,
               c.create_time,
               c.update_time,
               c1.classify_id,
               c1.classify_name
        from content c left join classify c1
                                 on c.classify_id = c1.classify_id where c.content_id =#{id}


    </select>
</mapper>
```

**第五步写 service**

①

```java
package com.xiange.mpboot03.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiange.mpboot03.domain.Classify;

/**
 * ClassName:Classifyservice
 * Package:com.xiange.mpboot03.service
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 8:41
 */
public interface ClassifyService extends IService<Classify> {
}

```

②

```java
package com.xiange.mpboot03.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiange.mpboot03.domain.Content;

import java.util.List;

/**
 * ClassName:ContentService
 * Package:com.xiange.mpboot03.service
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 8:55
 */
public interface ContentService extends IService<Content> {
    public List<Content> gatContentAll();

    public Content getById(Integer id);

}

```

第六步 写controller

```java
package com.xiange.mpboot03.comtroller;

import com.xiange.mpboot03.domain.Content;
import com.xiange.mpboot03.service.ContentService;
import com.xiange.mpboot03.tools.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:ContentController
 * Package:com.xiange.mpboot03.comtroller
 * Description:
 *
 * @Author: 贤哥编程
 * @Create: 2023-3-3 - 9:16
 */
@RestController
public class ContentController {
    @Resource
    private ContentService contentService;

    @GetMapping("/contentAll")
    public R getContentAll(){
        List<Content> contents = contentService.gatContentAll();

        if(contents == null){
            return R.error("未查询到");
        }
        return R.success(contents);
    }
    @GetMapping("/getById/content/{id}")
    public R getById(@PathVariable Integer id){
        Content content = contentService.getById(id);
        if(content == null){
            return R.error("未查询到");
        }
        return R.success(content);
    }
}

```



$$

$$
