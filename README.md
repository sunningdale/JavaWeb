#Do study the skill as follow

- *SpringMVC*
[5分钟构建spring web mvc REST风格HelloWorld](http://jinnianshilongnian.iteye.com/blog/1996071)

- *SpringSide*

- *SpringBoot* 
[Spring Boot——2分钟构建spring web mvc REST风格HelloWorld](http://jinnianshilongnian.iteye.com/blog/1996071)


- *JPA*

- *Nginx*

- *LVS*

- *LoadBalance&Cluster* 

---------------------------
Front End

- *Node*

- *Less*


----------------------------
- **spring4.0**

> Spring4新特性 [详细](http://jinnianshilongnian.iteye.com/blog/1989381)

> 丢弃重口味的xml配置--spring4用groovy配置bean [详细](http://blog.csdn.net/kiwi_coder/article/details/17467965)



#构建springmvc
> springmvc maven


[@详细配置url](http://www.360doc.com/content/12/0223/11/834950_188852804.shtml)

[@Eclipse deploy](http://zk1878.iteye.com/blog/1222330)

[@eclipse build path功能总结](http://blog.csdn.net/cheney521/article/details/8526414)


-----------------

- **springmvc  web.xml**

[Sample](http://www.cnblogs.com/zemliu/p/3191565.html)

> Spring分为多个文件进行分别的配置，其中在servlet-name中如果没有指定init-param属性，
那么系统自动寻找的spring配置文件为[servlet-name]-servlet.xml。
[详细](http://blog.csdn.net/wendellup/article/details/8270239)

> Spring加载resource时classpath*:与classpath:的区别
[详细](http://blog.csdn.net/kkdelta/article/details/5507799)


--------------------
- *xml tag*

> context:component-scan  
 在xml配置了这个标签后，spring可以自动去扫描base-pack下面或者子包下面的java文件，如果扫描到有@Component @Controller@Service等这些注解的类，则把这些类注册为bean
[详细](http://blog.csdn.net/chunqiuwei/article/details/16115135)

>  mvc:annotation-driven 
  会自动注册DefaultAnnotationHandlerMapping和AnnotationMethodHandlerAdapter两个实例
  [详细](http://www.cnblogs.com/penguin-panda/archive/2011/07/09/2101880.html)

 
 > [BeanNameUrlHandlerMappping](http://blog.csdn.net/sunxing007/article/details/4584748) & [DefaultAnnotationHandlerMapping](http://my.oschina.net/foggy/blog/55261)   [DefaultAnnotationHandlerMapping1](http://www.cnblogs.com/siukun/archive/2011/12/06/2277647.html)
 
 > [配置视图解析器ViewResolver](http://blog.csdn.net/sunxing007/article/details/4584979)
 
 	  <bean class="org.springframework.web.servlet.view.ResourceBundleViewResolver">
	   <property name="basename" value="views" /> <property name="order" value="0" />
	   </bean> 
	   <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"> 
	      <property name="prefix" value="/WEB-INF/mm/jsp/" /> 
	      <property name="suffix" value=".jsp" />
	   </bean> 
	   <bean id="freemarkerConfig" class="org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer"> 
	      <property name="templateLoaderPath"> 
	      <value>/WEB-INF/mm/freemarker/</value> 
	     </property>
	   </bean> 
	   
	   
	   上面为ResourceBundleViewResolver设置了order属性，用于定义顺序，在jsp处理之前
	   这里使用了ResourceBundleViewResolver，还需要有它的配置文件，这里配置的名称是views.properties，需要把它放置在classpath的根下
	   
	   register.(class)=org.springframework.web.servlet.view.freemarker.FreeMarkerView register.url=register.ftl
    这里的register，是spring mvc返回字符串的名称。url部分，要写freemarkerConfig中设置templateLoaderPath下的文件路径。
 



