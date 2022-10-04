package Observer;

public class WorldSimulator {
    public static void main(String[] args) {
        World season = new World();

        Bear bear = new Bear(season);
        Rabbit rabbit = new Rabbit(season);

        System.out.println(Season.Spring);
        season.setCurrentSeason(Season.Spring);
        System.out.println(Season.Summer);
        season.setCurrentSeason(Season.Summer);
        System.out.println(Season.Autumn);
        season.setCurrentSeason(Season.Autumn);
        System.out.println(Season.Winter);
        season.setCurrentSeason(Season.Winter);
    }
}
