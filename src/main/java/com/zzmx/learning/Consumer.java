package com.zzmx.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2017/12/16 12:18
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2017/12/16 12:18
 * @Version 1.0
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/dubbo-zookeeper-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
        System.in.read(); // 按任意键退出
    }
}
