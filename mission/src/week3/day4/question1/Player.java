package week3.day4.question1;

public class Player {

    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public PlayerLevel getLevel(){
        level.showLevelMessage();
        return this.level;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.level = playerLevel;
    }

    public void play(int count){
        level.go(count);
    }
}
