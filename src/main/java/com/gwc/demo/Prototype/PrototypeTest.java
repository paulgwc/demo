package com.gwc.demo.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        //创建一个具体需要克隆的对象
        ConcreatePrototypeA concreatePrototype = new ConcreatePrototypeA();
        concreatePrototype.setAge(18);
        concreatePrototype.setName("gwc");
        List hobbies = new ArrayList();
        concreatePrototype.setHobbies(hobbies);
        System.out.println(concreatePrototype);

        //创建client对象，准备开始克隆
        Client client = new Client(concreatePrototype);
        ConcreatePrototypeA concreatePrototypeA = (ConcreatePrototypeA) client.startClone(concreatePrototype);

    }
}
