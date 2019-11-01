package cn.itcast.chapter04.task01;

public class Mouse implements USB{

    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }
    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
