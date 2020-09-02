package com.blog.test;


import com.blog.BlogApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Description TODO
 * @Date 2020/8/8 20:20  by xinghang
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogApplication.class)
public class AspectTest {


    // @Date 2020/4/15 14:23
    @Test
    public void testJiqMi() {
        String md5DigestAsHex = DigestUtils.md5DigestAsHex("gg".getBytes());
        System.out.println(md5DigestAsHex);
    }


    // @Date 2020/4/15 14:23
    @Test
    public void testHashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        Hashtable<Object, Object> table = new Hashtable<>();
    }


    // @Date 2020/4/15 14:23
    @Test
    public void testFanzhuang() {
        String msg = "Hello World";
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append(msg).reverse().toString();
        System.out.println(string);
    }

    // @Date 2020/4/15 14:23
    @Test
    public void testFanzhuang2() {
        String msg = "Hello World";
        StringBuilder builder = new StringBuilder();
        for (int i = msg.length() - 1; i >= 0; i--) {
            builder.append(msg.charAt(i));
        }
        System.out.println(builder.toString());
    }


    // @Date 2020/4/15 14:23
    @Test
    public void testName() {


    }
}
