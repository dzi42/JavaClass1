package Java;

public class Array {
    public static void main(String[] args){



        int[] tuoi = new int[4];
        tuoi[0] = 1;
        tuoi[1] = 20;
        tuoi[2] = 25;
        tuoi[3] = 30;

        int tuoiDauTien = tuoi[0];
        int tuoiThuHai  = tuoi[1];
        int tuoiThuBa  = tuoi[2];
        int tuoiThuTu = tuoi[3];

        System.out.println("tuoiDautien: " +tuoiDauTien);
        System.out.println("tuoit2: " +tuoiThuHai);
        System.out.println("tuoit3: " +tuoiThuBa);
        System.out.println("tuoit4: " +tuoiThuTu);


        int[] age = { 2,4,6,8};
        int kichthuoc = age.length;

        System.out.println("tuoi dau tiên:" +age[0]);
        System.out.println("tuoi  2:" +age[1]);
        System.out.println("tuoi 3:" +age[2]);
        System.out.println("tuoi 4:" +age[3]);


        System.out.println("kich thuoc Array la:"+kichthuoc);




    }
}
