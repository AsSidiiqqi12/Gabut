package program.jago.Algoritma;

public class Stack {
    private int[] data;
    int top;

    public Stack(int angka) {
        data = new int[angka];
        top = 0;
    }
    public void push(int angka){
        if (top < data.length){//cek kondisi apakah masih ada ruang untuk push
            data[top++] = angka;
        }else {//jika sudah tidak ada ruang
            System.out.println("overflow pada " + angka);
        }
    }

    public int pop (){
        if (top > 0){//kondisi jika masih ada barang/angka yang dikeluarkan
            int tempatSimpan;
            tempatSimpan = data[--top];
            data[top] = 0;
            return tempatSimpan;
        }else {//berarti udah abis yang mau di ambil/dikeluarkan
            return 0;
        }
    }

    public int peek(){//algoritma untuk mencari stack
        return data[top -1];
    }
    public void display(){
        for (int n : data){
            System.out.print(n + " ");
        }
    }
}
