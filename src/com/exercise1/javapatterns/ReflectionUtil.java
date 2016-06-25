package com.exercise1.javapatterns;

import java.util.ResourceBundle;

/**
 * Created by kavita on 25/6/16.
 */
public class ReflectionUtil {
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle("car");

    public static <T> T get(String type) {
        String classType = resourceBundle.getString(type);
        T instance = null;
        try {
            instance = (T) Class.forName(classType).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
