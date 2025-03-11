# 面基_面试基础刷题平台
面试刷题平台项目，用户可刷题，查看学习日历并使用项目集成的 DeepSeek 进行AI面试，管理员可管理题目、题库、题解并使用 AI 生成题目。

项目使用数据库连接池、多种缓存数据库缓存数据，实现热 Key 探测、黑名单 IP 过滤、同端登录检测，集成AI DeepSeek 进行AI模拟面试。
## 技术选型
- JDK 17
- 框架：Spring Boot
- 数据存储：MySQL + Redis + Elasticsearch 分词搜索
- 鉴权：Sa-Token
- 配置中心：Nacos
- 限流：Sentinel
- 热点探测：HotKey

### 方案简介
- 使用 Redis 的 Bitmap 位图存储用户刷题日历，单个用户每年日历所占用空间仅365bit=368bit(内存对齐)=46B，百万用户所需内存仅43.8MB
- HotKey 实现热 Key 自动缓存，接口获取题目时判断当前题目是否是热点题目（需先配置规则），如果是则从数据库获取后放入Redis中，之后从Redis获取即可
- 使用 Sentinel 用滑动窗口实时统计接口调用次数，对返回题库列表接口及查看题目列表接口进行限流、熔断
- Nacos 存储更新IP黑名单，后端从Nacos获取黑名单后创建布隆过滤器，基于WebFilter过滤用户IP

## 架构设计
![mianji_架构](https://github.com/user-attachments/assets/931c2308-d487-4b65-94d7-3f554afe8de9)


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
