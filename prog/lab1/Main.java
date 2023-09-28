import static java.lang.Math.*;

public class Main {
    
    private static final int C_SIZE = 8;
    private static final int X_SIZE = 17;
    
    private static short[] createC() {
    	short[] c = new short[C_SIZE];
    	int currentNumber = 17;
    
    	for (int i = 0; i < c.length; i++){
    		c[i] = (short) currentNumber;
    		currentNumber -=2;
    	}
    
    	return c;
    
    }
    
    private static float[] createX(){
    	float[] x = new float[X_SIZE];
    
    	for (int i=0;i<x.length;i++){
            x[i] = (float)(random() * 17 - 14);
        }
        
        return x;
        
    }
    
    private static double calculateS(int ci, float xj){
    	switch (ci){
                    case 3,5,7,17:
                        return tan(atan(pow(((xj-5.5)/17), 2)));
                    case 11:
                    	return pow((asin(1/exp(abs(xj)))*(pow(atan((xj-5.5)/17),1/3 ))),pow(pow(xj,xj/2),1/3));
                    default:
                        return (3/4)/(4+cos(pow(1/4+(xj-1)/xj,2)));
                        
    	}
    }
    
    public static void main(String[] args){
        short[] c = createC();
        float[] x = createX();
        double[][] s = new double[C_SIZE][X_SIZE];
        
        for (int i = 0; i < C_SIZE; i++){
        	for(int j = 0; j < X_SIZE; j++) {
        	s[i][j] = calculateS(c[i], x[j]);
        	}
        }
        
        for (int i = 0; i < C_SIZE; i++){
            for (int j = 0; j < X_SIZE; j++){
                System.out.printf("%2.2f ",s[i][j]);
            }
            System.out.println();
        }
}
}
