package com.zzmx.learning;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2017/12/16 12:13
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2017/12/16 12:13
 * @Version 1.0
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}