package behavioral.observer.ca6_playerdata;

public class Dashboard implements PlayerDataListener {
    PlayerData playerData;

    public Dashboard(PlayerData playerData) {
        this.playerData = playerData;
        this.playerData.dangKy(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println(playerData.toString());
    }
}
