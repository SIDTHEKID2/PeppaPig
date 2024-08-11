public class lasagna {

    //part one
    int minutes = 50;
    int preparationTimePerLayer = 4;
    
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
        System.out.println("How many minutes it takes to bake a lasagna: " + finishedLasagna.expectedMinutesInOven());
        System.out.println("How many minutes the lasagna has left in the oven: " + finishedLasagna.remainingMinutesInOven(40));
        System.out.println("How many minutes it takes to prepare the lasagna: " + finishedLasagna.preparationTimeInMinutes(6));
        System.out.println("Total amount of minutes spent so far on baking the lasagna: " + finishedLasagna.totalTimeInMinutes(6, 20));
    };

};