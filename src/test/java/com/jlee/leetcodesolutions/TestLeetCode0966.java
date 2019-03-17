package com.jlee.leetcodesolutions;

import com.jlee.leetcodesolutions.LeetCode0966;
import org.junit.Assert;
import org.junit.Test;

public class TestLeetCode0966 {
  @Test
  public void testProblemCase1() {
    String[] wordlist = {"KiTe","kite","hare","Hare"};
    String[] queries = {"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
    LeetCode0966 solution = new LeetCode0966();
    Assert.assertArrayEquals(new String[] {"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"}, solution.spellchecker(wordlist, queries));
  }

  @Test
  public void testProblemCase2() {
    String[] wordlist = {"ae","aa"};
    String[] queries = {"UU"};
    LeetCode0966 solution = new LeetCode0966();
    Assert.assertArrayEquals(new String[] {"ae"}, solution.spellchecker(wordlist, queries));
  }

  @Test
  public void testProblemCase3() {
    String[] wordlist = {"aqgrtxr","wuebtnz","ekhwmxs","zpzelpz","owqnkjh","fznwxyg","iqidton","scxmrpp","scmfknj","ktbypeo","cnrkiry","wkwcbzt","poixwmf","rszuczw","pitpcoa","uvscpkd","xyxnwfh","xpfdfmh","thcxrze","wanmdvh"};
    String[] queries = {"cnrkiry","wtjdsod","fobjyxc","ScMfknJ","teblini","owqjknh","dfpadmb","aqnokmk","potpcou","wsxlkxn","poixwmf","xswwuta","oqedtno","zpzilpz","wuebtnz","trejhoz","OWQnkJH","xpFDfMH","cndrtef","ifeiwgq"};
    LeetCode0966 solution = new LeetCode0966();
    Assert.assertArrayEquals(new String[] {"cnrkiry","","","scmfknj","","","","","pitpcoa","","poixwmf","","","zpzelpz","wuebtnz","","owqnkjh","xpfdfmh","",""}, solution.spellchecker(wordlist, queries));
  }

  @Test
  public void testProblemCase4() {
    String[] wordlist = { "kkk", "hrt", "fze", "awj", "dfn", "kec", "zss", "dkp", "pdx", "pgm", "ozl", "dhj", "uqm",
        "eks", "opv", "cxo", "okq", "wym", "fjp", "yyo", "awz", "lsp", "quk", "hhe", "sth", "mpo", "mbg", "smj", "cpm",
        "dno", "miq", "fld", "zxa", "fdu", "ige", "lmt", "gyh", "wcu", "wiv", "zad", "tjk", "ync", "voc", "gqw", "fzk",
        "ehs", "kgp", "hde", "kkp", "tko", "uae", "uax", "xhm", "anh", "oph", "lws", "amw", "vyi", "lec", "exq", "dbx",
        "gee", "cbp", "pfu", "uya", "loi", "zba", "qdo", "cfv", "oxg", "him", "aoj", "uob", "kxs", "odx", "qtu", "xbg",
        "bqy", "imr", "dzo", "ona", "hat", "jxd", "bae", "ops", "len", "fof", "wlt", "fxa", "ryu", "qay", "asd", "shj",
        "wbi", "moz", "gsi", "hdc", "abt", "yfd", "ptc", "dyj", "dhg", "qwj", "zme", "enn", "lfc", "pdn", "vcx", "aig",
        "ywr", "txj", "ngl", "mro", "rqc", "baf", "vbr", "box", "wgv", "ifa", "ogw", "ikg", "aai", "qeg", "bgs", "cmo",
        "prf", "trt", "rqq", "sep", "uqx", "xvn", "uzw", "fof", "mzz", "qug", "pnq", "kwd", "igf", "yly", "ecb", "bcz",
        "osc", "onq", "khy", "ubi", "iik", "cee", "ora", "iyt", "soa", "qdo", "cmr", "hty", "jap", "ghn", "gwh", "cqd",
        "tre", "hix", "ztg", "zhf", "mbx", "esc", "hzo", "tic", "mpi", "gvt", "gmm", "tnp", "qgb", "riv", "yrw", "bvu",
        "uia", "mnx", "lnh", "wao", "pxz", "haw", "bix", "qmr", "kga", "umh", "lmk", "noi", "mjx", "erj", "yda", "dny",
        "zsk", "qla", "ndq", "atn", "hkb", "svh", "tvi", "pyw", "foa", "zuo", "ort", "ous", "orx", "vfk", "vus", "fwz",
        "nfg", "vsd", "opn", "nqm", "hru", "jrt", "ymi", "xty", "dph", "etf", "kiu", "dpa", "paa", "oug", "vca", "ejn",
        "hrl", "auc", "idt", "vuz", "dxr", "dzc", "crg", "cyw", "eiq", "owp", "qye", "aiy", "rmb", "laf", "fmu", "csn",
        "ray", "ckd", "rhg", "dvf", "guk", "suw", "nfv", "poe", "qpj", "tlg", "rxv", "iuu", "adj", "sjh", "ocw", "ytn",
        "ptt", "kdg", "anu", "dsl", "nhb", "ywm", "bok", "nlb", "wcf", "tor", "hlr", "rvw", "xui", "hxc", "knm", "oyb",
        "dgz", "puu", "ovo", "obi", "neb", "zfo", "ouz", "mcc", "fcd", "xzd", "mtu", "dpg", "zre", "tba", "hsz", "lqv",
        "tfv", "pbp", "glf", "dhc", "dzw", "zso", "cuf", "jek", "gqd", "wyr", "gip", "wsp", "wus", "emv", "kbc", "ssg",
        "gvu", "eme", "fwa", "zeo", "ljy", "rkv", "iiw", "ljl", "iwn", "oqo", "kcd", "bhl", "dyo", "mho", "scr", "zfg",
        "iqr", "zxo", "unq", "omd", "vck", "cux", "ivh", "xrw", "ata", "jgd", "mtu", "zhb", "ahd", "zcl", "zvi", "fgq",
        "htq", "epe", "vgi", "khc", "mdm", "nwq", "bbx", "iqz", "eys", "irl", "ihz", "zhd", "nsa", "ele", "pst", "xyq",
        "kox", "qys", "tlv", "uwr", "boi", "fdt", "amb", "lyq", "nej", "xxr", "ixx", "ust", "hwe", "hla", "ykp", "qyf",
        "sny", "bci", "yid", "gii", "dci", "irn", "mjp", "wvk", "zys", "cxs", "hua", "uji", "oxn", "flj", "uac", "yoz",
        "qcx", "fsk", "wvp", "vtq", "zsw", "uvw", "zqi", "bgu", "udg", "dnb", "ehz", "dtu", "atp", "cop", "unj", "zse",
        "vzv", "mjx", "xwr", "mlv", "mlv", "vky", "dkl", "kat", "ufp", "hyi", "vzd", "zok", "bel", "saz", "aba", "jgx",
        "uvc", "yir", "lid", "zph", "uuh", "gti", "lcl", "oxf", "yib", "xpa", "bwf", "udc", "bom", "nkm", "lkz", "rqw",
        "ihl", "bwy", "jmf", "pfy", "hbu", "imn", "eyf", "nkz", "gje", "svc", "ovt", "pdd", "ukl", "zxb", "mdr", "kzp",
        "oxi", "gtv", "raw", "shy", "cau", "vgx", "nrg", "bfg", "qzn", "knc", "srq", "qdx", "lij", "ixc", "ogc", "noj",
        "jxo", "usr", "ytl", "muv", "uti", "pbe", "dzb", "rvp", "fqt", "hhx", "mhe", "cga", "gtd", "yat", "zac", "lbt",
        "gke", "tuh", "obz", "vuv", "gmq", "dki", "skv", "qbm", "nbb", "ugv", "hxt", "uxn", "uaq", "qqa", "koe", "fxc",
        "sgj", "hvx", "nae", "wtp", "njm", "mnb", "rge" };
    String[] queries = {"aia","aia"};
    LeetCode0966 solution = new LeetCode0966();
    Assert.assertArrayEquals(new String[] {"uae","uae"}, solution.spellchecker(wordlist, queries));
  }
}
