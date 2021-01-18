* 1.启动 两个服务器 控制台输入 slave1 slave2
* 2.启动 两个服务提供者 8081 8082
* 3.启动服务调用者
* 4.启动测试类 


输出:
'''
{"id":1,"age":30,"message":"http://localhost:8081/person/1"}
{"id":1,"age":30,"message":"http://localhost:8082/person/1"}
{"id":1,"age":30,"message":"http://localhost:8081/person/1"}
{"id":1,"age":30,"message":"http://localhost:8082/person/1"}
{"id":1,"age":30,"message":"http://localhost:8081/person/1"}
{"id":1,"age":30,"message":"http://localhost:8082/person/1"}

达到负载均衡效果
