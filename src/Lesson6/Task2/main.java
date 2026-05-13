package Lesson6.Task2;

interface Greeting {
    void sayHello();
}

public class main {
    public static class EnglishGreeting implements Greeting {
        @Override
        public void sayHello() {
            System.out.println("Hello World!");
        }
    }

    public static class FrenchGreeting implements Greeting {
        @Override
        public void sayHello() {
            System.out.println("Bonjour le monde!");
        }
    }

    public static class SpanishGreeting implements Greeting {
        @Override
        public void sayHello() {
            System.out.println("Hola Mundo!");
        }
    }

    public static class GreetingFactory {
        public static Greeting createGreeting(String language) {
            switch (language) {
                case "English":
                    return new EnglishGreeting();
                case "French":
                    return new FrenchGreeting();
                case "Spanish":
                    return new SpanishGreeting();
                default:
                    return null;
            }
        }
    }

    public static void main(String[] args) {
        GreetingFactory greetingFactory = new GreetingFactory();
        Greeting greeting = greetingFactory.createGreeting("Spanish");
        greeting.sayHello();
    }

}





