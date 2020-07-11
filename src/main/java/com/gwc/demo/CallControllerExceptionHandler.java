package com.gwc.demo;

import com.gwc.demo.dingTalk.DingDingMessageUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class CallControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void exceptionHandler(Exception exception) throws ClassNotFoundException {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        exception.printStackTrace(pw);
        StackTraceElement[] stackTraceElements = exception.getStackTrace();
        String methodName = stackTraceElements[0].getMethodName();
        String className = stackTraceElements[0].getClassName();
        Class clazz = Class.forName(className);
        Method[] methods = clazz.getMethods();
        List<Method> ms= Arrays.stream(methods).filter(m->m.getName().equals(methodName)).collect(Collectors.toList());
        String author = null;
        if (ms.get(0).isAnnotationPresent(AuthorAnnotion.class)){
            author = ms.get(0).getAnnotation(AuthorAnnotion.class).name();
        }
        DingDingMessageUtil.sendTextMessage(sw.toString(),author,null);
        exception.printStackTrace();
    }
}