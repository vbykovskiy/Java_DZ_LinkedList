public class Main {

    public static void main(String[] args) {


        IntLL<Integer> ll = new GbLL<>();

        ll.addFirst(444).addLast(555).addLast(666).addLast(777).addLast(888);

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
        for (int i = 0; i < ll.getSize(); i++) {
            System.out.print(" " + ll.get(i));
        }

    }

}