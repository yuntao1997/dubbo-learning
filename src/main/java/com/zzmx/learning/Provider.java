package com.zzmx.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2017/12/16 12:15
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2017/12/16 12:15
 * @Version 1.0
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/dubbo-zookeeper-provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }

}
