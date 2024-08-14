package Factory;

public class Game {
    private static Game instance;

    // Static method to get the singleton instance
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    // Example method to set a level factory
    public void setLevelFactory(GameElementFactory factory) {
        // Implementation
    }

    // Example method to play the game
    public void play() {
        // Implementation
    }
}
