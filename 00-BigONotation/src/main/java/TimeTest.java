public class TimeTest {
    public static void main(String[] args) {

        final char a = 'A', d = 'D';
        char grade = 'B';

        switch (grade){
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.println("good"); break;
            case d:
            case 'F':
                System.out.print("not good");
        }
        int n=10000;
        long startTime=System.currentTimeMillis();
        int numberOfOperations=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) numberOfOperations++;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Number of Operations is = "+ numberOfOperations + " in "+ (endTime-startTime)+" milisecs");
    }
}
