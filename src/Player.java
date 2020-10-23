import java.util.Scanner;

public abstract class Player {

    public abstract void enemy();
}
abstract class Player2 extends Player{
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int width = scanner.nextInt();
    int height = scanner.nextInt();
}
class Player1 extends Player {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int width = scanner.nextInt();
    int height = scanner.nextInt();
    public void enemy() {
        System.out.println(Entity.player + "values:");
        System.out.println("x:"+x+" y:"+y+" width:"+width+" height:"+height);
    }
}
 class MyMainClass {

     public static void main(String[] args) {
        Player1 player1 = new Player1();
        Player2 enemy1 = new Player2() {
            @Override
            public void enemy() {
                System.out.println(Entity.enemy + "values:");
                System.out.println("x:"+x+" y:"+y+" width:"+width+" height:"+height);;
            }
        };
        player1.enemy();
        enemy1.enemy();
             if(player1.x < enemy1.x + enemy1.width &&
                     player1.x + player1.width > enemy1.x &&
                     player1.y < enemy1.y + enemy1.height &&
                     player1.y + player1.height > enemy1.y)
             {
                 System.out.println("Collision Detected");
             }
             else {
                 System.out.println("Collision isn't detected");
             }
    }

 }

