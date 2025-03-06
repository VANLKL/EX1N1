# JavaWeb实验一

## 项目简介
本项目是一个JavaWeb实验项目，旨在展示如何使用Java Servlet和JSP技术构建一个简单的用户注册系统。用户可以通过网页表单提交注册信息，服务器端接收并处理这些信息，并将结果显示在网页上。

## 安装说明
1. 克隆仓库：
   ```bash
   git clone https://github.com/VANLKL/EX1N1.git
   cd EX1N1
   ```

2. 安装依赖项：
   本项目使用Maven进行依赖管理。确保已安装Maven，并在项目根目录下运行以下命令：
   ```bash
   mvn clean install
   ```

3. 运行项目：
   使用Maven的Tomcat插件运行项目：
   ```bash
   mvn tomcat7:run
   ```

## 运行说明
1. 启动Tomcat服务器后，打开浏览器并访问以下URL：
   ```
   http://localhost:8080/EX1N1/
   ```

2. 在注册页面填写用户信息并提交表单。

3. 服务器将处理提交的信息，并在结果页面显示注册结果。

## 依赖项
本项目主要依赖以下库：
- `jakarta.servlet:jakarta.servlet-api:6.1.0` (provided scope)
- `org.junit.jupiter:junit-jupiter-api:5.11.0` (test scope)
- `org.junit.jupiter:junit-jupiter-engine:5.11.0` (test scope)
