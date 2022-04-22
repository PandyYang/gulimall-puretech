# gulimall-puretech-group
谷粒商城项目，由纯技术小组成员共同完成。

## 项目成员小伙伴一览

大白菜、
lyr、
毛利、
Upward-Yang、
午夜轻蓝、
dida

## 项目分工情况

| 核心功能               | Upward-Yang | CnCabbages大白菜 | 毛利 | lyr  | dida |
| ---------------------- | ----------- | ---------------- | ---- | ---- | ---- |
| 第三方认证登录（微博） |             |                  |      |      |      |
| 购物车                 |             | ✔️                |      |      |      |
| 公共组件方法           | ✔️           |                  |      |      | ✔️    |
| 优惠券                 | ✔️           |                  |      |      |      |
| 网关                   |             |                  |      |      | ✔️    |
| 成员                   |             |                  |      |      |      |
| 订单                   |             | ✔️                |      |      | ✔️    |
| 产品                   |             |                  | ✔️    | ✔️    |      |
| 搜索                   |             |                  | ✔️    |      |      |
| 秒杀                   | ✔️           |                  |      |      | ✔️    |
| 单点登录               |             | ✔️                |      |      |      |
| 邮件 短信 oss          |             |                  |      |      | ✔️    |
| 仓库                   | ✔️           |                  |      |      |      |
| 前端                   |             |                  |      |      | ✔️    |


## 后端项目及前端项目所用组件及版本情况

| 组件名称                             | 版本          |
| ------------------------------------ | ------------- |
| Jdk                                  | 1.8           |
| SpringBoot                           | 2.1.8.RELEASE |
| SpringCloud                          | Greenwich.SR3 |
| redisson                             | 3.12.2        |
| nekohtml                             | 1.9.22        |
| shiro-core                           | 1.4.0         |
| junit                                | 4.12          |
| Mybatis-plus                         | 3.2.0         |
| Lombok                               | 1.18.10       |
| httpcore                             | 4.4.12        |
| commons-lang                         | 2.6           |
| mysql-connector-java                 | 8.0.25        |
| servlet-api                          | 2.5           |
| openfeign                            | 2.2.5.RELEASE |
| httpclient                           | 4.5.12        |
| alibaba.cloud                        | 2.1.0.RELEASE |
| elasticsearch-rest-high-level-client | 7.2.0         |
| Druid                                | 1.1.13        |
| Node.js                              | 14.17.5       |

## 项目名称规范，编码规范，包名规范，review规则，单元测试规范

**项目名称规范：** 统一的格式为gulimall-puretech-**， 例如在主项目gulimall-puretech下面，
创建产品模块，对应的项目名称应该为：gulimall-puretech-product。

**编码规范：** 参考alibaba编码规范。

**包名规范：** 包名规范遵循国际规范，统一为：com.puretech.gulimall.*

**review规则：** 项目的代码结构必须符合规范，不能出现警告，缩进，空格等等不允许出现多或者少的情况。整个代码结构
还要注意回车换行，保持整体的整洁美观。

**单元测试规范：** 对于复杂的业务结构，鼓励测试驱动开发，尽量做到单测覆盖率百分之60及以上。推荐使用mock测试，相关
课题在之后的共同学习中再进行探讨。大家分享下经验心得。提高编码质量。
