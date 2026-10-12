public class BibloteksKort {
    private String namn;
    private static int totaltAntalBibloteksKort = 0;
    private final int kortnummer = totaltAntalBibloteksKort;
    private int antalLån = 0;
    private static final int maxLån = 3;
    BibloteksKort(String namn) {
        BibloteksKort.totaltAntalBibloteksKort++;
        setNamn(namn);
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        if (!(namn.trim().equals("") || namn.length() < 1)) {
            this.namn = namn;
        } else {
            namn = ("Okänd");
            IO.println("Ditt konto är registrerat under namnet " + namn);
            throw new IllegalArgumentException("Felaktigt inmatning på namn");
        }
        IO.println("Ditt konto är registrerat under namnet " + namn);
    }

    public static int getTotaltAntalBibloteksKort() {
        return totaltAntalBibloteksKort;
    }

    public int getAntalLån() {
        return antalLån;
    }

    public int getKortnummer() {
        return kortnummer;
    }

    public boolean lämnatillbaka() {
        if (antalLån <= 0){
            antalLån = 0;
            IO.println("Du har inga bökar att lämna tillbaka");
            return false;
        }
        else{
            antalLån--;
            IO.println("du har lämnat tillbaka en bok och har nu lånat" + antalLån +" böker");
            return true;
        }
    }

    public boolean låna() {
        if(antalLån < maxLån)
        {
            antalLån++;
            IO.println("Du har lånat en bok och har nu lånat " + antalLån + " böker totalt");
            return true;
        }
        else{
            IO.println("Du har har lånat för många böker och måste lämna tillbaka en först innan du kan låna en ny");
            antalLån = maxLån;
            return false;
        } 
    }

    public void info() {
        IO.println("Avändare: " + namn + " Kortnummer: " + kortnummer + " Antal lån. " + antalLån);
    }

    public void getAntalSkapadeBiblotekskort() {
        IO.println(totaltAntalBibloteksKort);
    }
}
