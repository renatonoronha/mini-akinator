import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AttackOnTitan MikasaAckerman = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, true, true, false,
                true, false, false, true, true, false,
                true, true, false, true, false,false,false,
                true, true, true, false, false, false,
                true, false, false, false, false,
                false, true, false, true,false, false,
                true);
        AttackOnTitan ArminArlert = new AttackOnTitan(false, true, true , false,
                false, true, true, false, false,
                false, true, true, true, true,
                false, false, true, true, false,
                false, false, true, true, true, false,
                true, true, false, true, false, false,false,
                false, true, true, false, true, false,
                false, true, false,false,false, false,
                false,false, true, false, false, false);
        AttackOnTitan JeanKirstein = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, true, true, true, false,
                true, true, false,true, true, false, false,
                false, true, true, false, false, true,
                false, false,false,false,false,false,
                false, false, true, false, false, false);
        AttackOnTitan ConnieSpringer = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, true, false,
                false, false, false, true, true, false,
                true, true, false, true, false, true, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);
        AttackOnTitan ReinerBraun = new AttackOnTitan(false, true, false, false,
                false, true, true, false, false,
                true, true, true, false, false,
                false, false, true, true, false,
                false, false, false, false, true, false,
                false, false, false, true, true, false, false,
                false, true, true, false, true, false,
                false, true, false, false, false, false,
                false, false, true, false, false, false);
        AttackOnTitan AnnieLeonhart = new AttackOnTitan(false, true, false, false,
                false, true, true, false, false,
                true, true, false, false, false,
                false, true, true, true, false,
                false, false, false, false, false, false,
                false, true, false, false, true, false, false,
                true, false, true, true, true, false,
                false, true, false, false, false, false,
                true, false, true, false, false, true);
        //AttackOnTitan KristaLenz = new AttackOnTitan(false, true, true);
        //AttackOnTitan HistoriaReiss = new AttackOnTitan(false, true, true);
        //AttackOnTitan LeviAckerman = new AttackOnTitan(false, true, true);
        //AttackOnTitan HitchDreyse = new AttackOnTitan(false, true, true);
        //AttackOnTitan PieckFinger = new AttackOnTitan(false, true,false);
        //AttackOnTitan FalcoGrice = new AttackOnTitan(false, true, false);
        //AttackOnTitan GabiBraun = new AttackOnTitan(false, true, false);
        //AttackOnTitan Kaya = new AttackOnTitan(false, true, true);
        //AttackOnTitan Onyankopon = new AttackOnTitan(false, false, false);
        //AttackOnTitan Yelena = new AttackOnTitan(false, false, false);
        //AttackOnTitan Nicolo = new AttackOnTitan(false, false, false);
        //AttackOnTitan ErenYeager = new AttackOnTitan(true, true, true);
        //AttackOnTitan Hannes = new AttackOnTitan(true, true, true);
        //AttackOnTitan GrishaYeager = new AttackOnTitan(true, true, false);
        //AttackOnTitan KeithShadis = new AttackOnTitan(true, true, true);
        //AttackOnTitan SashaBraus = new AttackOnTitan(true, true);
        //AttackOnTitan BertoltHoover = new AttackOnTitan(true, true);
        //AttackOnTitan ErwinSmith = new AttackOnTitan(true, true);
        //AttackOnTitan DotPixis = new AttackOnTitan(true, true);
        //AttackOnTitan HangeZoe = new AttackOnTitan(true, true);
        //AttackOnTitan MarcoBott = new AttackOnTitan(true, true);
        //AttackOnTitan DariusZackly = new AttackOnTitan(true, true);
        //AttackOnTitan MikeZacharias = new AttackOnTitan(true, true);
        //AttackOnTitan NileDok = new AttackOnTitan(true, true);
        //AttackOnTitan PastorNick = new AttackOnTitan(true, true);
        //AttackOnTitan PetraRall = new AttackOnTitan(true, true);
        //AttackOnTitan OluoBozard = new AttackOnTitan(true, true);
        //AttackOnTitan EldJinn = new AttackOnTitan(true, true);
        //AttackOnTitan GuntherSchultz = new AttackOnTitan(true, true);
        //AttackOnTitan Ymir = new AttackOnTitan(true, true);
        //AttackOnTitan MarloFreudenberg = new AttackOnTitan(true, true);
        //AttackOnTitan MarcelGalliard = new AttackOnTitan(true, true);
        //AttackOnTitan KennyAckerman = new AttackOnTitan(true, true);
        //AttackOnTitan RoddReiss = new AttackOnTitan(true, true);
        //AttackOnTitan FriedaReiss = new AttackOnTitan(true, true);
        //AttackOnTitan UriReiss = new AttackOnTitan(true, true);
        //AttackOnTitan ZekeYeager = new AttackOnTitan(true, true);
        //AttackOnTitan CarlaYeager = new AttackOnTitan(true, true);
        //AttackOnTitan YmirFritz = new AttackOnTitan(true, true);
        //AttackOnTitan ErenKruger = new AttackOnTitan(true, true);
        //AttackOnTitan FlochForster = new AttackOnTitan(true, true);
        //AttackOnTitan ColtGrice = new AttackOnTitan(true, true);
        //AttackOnTitan Zofia = new AttackOnTitan(true, true);
        //AttackOnTitan Udo = new AttackOnTitan(true, true);
        //AttackOnTitan PorcoGalliard = new AttackOnTitan(true, true);
        //AttackOnTitan WillyTybur = new AttackOnTitan(true, true);
        //AttackOnTitan TomKsaver = new AttackOnTitan(true, true);
        //AttackOnTitan TitaColossal = new AttackOnTitan(true, true);
        //AttackOnTitan TitaBlindado = new AttackOnTitan(true, true);
        //AttackOnTitan TitaAtaque = new AttackOnTitan(true, true);
        //AttackOnTitan TitaFemea = new AttackOnTitan(true, true);
        //AttackOnTitan TitaBestial = new AttackOnTitan(true, true);
        //AttackOnTitan TitaMandibulaYmir = new AttackOnTitan(true, true);
        //AttackOnTitan TitaFundadorFriedaReiss = new AttackOnTitan(true, true);
        //AttackOnTitan TitaAtaqueGrishaYeager = new AttackOnTitan(true, true);
        //AttackOnTitan TitaFundador = new AttackOnTitan(true, true);
        //AttackOnTitan TitaRoddReiss = new AttackOnTitan(true, true);
        //AttackOnTitan TitaCarroceiro = new AttackOnTitan(true, true);
        //AttackOnTitan TitaMandibulaPorcGalliard = new AttackOnTitan(true, true);
        //AttackOnTitan TitaMarteloGuerra = new AttackOnTitan(true, true);
        //AttackOnTitan TitaFundadorEren = new AttackOnTitan(true, true);
        //AttackOnTitan TeoMagath = new AttackOnTitan(true, false);

        ArrayList<AttackOnTitan> personagens = new ArrayList<AttackOnTitan>();
        personagens.add(MikasaAckerman);
        personagens.add(ArminArlert);
        personagens.add(JeanKirstein);
        personagens.add(ConnieSpringer);
        personagens.add(ReinerBraun);

        ArrayList backup = (ArrayList) personagens.clone();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seu personagem já está morto? (s/n)");
        String estaMorto = teclado.nextLine();
        if (estaMorto.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if(!personagem.isEstaMorto()){
                    backup.remove(personagem);
                }
            }
        } else if (estaMorto.equals("n")) {
            for(AttackOnTitan personagem: personagens){
                if(personagem.isEstaMorto()){
                    backup.remove(personagem);
                }
            }
        } else {
            System.out.println("Resposta inválida");
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();
        System.out.println(personagens);
    }
}