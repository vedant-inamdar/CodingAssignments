public class code {
    public static void main(String[] args) {
        double initialmass=100.0;
        double halflifetime=5.0;
        int numofhalflives=3;
        double remainingmass=initialmass;
        for(int i=0;i<numofhalflives;i++){
            remainingmass=remainingmass*0.5;
        }
        double totalyears=halflifetime*numofhalflives;
        System.out.println("Reamining mass of material: "+remainingmass);
        System.out.println("Years took: "+totalyears);
    }
}