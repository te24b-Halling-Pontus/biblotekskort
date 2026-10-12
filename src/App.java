import java.util.ArrayList;
public static void main(){
    ArrayList<BibloteksKort> biblotekskortLista = new ArrayList<>();
    biblotekskortLista.add(new BibloteksKort("Pontus"));
    biblotekskortLista.add(new BibloteksKort("Sixten"));
    IO.println(biblotekskortLista.get(0).getNamn());
    IO.println(biblotekskortLista.get(0).getKortnummer());
    IO.println(biblotekskortLista.get(1).getNamn());
    IO.println(biblotekskortLista.get(1).getKortnummer());
    biblotekskortLista.get(0).låna();
    biblotekskortLista.get(0).låna();
    biblotekskortLista.get(0).låna();
    biblotekskortLista.get(0).låna();
    biblotekskortLista.get(0).lämnatillbaka();
    biblotekskortLista.get(0).låna();
    biblotekskortLista.get(1).lämnatillbaka();
    biblotekskortLista.get(1).setNamn("po");
    try{
        biblotekskortLista.get(1).setNamn(" ");
    }
    catch(Exception IllegalArgumentException){
        IO.println(IllegalArgumentException);
    }
    IO.println(biblotekskortLista.get(1).getTotaltAntalBibloteksKort());
    
}