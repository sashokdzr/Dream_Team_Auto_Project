package Codewars;



class Tube {
    public static void main(String[]args){
    Object[] journey = new Object[] {};
        System.out.println(londonCityHacker(journey));
    }

    public static String londonCityHacker(Object[] journey) {
        double busCost=1.50;
        double tubeCost=2.40;
        double counter = 0.0;

        for (int i=0; i<journey.length; i++) {
            if (journey[i].getClass().getName().equals("java.lang.String")) {
                counter += tubeCost;
            }
            if (journey[i].getClass().getName().equals("java.lang.Integer")) {
                counter += busCost;
            }
        }
        int intcounter =0;
        for (int i=0; i<journey.length; i+=1) {
            if (i>0 && journey[i].getClass().getName().equals("java.lang.Integer") && journey[i-1].getClass().getName().equals("java.lang.Integer")){
                intcounter++;
                i+=1;
            }
        }
           counter = counter - intcounter * busCost;
        //code me up baby!
        return String.format("£%.2f", counter);
    }
}
