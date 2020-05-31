package Lesson;

public class HelloWorld {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.println(cat.doPurr());
        System.out.println(dog.bark());
        MyClass myClass = new MyClass();
        int c= myClass.addNum(3,3);
        System.out.println("The value of sum is " + c);
    }
}
