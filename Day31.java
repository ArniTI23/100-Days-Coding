public class Day31 {
    public static void main(String[] args){
        
        int variable1=10;
        int variable2=8;
        int hasil;
        
        // 1.Penjumlahan
        hasil=variable1+variable2;
        System.out.println(variable1+ "+"+ variable2+"= " +hasil);
        
        // 2.Pengurangan
        hasil=variable1-variable2;
        System.out.printf("%d-%d= %d\n",variable1,variable2,hasil);
        
        // 3.Perkalian
        hasil=variable1*variable2;
        System.out.printf("%d*%d= %d\n",variable1,variable2,hasil);
        
        // 4.Pembagian 
        float nilai1=variable1;
        float nilai2=variable2;
        float hasil1;
        hasil1=nilai1/nilai2;
        System.out.println(nilai1+"/"+nilai2+"= "+hasil1);
        
        // 5.Modulus
        hasil=variable1%variable2;
        System.out.printf("%d %% %d= %d\n",variable1,variable2,hasil);
        
        
    }
}
