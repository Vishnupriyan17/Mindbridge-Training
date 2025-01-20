package Day5.Enum;

public enum Season {
    Winter(15),
    Spring(25),
    Summer(40),
    Fall(10);

    final int averageTemperature;

    Season(int averageTemperature)
    {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature()
    {
        return this.averageTemperature;
    }

    public static void main(String[] args) {
        for(Season season:Season.values())
        {
            System.out.println(season.name() +" has the temperature of "+season.getAverageTemperature()+".C");
        }
    }
}
