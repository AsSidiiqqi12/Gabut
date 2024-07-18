public class Delay {
    public static void main(String[] args) {
        String text = "Seandainya kau tau ku tak ingin kau pergi,Meninggalkan ku sendiri bersama bayanganmu,Seandainya kau tau aku kan selalu cinta,Jangan Kau lupakan kenangan kita selama ini,Thoriq 2 bulan haji lah gua 2 bulan asing";

        // Array untuk delay dalam milidetik per kalimat
        int[] delays = {2000, 1000, 3500, 100, 100 };
        int [] delayChar = {150, 100, 120, 100, 90};
        // Memisahkan teks berdasarkan koma
        String[] sentences = text.split(",");

        // Pastikan jumlah delay dan jumlah kalimat sama
        if (sentences.length != delays.length) {
            System.out.println("Jumlah kalimat dan jumlah delay harus sama!");
            return;
        }

        // Iterasi setiap kalimat
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];

            // Iterasi setiap karakter dalam kalimat
            for (char c : sentence.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(delayChar[i]);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
            try{
                Thread.sleep(delays[i]);
            }catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
            // Tambahkan baris baru setelah setiap kalimat
            System.out.println();
        }
    }
}
