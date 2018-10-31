# springcloud-loadbalance

本项目简单ｄｅｍｏ在springcloud中如何使用Ribbon来做客户端负载均衡，运行本示例的方法，

  １．　启动eureka server
  
  2. 启动cloud-server-1
  
  3. 修改cloud-server-1下面的application.yml中的server.port，比如修改为１８０８３
  
  ４． 启动Ribbon　ｃｌｉｅｎｔ
  
  ５． 在浏览器中输入http://localhost:8084/myservice/ribbon/get
     可以看到之前启动的两个服务轮流被调用，在界面上打印不同的端口号
 
