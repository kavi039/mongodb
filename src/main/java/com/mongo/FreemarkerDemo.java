package com.mongo;


import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kavita on 6/6/16.
 */
public class FreemarkerDemo {

    public static void main(String... arg) {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(FreemarkerDemo.class, "/");
        try {
            Template template=configuration.getTemplate("Hello.ftl");
            StringWriter stringWriter=new StringWriter();
            Map<String,Object> helloMap=new HashMap<String,Object>();
            helloMap.put("name","kavita");
            helloMap.put("age",45);
            template.process(helloMap, stringWriter);
            System.out.println("string writer");
            System.out.println(stringWriter);
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
