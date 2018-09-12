package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode336;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode336 {
  @Test
  public void testProblemCase1() {
    String[] words = {"abcd","dcba","lls","s","sssll"};
    LeetCode336 solution = new LeetCode336();
    List<List<Integer>> result = solution.palindromePairs(words);
    Assert.assertEquals(4, result.size());
    Assert.assertTrue(result.contains(Arrays.asList(0,1)));
    Assert.assertTrue(result.contains(Arrays.asList(1,0)));
    Assert.assertTrue(result.contains(Arrays.asList(2,4)));
    Assert.assertTrue(result.contains(Arrays.asList(3,2)));
  }

  @Test
  public void testProblemCase2() {
    String[] words = {"bat","tab","cat"};
    LeetCode336 solution = new LeetCode336();
    List<List<Integer>> result = solution.palindromePairs(words);
    Assert.assertEquals(2, result.size());
    Assert.assertTrue(result.contains(Arrays.asList(0,1)));
    Assert.assertTrue(result.contains(Arrays.asList(1,0)));
  }

  @Test
  public void testProblemCase3() {
    String[] words = { "ghcadiceegj", "eifgg", "abejhifjeifdgdahbb", "jibaa", "cjiiahc", "gi", "cigeihe",
        "jbcggaiihgjhje", "cjajbbdehfaiibcbaj", "cbififciij", "fbabajefcfijhgeijja", "iia", "jecfefjdbicafjabbh",
        "bgdf", "hgahieahbjdcg", "hdeebejfdag", "gbahcbjfh", "hieggfehghgh", "fjecdcbgfdjjf", "e", "bbhficicheibig",
        "jehedbfiegffjg", "echh", "j", "hjbijffbgjchaagaaha", "gdaegdjg", "bahhaa", "hcfghhecjhdhgffaig",
        "jahajhahegdba", "ebjjjebfj", "addjjjgefc", "adghejajacagfcbfehai", "egfhjdcie", "eijefjddfjajdfheejgf",
        "cafcaijcihbg", "ajfahedebfafg", "jaiijgibjfaj", "jhhahejdeff", "fcjag", "hedajiabdcjghhdgej",
        "aahhejgacfbhagdjfcg", "bddibjghbfjbigefg", "bdgbgaej", "fcccggebcfjj", "jbebfdafdeda", "adddcj",
        "gjdhgdjgfggbijfbh", "hhjdchgaicibeeechde", "jdhheedghhjbijcgga", "bejfacjbigeijegdcje", "eaadaajheebejfjdfdh",
        "db", "bicifh", "ichjedae", "b", "fiacafidibccbaabhij", "edehifjjbjefggih", "i", "bfddjagfhde", "gbjdeba",
        "jegdbhfegffbdc", "jfifdhhjcjcdafhadi", "digje", "hhbbebhhgejhhcch", "bh", "dh", "aabb", "iebcbgbb",
        "aaejbjjbgcbcga", "ibdjfefadicjijeefcfj", "bbcbajfe", "hjbacajdajggbgfa", "aicjcgdfgijeda", "ghicafihe",
        "dhbaefbei", "fhcgabbgg", "agei", "feigc", "d", "jbjhfbgg", "jabbgejfjbbc", "ihcdd", "difhaebgbc", "iagfgjhggd",
        "hdad", "jfchiccffjbccgg", "ifg", "ifih", "aefjaajcfeccedf", "dbbbjahgbfgbae", "ghcddehagee", "hhhhbffgfge",
        "bfibdc", "gbhi", "djjdech", "djhebbcfbbjfffhcicg", "gjhiadjbfcea", "ebhdjjidgijchd", "jidagfcbfijahcgb",
        "hbajgjhgdjic", "gibahcbdfaebdeaaicjb", "jgcdgjdegbdgbcce", "jahgh", "jdbceefjcbdfiibjhgbf", "bieijeigbdi",
        "jdde", "hbgaehedbfcifbbf", "dbffjdcebjhhghebf", "ifccjajieaccbhi", "hbfhjcfb", "fghfihcieg", "cbbidgeeebfie",
        "eedgdcajfheggiah", "jibbibdheeabgfgegi", "jbhggadfbahgcjgjafdj", "figfdjdfijb", "gcha", "fddhbeafidigdic",
        "acifhbda", "afccadiehejdgcie", "hjeacgjfahifeiijihj", "cgfaahachdiacdjeifej", "ccjijibe", "abgda", "hhaeddcfh",
        "ihjadajebabjeifdd", "jibijjehafgeje", "becgdjefd", "bbicjgbi", "jcjefcgefaggcab", "gegbfihb",
        "adaiccgfcecgehdfhacf", "hibjfjbb", "cgehdb", "jbbeafefcfcfafjhfba", "ifaehehhfagaahagid",
        "babibjfgbedidbdcgcb", "fbaeffdhjbdhghbagjbc", "cfihhg", "fcfdi", "h", "heac", "daieijaaib", "cf", "cffijg",
        "iieifiicciejchibi", "bgcabgcgfcf", "ibeajbccjfh", "eijdighje", "dbdfjg", "aacihdehdeda", "hjjegbjfa",
        "bjggfaeah", "dibhihfeedfd", "egaj", "fifjahahhhbbfeadffj", "eghcbgcccbbihcc", "hb", "chebdjiegbiigigh",
        "cgggaeihajcebdd", "cfdhjhibdfabjdfbbej", "ahjaaagfiadded", "baedided", "bbbeaghfeiaiadgghhib",
        "hgadbchebfedef", "c", "idjijhhjhiccggce", "ifgbedcehggifdfbibg", "hibe", "iigc", "fbcjhcdbfjjbh",
        "fafgjfbeffggfehed", "eefihdbchcjbad", "hcehd", "dbefijafidcdgchgbgde", "jgfjbgch", "chbgicjd",
        "dhghdgehibddijjgicj", "ceagifeejihhjb", "f", "fifidfhfc", "bddcfejajejbii", "fhbfg", "egfcffbdagihheb",
        "ibadhbihjdgaca", "dgebcbd", "cj", "jgabehfedba", "bfedcfgaafhgfbbjac", "ichaabf", "ff", "jciiajjedfbgchh",
        "ifaed", "aj", "hedeccachaih", "ddajd", "ahffdhhdjgacjfg", "bhaad", "jaegbecchegegee", "fbeghjjffjj",
        "fcaijfgdagdhbgcaf", "eiahjaigcadigjfajae", "hcedajjfdggidbiaf", "gbibgifjhcjfaeajd", "gjgefeceefc", "dc",
        "bjgeeigbhdeechghghgh", "igf", "iajfdhhagfbhaijbbcfa", "bidcc", "fjadb", "fjhdiddjbhebebggegd",
        "ifgedggbdbafcbefjh", "bdiiggahf", "cjchijdeifiibh", "egh", "ebcjehaahcejchfidf", "cafihfhajicj", "cedgegjdeha",
        "caddajehjbajidgjiadc", "igafdebfcbfbfihca", "efifeigf", "chihgbiecf", "jabdicjhcei", "ef", "gfbchcdg",
        "jbccbfa", "giibhffjafaaijaejefi", "ifjdaejf", "gdgihbbhijeeabia", "iafih", "afb", "ajbgbgbbbhjc",
        "gcadfeefggbggjd", "hcdhcb", "fjfjggfjfcbfgchhhb", "baejbiffajjgbcbf", "bdefjcebdgbajh", "gbjfcbbfgfbdf", "jb",
        "ja", "chibceajcibhgdcjih", "caehgfacgjccibidd", "hjbaibgagbeihaic", "gj", "bedjbhd", "ijaac", "igfdbbgabejjfa",
        "bagchjecadfgdh", "gfciijgijbiaffd", "ibidea", "jaebbhahffj", "gcagghaichahd", "ejfbbjjjfaeei", "ajgcaifafj",
        "jdhdbdcbjeehhiija", "baacjcajcfijabd", "cdjhdgda", "bajhfibh", "dib", "hjeeajbcjhihdgh", "hdai", "djjchedfig",
        "aegdjgdh", "dcifbfa", "ihicgjbgbjjcdeafj", "fghbecdcggejf", "gicijcf", "cdbeaafgceafhfdfgaih", "chhcd",
        "ebideicahdddhiigg", "icdic", "aadcicgeibjgbhgi", "gjjiacj", "ahbiahc", "ieahei", "gichbeifii", "diagdgji",
        "gagcihdecebccdgg", "dgbibhfbfh", "ihg", "ifffjfbgabad", "ffda", "hcahgcfcjgbhc", "cffbbjc", "hafi", "bacbh",
        "fiddaeghhchejgcjh", "hc", "jajdhfjhiighbdjg", "gggjiacgefddajih", "acehhicg", "echjibih",
        "iiijabdhifdfhgdbabf", "cgfgdbfedchjace", "efdecefeccbdegh", "bej", "eijehfcedg", "bbbaadei", "idc", "cjchb",
        "iaidfecij", "fdigjidjiabf", "hcjighaejihhdcghjigf", "aadaj", "gf", "bchbhciifbaac", "ecghbfgaihafdjdfcdgd",
        "dibb", "bcc", "hggajgiejedbabfjbjib", "jaig", "icfdgjfgafjaefda", "jbgajjijhgbbdddcjgd", "cgdhjiifagfegibjb",
        "ac", "beaia", "bbigfdgfdbdfag", "fgcefeaffcca", "ee", "bcafaf", "cecdd", "jbjcbjjedacdghabiee", "efbbcgaigicd",
        "ddaceij", "ijjdfaf", "babiffbidjjec", "dbdddeeagfbfbjghcceb", "haddhffhjajjea", "hfgjdfgce",
        "cddbibbeefhifehb", "beiedigc", "jcaiicihd", "difeg", "fdadhibjighcaeceeci", "hjaa", "dd", "ifffcigdcfdchidb",
        "ibecajjcfjda", "gbjjjddbijdifjf", "iabeedfgg", "iedcihbfgccgaga", "aebbjdadbdi", "dffccghaaedgih",
        "cgciibehbheh", "bgcbcghaibacjagjh", "hiiheddbfiebecj", "ehjejacjfbjbbc", "iiadddjccfdf", "ief",
        "fegbehahdggjaaai", "ehi", "afeddi", "dhffdg", "ice", "je", "bjecaaeecfddjhg", "ifhjjffj", "iiijahbjegace",
        "dhdhhfifbbbbb", "daa", "cdhfehaeca", "dcjdjjbeeadjch", "bfhjbid", "gfjgcgiehfedifh", "bidbfdighadje",
        "chafdjhdjeiiehhc", "abaci", "befadhfegefhfgdfha", "gbccigehgidchfiiffc", "gbiefhed", "ccgdahbacgjceb", "fdcee",
        "faedjbgfdeeided", "cbebccaegh", "eeh", "ciddggifhfja", "ificfcihdffgdejffa", "ggbeiecdccacffbgj", "fdfcid",
        "cecafeegjd", "gcegahgfed", "hjgfjachiadafga", "achfcdggaicc", "efhjha", "iiiagbcgbg", "icihciejghccic",
        "fgchggiidh", "gcfdafhcjffgabf", "abafb", "fejjfgjfhf", "cdgfbdefc", "jbch", "jbaic", "ddadjiibeacaicifiah",
        "ddaddhfibbbfdfgbjg", "igjdiggfbecfieeegja", "igdiieegcbejdge", "cgge", "ehfdbbgegedafigibj", "hjigihebc",
        "djeiibddajjih", "chiffggcjbdjiifi", "chfi", "cfdbigcgaj", "cbgb", "fjhdjcjcbjhacefiee", "bhcfcdigg", "jfbgef",
        "gidghafeaggiehj", "caiieeafgf", "dgfgbdjgdabdifef", "adbhghfjigejfciigh", "jdhebhheedgfifgdbii",
        "aihdbeaedjbadicifed", "jceiicfiifc", "bfhib", "abadda", "cabafiedfgcahbbccg", "abba", "fjaeechgcchg",
        "fbeijafh", "chiigdcehfgedecai", "echeiabc", "ibbgbaibigj", "a", "fbcidabaihjg", "dijjdbjcjhghegji",
        "gfcdiiebegbddgihdch", "gie", "bajbjhihbdifafdcceh", "jf", "hjdjgjjdhabicjab", "dbhecidbbgcbeggd",
        "acdfjagdghe", "bfaihgedadiefh", "be", "jdddhgbf", "iabbefajfiaheadafhcg", "djcbe", "cbicfbdjdfddh", "jcecgbh",
        "hgficafjhgijbcb", "ei", "aaifjcffggihfggdfijg", "iadja", "adhefjghjbejh", "jjbgbij", "hhjjhfgdajccgaddhg",
        "bb", "gjichadfbcgddiajahg", "ebbehfcgjffedjdjcb", "hdihejhgi", "ijiegjhbbbg", "hcdiibiidcejggj", "fiea",
        "gbedj", "jejhc", "gfggheadaehbcfdeb", "ibhbjgheffd", "cg", "daifhgjbfiddgbffhb", "jbhbfijgjcidfefe", "gigajf",
        "ihbfefbhja", "gaijecfagdagicbhhce", "ghhijja", "iahhjbabiiac", "hjdidib", "gagafbggabae", "dgheedfajcaficjjd",
        "dfdjbdccg", "ai", "dhhhbhddeecbdeahaha", "caa", "hjj", "fcidi", "gheajjhigc", "ifaegbegjedda", "cjfbcjdjgajb",
        "jbbjebhgibffbf", "g", "ehgefh", "hfhi", "gacjjadiiabghb", "cbgi", "bge", "ciiejddcfiiaehgj",
        "acgjgdgjagcijfiiiai", "fbabhegcbfj", "fehaffdbdbdbjhheh", "fggjjjfhjgdaefhagg", "ahjbdi",
        "bagahchbehicbjeggjd", "ihj", "bdcjahaeagedchgaadd", "gba", "gbbebjh", "ccehihdc", "gihacj",
        "hhdcfiicdajedhjdiae", "ffagggajbfdabf", "gahbghagi", "gdaaagfccdajgbcigijh", "aiicb", "edffehejecc",
        "fhaffdeaaai", "fafhceiajajfahicead", "gihajhbicjj", "ffggggeabbji", "cbbhaheaeafchbjjj", "ic",
        "fdabcddfdffgbjjbahg", "iajhhabbaae", "gdhi", "bfdahheiacdjdfi", "jhfffiadibbe", "bigadhjhfedhahea",
        "djjcfigda", "ahggcgegajb", "baficghc", "hfghicfi", "bha", "fgdcfgfgbdhc", "gcfjbeifchbibeeheeeb",
        "achgjbcgieb", "cfihfihgefigifdahcj", "cbbhhgcfcjffdh", "hbcgbfibeafhhcdgibjb", "hhchh", "dddjdijegjhbfggejh",
        "ebbeafbbjjjaij", "aahebebbjchacfbhhcia", "jbac", "chegigb", "jiibjh", "ihedddfiicdjbgh", "ebcicdagcaigjajfieg",
        "faajbdif", "fdhjfjjad", "bbdibejigfjheebffbcf", "igja", "cbdagbhiedeg", "ebjigdjjaehehig", "dgiff",
        "fcadfgciedejgfeccf", "ehdfdigd", "cfgaag", "ddj", "dfjecafjjcg", "cdihbhidfhehafeda", "eeeddagbaibcbhgf",
        "gbabhjabjhddigjj", "ffgdggfcjc", "diihfe", "bg", "fhci", "jffjjefadjjaia", "fhe", "eijfbibjc", "fgjjg",
        "jifhejghbghiceab", "chbbhaba", "cfejjgbidh", "dgcbbcjijfgediadc", "hfi", "djdcdefb", "dhfhgaeibbjbdbfh",
        "fhhffagdh", "biafahceghaggjj", "aahddibfc", "eiafhhafdfaidifc", "cfdaicgchdbfbhjfgf", "aiaciff", "fihbg",
        "cbjgigigjdggcjgecj", "iaiicfecdjce", "gb", "ggbhjjebhd", "igiheeaghdjhggehb", "cbbbjjhi", "eadddh", "dahhcbdi",
        "bddfhijbhb", "gabeahhhjcb", "eefaaifbgifgcb", "beg", "bhgaeigiehjg", "cfbebdgf", "jhcagafccg", "eahfdg", "fh",
        "heaieeehhadei", "hgcefgagedbdj", "bebfff", "cjiidggejhg", "gbaffbhiccheegdjbd", "hihhefihhdf", "dbgfedg",
        "jigfgcbbcbhb", "hecgifeaedcidjffgae", "gaejcjbjehiajghgbc", "hfd", "dfce", "ffbhi", "ab", "fjhhhjabijeahjhccc",
        "hjjihibfgj", "gcjiccgeehhhdidfgd", "bafgfg", "cgbdigbhefgfhai", "jadgicgcadjgfcfh", "ggbdjei", "aehjjh", "hf",
        "dchcbf", "fajddaeeijgfefciai", "didgbdeb", "idgdbeaeh", "fhjbhgabgijdcfh", "gfafihjbjbbecgdafj", "hhcgb",
        "iieahjg", "bifgaaidacefbccg", "fhfifcjehagfdfaefg", "edjfdicejffacif", "cacidggi", "jifi", "ijajcdfeae",
        "hdbiiadhgficaae", "ibjjah", "ifacige", "bcfefeiefah", "bbfih", "bdahiedb", "ceihgegjbdbaaa", "ahfdiajghebbbag",
        "idijece", "gfihhegfhfchjieedcaj", "ceehgcdjfji", "afcgcdgcafdjh", "iabejgdjicahjaihgeee", "deaig",
        "iccgfdifhccgag", "giffb", "heeffhjceghfgdc", "cdahcffdjdb", "efaiceeafgb", "fiajcbbe", "dghjcdcfbbdccgc",
        "difjcad", "ehidjacegbcch", "effi", "ge", "ghhgecg", "cddhcfd", "fgg", "fdibccfda", "iigdjgag", "ejbgefhh",
        "bigd", "eb", "eggbjadbgbhe", "eheia", "ggbcdfbjfi", "gciefcgadg", "ggcefafcebgab", "aejiciffihacjgec",
        "egffij", "aajbaagjhcib", "ifeif", "hhdhdhhjeah", "gd", "bjcji", "ibjhbfedgca", "aee", "jh",
        "bbjbbghccifejecadh", "jiaicjacaibeaa", "eifggbbgbig" };
    LeetCode336 solution = new LeetCode336();
    List<List<Integer>> result = solution.palindromePairs(words);
    Assert.assertEquals(135, result.size());
    Assert.assertTrue(result.contains(Arrays.asList(5,481)));
    Assert.assertTrue(result.contains(Arrays.asList(57,5)));
    Assert.assertTrue(result.contains(Arrays.asList(472,11)));
    Assert.assertTrue(result.contains(Arrays.asList(425,11)));
    Assert.assertTrue(result.contains(Arrays.asList(51,78)));
    Assert.assertTrue(result.contains(Arrays.asList(54,51)));
    Assert.assertTrue(result.contains(Arrays.asList(64,54)));
    Assert.assertTrue(result.contains(Arrays.asList(140,64)));
    Assert.assertTrue(result.contains(Arrays.asList(64,157)));
    Assert.assertTrue(result.contains(Arrays.asList(65,78)));
    Assert.assertTrue(result.contains(Arrays.asList(140,65)));
    Assert.assertTrue(result.contains(Arrays.asList(449,66)));
    Assert.assertTrue(result.contains(Arrays.asList(84,140)));
    Assert.assertTrue(result.contains(Arrays.asList(305,86)));
    Assert.assertTrue(result.contains(Arrays.asList(140,87)));
    Assert.assertTrue(result.contains(Arrays.asList(102,193)));
    Assert.assertTrue(result.contains(Arrays.asList(105,548)));
    Assert.assertTrue(result.contains(Arrays.asList(143,165)));
    Assert.assertTrue(result.contains(Arrays.asList(179,143)));
    Assert.assertTrue(result.contains(Arrays.asList(157,140)));
    Assert.assertTrue(result.contains(Arrays.asList(54,157)));
    Assert.assertTrue(result.contains(Arrays.asList(157,64)));
    Assert.assertTrue(result.contains(Arrays.asList(460,169)));
    Assert.assertTrue(result.contains(Arrays.asList(186,165)));
    Assert.assertTrue(result.contains(Arrays.asList(23,186)));
    Assert.assertTrue(result.contains(Arrays.asList(190,179)));
    Assert.assertTrue(result.contains(Arrays.asList(179,190)));
    Assert.assertTrue(result.contains(Arrays.asList(193,425)));
    Assert.assertTrue(result.contains(Arrays.asList(23,193)));
    Assert.assertTrue(result.contains(Arrays.asList(193,240)));
    Assert.assertTrue(result.contains(Arrays.asList(205,78)));
    Assert.assertTrue(result.contains(Arrays.asList(165,205)));
    Assert.assertTrue(result.contains(Arrays.asList(207,5)));
    Assert.assertTrue(result.contains(Arrays.asList(209,259)));
    Assert.assertTrue(result.contains(Arrays.asList(215,653)));
    Assert.assertTrue(result.contains(Arrays.asList(224,19)));
    Assert.assertTrue(result.contains(Arrays.asList(179,224)));
    Assert.assertTrue(result.contains(Arrays.asList(239,23)));
    Assert.assertTrue(result.contains(Arrays.asList(54,239)));
    Assert.assertTrue(result.contains(Arrays.asList(240,23)));
    Assert.assertTrue(result.contains(Arrays.asList(425,240)));
    Assert.assertTrue(result.contains(Arrays.asList(240,193)));
    Assert.assertTrue(result.contains(Arrays.asList(244,481)));
    Assert.assertTrue(result.contains(Arrays.asList(23,244)));
    Assert.assertTrue(result.contains(Arrays.asList(78,269)));
    Assert.assertTrue(result.contains(Arrays.asList(288,140)));
    Assert.assertTrue(result.contains(Arrays.asList(165,288)));
    Assert.assertTrue(result.contains(Arrays.asList(355,296)));
    Assert.assertTrue(result.contains(Arrays.asList(296,661)));
    Assert.assertTrue(result.contains(Arrays.asList(64,300)));
    Assert.assertTrue(result.contains(Arrays.asList(305,481)));
    Assert.assertTrue(result.contains(Arrays.asList(179,305)));
    Assert.assertTrue(result.contains(Arrays.asList(309,54)));
    Assert.assertTrue(result.contains(Arrays.asList(315,425)));
    Assert.assertTrue(result.contains(Arrays.asList(165,315)));
    Assert.assertTrue(result.contains(Arrays.asList(316,661)));
    Assert.assertTrue(result.contains(Arrays.asList(319,19)));
    Assert.assertTrue(result.contains(Arrays.asList(19,319)));
    Assert.assertTrue(result.contains(Arrays.asList(336,321)));
    Assert.assertTrue(result.contains(Arrays.asList(335,676)));
    Assert.assertTrue(result.contains(Arrays.asList(336,78)));
    Assert.assertTrue(result.contains(Arrays.asList(78,336)));
    Assert.assertTrue(result.contains(Arrays.asList(349,443)));
    Assert.assertTrue(result.contains(Arrays.asList(355,23)));
    Assert.assertTrue(result.contains(Arrays.asList(19,355)));
    Assert.assertTrue(result.contains(Arrays.asList(360,78)));
    Assert.assertTrue(result.contains(Arrays.asList(511,367)));
    Assert.assertTrue(result.contains(Arrays.asList(375,319)));
    Assert.assertTrue(result.contains(Arrays.asList(140,375)));
    Assert.assertTrue(result.contains(Arrays.asList(405,165)));
    Assert.assertTrue(result.contains(Arrays.asList(443,429)));
    Assert.assertTrue(result.contains(Arrays.asList(431,23)));
    Assert.assertTrue(result.contains(Arrays.asList(179,431)));
    Assert.assertTrue(result.contains(Arrays.asList(436,54)));
    Assert.assertTrue(result.contains(Arrays.asList(19,436)));
    Assert.assertTrue(result.contains(Arrays.asList(436,661)));
    Assert.assertTrue(result.contains(Arrays.asList(443,19)));
    Assert.assertTrue(result.contains(Arrays.asList(57,443)));
    Assert.assertTrue(result.contains(Arrays.asList(449,54)));
    Assert.assertTrue(result.contains(Arrays.asList(54,449)));
    Assert.assertTrue(result.contains(Arrays.asList(460,165)));
    Assert.assertTrue(result.contains(Arrays.asList(481,460)));
    Assert.assertTrue(result.contains(Arrays.asList(472,425)));
    Assert.assertTrue(result.contains(Arrays.asList(57,472)));
    Assert.assertTrue(result.contains(Arrays.asList(474,165)));
    Assert.assertTrue(result.contains(Arrays.asList(474,315)));
    Assert.assertTrue(result.contains(Arrays.asList(475,140)));
    Assert.assertTrue(result.contains(Arrays.asList(475,676)));
    Assert.assertTrue(result.contains(Arrays.asList(476,143)));
    Assert.assertTrue(result.contains(Arrays.asList(57,483)));
    Assert.assertTrue(result.contains(Arrays.asList(486,577)));
    Assert.assertTrue(result.contains(Arrays.asList(676,494)));
    Assert.assertTrue(result.contains(Arrays.asList(605,496)));
    Assert.assertTrue(result.contains(Arrays.asList(496,555)));
    Assert.assertTrue(result.contains(Arrays.asList(511,57)));
    Assert.assertTrue(result.contains(Arrays.asList(165,511)));
    Assert.assertTrue(result.contains(Arrays.asList(522,157)));
    Assert.assertTrue(result.contains(Arrays.asList(548,336)));
    Assert.assertTrue(result.contains(Arrays.asList(23,548)));
    Assert.assertTrue(result.contains(Arrays.asList(555,54)));
    Assert.assertTrue(result.contains(Arrays.asList(481,555)));
    Assert.assertTrue(result.contains(Arrays.asList(555,577)));
    Assert.assertTrue(result.contains(Arrays.asList(558,614)));
    Assert.assertTrue(result.contains(Arrays.asList(560,179)));
    Assert.assertTrue(result.contains(Arrays.asList(565,591)));
    Assert.assertTrue(result.contains(Arrays.asList(93,574)));
    Assert.assertTrue(result.contains(Arrays.asList(577,481)));
    Assert.assertTrue(result.contains(Arrays.asList(54,577)));
    Assert.assertTrue(result.contains(Arrays.asList(577,555)));
    Assert.assertTrue(result.contains(Arrays.asList(653,586)));
    Assert.assertTrue(result.contains(Arrays.asList(586,661)));
    Assert.assertTrue(result.contains(Arrays.asList(591,179)));
    Assert.assertTrue(result.contains(Arrays.asList(140,591)));
    Assert.assertTrue(result.contains(Arrays.asList(591,614)));
    Assert.assertTrue(result.contains(Arrays.asList(602,591)));
    Assert.assertTrue(result.contains(Arrays.asList(605,425)));
    Assert.assertTrue(result.contains(Arrays.asList(54,605)));
    Assert.assertTrue(result.contains(Arrays.asList(614,140)));
    Assert.assertTrue(result.contains(Arrays.asList(179,614)));
    Assert.assertTrue(result.contains(Arrays.asList(614,591)));
    Assert.assertTrue(result.contains(Arrays.asList(627,23)));
    Assert.assertTrue(result.contains(Arrays.asList(653,481)));
    Assert.assertTrue(result.contains(Arrays.asList(19,653)));
    Assert.assertTrue(result.contains(Arrays.asList(656,179)));
    Assert.assertTrue(result.contains(Arrays.asList(656,305)));
    Assert.assertTrue(result.contains(Arrays.asList(661,19)));
    Assert.assertTrue(result.contains(Arrays.asList(54,661)));
    Assert.assertTrue(result.contains(Arrays.asList(661,436)));
    Assert.assertTrue(result.contains(Arrays.asList(472,663)));
    Assert.assertTrue(result.contains(Arrays.asList(672,481)));
    Assert.assertTrue(result.contains(Arrays.asList(78,672)));
    Assert.assertTrue(result.contains(Arrays.asList(675,425)));
    Assert.assertTrue(result.contains(Arrays.asList(319,675)));
    Assert.assertTrue(result.contains(Arrays.asList(676,23)));
    Assert.assertTrue(result.contains(Arrays.asList(140,676)));
  }
  
  @Test
  public void testProblemCase4() {
    String[] words = {"bab","","cat","abba"};
    LeetCode336 solution = new LeetCode336();
    List<List<Integer>> result = solution.palindromePairs(words);
    Assert.assertEquals(4, result.size());
    Assert.assertTrue(result.contains(Arrays.asList(0,1)));
    Assert.assertTrue(result.contains(Arrays.asList(1,0)));
    Assert.assertTrue(result.contains(Arrays.asList(1,3)));
    Assert.assertTrue(result.contains(Arrays.asList(3,1)));
  }
}
