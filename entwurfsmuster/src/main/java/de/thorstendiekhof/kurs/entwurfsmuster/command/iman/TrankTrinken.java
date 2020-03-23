package de.thorstendiekhof.kurs.entwurfsmuster.command.iman;

public class TrankTrinken implements Aktion {

    private Heiltrank heiltrank = new Heiltrank();

    public TrankTrinken(Heiltrank heiltrank) {
        this.heiltrank = heiltrank;
    }


    @Override
    public void ausfuehren() {
        System.out.println("Du trinkst einen " + heiltrank.name + " der eine Grösse von " + heiltrank.groesse + " hat und dir " + heiltrank.geheilteLebenspunkte + " LP heilt.");
    }
}
