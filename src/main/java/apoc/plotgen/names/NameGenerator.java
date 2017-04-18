package apoc.plotgen.names;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ResourceIterator;
import org.neo4j.procedure.Description;
import org.neo4j.procedure.Name;
import org.neo4j.procedure.UserFunction;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Daniel on 18/04/2017.
 */
public class NameGenerator {


    @UserFunction(name = "apoc.plotgen.names.humanSurname")
    @Description("apoc.plotgen.names.humanSurmane()")
    public String humanSurname() {
        String ret;
        int randNumber;

        Random random = new Random();
        int min = 1;
        int max = 100;
        randNumber = random.nextInt(max - min + 1) + min;
        switch (randNumber) {
            case 1  :
                ret = "Adelhof";
                break;
            case 2  :
                ret = "Albrecht";
                break;
            case 3  :
                ret = "Allenstag";
                break;
            case 4  :
                ret = "Altmann";
                break;
            case 5  :
                ret = "Atzwig";
                break;
            case 6  :
                ret = "Bacher";
                break;
            case 7  :
                ret = "Baer";
                break;
            case 8  :
                ret = "Baumann";
                break;
            case 9  :
                ret = "Becker";
                break;
            case 10 :
                ret = "Behn";
                break;
            case 11 :
                ret = "Betz";
                break;
            case 12 :
                ret = "Beyer";
                break;
            case 13 :
                ret = "Bischof";
                break;
            case 14 :
                ret = "Boehm";
                break;
            case 15 :
                ret = "Breitenbach";
                break;
            case 16 :
                ret = "Breuer";
                break;
            case 17 :
                ret = "Dahmbach";
                break;
            case 18 :
                ret = "Delfholt";
                break;
            case 19 :
                ret = "Drakenhof";
                break;
            case 20 :
                ret = "Drauwulf";
                break;
            case 21 :
                ret = "Durrbein";
                break;
            case 22 :
                ret = "Ehrhard";
                break;
            case 23 :
                ret = "Eisenhauer";
                break;
            case 24 :
                ret = "Eschlimann";
                break;
            case 25 :
                ret = "Falkznheim";
                break;
            case 26 :
                ret = "Fehr";
                break;
            case 27 :
                ret = "Fiegler";
                break;
            case 28 :
                ret = "Fleischer";
                break;
            case 29 :
                ret = "Frohlich";
                break;
            case 30 :
                ret = "Frueh";
                break;
            case 31 :
                ret = "Fuchs";
                break;
            case 32 :
                ret = "Gaffwig";
                break;
            case 33 :
                ret = "Gaertner";
                break;
            case 34 :
                ret = "Gebauer";
                break;
            case 35 :
                ret = "Godlgraf";
                break;
            case 36 :
                ret = "Grunenwald";
                break;
            case 37 :
                ret = "Guth";
                break;
            case 38 :
                ret = "Haintz";
                break;
            case 39 :
                ret = "Herz";
                break;
            case 40 :
                ret = "Herzog";
                break;
            case 41 :
                ret = "Hirtzel";
                break;
            case 42 :
                ret = "Hoch";
                break;
            case 43 :
                ret = "Hoefer";
                break;
            case 44 :
                ret = "Hofstetter";
                break;
            case 45 :
                ret = "Jaeger";
                break;
            case 46 :
                ret = "Jochutz";
                break;
            case 47 :
                ret = "Jutzenbach";
                break;
            case 48 :
                ret = "Kalb";
                break;
            case 49 :
                ret = "Kaltenbach";
                break;
            case 50 :
                ret = "Kraemer";
                break;
            case 51 :
                ret = "Krebs";
                break;
            case 52 :
                ret = "Kuhn";
                break;
            case 53 :
                ret = "Kummel";
                break;
            case 54 :
                ret = "Konig";
                break;
            case 55 :
                ret = "Konlgsamen";
                break;
            case 56 :
                ret = "Iang";
                break;
            case 57 :
                ret = "Iankdorf";
                break;
            case 58 :
                ret = "Liess";
                break;
            case 59 :
                ret = "Lebengut";
                break;
            case 60 :
                ret = "Lutzen";
                break;
            case 61 :
                ret = "Machholt";
                break;
            case 62 :
                ret = "Meusmann";
                break;
            case 63 :
                ret = "Meyer";
                break;
            case 64 :
                ret = "Mohr";
                break;
            case 65 :
                ret = "Muller";
                break;
            case 66 :
                ret = "Nachtmann";
                break;
            case 67 :
                ret = "Naubhof";
                break;
            case 68 :
                ret = "Netzhoch";
                break;
            case 69 :
                ret = "Neumann";
                break;
            case 70 :
                ret = "Niederlitz";
                break;
            case 71 :
                ret = "Nuhr";
                break;
            case 72 :
                ret = "Oberholtzer";
                break;
            case 73 :
                ret = "Ohrsten";
                break;
            case 74 :
                ret = "Otzlowe";
                break;
            case 75 :
                ret = "Reichert";
                break;
            case 76 :
                ret = "Reifneider";
                break;
            case 77 :
                ret = "Riese";
                break;
            case 78 :
                ret = "Rohrig";
                break;
            case 79 :
                ret = "Reiss";
                break;
            case 80 :
                ret = "Schaffer";
                break;
            case 81 :
                ret = "Schaumer";
                break;
            case 82 :
                ret = "Scherer";
                break;
            case 83 :
                ret = "Schultz";
                break;
            case 84 :
                ret = "Schleirmacher";
                break;
            case 85 :
                ret = "Schreiber";
                break;
            case 86 :
                ret = "Schwalb";
                break;
            case 87 :
                ret = "Steiner";
                break;
            case 88 :
                ret = "Tabbeck";
                break;
            case 89 :
                ret = "Teuber";
                break;
            case 90 :
                ret = "Tolzen";
                break;
            case 91 :
                ret = "Trachsel";
                break;
            case 92 :
                ret = "Weber";
                break;
            case 93 :
                ret = "Wechsler";
                break;
            case 94 :
                ret = "Wirtz";
                break;
            case 95 :
                ret = "Widmann";
                break;
            case 96 :
                ret = "Widmer";
                break;
            case 97 :
                ret = "Veit";
                break;
            case 98 :
                ret = "Vogt";
                break;
            case 99 :
                ret = "Vogel";
                break;
            case 100:
                ret = "Zumwald";
                break;
            default:
                ret ="Not Set";
                break;
        }
        return ret;
    }

