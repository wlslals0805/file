package day01;

import java.math.BigInteger;

public class Test155 {
	public BigInteger solution(int balls, int share) {
		
        BigInteger diff = BigInteger.ONE;
        BigInteger s_p = BigInteger.ONE;
        BigInteger b_p = BigInteger.ONE;
        BigInteger answer;

       
        for (int i = 1; i <= balls - share; i++) {
            diff = diff.multiply(BigInteger.valueOf(i));
        }

       
        for (int i = 1; i <= share; i++) {
            s_p = s_p.multiply(BigInteger.valueOf(i));
        }

        
        for (int i = 1; i <= balls; i++) {
            b_p = b_p.multiply(BigInteger.valueOf(i));
        }

       
        answer = b_p.divide(diff.multiply(s_p));

        return answer;
        
    }
}
