public class proov3{
    public static void main(String[] arg){
        int[][] laud = new int [10][10];
        laud[2][3] = 1;

        String juhis = "kee";
        if (arg.length > 0){
            juhis = arg[0];
        }
        kilpkonn k1 = new kilpkonn();
        for (int i = 0; i < juhis.length(); i++){
            if (juhis.charAt(i) == 'e'){
                k1.edasi();
            } else {
                k1.keera();
                System.out.println(k1);
            }

        for(int i = 0; i < 10; i++){
            for(int j=0; j<10; j++){
                System.out.println(laud[i][j]);
            }
            System.out.println();
        }
    }
}