    @UserFunction(name = "apoc.plotgen.names.humanMale")
    @Description("apoc.plotgen.names.humanMale()")
    public String humanMale() {
        String ret;
        int randNumber;

        Random random = new Random();
        int min = 1;
        int max = 1128;
        randNumber = random.nextInt(max - min + 1) + min;
        switch (randNumber) {
            case 1    :
                ret = "Abelhard";
                break;
            case 2    :
                ret = "Abelhardt";
                break;
            case 3    :
                ret = "Abelheim";
                break;
            case 4    :
                ret = "Adam";
                break;
            case 5    :
                ret = "Adel";
                break;
            case 6    :
                ret = "Adelbert";
                break;
            case 7    :
                ret = "Adelhard";
                break;
            case 8    :
                ret = "Adelmann";
                break;
            case 9    :
                ret = "Admund";
                break;
            case 10   :
                ret = "Adolf";
                break;
            case 11   :
                ret = "Adolph";
                break;
            case 12   :
                ret = "Adolphus";
                break;
            case 13   :
                ret = "Adred";
                break;
            case 14   :
                ret = "Adric";
                break;
            case 15   :
                ret = "Agilward";
                break;
            case 16   :
                ret = "Agis";
                break;
            case 17   :
                ret = "Alric";
                break;
            case 18   :
                ret = "Aldric";
                break;
            case 19   :
                ret = "Alard";
                break;
            case 20   :
                ret = "Alaric";
                break;
            case 21   :
                ret = "Alberic";
                break;
            case 22   :
                ret = "Alberich";
                break;
            case 23   :
                ret = "Albert";
                break;
            case 24   :
                ret = "Albrecht";
                break;
            case 25   :
                ret = "Aldebrand";
                break;
            case 26   :
                ret = "Aldebrandt";
                break;
            case 27   :
                ret = "Aldfreid";
                break;
            case 28   :
                ret = "Aldheim";
                break;
            case 29   :
                ret = "Aldred";
                break;
            case 30   :
                ret = "Alex";
                break;
            case 31   :
                ret = "Alexander";
                break;
            case 32   :
                ret = "Alexei";
                break;
            case 33   :
                ret = "Alexis";
                break;
            case 34   :
                ret = "Alfred";
                break;
            case 35   :
                ret = "Alfried";
                break;
            case 36   :
                ret = "Alfricht";
                break;
            case 37   :
                ret = "Aloysis";
                break;
            case 38   :
                ret = "Altmar";
                break;
            case 39   :
                ret = "Anderlin";
                break;
            case 40   :
                ret = "Anders";
                break;
            case 41   :
                ret = "Andirke";
                break;
            case 42   :
                ret = "Andre";
                break;
            case 43   :
                ret = "Andred";
                break;
            case 44   :
                ret = "Andreas";
                break;
            case 45   :
                ret = "Andric";
                break;
            case 46   :
                ret = "Andris";
                break;
            case 47   :
                ret = "Anselm";
                break;
            case 48   :
                ret = "Anshelm";
                break;
            case 49   :
                ret = "Anton";
                break;
            case 50   :
                ret = "Anthon";
                break;
            case 51   :
                ret = "Antony";
                break;
            case 52   :
                ret = "Anthony";
                break;
            case 53   :
                ret = "Aponymous";
                break;
            case 54   :
                ret = "Arne";
                break;
            case 55   :
                ret = "Arnest";
                break;
            case 56   :
                ret = "Arnold";
                break;
            case 57   :
                ret = "Arnulf";
                break;
            case 58   :
                ret = "Artur";
                break;
            case 59   :
                ret = "Arthur";
                break;
            case 60   :
                ret = "Asman";
                break;
            case 61   :
                ret = "Asoborn";
                break;
            case 62   :
                ret = "Assmus";
                break;
            case 63   :
                ret = "Athren";
                break;
            case 64   :
                ret = "August";
                break;
            case 65   :
                ret = "Augustus";
                break;
            case 66   :
                ret = "Austein";
                break;
            case 67   :
                ret = "Axel";
                break;
            case 68   :
                ret = "Axelbrand";
                break;
            case 69   :
                ret = "Baldwin";
                break;
            case 70   :
                ret = "Baldewin";
                break;
            case 71   :
                ret = "Baldekin";
                break;
            case 72   :
                ret = "Baldred";
                break;
            case 73   :
                ret = "Baldric";
                break;
            case 74   :
                ret = "Balthasar";
                break;
            case 75   :
                ret = "Baltzer";
                break;
            case 76   :
                ret = "Barnabas";
                break;
            case 77   :
                ret = "Bartel";
                break;
            case 78   :
                ret = "Barthel";
                break;
            case 79   :
                ret = "Bartelm";
                break;
            case 80   :
                ret = "Barthelm";
                break;
            case 81   :
                ret = "Bart";
                break;
            case 82   :
                ret = "Bartil";
                break;
            case 83   :
                ret = "Barthelm";
                break;
            case 84   :
                ret = "Bartisch";
                break;
            case 85   :
                ret = "Bartke";
                break;
            case 86   :
                ret = "Bartolf";
                break;
            case 87   :
                ret = "Bartomar";
                break;
            case 88   :
                ret = "Bartschval";
                break;
            case 89   :
                ret = "Bartusch";
                break;
            case 90   :
                ret = "Bastian";
                break;
            case 91   :
                ret = "Bechtold";
                break;
            case 92   :
                ret = "Bela";
                break;
            case 93   :
                ret = "Bella";
                break;
            case 94   :
                ret = "Benedic";
                break;
            case 95   :
                ret = "Benedict";
                break;
            case 96   :
                ret = "Bengt";
                break;
            case 97   :
                ret = "Benisch";
                break;
            case 98   :
                ret = "Benusch";
                break;
            case 99   :
                ret = "Berhtold";
                break;
            case 100  :
                ret = "Berchtold";
                break;
            case 101  :
                ret = "Berhtoldt";
                break;
            case 102  :
                ret = "Berchtoldt";
                break;
            case 103  :
                ret = "Bernt";
                break;
            case 104  :
                ret = "Bernolt";
                break;
            case 105  :
                ret = "Bernhard";
                break;
            case 106  :
                ret = "Bernhardt";
                break;
            case 107  :
                ret = "Bero";
                break;
            case 108  :
                ret = "Berold";
                break;
            case 109  :
                ret = "Bertram";
                break;
            case 110  :
                ret = "Berteram";
                break;
            case 111  :
                ret = "Bertold";
                break;
            case 112  :
                ret = "Berthold";
                break;
            case 113  :
                ret = "Bertoldt";
                break;
            case 114  :
                ret = "Bertholdt";
                break;
            case 115  :
                ret = "Berthuld";
                break;
            case 116  :
                ret = "Bertolf";
                break;
            case 117  :
                ret = "Berwic";
                break;
            case 118  :
                ret = "Blasius";
                break;
            case 119  :
                ret = "Bogusch";
                break;
            case 120  :
                ret = "Borchard";
                break;
            case 121  :
                ret = "Borchardt";
                break;
            case 122  :
                ret = "Boris";
                break;
            case 123  :
                ret = "Brigund";
                break;
            case 124  :
                ret = "Brocuff";
                break;
            case 125  :
                ret = "Bruno";
                break;
            case 126  :
                ret = "Burchard";
                break;
            case 127  :
                ret = "Burchardt";
                break;
            case 128  :
                ret = "Burghard";
                break;
            case 129  :
                ret = "Burghardt";
                break;
            case 130  :
                ret = "Burgman";
                break;
            case 131  :
                ret = "Burgmann";
                break;
            case 132  :
                ret = "Burgold";
                break;
            case 133  :
                ret = "Burgolf";
                break;
            case 134  :
                ret = "Burgolt";
                break;
            case 135  :
                ret = "Burkhard";
                break;
            case 136  :
                ret = "Burkhardt";
                break;
            case 137  :
                ret = "Calvin";
                break;
            case 138  :
                ret = "Carl";
                break;
            case 139  :
                ret = "Carol";
                break;
            case 140  :
                ret = "Carolus";
                break;
            case 141  :
                ret = "Carolus";
                break;
            case 142  :
                ret = "Casimir";
                break;
            case 143  :
                ret = "Caspar";
                break;
            case 144  :
                ret = "Cedred";
                break;
            case 145  :
                ret = "Cheruse";
                break;
            case 146  :
                ret = "Claud";
                break;
            case 147  :
                ret = "Claude";
                break;
            case 148  :
                ret = "Claus";
                break;
            case 149  :
                ret = "Conrad";
                break;
            case 150  :
                ret = "Constantin";
                break;
            case 151  :
                ret = "Corvin";
                break;
            case 152  :
                ret = "Dagmar";
                break;
            case 153  :
                ret = "Dankmar";
                break;
            case 154  :
                ret = "Dankred";
                break;
            case 155  :
                ret = "Dekmar";
                break;
            case 156  :
                ret = "Detlef";
                break;
            case 157  :
                ret = "Dider";
                break;
            case 158  :
                ret = "Diel";
                break;
            case 159  :
                ret = "Diehl";
                break;
            case 160  :
                ret = "Diebold";
                break;
            case 161  :
                ret = "Diefrid";
                break;
            case 162  :
                ret = "Diefried";
                break;
            case 163  :
                ret = "Dieter";
                break;
            case 164  :
                ret = "Dieterich";
                break;
            case 165  :
                ret = "Dietl";
                break;
            case 166  :
                ret = "Dietmar";
                break;
            case 167  :
                ret = "Dietmund";
                break;
            case 168  :
                ret = "Dietrich";
                break;
            case 169  :
                ret = "Dippelt";
                break;
            case 170  :
                ret = "Dirk";
                break;
            case 171  :
                ret = "Dirske";
                break;
            case 172  :
                ret = "Diterich";
                break;
            case 173  :
                ret = "Ditherich";
                break;
            case 174  :
                ret = "Ditl";
                break;
            case 175  :
                ret = "Ditmar";
                break;
            case 176  :
                ret = "Ditmarus";
                break;
            case 177  :
                ret = "Ditrich";
                break;
            case 178  :
                ret = "Ditwin";
                break;
            case 179  :
                ret = "Dominic";
                break;
            case 180  :
                ret = "Dominicus";
                break;
            case 181  :
                ret = "Dompnig";
                break;
            case 182  :
                ret = "Donat";
                break;
            case 183  :
                ret = "Donatus";
                break;
            case 184  :
                ret = "Durnhelm";
                break;
            case 185  :
                ret = "Erwin";
                break;
            case 186  :
                ret = "Everwin";
                break;
            case 187  :
                ret = "Eber";
                break;
            case 188  :
                ret = "Eberhart";
                break;
            case 189  :
                ret = "Eberhardus";
                break;
            case 190  :
                ret = "Eberhardtus";
                break;
            case 191  :
                ret = "Eberlin";
                break;
            case 192  :
                ret = "Eberlinus";
                break;
            case 193  :
                ret = "Eckhart";
                break;
            case 194  :
                ret = "Eckehart";
                break;
            case 195  :
                ret = "Eckhard";
                break;
            case 196  :
                ret = "Eckehard";
                break;
            case 197  :
                ret = "Eckhardt";
                break;
            case 198  :
                ret = "Eckehardt";
                break;
            case 199  :
                ret = "Eckel";
                break;
            case 200  :
                ret = "Edgar";
                break;
            case 201  :
                ret = "Edmund";
                break;
            case 202  :
                ret = "Edwin";
                break;
            case 203  :
                ret = "Egidius";
                break;
            case 204  :
                ret = "Ehrhard";
                break;
            case 205  :
                ret = "Ehrhardt";
                break;
            case 206  :
                ret = "Ehrl";
                break;
            case 207  :
                ret = "Ehrman";
                break;
            case 208  :
                ret = "Ehrmann";
                break;
            case 209  :
                ret = "Ehrwig";
                break;
            case 210  :
                ret = "Elbel";
                break;
            case 211  :
                ret = "Eldred";
                break;
            case 212  :
                ret = "Elgast";
                break;
            case 213  :
                ret = "Elger";
                break;
            case 214  :
                ret = "Elmeric";
                break;
            case 215  :
                ret = "Emil";
                break;
            case 216  :
                ret = "Emmerich";
                break;
            case 217  :
                ret = "Endal";
                break;
            case 218  :
                ret = "Enderl";
                break;
            case 219  :
                ret = "Enderlin";
                break;
            case 220  :
                ret = "Enewalt";
                break;
            case 221  :
                ret = "Engel";
                break;
            case 222  :
                ret = "Engelbert";
                break;
            case 223  :
                ret = "Engelbrecht";
                break;
            case 224  :
                ret = "Engelgerus";
                break;
            case 225  :
                ret = "Engelusch";
                break;
            case 226  :
                ret = "Eodred";
                break;
            case 227  :
                ret = "Eomund";
                break;
            case 228  :
                ret = "Erasmus";
                break;
            case 229  :
                ret = "Erdman";
                break;
            case 230  :
                ret = "Erdred";
                break;
            case 231  :
                ret = "Erich";
                break;
            case 232  :
                ret = "Erkenbrand";
                break;
            case 233  :
                ret = "Erlemann";
                break;
            case 234  :
                ret = "Erlemannus";
                break;
            case 235  :
                ret = "Erman";
                break;
            case 236  :
                ret = "Ermanrich";
                break;
            case 237  :
                ret = "Ermelaus";
                break;
            case 238  :
                ret = "Ermen";
                break;
            case 239  :
                ret = "Ermenrich";
                break;
            case 240  :
                ret = "Ernst";
                break;
            case 241  :
                ret = "Ernest";
                break;
            case 242  :
                ret = "Ernstus";
                break;
            case 243  :
                ret = "Ernestus";
                break;
            case 244  :
                ret = "Ernko";
                break;
            case 245  :
                ret = "Esmer";
                break;
            case 246  :
                ret = "Eugen";
                break;
            case 247  :
                ret = "Eustasius";
                break;
            case 248  :
                ret = "Ewald";
                break;
            case 249  :
                ret = "Fabian";
                break;
            case 250  :
                ret = "Fasolt";
                break;
            case 251  :
                ret = "Faustman";
                break;
            case 252  :
                ret = "Faustmann";
                break;
            case 253  :
                ret = "Faustus";
                break;
            case 254  :
                ret = "Felix";
                break;
            case 255  :
                ret = "Felkel";
                break;
            case 256  :
                ret = "Ferdnand";
                break;
            case 257  :
                ret = "Ferdinand";
                break;
            case 258  :
                ret = "Fickuld";
                break;
            case 259  :
                ret = "Fleugweiner";
                break;
            case 260  :
                ret = "Fosten";
                break;
            case 261  :
                ret = "Frederik";
                break;
            case 262  :
                ret = "Friederik";
                break;
            case 263  :
                ret = "Frediger";
                break;
            case 264  :
                ret = "Friediger";
                break;
            case 265  :
                ret = "Franz";
                break;
            case 266  :
                ret = "Fredman";
                break;
            case 267  :
                ret = "Fredeman";
                break;
            case 268  :
                ret = "Fredmann";
                break;
            case 269  :
                ret = "Fredemann";
                break;
            case 270  :
                ret = "Fredric";
                break;
            case 271  :
                ret = "Frederic";
                break;
            case 272  :
                ret = "Fredrich";
                break;
            case 273  :
                ret = "Frederich";
                break;
            case 274  :
                ret = "Fride";
                break;
            case 275  :
                ret = "Friede";
                break;
            case 276  :
                ret = "Fridebert";
                break;
            case 277  :
                ret = "Friedebert";
                break;
            case 278  :
                ret = "Friderich";
                break;
            case 279  :
                ret = "Friederich";
                break;
            case 280  :
                ret = "Fridl";
                break;
            case 281  :
                ret = "Fridel";
                break;
            case 282  :
                ret = "Fridlinus";
                break;
            case 283  :
                ret = "Fridelinus";
                break;
            case 284  :
                ret = "Fridebraht";
                break;
            case 285  :
                ret = "Frideric";
                break;
            case 286  :
                ret = "Fridericus";
                break;
            case 287  :
                ret = "Friebald";
                break;
            case 288  :
                ret = "Fritschold";
                break;
            case 289  :
                ret = "Fritz";
                break;
            case 290  :
                ret = "Fritzsche";
                break;
            case 291  :
                ret = "Gabriel";
                break;
            case 292  :
                ret = "Gawin";
                break;
            case 293  :
                ret = "Gawinus";
                break;
            case 294  :
                ret = "Gebhard";
                break;
            case 295  :
                ret = "Gebehard";
                break;
            case 296  :
                ret = "Gebhardt";
                break;
            case 297  :
                ret = "Gebehardt";
                break;
            case 298  :
                ret = "Gelfrat";
                break;
            case 299  :
                ret = "Gelfrid";
                break;
            case 300  :
                ret = "Georg";
                break;
            case 301  :
                ret = "George";
                break;
            case 302  :
                ret = "Georgius";
                break;
            case 303  :
                ret = "Gerber";
                break;
            case 304  :
                ret = "Gereke";
                break;
            case 305  :
                ret = "Gerhard";
                break;
            case 306  :
                ret = "Gerhardt";
                break;
            case 307  :
                ret = "Gerhart";
                break;
            case 308  :
                ret = "Gerlach";
                break;
            case 309  :
                ret = "Gerlacus";
                break;
            case 310  :
                ret = "Gernand";
                break;
            case 311  :
                ret = "Gernandt";
                break;
            case 312  :
                ret = "Gernar";
                break;
            case 313  :
                ret = "Gernot";
                break;
            case 314  :
                ret = "Gerold";
                break;
            case 315  :
                ret = "Gerunch";
                break;
            case 316  :
                ret = "Gerung";
                break;
            case 317  :
                ret = "Gilbrecht";
                break;
            case 318  :
                ret = "Girlach";
                break;
            case 319  :
                ret = "Girnot";
                break;
            case 320  :
                ret = "Gisbert";
                break;
            case 321  :
                ret = "Giselbert";
                break;
            case 322  :
                ret = "Gisbertus";
                break;
            case 323  :
                ret = "Giselbertus";
                break;
            case 324  :
                ret = "Gisel";
                break;
            case 325  :
                ret = "Giselher";
                break;
            case 326  :
                ret = "Giselbrecht";
                break;
            case 327  :
                ret = "Gislerus";
                break;
            case 328  :
                ret = "Gismar";
                break;
            case 329  :
                ret = "Glockrian";
                break;
            case 330  :
                ret = "Glogrian";
                break;
            case 331  :
                ret = "Gobel";
                break;
            case 332  :
                ret = "Godebert";
                break;
            case 333  :
                ret = "Godefridus";
                break;
            case 334  :
                ret = "Godeke";
                break;
            case 335  :
                ret = "Goffhilf";
                break;
            case 336  :
                ret = "Goran";
                break;
            case 337  :
                ret = "Gosbert";
                break;
            case 338  :
                ret = "Goswin";
                break;
            case 339  :
                ret = "Goswinus";
                break;
            case 340  :
                ret = "Gotfrid";
                break;
            case 341  :
                ret = "Gottfrid";
                break;
            case 342  :
                ret = "Gotfried";
                break;
            case 343  :
                ret = "Gottfried";
                break;
            case 344  :
                ret = "Gotfridus";
                break;
            case 345  :
                ret = "Gottfridus";
                break;
            case 346  :
                ret = "Gotfriedus";
                break;
            case 347  :
                ret = "Gottfriedus";
                break;
            case 348  :
                ret = "Gothard";
                break;
            case 349  :
                ret = "Gotthard";
                break;
            case 350  :
                ret = "Gothardus";
                break;
            case 351  :
                ret = "Gotthardus";
                break;
            case 352  :
                ret = "Gotboldus";
                break;
            case 353  :
                ret = "Gotboldtus";
                break;
            case 354  :
                ret = "Gotchalcus";
                break;
            case 355  :
                ret = "Gotschalg";
                break;
            case 356  :
                ret = "Gotsche";
                break;
            case 357  :
                ret = "Gottlieb";
                break;
            case 358  :
                ret = "Gottolf";
                break;
            case 359  :
                ret = "Gottzsche";
                break;
            case 360  :
                ret = "Gotwin";
                break;
            case 361  :
                ret = "Gozwin";
                break;
            case 362  :
                ret = "Gozwinus";
                break;
            case 363  :
                ret = "Greger";
                break;
            case 364  :
                ret = "Gregor";
                break;
            case 365  :
                ret = "Greimold";
                break;
            case 366  :
                ret = "Greimolt";
                break;
            case 367  :
                ret = "Grimel";
                break;
            case 368  :
                ret = "Grimmel";
                break;
            case 369  :
                ret = "Grimwold";
                break;
            case 370  :
                ret = "Griswold";
                break;
            case 371  :
                ret = "Groger";
                break;
            case 372  :
                ret = "Grolmes";
                break;
            case 373  :
                ret = "Guido";
                break;
            case 374  :
                ret = "Gumpert";
                break;
            case 375  :
                ret = "Gumprecht";
                break;
            case 376  :
                ret = "Gundel";
                break;
            case 377  :
                ret = "Gunderam";
                break;
            case 378  :
                ret = "Gundolf";
                break;
            case 379  :
                ret = "Gundram";
                break;
            case 380  :
                ret = "Gundred";
                break;
            case 381  :
                ret = "Gunnar";
                break;
            case 382  :
                ret = "Gunthar";
                break;
            case 383  :
                ret = "Gunther";
                break;
            case 384  :
                ret = "Guntram";
                break;
            case 385  :
                ret = "Gurge";
                break;
            case 386  :
                ret = "Gustaf";
                break;
            case 387  :
                ret = "Gustav";
                break;
            case 388  :
                ret = "Gustavus";
                break;
            case 389  :
                ret = "Gutsche";
                break;
            case 390  :
                ret = "Gutwin";
                break;
            case 391  :
                ret = "Hadred";
                break;
            case 392  :
                ret = "Hadwin";
                break;
            case 393  :
                ret = "Hagar";
                break;
            case 394  :
                ret = "Hagen";
                break;
            case 395  :
                ret = "Hainrich";
                break;
            case 396  :
                ret = "Hal";
                break;
            case 397  :
                ret = "Haldred";
                break;
            case 398  :
                ret = "Halman";
                break;
            case 399  :
                ret = "Halmut";
                break;
            case 400  :
                ret = "Halpern";
                break;
            case 401  :
                ret = "Halpert";
                break;
            case 402  :
                ret = "Hals";
                break;
            case 403  :
                ret = "Hamlin";
                break;
            case 404  :
                ret = "Han";
                break;
            case 405  :
                ret = "Hanco";
                break;
            case 406  :
                ret = "Hanes";
                break;
            case 407  :
                ret = "Hannes";
                break;
            case 408  :
                ret = "Hanke";
                break;
            case 409  :
                ret = "Hanman";
                break;
            case 410  :
                ret = "Hanmann";
                break;
            case 411  :
                ret = "Hannos";
                break;
            case 412  :
                ret = "Hannus";
                break;
            case 413  :
                ret = "Hantsch";
                break;
            case 414  :
                ret = "Hantsche";
                break;
            case 415  :
                ret = "Hanusch";
                break;
            case 416  :
                ret = "Harman";
                break;
            case 417  :
                ret = "Hartman";
                break;
            case 418  :
                ret = "Harmann";
                break;
            case 419  :
                ret = "Hartmann";
                break;
            case 420  :
                ret = "Harbrand";
                break;
            case 421  :
                ret = "Hardman";
                break;
            case 422  :
                ret = "Hardtman";
                break;
            case 423  :
                ret = "Hardmann";
                break;
            case 424  :
                ret = "Hardtmann";
                break;
            case 425  :
                ret = "Hardrat";
                break;
            case 426  :
                ret = "Hartlib";
                break;
            case 427  :
                ret = "Hartlip";
                break;
            case 428  :
                ret = "Hartmund";
                break;
            case 429  :
                ret = "Hartmundus";
                break;
            case 430  :
                ret = "Hartnid";
                break;
            case 431  :
                ret = "Hartrad";
                break;
            case 432  :
                ret = "Hartung";
                break;
            case 433  :
                ret = "Hartungus";
                break;
            case 434  :
                ret = "Hartusch";
                break;
            case 435  :
                ret = "Hartwicus";
                break;
            case 436  :
                ret = "Hartwig";
                break;
            case 437  :
                ret = "Haug";
                break;
            case 438  :
                ret = "Heienrich";
                break;
            case 439  :
                ret = "Heidenrich";
                break;
            case 440  :
                ret = "Heiman";
                break;
            case 441  :
                ret = "Heinman";
                break;
            case 442  :
                ret = "Heimann";
                break;
            case 443  :
                ret = "Heinmann";
                break;
            case 444  :
                ret = "Heidric";
                break;
            case 445  :
                ret = "Heimar";
                break;
            case 446  :
                ret = "Heinl";
                break;
            case 447  :
                ret = "Heinel";
                break;
            case 448  :
                ret = "Heinz";
                break;
            case 449  :
                ret = "Heintz";
                break;
            case 450  :
                ret = "Heinze";
                break;
            case 451  :
                ret = "Heintze";
                break;
            case 452  :
                ret = "Heintsch";
                break;
            case 453  :
                ret = "Heinutsch";
                break;
            case 454  :
                ret = "Heindl";
                break;
            case 455  :
                ret = "Heindel";
                break;
            case 456  :
                ret = "Heine";
                break;
            case 457  :
                ret = "Heineman";
                break;
            case 458  :
                ret = "Heinfried";
                break;
            case 459  :
                ret = "Heinich";
                break;
            case 460  :
                ret = "Heinke";
                break;
            case 461  :
                ret = "Heinric";
                break;
            case 462  :
                ret = "Heinricus";
                break;
            case 463  :
                ret = "Heinrich";
                break;
            case 464  :
                ret = "Heinusch";
                break;
            case 465  :
                ret = "Heironymous";
                break;
            case 466  :
                ret = "Helembertus";
                break;
            case 467  :
                ret = "Hellenboldus";
                break;
            case 468  :
                ret = "Hellenbrecht";
                break;
            case 469  :
                ret = "Helmut";
                break;
            case 470  :
                ret = "Helwig";
                break;
            case 471  :
                ret = "Hempe";
                break;
            case 472  :
                ret = "Hempel";
                break;
            case 473  :
                ret = "Henel";
                break;
            case 474  :
                ret = "Hennel";
                break;
            case 475  :
                ret = "Henil";
                break;
            case 476  :
                ret = "Henke";
                break;
            case 477  :
                ret = "Henlin";
                break;
            case 478  :
                ret = "Henne";
                break;
            case 479  :
                ret = "Henneke";
                break;
            case 480  :
                ret = "Henning";
                break;
            case 481  :
                ret = "Henric";
                break;
            case 482  :
                ret = "Henricus";
                break;
            case 483  :
                ret = "Henrich";
                break;
            case 484  :
                ret = "Henroth";
                break;
            case 485  :
                ret = "Henschel";
                break;
            case 486  :
                ret = "Hensel";
                break;
            case 487  :
                ret = "Hensil";
                break;
            case 488  :
                ret = "Hensl";
                break;
            case 489  :
                ret = "Henslo";
                break;
            case 490  :
                ret = "Hentschel";
                break;
            case 491  :
                ret = "Hentschil";
                break;
            case 492  :
                ret = "Herwig";
                break;
            case 493  :
                ret = "Hertwig";
                break;
            case 494  :
                ret = "Herbil";
                break;
            case 495  :
                ret = "Herbord";
                break;
            case 496  :
                ret = "Herbort";
                break;
            case 497  :
                ret = "Herdan";
                break;
            case 498  :
                ret = "Herden";
                break;
            case 499  :
                ret = "Herdein";
                break;
            case 500  :
                ret = "Herdenus";
                break;
            case 501  :
                ret = "Herdeinus";
                break;
            case 502  :
                ret = "Herdegen";
                break;
            case 503  :
                ret = "Hergard";
                break;
            case 504  :
                ret = "Herman";
                break;
            case 505  :
                ret = "Hermann";
                break;
            case 506  :
                ret = "Hermenchin";
                break;
            case 507  :
                ret = "Herpin";
                break;
            case 508  :
                ret = "Hertel";
                break;
            case 509  :
                ret = "Herterich";
                break;
            case 510  :
                ret = "Hertil";
                break;
            case 511  :
                ret = "Herwin";
                break;
            case 512  :
                ret = "Hieronymus";
                break;
            case 513  :
                ret = "Hieronymous";
                break;
            case 514  :
                ret = "Hilde";
                break;
            case 515  :
                ret = "Hildebart";
                break;
            case 516  :
                ret = "Hildebrandus";
                break;
            case 517  :
                ret = "Hildebrandtus";
                break;
            case 518  :
                ret = "Hildemar";
                break;
            case 519  :
                ret = "Hildenmund";
                break;
            case 520  :
                ret = "Hildiger";
                break;
            case 521  :
                ret = "Hildred";
                break;
            case 522  :
                ret = "Hildric";
                break;
            case 523  :
                ret = "Hinric";
                break;
            case 524  :
                ret = "Holger";
                break;
            case 525  :
                ret = "Horst";
                break;
            case 526  :
                ret = "Hug";
                break;
            case 527  :
                ret = "Huge";
                break;
            case 528  :
                ret = "Hugo";
                break;
            case 529  :
                ret = "Hultz";
                break;
            case 530  :
                ret = "Humfried";
                break;
            case 531  :
                ret = "Hunold";
                break;
            case 532  :
                ret = "Igor";
                break;
            case 533  :
                ret = "Ingwald";
                break;
            case 534  :
                ret = "Iwan";
                break;
            case 535  :
                ret = "Iwein";
                break;
            case 536  :
                ret = "Jacob";
                break;
            case 537  :
                ret = "Jacub";
                break;
            case 538  :
                ret = "Jakob";
                break;
            case 539  :
                ret = "Jakusch";
                break;
            case 540  :
                ret = "Jander";
                break;
            case 541  :
                ret = "Janderke";
                break;
            case 542  :
                ret = "Janke";
                break;
            case 543  :
                ret = "Janusch";
                break;
            case 544  :
                ret = "Jekel";
                break;
            case 545  :
                ret = "Jeckel";
                break;
            case 546  :
                ret = "Jekil";
                break;
            case 547  :
                ret = "Jekl";
                break;
            case 548  :
                ret = "Jekli";
                break;
            case 549  :
                ret = "Jenchin";
                break;
            case 550  :
                ret = "Jeronymus";
                break;
            case 551  :
                ret = "Jeschke";
                break;
            case 552  :
                ret = "Jesco";
                break;
            case 553  :
                ret = "Joachim";
                break;
            case 554  :
                ret = "Jocob";
                break;
            case 555  :
                ret = "Jocof";
                break;
            case 556  :
                ret = "Jocoff";
                break;
            case 557  :
                ret = "Jocop";
                break;
            case 558  :
                ret = "Jodocus";
                break;
            case 559  :
                ret = "Jodokus";
                break;
            case 560  :
                ret = "Joerg";
                break;
            case 561  :
                ret = "Johann";
                break;
            case 562  :
                ret = "Johannes";
                break;
            case 563  :
                ret = "Jokodus";
                break;
            case 564  :
                ret = "Jokoff";
                break;
            case 565  :
                ret = "Jonas";
                break;
            case 566  :
                ret = "Jone";
                break;
            case 567  :
                ret = "Jordan";
                break;
            case 568  :
                ret = "Jorg";
                break;
            case 569  :
                ret = "Jorgl";
                break;
            case 570  :
                ret = "Jorge";
                break;
            case 571  :
                ret = "Jorn";
                break;
            case 572  :
                ret = "Josef";
                break;
            case 573  :
                ret = "Jost";
                break;
            case 574  :
                ret = "Jurgn";
                break;
            case 575  :
                ret = "Jurgen";
                break;
            case 576  :
                ret = "Karl";
                break;
            case 577  :
                ret = "Karol";
                break;
            case 578  :
                ret = "Karolus";
                break;
            case 579  :
                ret = "Kasmir";
                break;
            case 580  :
                ret = "Kaspar";
                break;
            case 581  :
                ret = "Kastar";
                break;
            case 582  :
                ret = "Kastor";
                break;
            case 583  :
                ret = "Kirstan";
                break;
            case 584  :
                ret = "Kirsten";
                break;
            case 585  :
                ret = "Kitan";
                break;
            case 586  :
                ret = "Kite";
                break;
            case 587  :
                ret = "Klas";
                break;
            case 588  :
                ret = "Klaus";
                break;
            case 589  :
                ret = "Klaud";
                break;
            case 590  :
                ret = "Klaude";
                break;
            case 591  :
                ret = "Kleber";
                break;
            case 592  :
                ret = "Klemens";
                break;
            case 593  :
                ret = "Klemet";
                break;
            case 594  :
                ret = "Klose";
                break;
            case 595  :
                ret = "Klosel";
                break;
            case 596  :
                ret = "Knud";
                break;
            case 597  :
                ret = "Knut";
                break;
            case 598  :
                ret = "Konrad";
                break;
            case 599  :
                ret = "Konradin";
                break;
            case 600  :
                ret = "Konrat";
                break;
            case 601  :
                ret = "Kraft";
                break;
            case 602  :
                ret = "Kristof";
                break;
            case 603  :
                ret = "Krugar";
                break;
            case 604  :
                ret = "Kuneman";
                break;
            case 605  :
                ret = "Kunemann";
                break;
            case 606  :
                ret = "Kuno";
                break;
            case 607  :
                ret = "Kurt";
                break;
            case 608  :
                ret = "Kurdt";
                break;
            case 609  :
                ret = "Kurlass";
                break;
            case 610  :
                ret = "Lambert";
                break;
            case 611  :
                ret = "Lambertus";
                break;
            case 612  :
                ret = "Lampert";
                break;
            case 613  :
                ret = "Lampertus";
                break;
            case 614  :
                ret = "Lamprecht";
                break;
            case 615  :
                ret = "Lanfried";
                break;
            case 616  :
                ret = "Lanric";
                break;
            case 617  :
                ret = "Lanwin";
                break;
            case 618  :
                ret = "Lauryn";
                break;
            case 619  :
                ret = "Laureyn";
                break;
            case 620  :
                ret = "Laur";
                break;
            case 621  :
                ret = "Laurencius";
                break;
            case 622  :
                ret = "Lazarus";
                break;
            case 623  :
                ret = "Lenhard";
                break;
            case 624  :
                ret = "Lehenhard";
                break;
            case 625  :
                ret = "Lenhard";
                break;
            case 626  :
                ret = "Leonhard";
                break;
            case 627  :
                ret = "Leo";
                break;
            case 628  :
                ret = "Leonardus";
                break;
            case 629  :
                ret = "Leopold";
                break;
            case 630  :
                ret = "Leupold";
                break;
            case 631  :
                ret = "Leuter";
                break;
            case 632  :
                ret = "Leuthold";
                break;
            case 633  :
                ret = "Leutke";
                break;
            case 634  :
                ret = "Levin";
                break;
            case 635  :
                ret = "Lewpold";
                break;
            case 636  :
                ret = "Libincko";
                break;
            case 637  :
                ret = "Libing";
                break;
            case 638  :
                ret = "Libingus";
                break;
            case 639  :
                ret = "Libniko";
                break;
            case 640  :
                ret = "Liebert";
                break;
            case 641  :
                ret = "Liebink";
                break;
            case 642  :
                ret = "Liebrecht";
                break;
            case 643  :
                ret = "Liebwin";
                break;
            case 644  :
                ret = "Lienhart";
                break;
            case 645  :
                ret = "Linus";
                break;
            case 646  :
                ret = "Liphardus";
                break;
            case 647  :
                ret = "Liutpold";
                break;
            case 648  :
                ret = "Lodwig";
                break;
            case 649  :
                ret = "Lodewig";
                break;
            case 650  :
                ret = "Lorenz";
                break;
            case 651  :
                ret = "Lothar";
                break;
            case 652  :
                ret = "Lupold";
                break;
            case 653  :
                ret = "Luitpold";
                break;
            case 654  :
                ret = "Lupoldus";
                break;
            case 655  :
                ret = "Luitpoldus";
                break;
            case 656  :
                ret = "Lucas";
                break;
            case 657  :
                ret = "Lucius";
                break;
            case 658  :
                ret = "Ludevic";
                break;
            case 659  :
                ret = "Ludevicus";
                break;
            case 660  :
                ret = "Ludo";
                break;
            case 661  :
                ret = "Ludolf";
                break;
            case 662  :
                ret = "Ludovic";
                break;
            case 663  :
                ret = "Ludovicus";
                break;
            case 664  :
                ret = "Ludwig";
                break;
            case 665  :
                ret = "Lukas";
                break;
            case 666  :
                ret = "Luppolt";
                break;
            case 667  :
                ret = "Lupus";
                break;
            case 668  :
                ret = "Lutold";
                break;
            case 669  :
                ret = "Luthold";
                break;
            case 670  :
                ret = "Luther";
                break;
            case 671  :
                ret = "Lutherius";
                break;
            case 672  :
                ret = "Lutke";
                break;
            case 673  :
                ret = "Lutolf";
                break;
            case 674  :
                ret = "Madred";
                break;
            case 675  :
                ret = "Mandred";
                break;
            case 676  :
                ret = "Mach";
                break;
            case 677  :
                ret = "Magnus";
                break;
            case 678  :
                ret = "Manegold";
                break;
            case 679  :
                ret = "Manfred";
                break;
            case 680  :
                ret = "Marcus";
                break;
            case 681  :
                ret = "Marius";
                break;
            case 682  :
                ret = "Mark";
                break;
            case 683  :
                ret = "Markus";
                break;
            case 684  :
                ret = "Markward";
                break;
            case 685  :
                ret = "Markwardt";
                break;
            case 686  :
                ret = "Markwart";
                break;
            case 687  :
                ret = "Martin";
                break;
            case 688  :
                ret = "Marx";
                break;
            case 689  :
                ret = "Mathis";
                break;
            case 690  :
                ret = "Matthis";
                break;
            case 691  :
                ret = "Mathias";
                break;
            case 692  :
                ret = "Matthias";
                break;
            case 693  :
                ret = "Matern";
                break;
            case 694  :
                ret = "Maternus";
                break;
            case 695  :
                ret = "Mathwelin";
                break;
            case 696  :
                ret = "Mathewelin";
                break;
            case 697  :
                ret = "Mathes";
                break;
            case 698  :
                ret = "Matheus";
                break;
            case 699  :
                ret = "Matz";
                break;
            case 700  :
                ret = "Matzke";
                break;
            case 701  :
                ret = "Maxmillian";
                break;
            case 702  :
                ret = "Maximillian";
                break;
            case 703  :
                ret = "Mechtfrid";
                break;
            case 704  :
                ret = "Meffrid";
                break;
            case 705  :
                ret = "Meiner";
                break;
            case 706  :
                ret = "Meingot";
                break;
            case 707  :
                ret = "Meinhardus";
                break;
            case 708  :
                ret = "Meinhardtus";
                break;
            case 709  :
                ret = "Meinhart";
                break;
            case 710  :
                ret = "Meinolf";
                break;
            case 711  :
                ret = "Mekel";
                break;
            case 712  :
                ret = "Melched";
                break;
            case 713  :
                ret = "Melchior";
                break;
            case 714  :
                ret = "Mengot";
                break;
            case 715  :
                ret = "Menogoth";
                break;
            case 716  :
                ret = "Merbot";
                break;
            case 717  :
                ret = "Merboth";
                break;
            case 718  :
                ret = "Merke";
                break;
            case 719  :
                ret = "Merkel";
                break;
            case 720  :
                ret = "Meroge";
                break;
            case 721  :
                ret = "Merten";
                break;
            case 722  :
                ret = "Mertein";
                break;
            case 723  :
                ret = "Mertin";
                break;
            case 724  :
                ret = "Mertt";
                break;
            case 725  :
                ret = "Metrious";
                break;
            case 726  :
                ret = "Michael";
                break;
            case 727  :
                ret = "Michahel";
                break;
            case 728  :
                ret = "Mikusch";
                break;
            case 729  :
                ret = "Moritz";
                break;
            case 730  :
                ret = "Nanker";
                break;
            case 731  :
                ret = "Nat";
                break;
            case 732  :
                ret = "Nathandar";
                break;
            case 733  :
                ret = "Ned";
                break;
            case 734  :
                ret = "Neid";
                break;
            case 735  :
                ret = "Nedhart";
                break;
            case 736  :
                ret = "Neidhart";
                break;
            case 737  :
                ret = "Neithart";
                break;
            case 738  :
                ret = "Nenker";
                break;
            case 739  :
                ret = "Niclos";
                break;
            case 740  :
                ret = "Nicklos";
                break;
            case 741  :
                ret = "Nickel";
                break;
            case 742  :
                ret = "Nickil";
                break;
            case 743  :
                ret = "Nickl";
                break;
            case 744  :
                ret = "Nicklas";
                break;
            case 745  :
                ret = "Niclas";
                break;
            case 746  :
                ret = "Niclawes";
                break;
            case 747  :
                ret = "Nicodemus";
                break;
            case 748  :
                ret = "Nicolai";
                break;
            case 749  :
                ret = "Nicolaus";
                break;
            case 750  :
                ret = "Nikel";
                break;
            case 751  :
                ret = "Nikkel";
                break;
            case 752  :
                ret = "Niklas";
                break;
            case 753  :
                ret = "Nikolas";
                break;
            case 754  :
                ret = "Niklaus";
                break;
            case 755  :
                ret = "Nikolaus";
                break;
            case 756  :
                ret = "Niklos";
                break;
            case 757  :
                ret = "Nikusch";
                break;
            case 758  :
                ret = "Nimandus";
                break;
            case 759  :
                ret = "Nithart";
                break;
            case 760  :
                ret = "Nitsche";
                break;
            case 761  :
                ret = "Nitschke";
                break;
            case 762  :
                ret = "Odric";
                break;
            case 763  :
                ret = "Oldric";
                break;
            case 764  :
                ret = "Otwin";
                break;
            case 765  :
                ret = "Ortwin";
                break;
            case 766  :
                ret = "Odmar";
                break;
            case 767  :
                ret = "Odwin";
                break;
            case 768  :
                ret = "Olaf";
                break;
            case 769  :
                ret = "Olbrecht";
                break;
            case 770  :
                ret = "Oldred";
                break;
            case 771  :
                ret = "Orban";
                break;
            case 772  :
                ret = "Ortel";
                break;
            case 773  :
                ret = "Ortlib";
                break;
            case 774  :
                ret = "Ortlieb";
                break;
            case 775  :
                ret = "Ortlip";
                break;
            case 776  :
                ret = "Ortlouf";
                break;
            case 777  :
                ret = "Ortolf";
                break;
            case 778  :
                ret = "Ortolphus";
                break;
            case 779  :
                ret = "Oskar";
                break;
            case 780  :
                ret = "Osprant";
                break;
            case 781  :
                ret = "Osric";
                break;
            case 782  :
                ret = "Ostagoth";
                break;
            case 783  :
                ret = "Oswald";
                break;
            case 784  :
                ret = "Oswin";
                break;
            case 785  :
                ret = "Otfried";
                break;
            case 786  :
                ret = "Otmar";
                break;
            case 787  :
                ret = "Otnand";
                break;
            case 788  :
                ret = "Otte";
                break;
            case 789  :
                ret = "Ottel";
                break;
            case 790  :
                ret = "Otto";
                break;
            case 791  :
                ret = "Otwin";
                break;
            case 792  :
                ret = "Peter";
                break;
            case 793  :
                ret = "Pieter";
                break;
            case 794  :
                ret = "Petermann";
                break;
            case 795  :
                ret = "Pietermann";
                break;
            case 796  :
                ret = "Pancracius";
                break;
            case 797  :
                ret = "Pankratz";
                break;
            case 798  :
                ret = "Partschfall";
                break;
            case 799  :
                ret = "Parzival";
                break;
            case 800  :
                ret = "Paschalis";
                break;
            case 801  :
                ret = "Paschke";
                break;
            case 802  :
                ret = "Patrice";
                break;
            case 803  :
                ret = "Paul";
                break;
            case 804  :
                ret = "Pauel";
                break;
            case 805  :
                ret = "Paulus";
                break;
            case 806  :
                ret = "Pauelus";
                break;
            case 807  :
                ret = "Paulo";
                break;
            case 808  :
                ret = "Pauwel";
                break;
            case 809  :
                ret = "Pawel";
                break;
            case 810  :
                ret = "Pawil";
                break;
            case 811  :
                ret = "Pecolt";
                break;
            case 812  :
                ret = "Peregrin";
                break;
            case 813  :
                ret = "Peregrinus";
                break;
            case 814  :
                ret = "Peschel";
                break;
            case 815  :
                ret = "Peschke";
                break;
            case 816  :
                ret = "Pesold";
                break;
            case 817  :
                ret = "Pessl";
                break;
            case 818  :
                ret = "Pessol";
                break;
            case 819  :
                ret = "Pesslt";
                break;
            case 820  :
                ret = "Pessolt";
                break;
            case 821  :
                ret = "Petir";
                break;
            case 822  :
                ret = "Petran";
                break;
            case 823  :
                ret = "Petrus";
                break;
            case 824  :
                ret = "Petrusch";
                break;
            case 825  :
                ret = "Petschl";
                break;
            case 826  :
                ret = "Petschel";
                break;
            case 827  :
                ret = "Petschman";
                break;
            case 828  :
                ret = "Petschmann";
                break;
            case 829  :
                ret = "Philipus";
                break;
            case 830  :
                ret = "Philippus";
                break;
            case 831  :
                ret = "Philipps";
                break;
            case 832  :
                ret = "Piter";
                break;
            case 833  :
                ret = "Poppe";
                break;
            case 834  :
                ret = "Prokop";
                break;
            case 835  :
                ret = "Prospero";
                break;
            case 836  :
                ret = "Quintus";
                break;
            case 837  :
                ret = "Ragen";
                break;
            case 838  :
                ret = "Ralf";
                break;
            case 839  :
                ret = "Rambrecht";
                break;
            case 840  :
                ret = "Ramung";
                break;
            case 841  :
                ret = "Ramvoldus";
                break;
            case 842  :
                ret = "Ramwold";
                break;
            case 843  :
                ret = "Ranulf";
                break;
            case 844  :
                ret = "Randulf";
                break;
            case 845  :
                ret = "Randolph";
                break;
            case 846  :
                ret = "Ranfeld";
                break;
            case 847  :
                ret = "Raphael";
                break;
            case 848  :
                ret = "Ratbot";
                break;
            case 849  :
                ret = "Regimius";
                break;
            case 850  :
                ret = "Reichel";
                break;
            case 851  :
                ret = "Reikard";
                break;
            case 852  :
                ret = "Reikhard";
                break;
            case 853  :
                ret = "Reikardt";
                break;
            case 854  :
                ret = "Reikhardt";
                break;
            case 855  :
                ret = "Reikert";
                break;
            case 856  :
                ret = "Rein";
                break;
            case 857  :
                ret = "Reinald";
                break;
            case 858  :
                ret = "Reiner";
                break;
            case 859  :
                ret = "Reinfrid";
                break;
            case 860  :
                ret = "Reinfried";
                break;
            case 861  :
                ret = "Reinhard";
                break;
            case 862  :
                ret = "Reinhardt";
                break;
            case 863  :
                ret = "Reinhold";
                break;
            case 864  :
                ret = "Reinolt";
                break;
            case 865  :
                ret = "Reintsch";
                break;
            case 866  :
                ret = "Reinwald";
                break;
            case 867  :
                ret = "Reiprech";
                break;
            case 868  :
                ret = "Reiprecht";
                break;
            case 869  :
                ret = "Reuban";
                break;
            case 870  :
                ret = "Richart";
                break;
            case 871  :
                ret = "Richel";
                break;
            case 872  :
                ret = "Richolf";
                break;
            case 873  :
                ret = "Richter";
                break;
            case 874  :
                ret = "Rigo";
                break;
            case 875  :
                ret = "Rilker";
                break;
            case 876  :
                ret = "Ripertus";
                break;
            case 877  :
                ret = "Robb";
                break;
            case 878  :
                ret = "Robert";
                break;
            case 879  :
                ret = "Roderic";
                break;
            case 880  :
                ret = "Roland";
                break;
            case 881  :
                ret = "Rolf";
                break;
            case 882  :
                ret = "Ropot";
                break;
            case 883  :
                ret = "Roprecht";
                break;
            case 884  :
                ret = "Ruben";
                break;
            case 885  :
                ret = "Rudger";
                break;
            case 886  :
                ret = "Rudeger";
                break;
            case 887  :
                ret = "Rudel";
                break;
            case 888  :
                ret = "Rudeloff";
                break;
            case 889  :
                ret = "Rudi";
                break;
            case 890  :
                ret = "Rudiger";
                break;
            case 891  :
                ret = "Rudlinus";
                break;
            case 892  :
                ret = "Rudlo";
                break;
            case 893  :
                ret = "Rudolf";
                break;
            case 894  :
                ret = "Rudusch";
                break;
            case 895  :
                ret = "Rufus";
                break;
            case 896  :
                ret = "Ruland";
                break;
            case 897  :
                ret = "Rulant";
                break;
            case 898  :
                ret = "Rule";
                break;
            case 899  :
                ret = "Rumpolt";
                break;
            case 900  :
                ret = "Rupert";
                break;
            case 901  :
                ret = "Ruppel";
                break;
            case 902  :
                ret = "Ruprecht";
                break;
            case 903  :
                ret = "Rutger";
                break;
            case 904  :
                ret = "Rutiger";
                break;
            case 905  :
                ret = "Rutsch";
                break;
            case 906  :
                ret = "Rutschel";
                break;
            case 907  :
                ret = "Sidel";
                break;
            case 908  :
                ret = "Seidel";
                break;
            case 909  :
                ret = "Salomon";
                break;
            case 910  :
                ret = "Samuel";
                break;
            case 911  :
                ret = "Sander";
                break;
            case 912  :
                ret = "Schimko";
                break;
            case 913  :
                ret = "Sebastian";
                break;
            case 914  :
                ret = "Seel";
                break;
            case 915  :
                ret = "Segehart";
                break;
            case 916  :
                ret = "Segemund";
                break;
            case 917  :
                ret = "Seibke";
                break;
            case 918  :
                ret = "Seibot";
                break;
            case 919  :
                ret = "Seidel";
                break;
            case 920  :
                ret = "Seidelman";
                break;
            case 921  :
                ret = "Seiffrid";
                break;
            case 922  :
                ret = "Semund";
                break;
            case 923  :
                ret = "Sepp";
                break;
            case 924  :
                ret = "Setanta";
                break;
            case 925  :
                ret = "Sieger";
                break;
            case 926  :
                ret = "Siegfried";
                break;
            case 927  :
                ret = "Siegmund";
                break;
            case 928  :
                ret = "Sifrid";
                break;
            case 929  :
                ret = "Siffrid";
                break;
            case 930  :
                ret = "Sifridus";
                break;
            case 931  :
                ret = "Siffridus";
                break;
            case 932  :
                ret = "Sifrit";
                break;
            case 933  :
                ret = "Sigmund";
                break;
            case 934  :
                ret = "Sigismund";
                break;
            case 935  :
                ret = "Sigfrid";
                break;
            case 936  :
                ret = "Siggi";
                break;
            case 937  :
                ret = "Siggurd";
                break;
            case 938  :
                ret = "Sighard";
                break;
            case 939  :
                ret = "Sigibert";
                break;
            case 940  :
                ret = "Sigisbert";
                break;
            case 941  :
                ret = "Sigiberht";
                break;
            case 942  :
                ret = "Sigisberht";
                break;
            case 943  :
                ret = "Sigmar";
                break;
            case 944  :
                ret = "Sigric";
                break;
            case 945  :
                ret = "Siman";
                break;
            case 946  :
                ret = "Sorgrim";
                break;
            case 947  :
                ret = "Sothelin";
                break;
            case 948  :
                ret = "Stafke";
                break;
            case 949  :
                ret = "Stanislaus";
                break;
            case 950  :
                ret = "Stemar";
                break;
            case 951  :
                ret = "Stehmar";
                break;
            case 952  :
                ret = "Stemahr";
                break;
            case 953  :
                ret = "Stehmahr";
                break;
            case 954  :
                ret = "Stefan";
                break;
            case 955  :
                ret = "Steffan";
                break;
            case 956  :
                ret = "Steffen";
                break;
            case 957  :
                ret = "Stephan";
                break;
            case 958  :
                ret = "Stephke";
                break;
            case 959  :
                ret = "Swideger";
                break;
            case 960  :
                ret = "Sweideger";
                break;
            case 961  :
                ret = "Syman";
                break;
            case 962  :
                ret = "Symon";
                break;
            case 963  :
                ret = "Tankmar";
                break;
            case 964  :
                ret = "Thankmar";
                break;
            case 965  :
                ret = "Taleute";
                break;
            case 966  :
                ret = "Tancred";
                break;
            case 967  :
                ret = "Tankred";
                break;
            case 968  :
                ret = "Temil";
                break;
            case 969  :
                ret = "Teutoge";
                break;
            case 970  :
                ret = "Thadeus";
                break;
            case 971  :
                ret = "Thaddeus";
                break;
            case 972  :
                ret = "Thamme";
                break;
            case 973  :
                ret = "Theo";
                break;
            case 974  :
                ret = "Theoderic";
                break;
            case 975  :
                ret = "Theodosius";
                break;
            case 976  :
                ret = "Theodric";
                break;
            case 977  :
                ret = "Theodricus";
                break;
            case 978  :
                ret = "Theophilus";
                break;
            case 979  :
                ret = "Thiemo";
                break;
            case 980  :
                ret = "Thietmarus";
                break;
            case 981  :
                ret = "Thom";
                break;
            case 982  :
                ret = "Thomas";
                break;
            case 983  :
                ret = "Thomel";
                break;
            case 984  :
                ret = "Thomke";
                break;
            case 985  :
                ret = "Thorgad";
                break;
            case 986  :
                ret = "Thuring";
                break;
            case 987  :
                ret = "Thyrus";
                break;
            case 988  :
                ret = "Tile";
                break;
            case 989  :
                ret = "Tilke";
                break;
            case 990  :
                ret = "Tilman";
                break;
            case 991  :
                ret = "Tilmann";
                break;
            case 992  :
                ret = "Tilusch";
                break;
            case 993  :
                ret = "Timo";
                break;
            case 994  :
                ret = "Tobias";
                break;
            case 995  :
                ret = "Tomas";
                break;
            case 996  :
                ret = "Treuthwin";
                break;
            case 997  :
                ret = "Tristan";
                break;
            case 998  :
                ret = "Tristram";
                break;
            case 999  :
                ret = "Trubald";
                break;
            case 1000 :
                ret = "Trubert";
                break;
            case 1001 :
                ret = "Truchtlip";
                break;
            case 1002 :
                ret = "Trutwin";
                break;
            case 1003 :
                ret = "Tschepan";
                break;
            case 1004 :
                ret = "Tyle";
                break;
            case 1005 :
                ret = "Tylo";
                break;
            case 1006 :
                ret = "Udo";
                break;
            case 1007 :
                ret = "Udos";
                break;
            case 1008 :
                ret = "Ulein";
                break;
            case 1009 :
                ret = "Ulf";
                break;
            case 1010 :
                ret = "Ulfman";
                break;
            case 1011 :
                ret = "Ulfred";
                break;
            case 1012 :
                ret = "Ulher";
                break;
            case 1013 :
                ret = "Ulli";
                break;
            case 1014 :
                ret = "Ulman";
                break;
            case 1015 :
                ret = "Ulricus";
                break;
            case 1016 :
                ret = "Ulrichus";
                break;
            case 1017 :
                ret = "Ulusch";
                break;
            case 1018 :
                ret = "Unberoge";
                break;
            case 1019 :
                ret = "Urban";
                break;
            case 1020 :
                ret = "Uto";
                break;
            case 1021 :
                ret = "Valtin";
                break;
            case 1022 :
                ret = "Valentin";
                break;
            case 1023 :
                ret = "Valdred";
                break;
            case 1024 :
                ret = "Valdric";
                break;
            case 1025 :
                ret = "Valgeit";
                break;
            case 1026 :
                ret = "Valmir";
                break;
            case 1027 :
                ret = "Valten";
                break;
            case 1028 :
                ret = "Van";
                break;
            case 1029 :
                ret = "Varl";
                break;
            case 1030 :
                ret = "Veit";
                break;
            case 1031 :
                ret = "Verspasian";
                break;
            case 1032 :
                ret = "Viggo";
                break;
            case 1033 :
                ret = "Viktor";
                break;
            case 1034 :
                ret = "Vilmar";
                break;
            case 1035 :
                ret = "Vincencius";
                break;
            case 1036 :
                ret = "Vitus";
                break;
            case 1037 :
                ret = "Volmar";
                break;
            case 1038 :
                ret = "Volkmar";
                break;
            case 1039 :
                ret = "Volmarus";
                break;
            case 1040 :
                ret = "Volkmarus";
                break;
            case 1041 :
                ret = "Volans";
                break;
            case 1042 :
                ret = "Volkel";
                break;
            case 1043 :
                ret = "Volker";
                break;
            case 1044 :
                ret = "Volkhard";
                break;
            case 1045 :
                ret = "Volkin";
                break;
            case 1046 :
                ret = "Volkrad";
                break;
            case 1047 :
                ret = "Volkwin";
                break;
            case 1048 :
                ret = "Voltz";
                break;
            case 1049 :
                ret = "Vorster";
                break;
            case 1050 :
                ret = "Vridel";
                break;
            case 1051 :
                ret = "Vridil";
                break;
            case 1052 :
                ret = "Wabirske";
                break;
            case 1053 :
                ret = "Walbrecht";
                break;
            case 1054 :
                ret = "Waldemar";
                break;
            case 1055 :
                ret = "Waldemarr";
                break;
            case 1056 :
                ret = "Waldor";
                break;
            case 1057 :
                ret = "Waldred";
                break;
            case 1058 :
                ret = "Waliwan";
                break;
            case 1059 :
                ret = "Walter";
                break;
            case 1060 :
                ret = "Walther";
                break;
            case 1061 :
                ret = "Walterus";
                break;
            case 1062 :
                ret = "Waltherus";
                break;
            case 1063 :
                ret = "Warmund";
                break;
            case 1064 :
                ret = "Weigand";
                break;
            case 1065 :
                ret = "Weigandt";
                break;
            case 1066 :
                ret = "Weigel";
                break;
            case 1067 :
                ret = "Weiker";
                break;
            case 1068 :
                ret = "Wenzel";
                break;
            case 1069 :
                ret = "Werner";
                break;
            case 1070 :
                ret = "Wernher";
                break;
            case 1071 :
                ret = "Wernerus";
                break;
            case 1072 :
                ret = "Wernherus";
                break;
            case 1073 :
                ret = "Wernike";
                break;
            case 1074 :
                ret = "Wernusch";
                break;
            case 1075 :
                ret = "Wicher";
                break;
            case 1076 :
                ret = "Wichman";
                break;
            case 1077 :
                ret = "Wigan";
                break;
            case 1078 :
                ret = "Wigant";
                break;
            case 1079 :
                ret = "Wigand";
                break;
            case 1080 :
                ret = "Wigandus";
                break;
            case 1081 :
                ret = "Wigel";
                break;
            case 1082 :
                ret = "Wigher";
                break;
            case 1083 :
                ret = "Wiglas";
                break;
            case 1084 :
                ret = "Wiker";
                break;
            case 1085 :
                ret = "Wikert";
                break;
            case 1086 :
                ret = "Wikman";
                break;
            case 1087 :
                ret = "Wiland";
                break;
            case 1088 :
                ret = "Wilbert";
                break;
            case 1089 :
                ret = "Wilfried";
                break;
            case 1090 :
                ret = "Wilhelm";
                break;
            case 1091 :
                ret = "Wilher";
                break;
            case 1092 :
                ret = "Willehalm";
                break;
            case 1093 :
                ret = "Willi";
                break;
            case 1094 :
                ret = "Willusch";
                break;
            case 1095 :
                ret = "Wilrich";
                break;
            case 1096 :
                ret = "Wilreich";
                break;
            case 1097 :
                ret = "Wilricus";
                break;
            case 1098 :
                ret = "Winand";
                break;
            case 1099 :
                ret = "Winandus";
                break;
            case 1100 :
                ret = "Winlin";
                break;
            case 1101 :
                ret = "Winlind";
                break;
            case 1102 :
                ret = "Winrich";
                break;
            case 1103 :
                ret = "Winricus";
                break;
            case 1104 :
                ret = "Wiprecht";
                break;
            case 1105 :
                ret = "Witche";
                break;
            case 1106 :
                ret = "Wittich";
                break;
            case 1107 :
                ret = "Woldred";
                break;
            case 1108 :
                ret = "Wolf";
                break;
            case 1109 :
                ret = "Wolferam";
                break;
            case 1110 :
                ret = "Wolfel";
                break;
            case 1111 :
                ret = "Wolfgang";
                break;
            case 1112 :
                ret = "Wolfhard";
                break;
            case 1113 :
                ret = "Wolfhart";
                break;
            case 1114 :
                ret = "Wolfila";
                break;
            case 1115 :
                ret = "Wolfker";
                break;
            case 1116 :
                ret = "Wolfram";
                break;
            case 1117 :
                ret = "Wolmar";
                break;
            case 1118 :
                ret = "Wolveram";
                break;
            case 1119 :
                ret = "Wortwin";
                break;
            case 1120 :
                ret = "Wuder";
                break;
            case 1121 :
                ret = "Wulf";
                break;
            case 1122 :
                ret = "Xavier";
                break;
            case 1123 :
                ret = "Ytel";
                break;
            case 1124 :
                ret = "Zacharias";
                break;
            case 1125 :
                ret = "Zeidl";
                break;
            case 1126 :
                ret = "Zifrid";
                break;
            case 1127 :
                ret = "Zifridus";
                break;
            case 1128 :
                ret = "Zobeslaus";
                break;
            default:
                ret = "Not Set";
        }
        return ret;
    }
}
