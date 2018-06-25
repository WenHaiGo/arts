##总览(一星)
刚刚实习,时间不多,第一次做LeetCode<br/>
1.俩道算法题目(A)  
2.目前还不知道好的英文文章来源(R)  
3.在公司学了一个新的框架dwr(T)   
4.如何把复杂单体应用快速迁移到微服务(S) 

### 算法部分
#### leetcode1 数组去重
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
```class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        //判断无输入
        int number = 0;//标记计数
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1; //标记+1即为数字个数
        return number;
    }
}
```

#### LeetCode2 最佳股票购买时间  
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
```
class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i= 0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                sum = prices[i+1] -prices[i]+sum;
            }
        }
        return sum;
    }
}

```
### 学到的技术
就是dwr框架了,感觉非常神奇,尽然可以直接把java代码直接在js代码中使用,非常方便
但是个人感觉应该不利于前后端分离

### 分享
如何把复杂单体应用快速迁移到微服务
https://mp.weixin.qq.com/s?__biz=MzIwODA4NjMwNA==&mid=2652898760&idx=1&sn=a7959de35edea766f397934b7623eeee&chksm=8cdcd187bbab58918618b02e0be528f3431f66b93293f7853e7a111a3696f949d76aa4219439&scene=0#rd
##### 我的体会
```
    
    1.文中提到"特性耦合，发版困难",不采用微服务难道就不可以避免这种情况吗,
    我认为主要是避免给测试带来工作量吧  
    2."系统业务复杂，接手项目困难" 在单体上也可以避免啊可以通过重构降低模块间的耦合度啊
    3."技术升级困难"这是指什么技术升级困难?用消息队列和websocket算不算新技术,这样的技术也会导致这个情况吗
    4.前几天看infoq的人演讲说微服务不是银弹,最重要的是理清业务,架构合理,划分清楚拆分粒度,
    业务如果理清楚的话,就好建模了,这样不论是数据库还是代码都变得容易多.
```
因为我个人有一个自己的练手项目之前是单体的,现在想学学微服务,学学springcloud  看看怎么来做.希望多多看到这方面的资料
