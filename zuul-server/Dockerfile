# 基于哪个镜像
FROM java:8

# 将本地文件夹挂载到当前容器
VOLUME /docker/container

# 拷贝文件到容器，也可以直接写成ADD eureka-server-0.0.1-SNAPSHOT.jar /app.jar
# 这个地方jar包名称改成自己的jar名称
ADD ./target/zuul-server-0.0.1-SNAPSHOT.jar /app.jar
RUN bash -c 'touch /app.jar'

# 开放8080端口
EXPOSE 8080

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]