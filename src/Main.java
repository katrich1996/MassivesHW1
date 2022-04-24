public class Main {
    public static void main(String[] args) {
        int [] weights = new int[] {90,91,93,92,85,87,88,89,0,0,0,0};
        int [] weightsCopy = new int[] {90,87,93,92,85,87,88,89,0,0,0,0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                   arraysAreEqual = false;
                }
                
            }
        }
    if (arraysAreEqual) {
    System.out.println("Massives are equal");
    }else {
    System.out.println("Massives aren't equal");
    }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);

        }
    }

    }