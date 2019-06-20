# Java Maven Project

## Prerequisite

* JDK
  * [Oracle](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  * [Zulu](https://www.azul.com/downloads/zulu/)
  * [Amazon](https://docs.aws.amazon.com/corretto/latest/corretto-8-ug/downloads-list.html)
* Set JAVA_HOME
  * [Windows](https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html)
* [Maven](https://maven.apache.org/download.cgi)
* Set MVN_HOME
  * [Windows](https://www.mkyong.com/maven/how-to-install-maven-in-windows/)

## Basic Maven Command

* Clean Project

```sh
mvn clean
```

* Clean Compile

```sh
mvn compile
```

* Test Project

```sh
mvn test
```

* Package Project

```sh
mvn package
```

## Start Java App

```sh
java -jar target/[project-name].jar
```