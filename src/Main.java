import java.util.ArrayList;
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

        AttackOnTitan KristaLenz = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, true, false,
                false, true, false, true, false, false, false,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan HistoriaReiss = new AttackOnTitan(false, true, true, true,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, true, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan LeviAckerman = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, true, false, true,
                true, false, true, true, true, false,
                true, true, false, true, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, true);

        AttackOnTitan HitchDreyse = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, false, false, false, false, false,
                true, false, false, true, false, false, false,
                true, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PieckFinger = new AttackOnTitan(false, true,false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, false, true, false,
                false, false, true, true, true, false,
                false, false, false, true, true, false, false,
                true, false, true, true, false, false,
                true, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan FalcoGrice = new AttackOnTitan(false, true, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false,
                false, true, false, true, true, false,
                false, false, false, true, false, true, true,
                false, false, true, false, true, false,
                false, true, false, false, false, false,
                false, true, true, false, false, false);

        AttackOnTitan GabiBraun = new AttackOnTitan(false, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true, true,
                false, false, false, false, false, false,
                true, false, false, true, false, false, true,
                true, true, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Kaya = new AttackOnTitan(false, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, true, true, false,
                false, false, false, false, false, false,
                false, false, false, false, false, true, true,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Onyankopon = new AttackOnTitan(false, false, false, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, true, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Yelena = new AttackOnTitan(false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, true, true, true, false,
                true, false, false, true, false, false, false,
                true, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Nicolo = new AttackOnTitan(false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, true, false,
                false, false, false, true, false, false, false,
                false, true, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ErenYeager = new AttackOnTitan(true, true, true, false,
                false, true, true, false, false,
                false, true, true, false, true,
                false, false, true, true, true,
                true, false, true, true, false, false,
                false, true, false, true, true, true, false,
                false, true, true, true, false, false,
                true, true, false, false, true, false,
                false, true, true, false, false, false);

        AttackOnTitan Hannes = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                true, false, false, true, false,
                false, false, false, false, false, true,
                false, true, false, false, false, false, false,
                false, true, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan GrishaYeager = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, true, true, true,
                true, false, true, true, true, true,
                false, false, true, true, true, true, false,
                false, true, true, true, false, true,
                false, true, false, false, true, false,
                false, false, true, false, false, false);

        AttackOnTitan DinaFritz = new AttackOnTitan(true, true, false, true,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, false, true,
                true, true, false, false, false, true,
                false, false, false, true, false, false, false,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan KeithShadis = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, true, false,
                false, false, false, false, false,
                false, false, true, false, false, false,
                false, true, false, false, false, false, false,
                false, true, false, false, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan SashaBraus = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, false, false, false,
                true, true, false, true, false, true, false,
                true, false, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan BertoltHoover = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                true, true, true, false, false,
                false, false, false, true, false,
                false, false, false, true, false, true,
                false, true, false, false, true, false, false,
                false, true, true, false, false, false,
                true, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ErwinSmith = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, true, false,
                false, false, true, false, false,
                false, false, true, true, false, false,
                false, true, false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan DotPixis = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                true, false, false, false, false,
                false, true, true, true, true, false,
                false, false, false, true, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan HangeZoe = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, true, false,
                false, false, false, false, false,
                false, false, true, true, true, false,
                true, true, true, true, false, false, false,
                true, true, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MarcoBott = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, true, true, false, true,
                false, true, false, true, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan DariusZackly = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true,false, false, false,
                false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false, false,
                false, false, true, true, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MikeZacharias = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false ,false, true, false, true,
                false, true, false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan NileDok = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, true, false, false, false, false,
                true, false, false, false, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PastorNick = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PetraRall = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true, false, false, false, false, false,
                true, false, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan OluoBozard = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true,  false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan EldJinn = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true, false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan GuntherSchultz = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false,true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true, false, false, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Ymir = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                false, true, true, false, false,
                false, false, true, false, false,
                false, true, false, true, false, true,
                false, false, false, false, false, false, false,
                true, true, true, true, false, true,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MarloFreudenberg = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, true, false, false, false,
                false, false, false, false, false, false,
                true, false, false, true, false, false, false,
                false, false, true, false, false,false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MarcelGalliard = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, false, true, false,
                false, false, true, false, false, true,
                false, false, false, false, false, true, true,
                false, true, true, false, false, true,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PorcoGalliard = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, false, true, true,
                false, false, false, false, false, true,
                false, false, false, true, true, true, false,
                false, false, true, false, true, false,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan KennyAckerman = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, true, false, false, false,
                true, false, false, true, false, false,
                true, false, false, false, false, true, false,
                false, false, true, true, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, true);

        AttackOnTitan RoddReiss = new AttackOnTitan(true, true, true, true,
                true, true, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, true, false, false, false, false,
                false, false, false, false, false, true, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan FriedaReiss = new AttackOnTitan(true, true, true, true,
                true, true, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, true, false, true,
                false, false, false, false, false, true, false,
                true, false, true, true, false, false,
                true, true, true, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan UriReiss = new AttackOnTitan(true, true, true, true,
                true, true, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, true, false, true,
                false, false, false, false, false, true, false,
                false, false, true, false, false, false,
                false, true, true, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ZekeYeager = new AttackOnTitan(true, true, false, true,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, true, true, false,
                true, false, true, false, true, false,
                false, false, true, true, false, true, false,
                false, false, true, false, true, false,
                false, true, false, false, false, false,
                false, true, true, false, false, false);

        AttackOnTitan CarlaYeager = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, true, false,
                true, false, false, false, false, true,
                false, false, false, false, false, false, false,
                true, false, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan YmirFritz = new AttackOnTitan(true, true, false, true,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, true, true, false,
                true, false, false, true, false, true,
                false, false, false, false, false, false, true,
                true, false, true, true, true, false,
                false, true, false, false, false, false,
                false, false, true, false , false, false);

        AttackOnTitan ErenKruger = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, true, false, false,
                true, false, false, false, false, true,
                true, false, false, false, true, false, false,
                false, true, true, false, false, true,
                false, true, false, false, true, false,
                false, false, true, false, false, false);

        AttackOnTitan FlochForster = new AttackOnTitan(true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, false, true, true, false,
                true, false, false, false, false, false, false,
                false, false, true, false, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan TeoMagath = new AttackOnTitan(true, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, true, false,
                true, false, false, true, false, false, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ColtGrice = new AttackOnTitan(true, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false, false,
                false, false, false, true, false, true, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Zofia = new AttackOnTitan(true, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false, true,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Udo = new AttackOnTitan(true, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true,  false,
                false, false, false, false, false, false,
                false, false, true, false, false, false, true,
                false, false, true, false, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan WillyTybur = new AttackOnTitan(true, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, true, false, false, true,
                false, false, false, false, false, true, false,
                false, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true,false, false, false);

        AttackOnTitan TomKsaver = new AttackOnTitan(true, true, false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, true, false, false,
                false, false, true, false, false, true,
                false, false, true, false, false, false, false,
                false, true, true, false, false, true,
                false, true, false, false, false, false,
                false, true, true, false, false, false);

        AttackOnTitan TitaColossal = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, false, false, false, false,
                false, true, false, false, false, false,
                false, false, false, false, true, false);

        AttackOnTitan TitaBlindado = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, false, true, false,
                false, true, false, true, false, false,
                false, false, false, false, true, true);

        AttackOnTitan TitaAtaque = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, true, false, false,
                true, true, false, true, true, false,
                true, false, false, false, true, false);

        AttackOnTitan TitaFemea = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, true, false,
                false, true, false, true, false, false,
                true, false, false, false, true, true);

        AttackOnTitan TitaBestial = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false,false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, false, false, true,
                false, true, false, true, false, false,
                false, true, true, false, true, false);

        AttackOnTitan TitaMandibulaYmir = new AttackOnTitan(true, true,false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, false, false,
                true, true, false, false, false, false,
                false, false, true, true, true, true);

        AttackOnTitan TitaFundadorFriedaReiss = new AttackOnTitan(true, true, false, true,
                true, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, false, false,
                true, true, true, false, false, false,
                false, false, false, false, true, false);

        AttackOnTitan TitaAtaqueGrishaYeager = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false,false, false, false,
                true, false, false, false, false, false,
                false, false, false ,false, false, true, false,
                false, false, true, true, false, true,
                false, true, false, false, true, false,
                false, false, false, false, true, false);

        AttackOnTitan TitaFundador = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, true, false,
                false, true, true, true, true, true,
                false, false, false, false, true, false);

        AttackOnTitan TitaRoddReiss = new AttackOnTitan(true, true, false, true,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, true, false, false, false, false,
                false, false, false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, true,
                false, false, false, false, true, false);

        AttackOnTitan TitaCarroceiro = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                true, false, false, false, false, true, false,
                true, false, true, false, false, false,
                true, true, false, false, false, false,
                false, false, true, true, true, true);

        AttackOnTitan TitaMandibulaPorcoGalliard = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, true, true, false,
                false, true, false, false, false, false,
                false, false, false, true, true, true);

        AttackOnTitan TitaMarteloGuerra = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, true, false, false, false, true, false,
                true, false, false, false, false, false,
                false, true, false, true, false, false,
                false, false, true, false, true, false);

        AttackOnTitan TitaFundadorEren = new AttackOnTitan(true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, true,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, true, true, true, false, false,
                true, true, true, true, true, true,
                false, false, false, true, true, false);


        ArrayList<AttackOnTitan> personagens = new ArrayList<AttackOnTitan>();
        personagens.add(MikasaAckerman);
        personagens.add(ArminArlert);
        personagens.add(JeanKirstein);
        personagens.add(ConnieSpringer);
        personagens.add(ReinerBraun);
        personagens.add(AnnieLeonhart);
        personagens.add(KristaLenz);
        personagens.add(HistoriaReiss);
        personagens.add(LeviAckerman);
        personagens.add(HitchDreyse);
        personagens.add(PieckFinger);
        personagens.add(FalcoGrice);
        personagens.add(GabiBraun);
        personagens.add(Kaya);
        personagens.add(Onyankopon);
        personagens.add(Yelena);
        personagens.add(Nicolo);
        personagens.add(ErenYeager);
        personagens.add(Hannes);
        personagens.add(GrishaYeager);
        personagens.add(DinaFritz);
        personagens.add(KeithShadis);
        personagens.add(SashaBraus);
        personagens.add(BertoltHoover);
        personagens.add(ErwinSmith);
        personagens.add(DotPixis);
        personagens.add(HangeZoe);
        personagens.add(MarcoBott);
        personagens.add(DariusZackly);
        personagens.add(MikeZacharias);
        personagens.add(NileDok);
        personagens.add(PastorNick);
        personagens.add(PetraRall);
        personagens.add(OluoBozard);
        personagens.add(EldJinn);
        personagens.add(GuntherSchultz);
        personagens.add(Ymir);
        personagens.add(MarloFreudenberg);
        personagens.add(MarcelGalliard);
        personagens.add(PorcoGalliard);
        personagens.add(KennyAckerman);
        personagens.add(RoddReiss);
        personagens.add(FriedaReiss);
        personagens.add(UriReiss);
        personagens.add(ZekeYeager);
        personagens.add(CarlaYeager);
        personagens.add(YmirFritz);
        personagens.add(ErenKruger);
        personagens.add(FlochForster);
        personagens.add(TeoMagath);
        personagens.add(ColtGrice);
        personagens.add(Zofia);
        personagens.add(Udo);
        personagens.add(WillyTybur);
        personagens.add(TomKsaver);
        personagens.add(TitaColossal);
        personagens.add(TitaBlindado);
        personagens.add(TitaAtaque);
        personagens.add(TitaFemea);
        personagens.add(TitaBestial);
        personagens.add(TitaMandibulaYmir);
        personagens.add(TitaFundadorFriedaReiss);
        personagens.add(TitaAtaqueGrishaYeager);
        personagens.add(TitaFundador);
        personagens.add(TitaRoddReiss);
        personagens.add(TitaCarroceiro);
        personagens.add(TitaMandibulaPorcoGalliard);
        personagens.add(TitaMarteloGuerra);
        personagens.add(TitaFundadorEren);


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