package Lesson6.Task3;

interface Button {
    void display();
}

interface Background {
    void display();
}

interface ThemeFactory {
    Button createButton();
    Background createBackground();
}

public class main {
    static class LightButton implements Button {
        @Override
        public void display() {
            System.out.println("Light Button");
        }
    }
    static class LightBackground implements Background {
        @Override
        public void display() {
            System.out.println("Light background");
        }
    }
    static class DarkButton implements Button {
        @Override
        public void display() {
            System.out.println("Dark Button");
        }
    }
    static class DarkBackground implements Background {
        @Override
        public void display() {
            System.out.println("Dark background");
        }
    }

    static class LightThemeFactory implements ThemeFactory {
        @Override
        public Button createButton() {
            return new LightButton();
        }
        @Override
        public Background createBackground() {
            return new LightBackground();
        }
    }

    static class DarkThemeFactory implements ThemeFactory {
        @Override
        public Background createBackground() {
            return new DarkBackground();
        }
        public Button createButton() {
            return new DarkButton();
        }
    }

    public static void main(String[] args) {
        ThemeFactory themeFactory = new DarkThemeFactory();

        Button button = themeFactory.createButton();
        Background background = themeFactory.createBackground();

        button.display();
        background.display();
    }



}
