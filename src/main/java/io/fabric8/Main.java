package io.fabric8;

public class Main {

    public static void main(String[] args) {
         new ImplementationBuilder()
                 .withBar("BAR")
                 .withFoo("FOO")
                 .build();
    }
}
