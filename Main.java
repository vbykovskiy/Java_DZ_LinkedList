public class Main {

    public static void main(String[] args) {

        GbLL<Integer> ll = new GbLL<Integer>();
        System.out.println(ll.getSize());
        System.out.println("=================================");
        ll.addFirst(13);
        ll.addLast(14);
        ll.addFirst(3);
        ll.addFirst(5);
        System.out.println(ll.getSize());
        System.out.println("=================================");
        ll.remove(3);
        System.out.println(ll);
        System.out.println("=================================");
        System.out.println(ll.get( 1));
        System.out.println("=================================");
        for (Integer item : ll) {
            System.out.print(" " + item);
        }

    }

}