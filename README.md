# 基于java的仿QQ桌面软件
> 这是一个模仿QQ的即时聊天软件，可以通过运行在本地的服务端，实现两个客服端之间的通信，即聊天。采用的是javafx架构作为GUI设计架构，个人认为优点是可以自己设计css，使界面达到美观的目的。
本项目共有登录、注册、重置密码、主界面发消息、添加好友、好友列表项、查看聊天记录、删除聊天记录、未读消息提醒、好友主页、我的主页等模块。
该项目还调用了短信验证码的api和图灵机器人的api。在进行注册和重置密码时，都会有发送验证码的按钮，通过输入的手机号接收验证码。
每个人的账号都会有个聊天助手，聊天助手就是接入的图灵机器人，可实现自动智能回复。

## 项目准备
### 项目工具
 - IDEA、Eclipse等编译工具
 - Navicat
 - JavaFX scene Builder
### 准备数据库(MySQL)
 - 创建数据库wechat
 - 使用Navicat或其他MySQL可视化工具运行database路径下的SQL文件

### 环境准备
下载一个JavaFX scene Builder，获取[链接](https://pan.baidu.com/s/1b__UVMt82zYK9MrwypTvgQ)
提取码：hd4j。将JavaFX配置到idea中(具体操作自己查找)
### 项目运行
QQ服务端地址：
```
https://github.com/CooliHe/qq-server
```
**Tips：** 在Model.database下配置自己的数据库信息。 短信服务的话，想要就去买一个，不想要可直接打印在控制台。
将jar包导入(都放在了jar文件夹)。
把项目克隆到本地部署,直接主程序Main即可。

详情访问博客：[java版仿QQ聊天](https://www.coolive.top/archives/java_qq.html)
