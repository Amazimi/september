#FROM为使用哪个镜像
FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME为挂载路径
VOLUME /tmp
#ADD为复制文件到镜像中
ADD sept-docker-demo.jar app.jar
#RUN为初始化时运行的命令
RUN sh -c 'touch /app.jar'
#ENV为设置环境变量
ENV JAVA_OPTS=""
#ENTRYPOINT为启动时运行的命令
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]