package com.github.xtermi2.java16.jep392jpackage;

/**
 * Steps to build an run:
 * <p>
 * export JAVA_HOME=/usr/lib/jvm/java-16-openjdk-amd64
 * <br/>
 * export PATH=/usr/lib/jvm/java-16-openjdk-amd64/bin:$PATH
 * <br/>
 * ./mvnw clean package
 * <br/>
 * jpackage --name myapp --input target --main-jar java16-1.0-SNAPSHOT.jar --main-class com.github.xtermi2.java16.jep392jpackage.Main --java-options "--enable-preview"
 * <br/>
 * sudo dpkg -i myapp_1.0-1_amd64.deb
 * <br/>
 * /opt/myapp/bin/myapp
 * <br/>
 * sudo apt-get remove myapp
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
