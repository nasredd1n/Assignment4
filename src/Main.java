public class Main {
    public static void main(String[] args) {
        MyBST<Integer, String> bst = new MyBST<Integer, String>();
        bst.put(5, "five");
        bst.put(2, "two");
        bst.put(7, "seven");
        bst.put(1, "one");
        bst.put(3, "three");
        bst.put(6, "six");
        bst.put(8, "eight");

        for (Integer key : bst) {
            System.out.println(key + " : " + bst.get(key));
        }

        System.out.println();

        bst.delete(5);

        for (Integer key : bst) {
            System.out.println(key + " : " + bst.get(key));
        }
    }
}
