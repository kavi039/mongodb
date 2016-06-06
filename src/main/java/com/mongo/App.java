package com.mongo;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(App.class, "/");


        get("/hello", (req, res) -> {
            StringWriter stringWriter = new StringWriter();
            try {
                Template template = configuration.getTemplate("Hello.ftl");
                template.process(new HashMap<>(), stringWriter);
                System.out.println("string writer");
                System.out.println(stringWriter);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return stringWriter;
        });

        post("/student_registration",(req,res)->{
            System.out.println(">>   request params   ");
            System.out.println(req.queryParams("name"));
            System.out.println(req.queryParams("age"));
            System.out.println(">>   request params   ");
         return "submitted  "+req.queryParams() ;
        });

    }
}
