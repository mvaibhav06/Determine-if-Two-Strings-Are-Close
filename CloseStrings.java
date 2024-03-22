import java.util.*;

public class CloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.equals(word2)) return true;
        HashMap<Character,Integer> inp1 = new HashMap<>();
        HashMap<Character,Integer> inp2 = new HashMap<>();

        for(int i=0; i<word1.length(); i++){
            char ch = word1.charAt(i);

            if(inp1.containsKey(ch)){
                inp1.put(ch, inp1.get(ch)+1);
            }else{
                inp1.put(ch,1);
            }
        }

        for(int i=0; i<word2.length(); i++){
            char ch = word2.charAt(i);

            if(inp2.containsKey(ch)){
                inp2.put(ch, inp2.get(ch)+1);
            }else{
                inp2.put(ch,1);
            }
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Set<Character> temp = new HashSet<>();

        for(Character ch: inp1.keySet()){
            list1.add(inp1.get(ch));
            temp.add(ch);
        }
        for(Character ch: inp2.keySet()){
            if(!temp.contains(ch)) return false;
            list2.add(inp2.get(ch));
        }

        if(list1.size() != list2.size()) return false;

        Collections.sort(list1);
        Collections.sort(list2);

        for(int i=0; i<list1.size(); i++){
            int i1 = list1.get(i);
            int i2 = list2.get(i);
            if(i1 != i2){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1 = "byiwbiibwhyyyibybmbyjiembbbybiyhjbfdmuiiyebbqhbijibbifybbybwmbbyddyyibdiupybbmiymfimvijwypiufywybhbhbjyyyymyyyifwbwuyiybbbbjyjwmduvibfzbmbfyfjpyywiiyuyjbbyhwywbwibbyybiybbwjbfjebymiffyifyijbfiyibibyfbymfkwfbjjhiqiipjmyembwbjijuiuydimwjyeidubdwmdjdijjidyidwbbuwfybmybwyhyfyydbbujzjjuwybibdhiuyfbyjhdbuybybbuyfdlubiimjibijywyiyypbiybbpwywbmvuwuiyiwfbiwdbjiiibiwdiiibiimyfwwbybmjwbfyibixdmuybbdbfyewbyifuubmybbyibibyjwbbibbbwufdbbydifybmbyibidiuybbiuiidjmyuddzvyybyuibjhbbysefjbjmiidbfidybfbyyiybdbubiyhbfdbbbbibwwbmdiwydjbeymmqbihubpjyiuuhibidjidjyhbuhdiybjbidbjdbmddiubiiufymjbuuiwbbubyeeijefuwbyejiybybypyyhbdpbfwhjjbdwbiyiwybbfbiwymwdbbbbiiibbwmdydiuwddhbywbehbyfbizybmyhyiedyibbbmuyjimbyivfejqywdjbybubibyjdmdwbdbmmbjubuiubbbwhbbyhbymhihmdbhubjybdyuibbifbbbhbibybfbjyyjbffiybuemiiwhdbyjebbjyihiwbbyuifiydiybbibubfbifybbyhiiuhbbbbzidbwubwbhbiyybbbyhybyiihijhubfybyzdijbmfuoijiybyyyiubwbbyyyyjjujiyjbjedjdjwwbbyiduyfybyyudbydwiijbbjwybjmiyyyjbubwbcbjyybbmdmwbbjibbwwymbdbmiybiibbhmybybeibifyjybybejdibbbfmbybwyqjdwyibybwmdjbbjhfiyfuubbbfpwybyhjbbyybequyuywyyybjbyyiybwhhbiyiwbfyuyiwyfbjyhibyiiybiwbbjejibdyibbyyudyewypwyyyedfbpbbwyuyjmueyibijyjmyfujydiiyiwibiwuwimbwdyzeyfbfbzwydbbyiwudwjwbybbbjyybyjbbyfyybbiubbmbbibdimyiyybjffybmebbbfbjbuimyjfdbyjiwyyidybijiimwijyyibijdyjbbmeyubmdiwubiwwjfbwybbwihiiwbfuipmbiyebbwhyjfifbuwvdyybdyymfyifjiewmyiydbudbbubbyyiyimbjmwbjhiwfybyhwbibhwfwijmjbmbbebbyibbjbijdhffbdadwddifwbhjdybibwuymyyjbybdywbuebwwiyeymwymyuybyjbwyhimiyimwbzijwwdbhbyffjuybwhfbiibfiwhubyijbhwyuybbemfhfdbtymiyybjjbbyfmhyiymjiibbbdywfjwbbjbyiijubywdffjwmhdwijybwbmidyuyuyibbibibbhuiuibbzbyiwyeijdiebbdbwfbjiyibyifiiyeybbfdbibzbzbbyyfbbjyqmibbmbbiifdbwbbyjibmbyydibdhbbbyyibibyybdmymubjbybwfbuiyburybwbibhbhdjuiiiyufewjbiyjyyybiubizbyhbhyyiyibibbbhyjfijbyjmyybiiiyjbybjbjdduiwywdbumymibyybbbjwuifbbiwddbdddbjbjbdeijjqijiyjydjbiybybyibwhwyefbbyfbdybbdbbyhbywyymdbiybiihiywyjfbwwbdfhqhyuuhiwybbbibmybuyiyweyiiybbibwbhwfybyywjmybmjyieuufnjenbyzuyfimeyiydibmidmybiyfuiuwybbijbjibfyubbefdjziyejibbibhibyyjjwfyjemyhbhwyyiydiyybydmwmbzyfqwbjibjimfyhiuufbyhbmiyfyyyifebfbbbhbifbyidbdbbbwyybebiuubymiyyiiybfyijdiibbpymdmmibyfwufyyjbbumyduyyfyjiiyydbbyyyyfyyiwubbybiidewewiwbbjbbyiibffbubmwdybmwijyigbybymidwfyydyyjifjuybjybibnifjbyibyweyibbmjirbybuvwwuhimywujiymyebjbbhdumeyuiyy";
        String s2 = "dikaziirmizqhrdkzikkiazirzviiiiaraikviiairimrdzihiziiizszizzizkiaimhaazdavmaaajlimrikzvhiiiikiizziikrijaiaimzaakizzmrakiziairzaraazraikraaidmihzjizsarzaizismirzsvaazkzsiiziivaaiikivsiiizmzaizrizzzzizikzmkiivijmiiiirvjiziisadrzizjssdiiijzrakqizizkvsazzzkaddmkivairuazsrqjrazzaijkrmzmdsivzddjziimikimmzsazhazjakzvzvzkriirzijmvavaiijurzafziavkrizizjkijzamadzivazzjaakjvavukkiiksizrvgvivivazkmaiijaivrdaskdmsriaizardaikasairakzvmkdsahdiziiiviiihzaavkzvazrizmsarzmikmjkaizifrrkkzmazdsmivvivaiviiizsacaamkzrsdzzaikmizmrzvzjjakazkzzzmzrzijazizimkrikzkiizzzhiizadirdiazdasviarzkirvsaizrisdazszhzziazizrdaziraasdiariaiizkmshumzzadrjaiiiizzsdjaziajziiszdzzsrrsrzzdsiqaihiridizdmadzekmrkismrbrziikrmmizizhrvmjvjzziahikiaajazsdaaikazzdrvjishakmdzajaajhjjivzzrzjaiikirimzijhjzizzzdzziiizazaazahrrzdaszvaavajzkradhhamviijzmkzjizahvksakrszzhisdiikrrzkkimarzizizhorzisrrizruaaijizaizhjizzraissiziarjirjamajadaiiiviaizizmvaazhzraimimvvaiazzkibzasikajkavaavmizzizzadiijajkiiiakikiksmdjzdzzmziikajjzzkzzziazjiairdaiiivisiazzzhdamhmzshrdiziziaazvzsaikrkizhaizrmzarzrzaadviavivdjiiavmziaazkkirddvihkiaiqziiiaijrzkazvazamzizizzsmikiiikddirjjizmrzzmvmzzijmkiivjiimriaidsazaidriakjajziikazaskahzazihrdiiiflzzddkidkzuzijmhzzidihzizidmiqaairmjdadrramaiiijrmaiaiiarjiiiidzmsazmahmjazijihkaiarkazirzazaiakjdvrivhrzazamaaiivzliiqijizzzjzaimzmmhiajimzkikjzikmakviizmijihzdiizizizzrivadaviaiiiiidvziaizzrisrfkirvizjzaidzjjrapkakzrzvvmaimzdidadrjumzaazjuhhziizkddzzrkiiimajmrsazazizdakmiasvkzmazrflkzzaiizhivdzdmvdairzimrrvrzisklzvrkjrkjdzdhzaziiidmiznixjaksiizviiiazzaizkzvizzkhdisvizjasziarzjlikizaidiramzjiamvdaraadrimiaikzaddzzdvaiirdariizriaaizziaizirmizdzizizzzivkakvikiizhiszvkdikiizimkmaiiiirmiiaaywszaiiziiviuzimiaajzzzmakvazvrmsaizaskramsrirzizirrimksvrsjzakavviziirjdfzvidaarmiizriikriarizzrajdzkzdziaiiviaidrsziakikkmiairaaziiiijjiaaiqazihiizziziidzqiiikzkamimiazvzadadzhdzzakvazzzrrkiimsazriiiijariiivzhdzhkarrsimaarzaizijlzdzazvkzazizmmkzqrzmaziziadvziidziiziizvzirizivijaiiaadszduivvkajrazdlimzjisijiqjiaisiabzmzitziraakvakkidmmqikvaiikjjikikjizzaaazizaijsqzvimjzvurmmkzriisdaivkzfmvdzzkazzdkjzkjiviirzrvmajziijmzizmuahikiijrivmaraivdadmirzravazaiimmiiqadzsvrirkzdjavksdlaiivirzlazaiadrjmiirvizizkzzkszizikaghvzmiiqzdmiqhvazmzhikairazkkiivmkjzraiiijaiukrzivjzazidkriziszizkzvarzmmaaiivhmuzmikzadz";

        System.out.println(closeStrings(s1,s2));
    }
}
