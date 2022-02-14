public class proov2a{
    public static void main(String[] arg){
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
            System.out.println(k1.kysiX());
        }
        
        /*if (juhis.charAt(0) == "e"){
            k1.edasi();
        } else {
            k1.keera();
        }
        System.out.println(k1);
        if (juhis.charAt(1) == "e"){
            k1.edasi();
        } else {
            k1.keera();
        }
        System.out.println(k1);
        if (juhis.charAt(2) == "e"){
            k1.edasi();
        } else {
            k1.keera();
        }
        System.out.println(k1);*/
    }
}