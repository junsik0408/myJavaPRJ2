class  Animal {
        public void eat(){
            System.out.println("먹습니다.");
        }

        public void poop(){
            System.out.println("응가.");
        }

        public void sleep(){
            System.out.println("잠자요.");
        }
    }

    class Dog extends Animal {
        public void showID(){
            System.out.println("강아지입니다.");
        }
        public void makeSound(){
            System.out.println("멍멍");
        }
    }


    class Cat extends Animal {
        public void showID(){
            System.out.println("고양이입니다.");
        }
        public void makeSound(){
            System.out.println("야옹야옹");
        }
    }


    class Inher{

        public static void main(String[] args){

            System.out.println("\n\n");

            Dog dog = new Dog();
            dog.showID();
            dog.eat();
            dog.poop();
            dog.sleep();
            dog.makeSound();

            System.out.println("\n\n");

            Cat cat = new Cat();
            cat.showID();
            cat.eat();
            cat.poop();
            cat.sleep();
            cat.makeSound();

            System.out.println("\n\n");

        }

    }



