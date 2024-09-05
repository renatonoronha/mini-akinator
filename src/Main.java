import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AttackOnTitan MikasaAckerman = new AttackOnTitan("Mikasa Ackerman",false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, true, true, false,
                true, false, false, true, true, false,
                true, true, false, true, false,false,false,
                true, true, true, false, false, false,
                true, false, false, false, false,
                false, true, false, true,false, false,
                true);

        AttackOnTitan ArminArlert = new AttackOnTitan("Armin Arlert",false, true, true , false,
                false, true, true, false, false,
                false, true, true, true, true,
                false, false, true, true, false,
                false, false, true, true, true, false,
                true, true, false, true, false, false,false,
                false, true, true, false, true, false,
                false, true, false,false,false, false,
                false,false, true, false, false, false);

        AttackOnTitan JeanKirstein = new AttackOnTitan("Jean Kirstein",false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, true, true, true, false,
                true, true, false,true, true, false, false,
                false, true, true, false, false, true,
                false, false,false,false,false,false,
                false, false, true, false, false, false);

        AttackOnTitan ConnieSpringer = new AttackOnTitan("Connie Springer",false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, true, false,
                false, false, false, true, true, false,
                true, true, false, true, false, true, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ReinerBraun = new AttackOnTitan("Reiner Braun",false, true, false, false,
                false, true, true, false, false,
                true, true, true, false, false,
                false, false, true, true, false,
                false, false, false, false, true, false,
                false, false, false, true, true, false, false,
                false, true, true, false, true, false,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan AnnieLeonhart = new AttackOnTitan("Annie Leonhart",false, true, false, false,
                false, true, true, false, false,
                true, true, false, false, false,
                false, true, true, true, false,
                false, false, false, false, false, false,
                false, true, false, false, true, false, false,
                true, false, true, true, true, false,
                false, true, false, false, false, false,
                true, false, true, false, false, true);

        AttackOnTitan KristaLenz = new AttackOnTitan("Krista Lenz",false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, true, false,
                false, true, false, true, false, false, false,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan HistoriaReiss = new AttackOnTitan("Historia Reiss",false, true, true, true,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, true, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan LeviAckerman = new AttackOnTitan("Levi Ackerman",false, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, true, false, true,
                true, false, true, true, true, false,
                true, true, false, true, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, true);

        AttackOnTitan HitchDreyse = new AttackOnTitan("Hitch Dreyse",false, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, false, false, false, false, false,
                true, false, false, true, false, false, false,
                true, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PieckFinger = new AttackOnTitan("Pieck Finger",false, true,false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, false, true, false,
                false, false, true, true, true, false,
                false, false, false, true, true, false, false,
                true, false, true, true, false, false,
                true, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan FalcoGrice = new AttackOnTitan("Falco Grice",false, true, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false,
                false, true, false, true, true, false,
                false, false, false, true, false, true, true,
                false, false, true, false, true, false,
                false, true, false, false, false, false,
                false, true, true, false, false, false);

        AttackOnTitan GabiBraun = new AttackOnTitan("Gabi Braun",false, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true, true,
                false, false, false, false, false, false,
                true, false, false, true, false, false, true,
                true, true, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Kaya = new AttackOnTitan("Kaya",false, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, true, true, false,
                false, false, false, false, false, false,
                false, false, false, false, false, true, true,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Onyankopon = new AttackOnTitan("Onyankopon",false, false, false, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, true, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Yelena = new AttackOnTitan("Yelena",false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, true, true, true, false,
                true, false, false, true, false, false, false,
                true, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Nicolo = new AttackOnTitan("Nicolo",false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, true, false,
                false, false, false, true, false, false, false,
                false, true, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ErenYeager = new AttackOnTitan("Eren Yeager",true, true, true, false,
                false, true, true, false, false,
                false, true, true, false, true,
                false, false, true, true, true,
                true, false, true, true, false, false,
                false, true, false, true, true, true, false,
                false, true, true, true, false, false,
                true, true, false, false, true, false,
                false, true, true, false, false, false);

        AttackOnTitan Hannes = new AttackOnTitan("Hannes",true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                true, false, false, true, false,
                false, false, false, false, false, true,
                false, true, false, false, false, false, false,
                false, true, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan GrishaYeager = new AttackOnTitan("Grisha Yeager",true, true, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, true, true, true,
                true, false, true, true, true, true,
                false, false, true, true, true, true, false,
                false, true, true, true, false, true,
                false, true, false, false, true, false,
                false, false, true, false, false, false);

        AttackOnTitan DinaFritz = new AttackOnTitan("Dina Fritz",true, true, false, true,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, false, true,
                true, true, false, false, false, true,
                false, false, false, true, false, false, false,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan KeithShadis = new AttackOnTitan("Keith Shadis",true, true, true, false,
                false, true, false, false, false,
                false, true, true, true, false,
                false, false, false, false, false,
                false, false, true, false, false, false,
                false, true, false, false, false, false, false,
                false, true, false, false, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan SashaBraus = new AttackOnTitan("Sasha Braus",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, false, false, false,
                true, true, false, true, false, true, false,
                true, false, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan BertoltHoover = new AttackOnTitan("Bertolt Hoover",true, true, false, false,
                false, true, true, false, false,
                true, true, true, false, false,
                false, false, false, true, false,
                false, false, false, true, false, true,
                false, true, false, false, true, false, false,
                false, true, true, false, false, false,
                true, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ErwinSmith = new AttackOnTitan("Erwin Smith",true, true, true, false,
                false, true, false, false, false,
                false, true, true, true, false,
                false, false, true, false, false,
                false, false, true, true, false, false,
                false, true, false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan DotPixis = new AttackOnTitan("Dot Pixis",true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                true, false, false, false, false,
                false, true, true, true, true, false,
                false, false, false, true, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan HangeZoe = new AttackOnTitan("Hange Zoe", true, true, true, false,
                false, true, false, false, false,
                false, true, true, true, false,
                false, false, false, false, false,
                false, false, true, true, true, false,
                true, true, true, true, false, false, false,
                true, true, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MarcoBott = new AttackOnTitan("Marco Bott", true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, true, true, false, true,
                false, true, false, true, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan DariusZackly = new AttackOnTitan("Darius Zackly",true, true, true, false,
                false, true, false, false, false,
                false, true,false, false, false,
                false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false, false,
                false, false, true, true, false, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MikeZacharias = new AttackOnTitan("Mike Zacharias",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false ,false, true, false, true,
                false, true, false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan NileDok = new AttackOnTitan("Nile Dok",true, true, true, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, true, false, false, false,
                false, true, false, false, false, false,
                true, false, false, false, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PastorNick = new AttackOnTitan("Pastor Nick",true, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PetraRall = new AttackOnTitan("Petra Rall",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true, false, false, false, false, false,
                true, false, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan OluoBozard = new AttackOnTitan("Oluo Bozard",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true,  false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan EldJinn = new AttackOnTitan("Eld Jinn",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true, false, false, false, false, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan GuntherSchultz = new AttackOnTitan("Gunther Schultz",true, true, true, false,
                false, true, false, false, false,
                false,true, true, false, true,
                false, false, false, false, false,
                false, false, false, true, false, false,
                false, true, false, false, false, false, false,
                false, false, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Ymir = new AttackOnTitan("Ymir",true, true, false, false,
                false, true, true, false, false,
                false, true, true, false, false,
                false, false, true, false, false,
                false, true, false, true, false, true,
                false, false, false, false, false, false, false,
                true, true, true, true, false, true,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MarloFreudenberg = new AttackOnTitan("Marlo Freudenberg",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, true, false, false, false,
                false, false, false, false, false, false,
                true, false, false, true, false, false, false,
                false, false, true, false, false,false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan MarcelGalliard = new AttackOnTitan("Marcel Galliard",true, true, false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, false, true, false,
                false, false, true, false, false, true,
                false, false, false, false, false, true, true,
                false, true, true, false, false, true,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan PorcoGalliard = new AttackOnTitan("Porco Galliard",true, true, false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, false, true, true,
                false, false, false, false, false, true,
                false, false, false, true, true, true, false,
                false, false, true, false, true, false,
                false, true, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan KennyAckerman = new AttackOnTitan("Kenny Ackerman",true, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, true, false, false, false,
                true, false, false, true, false, false,
                true, false, false, false, false, true, false,
                false, false, true, true, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, true);

        AttackOnTitan RoddReiss = new AttackOnTitan("Rodd Reiss",true, true, true, true,
                true, true, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, true, false, false, false, false,
                false, false, false, false, false, true, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan FriedaReiss = new AttackOnTitan("Frieda Reiss",true, true, true, true,
                true, true, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, true, false, true,
                false, false, false, false, false, true, false,
                true, false, true, true, false, false,
                true, true, true, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan UriReiss = new AttackOnTitan("Uri Reiss",true, true, true, true,
                true, true, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, true, false, true,
                false, false, false, false, false, true, false,
                false, false, true, false, false, false,
                false, true, true, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ZekeYeager = new AttackOnTitan("Zeke Yeager",true, true, false, true,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, true, true, false,
                true, false, true, false, true, false,
                false, false, true, true, false, true, false,
                false, false, true, false, true, false,
                false, true, false, false, false, false,
                false, true, true, false, false, false);

        AttackOnTitan CarlaYeager = new AttackOnTitan("Carla Yeager",true, true, true, false,
                false, true, false, false, false,
                false, false, false, false, false,
                false, false, false, true, false,
                true, false, false, false, false, true,
                false, false, false, false, false, false, false,
                true, false, true, true, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan YmirFritz = new AttackOnTitan("Ymir Fritz",true, true, false, true,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, true, true, false,
                true, false, false, true, false, true,
                false, false, false, false, false, false, true,
                true, false, true, true, true, false,
                false, true, false, false, false, false,
                false, false, true, false , false, false);

        AttackOnTitan ErenKruger = new AttackOnTitan("Eren Kruger",true, true, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, true, false, false,
                true, false, false, false, false, true,
                true, false, false, false, true, false, false,
                false, true, true, false, false, true,
                false, true, false, false, true, false,
                false, false, true, false, false, false);

        AttackOnTitan FlochForster = new AttackOnTitan("Floch Forster",true, true, true, false,
                false, true, false, false, false,
                false, true, true, false, false,
                false, false, false, false, false,
                false, false, false, true, true, false,
                true, false, false, false, false, false, false,
                false, false, true, false, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan TeoMagath = new AttackOnTitan("Teo Magath", true, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, true, false,
                true, false, false, true, false, false, false,
                false, true, true, false, false, false,
                true, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan ColtGrice = new AttackOnTitan("Colt Grice", true, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false, false,
                false, false, false, true, false, true, false,
                false, false, true, false, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Zofia = new AttackOnTitan("Zofia",true, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true, false,
                false, false, false, false, false, false,
                false, false, false, false, false, false, true,
                true, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan Udo = new AttackOnTitan("Udo",true, true, false, false,
                false, true, false, false, true,
                false, false, false, false, false,
                false, false, false, true,  false,
                false, false, false, false, false, false,
                false, false, true, false, false, false, true,
                false, false, true, false, false, true,
                false, false, false, false, false, false,
                false, false, true, false, false, false);

        AttackOnTitan WillyTybur = new AttackOnTitan("Willy Tybur",true, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, true, false, false, true,
                false, false, false, false, false, true, false,
                false, false, true, true, true, false,
                false, false, false, false, false, false,
                false, false, true,false, false, false);

        AttackOnTitan TomKsaver = new AttackOnTitan("Tom Ksaver",true, true, false, false,
                false, true, true, false, false,
                true, false, false, false, false,
                false, false, true, false, false,
                false, false, true, false, false, true,
                false, false, true, false, false, false, false,
                false, true, true, false, false, true,
                false, true, false, false, false, false,
                false, true, true, false, false, false);

        AttackOnTitan TitaColossal = new AttackOnTitan("Titã Colossal",true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, false, false, false, false,
                false, true, false, false, false, false,
                false, false, false, false, true, false);

        AttackOnTitan TitaBlindado = new AttackOnTitan("Titã Blindado",true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, false, true, false,
                false, true, false, true, false, false,
                false, false, false, false, true, true);

        AttackOnTitan TitaAtaque = new AttackOnTitan("Titã de Ataque", true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, true, false, false,
                true, true, false, true, true, false,
                true, false, false, false, true, false);

        AttackOnTitan TitaFemea = new AttackOnTitan("Titã Fêmea", true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, true, false,
                false, true, false, true, false, false,
                true, false, false, false, true, true);

        AttackOnTitan TitaBestial = new AttackOnTitan("Titã Bestial",true, true, false, false,
                false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false,false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, false, false, true,
                false, true, false, true, false, false,
                false, true, true, false, true, false);

        AttackOnTitan TitaMandibulaYmir = new AttackOnTitan("Titã Mandíbula de Ymir",true, true,false,
                false, false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, false, false,
                true, true, false, false, false, false,
                false, false, true, true, true, true);

        AttackOnTitan TitaFundadorFriedaReiss = new AttackOnTitan("Titã Fundador de Frieda Reiss",true, true,
                false, true, true, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, false, false,
                true, true, true, false, false, false,
                false, false, false, false, true, false);

        AttackOnTitan TitaAtaqueGrishaYeager = new AttackOnTitan("Titã de Ataque de Grisha Yeager",true, true,
                false, false, false, false, true, false, false,
                false, false, false, false, false,
                false, false,false, false, false,
                true, false, false, false, false, false,
                false, false, false ,false, false, true, false,
                false, false, true, true, false, true,
                false, true, false, false, true, false,
                false, false, false, false, true, false);

        AttackOnTitan TitaFundadorYmirFritz = new AttackOnTitan("Titã Fundador de Ymir Fritz",true, true,
                false, false, false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                true, false, true, true, true, false,
                false, true, true, true, true, true,
                false, false, false, false, true, false);

        AttackOnTitan TitaRoddReiss = new AttackOnTitan("Titã de Rodd Reiss",true, true, false,
                true, false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, true, false, false, false, false,
                false, false, false, false, false, false, false,
                false, false, false, false, false, false,
                false, false, false, false, false, true,
                false, false, false, false, true, false);

        AttackOnTitan TitaCarroceiro = new AttackOnTitan("Titã Carroceiro",true, true, false,
                false, false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, true, false, false, false,
                true, false, false, false, false, true, false,
                true, false, true, false, false, false,
                true, true, false, false, false, false,
                false, false, true, true, true, true);

        AttackOnTitan TitaMandibulaPorcoGalliard = new AttackOnTitan("Titã Mandíbula de Porco Galliard",true,
                true, false, false, false, false, true, false,
                false, false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, true, true, false,
                false, true, false, false, false, false,
                false, false, false, true, true, true);

        AttackOnTitan TitaMandibulaFalco = new AttackOnTitan("Titã Mandíbula de Falco Grice", true, true,
                false, false, false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, false, true, true, true, false,
                false, true, false, false, false, false,
                false, true, false, true, true, true);

        AttackOnTitan TitaMarteloGuerra = new AttackOnTitan("Titã Martelo de Guerra",true, true,
                false, false, false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                true, false, false, false, false, false,
                false, true, false, false, false, true, false,
                true, false, false, false, false, false,
                false, true, false, true, false, false,
                false, false, true, false, true, false);

        AttackOnTitan TitaFundadorEren = new AttackOnTitan("Titã Fundador de Eren Yeager",true, true,
                false, false, false, false, true, false, false,
                false, false, false, false, false,
                false, false, false, false, true,
                true, false, false, false, false, false,
                false, false, false, false, false, true, false,
                false, true, true, true, false, false,
                true, true, true, true, true, true,
                false, false, false, true, true, false);


        ArrayList<AttackOnTitan> personagens = new ArrayList<>();
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
        personagens.add(TitaFundadorYmirFritz);
        personagens.add(TitaRoddReiss);
        personagens.add(TitaCarroceiro);
        personagens.add(TitaMandibulaPorcoGalliard);
        personagens.add(TitaMandibulaFalco);
        personagens.add(TitaMarteloGuerra);
        personagens.add(TitaFundadorEren);


        ArrayList<AttackOnTitan> backup = (ArrayList<AttackOnTitan>) personagens.clone();
        Scanner teclado = new Scanner(System.in);


        System.out.println("Seu personagem é mulher? (s/n)"); // Pergunta 1
        String mulher = teclado.nextLine();
        if(mulher.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if (!personagem.isMulher()){
                    backup.remove(personagem);
                }
            }
        } else if (mulher.equals("n")){
            for(AttackOnTitan personagem: personagens){
                if (personagem.isMulher()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem é Eldiano? (s/n)"); // Pergunta 2
        String eldiano = teclado.nextLine();
        if(eldiano.equals("s")){
            for (AttackOnTitan personagem: personagens){
                if(!personagem.isEldiano()){
                    backup.remove(personagem);
                }
            }
        } else if (eldiano.equals("n")){
            for (AttackOnTitan personagem: personagens){
                if(personagem.isEldiano()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem nasceu na Ilha Paradis? (s/n)"); // Pergunta 3
        String nascidoParadis = teclado.nextLine();
        if(nascidoParadis.equals("s")){
            for (AttackOnTitan personagem: personagens){
                if(!personagem.isNascidoParadis()){
                    backup.remove(personagem);
                }
            }
        } else if (nascidoParadis.equals("n")){
            for (AttackOnTitan personagem: personagens){
                if(personagem.isNascidoParadis()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem faz parte da tropa de exploração? (s/n)"); // Pergunta 4
        String tropaExploracao = teclado.nextLine();
        if(tropaExploracao.equals("s")){
            for (AttackOnTitan personagem: personagens){
                if(!personagem.isTropaExploracao()){
                    backup.remove(personagem);
                }
            }
        } else if (tropaExploracao.equals("n")){
            for (AttackOnTitan personagem: personagens){
                if(personagem.isTropaExploracao()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem já está morto? (s/n)"); // Pergunta 5
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
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem pode se transformar em um titã?"); // Pergunta 6
        String transformaTita = teclado.nextLine();
        if (transformaTita.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if(!personagem.isTransformaTita()){
                    backup.remove(personagem);
                }
            }
        } else if (transformaTita.equals("n")) {
            for(AttackOnTitan personagem: personagens){
                if(personagem.isTransformaTita()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem é um guerreiro?"); // Pergunta 7
        String guerreiro = teclado.nextLine();
        if (guerreiro.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if(!personagem.isGuerreiro()){
                    backup.remove(personagem);
                }
            }
        } else if (guerreiro.equals("n")) {
            for(AttackOnTitan personagem: personagens){
                if(personagem.isGuerreiro()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem teve um passado traumático?"); // Pergunta 8
        String passadoTraumatico = teclado.nextLine();
        if (passadoTraumatico.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if(!personagem.isPassadoTraumatico()){
                    backup.remove(personagem);
                }
            }
        } else if (passadoTraumatico.equals("n")) {
            for(AttackOnTitan personagem: personagens){
                if(personagem.isPassadoTraumatico()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem é um soldado?"); // Pergunta 9
        String soldado = teclado.nextLine();
        if (soldado.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if(!personagem.isSoldado()){
                    backup.remove(personagem);
                }
            }
        } else if (soldado.equals("n")) {
            for(AttackOnTitan personagem: personagens){
                if(personagem.isSoldado()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        System.out.println("Seu personagem é gigante?"); // Pergunta 10
        String gigante = teclado.nextLine();
        if (gigante.equals("s")){
            for(AttackOnTitan personagem: personagens){
                if(!personagem.isGigante()){
                    backup.remove(personagem);
                }
            }
        } else if (gigante.equals("n")) {
            for(AttackOnTitan personagem: personagens){
                if(personagem.isGigante()){
                    backup.remove(personagem);
                }
            }
        }

        personagens = (ArrayList<AttackOnTitan>) backup.clone();

        if (personagens.size()>1){
            System.out.println("Seu personagem é inteligente?"); // Pergunta 11
            String inteligente = teclado.nextLine();
            if (inteligente.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isInteligente()){
                        backup.remove(personagem);
                    }
                }
            } else if (inteligente.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isInteligente()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem sente culpa por algo?"); // Pergunta 12
            String senteCulpa = teclado.nextLine();
            if (senteCulpa.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isSenteCulpa()){
                        backup.remove(personagem);
                    }
                }
            } else if (senteCulpa.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isSenteCulpa()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem foi devorado por um titã?"); // Pergunta 13
            String devorado = teclado.nextLine();
            if (devorado.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isDevorado()){
                        backup.remove(personagem);
                    }
                }
            } else if (devorado.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isDevorado()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é uma criança?"); // Pergunta 14
            String crianca = teclado.nextLine();
            if (crianca.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isCrianca()){
                        backup.remove(personagem);
                    }
                }
            } else if (crianca.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isCrianca()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem teve sua cidade natal destruída?"); // Pergunta 15
            String cidadeNatalDestruida = teclado.nextLine();
            if (cidadeNatalDestruida.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isCidadeNatalDestruida()){
                        backup.remove(personagem);
                    }
                }
            } else if (cidadeNatalDestruida.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isCidadeNatalDestruida()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem faz parte da polícia militar?"); // Pergunta 16
            String policiaMilitar = teclado.nextLine();
            if (policiaMilitar.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isPoliciaMilitar()){
                        backup.remove(personagem);
                    }
                }
            } else if (policiaMilitar.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isPoliciaMilitar()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();

        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem sangue da família real de Eldia?"); // Pergunta 17
            String sangueReal = teclado.nextLine();
            if (sangueReal.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isSangueReal()){
                        backup.remove(personagem);
                    }
                }
            } else if (sangueReal.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isSangueReal()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem domina o enrijecimento de titã?"); // pergunta 18
            String enrijecimento = teclado.nextLine();
            if (enrijecimento.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isEnrijecimento()){
                        backup.remove(personagem);
                    }
                }
            } else if (enrijecimento.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isEnrijecimento()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem cabelos loiros?"); // Pergunta 19
            String cabeloLoiro = teclado.nextLine();
            if (cabeloLoiro.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isCabeloLoiro()){
                        backup.remove(personagem);
                    }
                }
            } else if (cabeloLoiro.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isCabeloLoiro()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem deseja vingança?"); // Pergunta 20
            String desejaVinganca = teclado.nextLine();
            if (desejaVinganca.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isDesejaVigança()){
                        backup.remove(personagem);
                    }
                }
            } else if (desejaVinganca.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isDesejaVigança()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem pode ver acontecimentos do futuro?"); // Pergunta 21
            String verFuturo = teclado.nextLine();
            if (verFuturo.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isVerFuturo()){
                        backup.remove(personagem);
                    }
                }
            } else if (verFuturo.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isVerFuturo()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem cabelos marrons?"); // Pergunta 22
            String cabeloMarrom = teclado.nextLine();
            if (cabeloMarrom.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isCabeloMarrom()){
                        backup.remove(personagem);
                    }
                }
            } else if (cabeloMarrom.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isCabeloMarrom()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem usa óculos?"); // Pergunta 23
            String usaOculos = teclado.nextLine();
            if (usaOculos.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isUsaOculos()){
                        backup.remove(personagem);
                    }
                }
            } else if (usaOculos.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isUsaOculos()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é ou foi comandante da Tropa de Exploração?"); // Pergunta 24
            String comandanteTropaExploracao = teclado.nextLine();
            if (comandanteTropaExploracao.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isComandanteTropaExploracao()){
                        backup.remove(personagem);
                    }
                }
            } else if (comandanteTropaExploracao.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isComandanteTropaExploracao()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é um candidato a guerreiro?"); // Pergunta 25
            String candidatoGuerreiro = teclado.nextLine();
            if (candidatoGuerreiro.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isCandidatoGuerreiro()){
                        backup.remove(personagem);
                    }
                }
            } else if (candidatoGuerreiro.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isCandidatoGuerreiro()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem se infiltrou em uma cidade?"); // Pergunta 26
            String infiltrado = teclado.nextLine();
            if (infiltrado.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isInfiltrado()){
                        backup.remove(personagem);
                    }
                }
            } else if (infiltrado.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isInfiltrado()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem faz parte da guarnição?"); // Pergunta 27
            String guarnicao = teclado.nextLine();
            if (guarnicao.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isGuarnicao()){
                        backup.remove(personagem);
                    }
                }
            } else if (guarnicao.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isGuarnicao()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem irmão/irmã?"); // Pergunta 28
            String temIrmaos = teclado.nextLine();
            if (temIrmaos.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isTemIrmaos()){
                        backup.remove(personagem);
                    }
                }
            } else if (temIrmaos.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isTemIrmaos()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem cabelo?"); // Pergunta 29
            String temCabelo = teclado.nextLine();
            if (temCabelo.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isTemCabelo()){
                        backup.remove(personagem);
                    }
                }
            } else if (temCabelo.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isTemCabelo()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem poderes?"); // Pergunta 30
            String poderes = teclado.nextLine();
            if (poderes.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isTemPoderes()){
                        backup.remove(personagem);
                    }
                }
            } else if (poderes.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isTemPoderes()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu persoangem faz parte do esquadrão Levi?"); // Pergunta 31
            String esquadraoLevi = teclado.nextLine();
            if (esquadraoLevi.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isEsquadraoLevi()){
                        backup.remove(personagem);
                    }
                }
            } else if (esquadraoLevi.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isEsquadraoLevi()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem foi transformado em titã?"); // Pergunta 32
            String transformadoTita = teclado.nextLine();
            if (transformadoTita.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isTransformadoTita()){
                        backup.remove(personagem);
                    }
                }
            } else if (transformadoTita.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isTransformadoTita()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem pode manipular memórias?"); // Pergunta 33
            String manipularMemorias = teclado.nextLine();
            if (manipularMemorias.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isManipularMemorias()){
                        backup.remove(personagem);
                    }
                }
            } else if (manipularMemorias.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isManipularMemorias()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem consegue falar?"); // Pergunta 34
            String consegueFalar = teclado.nextLine();
            if (consegueFalar.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isConsegueFalar()){
                        backup.remove(personagem);
                    }
                }
            } else if (consegueFalar.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isConsegueFalar()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem usa uma arma?"); // Pergunta 35
            String usaArma = teclado.nextLine();
            if (usaArma.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isUsaArma()){
                        backup.remove(personagem);
                    }
                }
            } else if (usaArma.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isUsaArma()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem relação com algum animal?"); // Pergunta 36
            String relacaoAnimal = teclado.nextLine();
            if (relacaoAnimal.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isRelacaoAnimal()){
                        backup.remove(personagem);
                    }
                }
            } else if (relacaoAnimal.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isRelacaoAnimal()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem foi manipulado?"); // Pergunta 37
            String manipulado = teclado.nextLine();
            if (manipulado.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isManipulado()){
                        backup.remove(personagem);
                    }
                }
            } else if (manipulado.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isManipulado()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem tem cabelos longos?"); // Pergunta 38
            String cabelosLongos = teclado.nextLine();
            if (cabelosLongos.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isCabelosLongos()){
                        backup.remove(personagem);
                    }
                }
            } else if (cabelosLongos.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isCabelosLongos()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é quadrúpede?"); // Pergunta 39
            String quadrupede = teclado.nextLine();
            if (quadrupede.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isQuadrupede()){
                        backup.remove(personagem);
                    }
                }
            } else if (quadrupede.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isQuadrupede()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem pertence a uma linhagem importante na história?"); // Pergunta 40
            String linhagemImportante = teclado.nextLine();
            if (linhagemImportante.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isLinhagemImportante()){
                        backup.remove(personagem);
                    }
                }
            } else if (linhagemImportante.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isLinhagemImportante()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem sofre preconceito?"); // Pergunta 41
            String sofrePreconceito = teclado.nextLine();
            if (sofrePreconceito.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isSofrePreconceito()){
                        backup.remove(personagem);
                    }
                }
            } else if (sofrePreconceito.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isSofrePreconceito()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é Marleyano?"); // Pergunta 42
            String marleyano = teclado.nextLine();
            if (marleyano.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isMarleyano()){
                        backup.remove(personagem);
                    }
                }
            } else if (marleyano.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isMarleyano()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem foi traído?"); // Pergunta 43
            String foiTraido = teclado.nextLine();
            if (foiTraido.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isFoiTraido()){
                        backup.remove(personagem);
                    }
                }
            } else if (foiTraido.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isFoiTraido()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem usa uma espada?"); // Pergunta 44
            String usaEspada = teclado.nextLine();
            if (usaEspada.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isUsaEspada()){
                        backup.remove(personagem);
                    }
                }
            } else if (usaEspada.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isUsaEspada()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é restringido por uma promessa?"); // Pergunta 45
            String restringido = teclado.nextLine();
            if (restringido.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isRestringido()){
                        backup.remove(personagem);
                    }
                }
            } else if (restringido.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isRestringido()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é leal?"); // Pergunta 46
            String leal = teclado.nextLine();
            if (leal.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isLeal()){
                        backup.remove(personagem);
                    }
                }
            } else if (leal.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isLeal()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();

        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é maior que o Titã colossal?"); // Pergunta 47
            String maiorColossal = teclado.nextLine();
            if (maiorColossal.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isMaiorColossal()){
                        backup.remove(personagem);
                    }
                }
            } else if (maiorColossal.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isMaiorColossal()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é bom com artes marciais?"); // Pergunta 48
            String artesMarciais = teclado.nextLine();
            if (artesMarciais.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isArtesMarciais()){
                        backup.remove(personagem);
                    }
                }
            } else if (artesMarciais.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isArtesMarciais()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.size()>1){
            System.out.println("Seu personagem é veloz?"); // Pergunta 49
            String veloz = teclado.nextLine();
            if (veloz.equals("s")){
                for(AttackOnTitan personagem: personagens){
                    if(!personagem.isVeloz()){
                        backup.remove(personagem);
                    }
                }
            } else if (veloz.equals("n")) {
                for(AttackOnTitan personagem: personagens){
                    if(personagem.isVeloz()){
                        backup.remove(personagem);
                    }
                }
            }

            personagens = (ArrayList<AttackOnTitan>) backup.clone();
        }

        if (personagens.isEmpty()){
            System.out.println("Não sei");
        }

        System.out.println(personagens.getFirst().getNome());

    }
}