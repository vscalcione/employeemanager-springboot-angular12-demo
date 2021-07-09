# employeemanager-springboot-angular12-demo

## Backend

![java-logo](https://img.icons8.com/color/50/000000/java-coffee-cup-logo--v1.png)
![springboot-logo](https://img.icons8.com/color/50/000000/spring-logo.png)
![apachemaven-logo](https://img.icons8.com/ios/50/000000/maven-ios.png)

To build the backend module, you can run these commands:
```bash
mvn clean install -U -DSkipTests=true
mvn spring-boot:run
```

If in your shell, after executing these commands, the outputs is "**mvn: command not found**", it means that on your machine isn't installed apache-maven package.
Go to https://maven.apache.org/download.cgi and download the maven package (zip for Windows, tar.gz for Linux). 

For the use on the shell or cmd.exe, you do several steps:
- Extract the downloaded package
- If you are on a Windows Machine, define System Environment Variable and added this variable to PATH variable
- If you are on a Linux Machine, define a System Environment Variable throw editing .bashrc file and export this variable and then type the command **$ source .bashrc** to execute

## Frontend
![angular-logo](https://img.icons8.com/color/50/000000/angularjs.png)
![typescript-logo](https://img.icons8.com/color/50/000000/typescript.png)
![javascript-logo](https://img.icons8.com/color/50/000000/javascript--v1.png)
![nodejs-logo](https://img.icons8.com/color/50/000000/nodejs.png)

To build the frontend module, you can run these commands:
```bash
$ npm install
$ npm run
```

If in your shell, after executing these commands, the output is **ng serve: command not found**, it means that on your machine isn't installed @angular/cli package.
Run this command to install:
```bash
$ npm install -g @angular/cli
$ ng version
```
