package Lesson6.Task5;

import lombok.Getter;
import lombok.Setter;



public class main {

    public static class Circle implements java.lang.Cloneable {
        @Getter @Setter
        private int radius;

        @Getter @Setter
        private String color;

        @Override
        public Circle clone() {
            try {
                return (Circle) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }

        @Override
        public String toString() {
            return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + '}';
        }

        private Circle(int radius, String color) {
            this.radius = radius;
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, "read");

        Circle clone = circle.clone();

        clone.color = "red";
        clone.radius = 10;

        System.out.println(circle == clone);

        System.out.println(clone);
        System.out.println(circle);
    }
}
