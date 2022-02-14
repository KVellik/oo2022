public class isikukood{
    private String kood;
    public isikukood(String uusKood) {kood = uusKood;}
    public String sugu(){
        return (Integer.parseInt(kood.substring(0, 1)) % 2 == 0 ? "Naine" : "Mees");
    }

    public String aastakakstahte(){
        return String.valueOf(18 + (Integer.parseInt(kood.substring(0, 1))-1)/2);      
    }

    public String synniaasta(){
        return aastakakstahte()+kood.substring(1, 3);
    }

    public String synnikuu(){
        return kood.substring(3, 5);
        
    }
}