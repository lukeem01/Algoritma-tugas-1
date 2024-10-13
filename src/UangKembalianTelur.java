public class UangKembalianTelur {
    public static void main(String[]argsStrings) throws Exception {
        Double jumlah_KG_yang_dibeli_ = 2.5;
        Double Total_yang_harus_dibayar = 70000.0;
        Double Uang_yang_dibayarkan = 100000.0;
        Double Uang_kembalian = Uang_yang_dibayarkan - Total_yang_harus_dibayar;
    System.out.println("Ini bapak akan membeli "+jumlah_KG_yang_dibeli_+" KG Telur");
    System.err.println("Ini harga totalnya = "+Total_yang_harus_dibayar+" Pak");
    System.err.println("Baik pak uang bapak senilai = "+Uang_yang_dibayarkan+"");
    System.out.println("dan ini uang kembalian "+Uang_kembalian+" nya ya pak");
    System.err.println("Terima Kasihhh");
    }
}