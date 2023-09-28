import static java.lang.Math.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        short[] c = new short[8];
        float[] x = new float[17];
        double[][] s = new double[8][17];
        
        Random random = new Random();
        int currentNumber = 17;
        
        for (int i=0;i <c.length;i++){
            c[i] = (short) currentNumber;
            currentNumber -=2;
        }
        
        for (int i=0;i<x.length;i++){
            x[i] = random.nextFloat() * 17 - 14;
        }
        
        
        for (int i=0;i<7;i++){
            for (int j=0;j<17;j++){
                switch (c[i]){
                    case 3,5,7,17:
                        s[i][j] = tan(atan(pow(((x[j]-5.5)/17), 2)));
                        break;
                    case 11:
                        s[i][j] = pow((asin(1/exp(abs(x[j])))*(pow(atan((x[j]-5.5)/17),1/3 ))),pow(pow(x[j],x[j]/2),1/3));
                    break;
                    default:
                        s[i][j] = (3/4)/(4+cos(pow(1/4+(x[j]-1)/x[j],2)));
                        
                }
            }
        }
        
        for (int i=0;i<7;i++){
            for (int j=0;j<17;j++){
                System.out.printf("%2.2f",s[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
}
}
