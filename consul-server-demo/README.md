# 服务治理 - Consul

* Eureka 2.x 不再开源
* Consul具有更好的性能（一定程度上）
* 服务注册失败：
  * 除了consul-discovery 的 starter外，还需要导入监控检查依赖： spring-boot-starter-actuator
* consul服务器开启
    * ```consul agent -dev```