package com.percy.app;

/**
 * Hello world!
 */
public final class App {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String stringStream = "BabyBaby";
        FirstAppearingOnce obj = new FirstAppearingOnce();
        for (int i = 0; i != stringStream.length(); i++) {
            obj.insert(stringStream.charAt(i));
            System.out.println(obj.firstAppearingOnce());
        }
        System.out.println("Hello World!");
    }
}
