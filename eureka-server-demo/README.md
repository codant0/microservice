# Eureka服务注册中心集群（单主机）

## 使用profile文件实现配置切换

* 解决生产环境 / 开发环境需要不同配置的问题
* application.yaml配置文件中，定义公共配置文件和局部配置文件，用 " --- " 分隔不同profile文件，并分别配置spring.profile 
* host文件中配置DNS映射

### profile运行方式 

* maven：

  ```maven
  $ mvn clean
  $ mvn package
  $ java -jar <artifactId>-<version> --spring.profiles.active = <profiles.active>
  ```

  ![image-20200721095359067](C:\Users\87912\AppData\Roaming\Typora\typora-user-images\image-20200721095359067.png)

* IDEA：

  * 在新建Edit Configurations 中新建SpringBoot服务并在active profiles 中加上profiles名称即可

### 节点出现在unavailable-replicas可能原因：

* 各个profile的application.name应相同
* prefer-ip-address应设为false
* register-with-eureka应为true
* 不能直接使用ip作为hostname