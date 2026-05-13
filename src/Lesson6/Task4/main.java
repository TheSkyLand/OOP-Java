package Lesson6.Task4;

public class main {
     public static class Pizza {
        final String dough;
        final String sauce;
        final String size;
        final boolean cheese;

         private Pizza(Builder builder) {
             this.dough = builder.dough;
             this.sauce = builder.sauce;
             this.size = builder.size;
             this.cheese = builder.cheese;
         }

         @Override
         public String toString() {
             return "Pizza [ dough = " + dough + " sauce = " + sauce + " size = " + size + " cheese = " + cheese + "]";
         }

        public static class Builder {
             String dough  = "";
             String sauce = "";
             String size = "";
             boolean cheese = true;

             public Builder(String dough,String size) {
                 this.dough = dough;
                 this.size = size;
             }

            public Builder setDough(String dough) {
                 this.dough = dough;
                return this;
             }

            public Builder setSauce(String sauce) {
                 this.sauce = sauce;
                return this;
             }

            public Builder   setSize(String size) {
                 this.size = size;
                return this;
             }

            public Builder addCheese(Boolean cheese){
                 this.cheese = cheese;
                 return this;
            }

            Pizza build(){
                return new Pizza(this);
            }
        }


    }

    public static void main(String[] args) {
         Pizza p = new Pizza.Builder("тонкое", "средняя").setSauce("томатный").addCheese(true).build();

         System.out.println(p);
    }
}
