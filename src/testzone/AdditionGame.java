package testzone;

public class AdditionGame 
{
    public static boolean isInNumberRange(int X)
    {
        return ( X>=1 && X<=50 );
    }

    public static boolean isInRange(int A, int B, int C, int N)
    {
        return ( isInNumberRange(A) && isInNumberRange(B) && isInNumberRange(C) && (N>=1 && N<=150) );
    }
    
    public static int getMaximumPoints (int A, int B, int C, int N)
    {
        int i,p = 0;

        if ( isInRange(A,B,C,N) )
        {
            for (i=0; i<N; i++)
            {
                if ( A >= B && A >= C )
                {
                    p += A;
                    if (A>=1)
                        A=A-1;
                }
                else if ( B >= A && B >= C )
                {
                    p+=B;
                    if (B>=1)
                        B=B-1;
                }
                else if ( C >= A && C >= B )
                {
                    p+=C;
                    if (C>=1)
                        C=C-1;
                }
            }            
        }else
        {
            System.out.println("Check numbers limits !");
        }
        return p;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Point = " + getMaximumPoints(8,2,6,13));
    }
}