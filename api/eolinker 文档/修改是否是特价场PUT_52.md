##修改是否是特价场

**请求协议|请求方法**：HTTP|PUT

**接口路径**：/bargain

**接口使用状态**：已经弃用

**请求头部**：

| 头部标签 | 必填  | 头部内容 | 
| :------------ | :------------ |

**鉴权**：

**验证类型**：
无

**请求参数**
参数类型：Json
根类型: Object

| 参数名 | 说明 | 必填 | 类型 | 值可能性 |  限制 | 示例 |
| :------------ | :------------ | :------------ | :------------ | :------------ | :------------ | :------------ |
|state||是|[number]||0:特价场 1:普通场|

**返回参数**
参数类型：Json
根类型: Object

| 参数名  | 说明 |  | 类型 | 值可能性 | 限制 | 示例 |
| :------------ | :------------ | :------------ | :------------ | :------------ | :------------ | :------------ |
|data||是|[object]||||
|message||是|[string]|||success|
|status|状态码|是|[number]|||200|

**数据结构**：


Normalresponse

| 参数名  | 说明 | 必填 | 类型 | 值可能性 | 限制 |  示例 |
| :------------ | :------------ | :------------ | :------------ | :------------ | :------------ | :------------ |

**成功示例[Mock API]**：


**mock api**：https://result.eolinker.comVHpSWiEb7482c7bfbc92a5ec980f56a421b4cbac3ff8d4d?uri=/bargain
```

```

**失败示例[Mock API]**：


**mock api**：https://result.eolinker.comVHpSWiEb7482c7bfbc92a5ec980f56a421b4cbac3ff8d4d?uri=/bargain&resultType=failure
```

```

**详细说明**：


```
