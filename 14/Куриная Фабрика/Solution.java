public class Solution{

    public static void main(String[] args) {
        Hen belarus = HenFactory.getHen(Country.BELARUS);
        System.out.println(belarus.getDescription());
        Hen russian = HenFactory.getHen(Country.RUSSIA);
        System.out.println(russian.getDescription());
        Hen ukrainen = HenFactory.getHen(Country.UKRAINE);
        System.out.println(ukrainen.getDescription());
        Hen moldovian = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(moldovian.getDescription());
    }

    static class HenFactory{
        static Hen getHen(String country){
            Hen hen = null;

            if(country.equals(Country.RUSSIA)){
                 hen = new RussianHen();
            }
            if(country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }
            if(country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }
            if(country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }
            return hen;
        }

    }
}
