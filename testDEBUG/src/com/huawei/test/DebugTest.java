package com.huawei.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiongjianjian
 * @dte 2019/8/1 - 18:14
 */
public class DebugTest {
    public static final String len="pdd";
    int i=0;

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
    }
    public void testIdea(){
        String[] arr={"A","B","C"};
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        List list=new ArrayList();
        if (list == null) {
            System.out.println("DebugTest.testIdea");
            System.out.println("arr = " + arr);
        }else{
            for (Object o : list) {
                System.out.println(o);
            }
        }
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("i = " + i);
    }
}
