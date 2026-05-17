public class Reverse {

    public static int[] list(int[] scores) {

        int[] newScores = new int[scores.length];

        for (int index = 0; index < scores.length; index++) {
            newScores[index] = scores[scores.length - 1 - index];
        }

        return newScores;
    }
}
