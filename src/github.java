import java.util.Scanner;
public class github {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println ("Fundamental of Programming = 87");
        System.out.println ("Computer Organization and Architecture = 90");
        System.out.println ("Web Programming = 68");
        System.out.println ("System Interface = 50\n");
        System.out.print("Pilih 1 Untuk Jumlah Markah\nPilih 2 Untuk "
                + "Purata Markah\nPilih 3 Untuk Peratus Markah\n= ");
        int no=input.nextInt();
        
        int fop=87;
        int coaa=90;
        int wp=68;
        int si=50;
        
        int jum=fop+coaa+wp+si;
        double pur=jum/4;
        double per=jum*100/400;

        System.out.println ("\n");
        
        if(no==1)
        { 
            System.out.println ("Jumlah Markah = "+jum);     
        }
            
        else if(no==2)
        {
            System.out.println ("Purata Markah = "+pur); 
        }
        
        else if(no==3)
        {
            System.out.println ("Peratus Markah = "+per); 
        }
        
        else 
        {
            System.out.println ("Masukkan 1,2 atau 3 SAHAJA"); 
        }
}    }
