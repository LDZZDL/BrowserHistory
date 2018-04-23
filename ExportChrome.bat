@echo off
rem 创建bin目录
mkdir bin
rem 编译
javac -encoding utf-8 -sourcepath .\src\com\chrome\browserhistory -cp .\lib\commons-codec-1.10.jar;.\lib\commons-collections4-4.1.jar;.\lib\curvesapi-1.04.jar;.\lib\poi-3.17.jar;.\lib\poi-ooxml-3.17.jar;.\lib\poi-ooxml-schemas-3.17.jar;.\lib\sqlite-jdbc-3.21.0.jar;.\lib\stax-api-1.0.1.jar;.\lib\xmlbeans-2.6.0.jar; -d .\bin .\src\com\chrome\browserhistory\*.java
rem 复制配置文件
copy .\src\history.properties .\bin\
rem 运行
java -cp .\bin;.\lib\commons-codec-1.10.jar;.\lib\commons-collections4-4.1.jar;.\lib\curvesapi-1.04.jar;.\lib\poi-3.17.jar;.\lib\poi-ooxml-3.17.jar;.\lib\poi-ooxml-schemas-3.17.jar;.\lib\sqlite-jdbc-3.21.0.jar;.\lib\stax-api-1.0.1.jar;.\lib\xmlbeans-2.6.0.jar; com.chrome.browserhistory.Main
rem 删除bin目录
rd /s/q .\bin
pause