package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
                    }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
                }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        zofka.turnLeft(90);

        for (int i = 0; i < 1; i++) {
            zofka.turnRight(45);
            zofka.move(71);
            zofka.turnRight(90);
            zofka.move(71);
            zofka.turnRight(45);
        }

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }




        /*zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        zofka.turnRight(45);
        zofka.move(71);
        zofka.turnRight(90);
        zofka.move(71);
        zofka.turnRight(45);

        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        */




        /*zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(90);
        for(int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }*/
        //TODO tady bude kód
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
