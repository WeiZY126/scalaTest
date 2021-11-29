public class TestDynamicBind {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();
        worker.hi();

        Person person = new Worker();
        System.out.println(person.name);    //属性静态绑定
        person.hello(); //方法调用动态绑定
    }
}

class Person {
    String name = "person";

    public void hello() {
        System.out.println("hello person");
    }
}

class Worker extends Person {
    String name = "worker";

    public void hello() {
        System.out.println("hello worker");
    }

    public void hi() {
        System.out.println("hi worker");
    }
}
