package exercises;

public class Arrays {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] % 2 == 1) {
                System.out.println(integerArray[i]);
            }
        }
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] textArray = text.split("\\.");
        System.out.println(textArray[2]);
    }
}
