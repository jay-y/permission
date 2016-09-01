# About Project
一个Android授权操作工具套件，使用请参考[app](https://github.com/Jay-Y/permission/blob/master/app/src/main/java/com/dream/permission/presenter/MainPresenter.java)或[yApp](https://github.com/Jay-Y/yApp).
(An Android authorization tool suite,please refer to [app](https://github.com/Jay-Y/permission/blob/master/app/src/main/java/com/dream/permission/presenter/MainPresenter.java) or [yApp](https://github.com/Jay-Y/yApp).)
#### When you use Gradle to build a dependency can be added to:
```javascript
compile 'com.github.jay-y:permission:1.0.2'
```
## Usage

```java

PermissionUtil

.with(getContext())

.permissions(

      PermissionUtil.PERMISSIONS_GROUP_LOACATION,//定位授权

      PermissionUtil.PERMISSIONS_GROUP_CONTCATS//获取联系人授权

).request();

```
## About Me
#### GitHub: https://github.com/Jay-Y
#### 博客园: https://home.cnblogs.com/u/ysjshrine/
#### 新浪微博: http://weibo.com/u/5785639138
#### 个人邮箱: 570440569@qq.com
