/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ezen.academy;

import java.io.IOException;

class Music extends Thread {
    String name;

    Music(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}

// class Num {
// int a;

// Num(int a) {
// this.a = a;
// }

// int get() {
// return a;
// }
// }

// class Animal{
// String type;

// Animal(String type){
// this.type = type;
// }

// String ani(){
// return type;
// }
// }

// class Dog extends Animal{
// String breed;
// Dog(String type, String breed){
// super(type);
// this.breed = breed;
// }
// @Override
// String ani(){
// return super.ani() + " " + breed;
// }
// }

public class Main {

    public static void main(String[] args) throws IOException {
        Music m = new Music("음악 재생");
        Thread t = new Thread(m);
        t.start();

        // Animal a1 = new Dog("강아지","푸들");
        // System.out.println(a1.ani());

        // Num[] ary = new Num[] { new Num(1), new Num(2), new Num(3) };
        // for(Num a : ary){
        // System.out.println(a.get());
        // }
    }

}