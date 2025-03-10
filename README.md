# 面基_面试基础刷题平台
面试刷题平台项目，用户可刷题，查看学习日历并使用项目集成的 DeepSeek 进行AI面试，管理员可管理题目、题库、题解并使用 AI 生成题目。

项目使用数据库连接池、多种缓存数据库缓存数据，实现热 Key 探测、黑名单 IP 过滤、同端登录检测、反爬虫，集成AI DeepSeek 进行AI模拟面试。
## 技术架构
- JDK 17
- 框架：Spring Boot
- 数据存储：MySQL + Redis + Elasticsearch 分词搜索
- 鉴权：Sa-Token
- HotKey 实现热 Key 自动缓存
- 使用 Sentinel 对部分接口进行限流、熔断策略
- Nacos 及 布隆过滤器 创建黑名单过滤器

## 架构设计


## 项目成品展示
- 部署实测需两台 2核2g 服务器（一台服务器卡内存，需要舍弃 nacos、es）
- 主页
![image](https://github.com/user-attachments/assets/f6b42b44-348e-4545-b65d-3a92867aae48)
- AI 模拟面试
![image](https://github.com/user-attachments/assets/1638b2a5-6ebf-497c-ad8d-512c74194cbf)
- 题目详情
![image](https://github.com/user-attachments/assets/456142e6-0dbb-4008-8dbc-b3cfcf855153)

测试用户 user 密码 12345678

### 待开发
- [x] 引入 AI 功能
- [ ] 用户发帖模块
