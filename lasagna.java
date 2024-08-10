public class lasagna {

    //part one
    int minutes = 50;
    int preparationTimePerLayer = 2;
    
    public int expectedMinutesInOven() {
        return minutes;
    };

    //part two
    public int remainingMinutesInOven(int minutesInOven) {
        return minutes - minutesInOven;
    };

    public int preparationTimeInMinutes(int layersCount) {
        return preparationTimePerLayer * layersCount;
    };

    //part three
    public int totalTimeInMinutes(int numLayers, int numMinutesInOvenSoFar) {
        return numMinutesInOvenSoFar + preparationTimeInMinutes(numLayers);    
    };

    public static void main(String[] args) {
        lasagna finishedLasagna = new lasagna();
        System.out.println("How long it takes to "finishedLasagna.expectedMinutesInOven());
        System.out.println(finishedLasagna.remainingMinutesInOven(40));
        System.out.println(finishedLasagna.preparationTimeInMinutes(6));
        System.out.println(finishedLasagna.totalTimeInMinutes(6, 20));
    };

};