package com.gwc.demo.adapter.objectadapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5() {
        int adapterInput = ac220.outputAc220();
        int adapterOutput = adapterInput/44;
        System.out.println("使用适配器转换输入ac:"+adapterInput+"V"+"输出dc"+adapterOutput+"v");
        return adapterOutput;
    }
}
