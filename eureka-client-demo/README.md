# "服务提供者"客户端 & 客户端集群

* **@EnableDiscoveryClient 和 @EnableEurekaClient区别**
  * EnableEurekaClient 中使用了EnableDiscoveryClient。因此，从使用角度来看两者已经没有什么区别了。
  * **官方建议使用@EnableDiscoveryClinet**
    * @EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现。
    * @EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用。
    * @EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
* 