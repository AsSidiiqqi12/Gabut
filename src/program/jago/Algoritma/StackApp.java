package program.jago.Algoritma;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(5);//membuat objek baru dan dalam contructor untuk jumlah array
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        /*===>
        6 overflow gak ada tempat
        ==
        5
        4
        3
        2
        1
        ==
         */

        System.out.println("ini peek: "+stack.peek());
        System.out.println(stack.pop());//untuk pop pake LIFO last in first out jadi yang terakhir dimasukkan paling atas dan itu lah yang di akses pertama kali
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());//ini terakhir diakses
        System.out.println(stack.pop());//ini return 0 karena udah gak ada apa apa di stack udah abis


        stack.display();
    }
}
