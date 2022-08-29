FROM eclipse-temurin:17.0.4.1_1-jdk-alpine as builder
ADD . /src
WORKDIR /src
RUN sed -i 's/\r$//' mvnw
RUN ./mvnw package -DskipTests

FROM alpine:latest as packager
RUN apk --no-cache add openjdk17-jdk openjdk17-jmods
ENV JAVA_MINIMAL="/opt/java-minimal"
RUN apk add binutils
RUN /usr/lib/jvm/java-17-openjdk/bin/jlink \
    --verbose \
    --add-modules \
        java.base,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument \
    --compress 2 --strip-debug --no-header-files --no-man-pages \
    --release-info="add:IMPLEMENTOR=radistao:IMPLEMENTOR_VERSION=radistao_JRE" \
    --output "$JAVA_MINIMAL"

FROM alpine:latest
LABEL maintainer="darkneees newcrossfire321@mail.ru"
ENV JAVA_HOME=/opt/java-minimal
ENV PATH="$PATH:$JAVA_HOME/bin"
COPY --from=packager "$JAVA_HOME" "$JAVA_HOME"
COPY --from=builder /src/target/ElectronComponents-*.war app.war
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.war" ]