import java.util.Scanner;

abstract class pen {
    public abstract void write();

    public abstract void refill();
}

class fountainPen extends pen {
    public void write() {
        System.out.println("You can write with this ");
    }

    public void refill() {
        System.out.println("You can refill this Pen");
    }

    public void changeNib() {
        System.out.println("You can change the nib of this pen");
    }

}

interface Animal {
    public void eat();

    public void sleep();

}

abstract class Monkey {
    public abstract void bite();

    public abstract void jump();
}

class Human extends Monkey implements Animal {
    public void eat() {
        System.out.println("Humans can eat ");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }

    public void bite() {
        System.out.println("Humans can bite ");
    }

    public void jump() {
        System.out.println("I can jump");
    }
}

public class InterfacesPs {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.bite();


    }

}

abstract class telephone {
    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();
}

class smartTelephone extends telephone {
    public void ring() {
        System.out.println("You can call");
    }

    public void lift() {
        System.out.println("You can lift the phone ");
    }

    public void disconnect() {
        System.out.println("You can drop the call ");
    }

    public void game() {

        System.out.println("You can play the game ");
    }
}