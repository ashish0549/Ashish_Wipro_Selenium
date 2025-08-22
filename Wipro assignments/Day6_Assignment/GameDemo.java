
// 7. Difficulty Level and Game Setup
package Day_6_Assignment;
enum Difficulty {
    EASY, MEDIUM, HARD;
}

class Game {
    private Difficulty difficulty;

    public Game(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setup() {
        switch (difficulty) {
            case EASY:
                System.out.println("Easy mode: 10 lives, simple enemies");
                break;
            case MEDIUM:
                System.out.println("Medium mode: 5 lives, moderate enemies");
                break;
            case HARD:
                System.out.println("Hard mode: 3 lives, tough enemies");
                break;
        }
    }
}

class GameDemo {
    public static void main(String[] args) {
        Game game = new Game(Difficulty.MEDIUM);
        game.setup();
    }
}
