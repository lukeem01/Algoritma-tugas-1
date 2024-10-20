package Tugas_Sesi_4;

public class Loop5 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0; j<=5;j++){
                int k=5-i;
                if(j<k)
                System.out.print("* ");
                else
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
