public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int random;
        double total = 0.0;
        for (int i = 0; i < 10000; i++){
            for (int x = 0; x < 6; x++){
                random = (int)(Math.random()*6) + 1;
                if (random == 6){
                    total += 1;
                    break;
                }
            } 
        }
        return (total/10000.0)*100.0;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int random;
        int numSixes;
        double total = 0.0;
        for (int i = 0; i < 10000; i++){
            numSixes = 0;
            for (int x = 0; x < 12; x++){
                random = (int)(Math.random()*6) + 1;
                if (random == 6){
                    numSixes += 1;
                }
                if (numSixes == 2){
                    total += 1;
                    break;
                }
            } 
        }
        return (total/10000.0)*100.0;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int random;
        int numSixes;
        double total = 0.0;
        for (int i = 0; i < 10000; i++){
            numSixes = 0;
            for (int x = 0; x < 18; x++){
                random = (int)(Math.random()*6) + 1;
                if (random == 6){
                    numSixes += 1;
                }
                if (numSixes == 3){
                    total += 1;
                    break;
                }
            } 
        }
        return (total/10000.0)*100.0;
    }


    public static void main(String[] args) {
        double oneSix = probabilityOneSix();
        System.out.println("Probability of rolling six dice and getting at least one 6: " + oneSix);
        double twoSix = probabilityTwoSixes();
        System.out.println("Probability of rolling twelve dice and getting at least two 6's: " + twoSix);
        double threeSix = probabilityThreeSixes();
        System.out.println("Probability of rolling eigthteen dice and getting at least three 6's: " + threeSix);
    }
}
