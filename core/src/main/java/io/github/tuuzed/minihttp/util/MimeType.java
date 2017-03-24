package io.github.tuuzed.minihttp.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class MimeType {
    private static final Map<String, String> sMimeType = new HashMap<>();
    private static final String DEFAULT_TYPE = "application/octet-stream";

    static {
        sMimeType.put(".tif", "image/tiff");
        sMimeType.put(".001", "application/x-001");
        sMimeType.put(".301", "application/x-301");
        sMimeType.put(".323", "text/h323");
        sMimeType.put(".906", "application/x-906");
        sMimeType.put(".907", "drawing/907");
        sMimeType.put(".a11", "application/x-a11");
        sMimeType.put(".acp", "audio/x-mei-aac");
        sMimeType.put(".ai", "application/postscript");
        sMimeType.put(".aif", "audio/aiff");
        sMimeType.put(".aifc", "audio/aiff");
        sMimeType.put(".aiff", "audio/aiff");
        sMimeType.put(".anv", "application/x-anv");
        sMimeType.put(".asa", "text/asa");
        sMimeType.put(".asf", "video/x-ms-asf");
        sMimeType.put(".asp", "text/asp");
        sMimeType.put(".asx", "video/x-ms-asf");
        sMimeType.put(".au", "audio/basic");
        sMimeType.put(".avi", "video/avi");
        sMimeType.put(".awf", "application/vnd.adobe.workflow");
        sMimeType.put(".biz", "text/xml");
        sMimeType.put(".bmp", "application/x-bmp");
        sMimeType.put(".bot", "application/x-bot");
        sMimeType.put(".c4t", "application/x-c4t");
        sMimeType.put(".c90", "application/x-c90");
        sMimeType.put(".cal", "application/x-cals");
        sMimeType.put(".cat", "application/vnd.ms-pki.seccat");
        sMimeType.put(".cdf", "application/x-netcdf");
        sMimeType.put(".cdr", "application/x-cdr");
        sMimeType.put(".cel", "application/x-cel");
        sMimeType.put(".cer", "application/x-x509-ca-cert");
        sMimeType.put(".cg4", "application/x-g4");
        sMimeType.put(".cgm", "application/x-cgm");
        sMimeType.put(".cit", "application/x-cit");
        sMimeType.put(".class", "java/*");
        sMimeType.put(".cml", "text/xml");
        sMimeType.put(".cmp", "application/x-cmp");
        sMimeType.put(".cmx", "application/x-cmx");
        sMimeType.put(".cot", "application/x-cot");
        sMimeType.put(".crl", "application/pkix-crl");
        sMimeType.put(".crt", "application/x-x509-ca-cert");
        sMimeType.put(".csi", "application/x-csi");
        sMimeType.put(".css", "text/css");
        sMimeType.put(".cut", "application/x-cut");
        sMimeType.put(".dbf", "application/x-dbf");
        sMimeType.put(".dbm", "application/x-dbm");
        sMimeType.put(".dbx", "application/x-dbx");
        sMimeType.put(".dcd", "text/xml");
        sMimeType.put(".dcx", "application/x-dcx");
        sMimeType.put(".der", "application/x-x509-ca-cert");
        sMimeType.put(".dgn", "application/x-dgn");
        sMimeType.put(".dib", "application/x-dib");
        sMimeType.put(".dll", "application/x-msdownload");
        sMimeType.put(".doc", "application/msword");
        sMimeType.put(".dot", "application/msword");
        sMimeType.put(".drw", "application/x-drw");
        sMimeType.put(".dtd", "text/xml");
        sMimeType.put(".dwf", "Model/vnd.dwf");
        sMimeType.put(".dwf", "application/x-dwf");
        sMimeType.put(".dwg", "application/x-dwg");
        sMimeType.put(".dxb", "application/x-dxb");
        sMimeType.put(".dxf", "application/x-dxf");
        sMimeType.put(".edn", "application/vnd.adobe.edn");
        sMimeType.put(".emf", "application/x-emf");
        sMimeType.put(".eml", "message/rfc822");
        sMimeType.put(".ent", "text/xml");
        sMimeType.put(".epi", "application/x-epi");
        sMimeType.put(".eps", "application/x-ps");
        sMimeType.put(".eps", "application/postscript");
        sMimeType.put(".etd", "application/x-ebx");
        sMimeType.put(".exe", "application/x-msdownload");
        sMimeType.put(".fax", "image/fax");
        sMimeType.put(".fdf", "application/vnd.fdf");
        sMimeType.put(".fif", "application/fractals");
        sMimeType.put(".fo", "text/xml");
        sMimeType.put(".frm", "application/x-frm");
        sMimeType.put(".g4", "application/x-g4");
        sMimeType.put(".gbr", "application/x-gbr");
        sMimeType.put(".", "application/x-");
        sMimeType.put(".gif", "image/gif");
        sMimeType.put(".gl2", "application/x-gl2");
        sMimeType.put(".gp4", "application/x-gp4");
        sMimeType.put(".hgl", "application/x-hgl");
        sMimeType.put(".hmr", "application/x-hmr");
        sMimeType.put(".hpg", "application/x-hpgl");
        sMimeType.put(".hpl", "application/x-hpl");
        sMimeType.put(".hqx", "application/mac-binhex40");
        sMimeType.put(".hrf", "application/x-hrf");
        sMimeType.put(".hta", "application/hta");
        sMimeType.put(".htc", "text/x-component");
        sMimeType.put(".htm", "text/html");
        sMimeType.put(".html", "text/html");
        sMimeType.put(".htt", "text/webviewhtml");
        sMimeType.put(".htx", "text/html");
        sMimeType.put(".icb", "application/x-icb");
        sMimeType.put(".ico", "image/x-icon");
        sMimeType.put(".ico", "application/x-ico");
        sMimeType.put(".iff", "application/x-iff");
        sMimeType.put(".ig4", "application/x-g4");
        sMimeType.put(".igs", "application/x-igs");
        sMimeType.put(".iii", "application/x-iphone");
        sMimeType.put(".img", "application/x-img");
        sMimeType.put(".ins", "application/x-internet-signup");
        sMimeType.put(".isp", "application/x-internet-signup");
        sMimeType.put(".IVF", "video/x-ivf");
        sMimeType.put(".java", "java/*");
        sMimeType.put(".jfif", "image/jpeg");
        sMimeType.put(".jpe", "image/jpeg");
        sMimeType.put(".jpe", "application/x-jpe");
        sMimeType.put(".jpeg", "image/jpeg");
        sMimeType.put(".jpg", "image/jpeg");
        sMimeType.put(".jpg", "application/x-jpg");
        sMimeType.put(".js", "application/x-javascript");
        sMimeType.put(".jsp", "text/html");
        sMimeType.put(".la1", "audio/x-liquid-file");
        sMimeType.put(".lar", "application/x-laplayer-reg");
        sMimeType.put(".latex", "application/x-latex");
        sMimeType.put(".lavs", "audio/x-liquid-secure");
        sMimeType.put(".lbm", "application/x-lbm");
        sMimeType.put(".lmsff", "audio/x-la-lms");
        sMimeType.put(".ls", "application/x-javascript");
        sMimeType.put(".ltr", "application/x-ltr");
        sMimeType.put(".m1v", "video/x-mpeg");
        sMimeType.put(".m2v", "video/x-mpeg");
        sMimeType.put(".m3u", "audio/mpegurl");
        sMimeType.put(".m4e", "video/mpeg4");
        sMimeType.put(".mac", "application/x-mac");
        sMimeType.put(".man", "application/x-troff-man");
        sMimeType.put(".math", "text/xml");
        sMimeType.put(".mdb", "application/msaccess");
        sMimeType.put(".mdb", "application/x-mdb");
        sMimeType.put(".mfp", "application/x-shockwave-flash");
        sMimeType.put(".mht", "message/rfc822");
        sMimeType.put(".mhtml", "message/rfc822");
        sMimeType.put(".mi", "application/x-mi");
        sMimeType.put(".mid", "audio/mid");
        sMimeType.put(".midi", "audio/mid");
        sMimeType.put(".mil", "application/x-mil");
        sMimeType.put(".mml", "text/xml");
        sMimeType.put(".mnd", "audio/x-musicnet-download");
        sMimeType.put(".mns", "audio/x-musicnet-stream");
        sMimeType.put(".mocha", "application/x-javascript");
        sMimeType.put(".movie", "video/x-sgi-movie");
        sMimeType.put(".mp1", "audio/mp1");
        sMimeType.put(".mp2", "audio/mp2");
        sMimeType.put(".mp2v", "video/mpeg");
        sMimeType.put(".mp3", "audio/mp3");
        sMimeType.put(".mp4", "video/mpeg4");
        sMimeType.put(".mpa", "video/x-mpg");
        sMimeType.put(".mpd", "application/vnd.ms-project");
        sMimeType.put(".mpe", "video/x-mpeg");
        sMimeType.put(".mpeg", "video/mpg");
        sMimeType.put(".mpg", "video/mpg");
        sMimeType.put(".mpga", "audio/rn-mpeg");
        sMimeType.put(".mpp", "application/vnd.ms-project");
        sMimeType.put(".mps", "video/x-mpeg");
        sMimeType.put(".mpt", "application/vnd.ms-project");
        sMimeType.put(".mpv", "video/mpg");
        sMimeType.put(".mpv2", "video/mpeg");
        sMimeType.put(".mpw", "application/vnd.ms-project");
        sMimeType.put(".mpx", "application/vnd.ms-project");
        sMimeType.put(".mtx", "text/xml");
        sMimeType.put(".mxp", "application/x-mmxp");
        sMimeType.put(".net", "image/pnetvue");
        sMimeType.put(".nrf", "application/x-nrf");
        sMimeType.put(".nws", "message/rfc822");
        sMimeType.put(".odc", "text/x-ms-odc");
        sMimeType.put(".out", "application/x-out");
        sMimeType.put(".p10", "application/pkcs10");
        sMimeType.put(".p12", "application/x-pkcs12");
        sMimeType.put(".p7b", "application/x-pkcs7-certificates");
        sMimeType.put(".p7c", "application/pkcs7-mime");
        sMimeType.put(".p7m", "application/pkcs7-mime");
        sMimeType.put(".p7r", "application/x-pkcs7-certreqresp");
        sMimeType.put(".p7s", "application/pkcs7-signature");
        sMimeType.put(".pc5", "application/x-pc5");
        sMimeType.put(".pci", "application/x-pci");
        sMimeType.put(".pcl", "application/x-pcl");
        sMimeType.put(".pcx", "application/x-pcx");
        sMimeType.put(".pdf", "application/pdf");
        sMimeType.put(".pdf", "application/pdf");
        sMimeType.put(".pdx", "application/vnd.adobe.pdx");
        sMimeType.put(".pfx", "application/x-pkcs12");
        sMimeType.put(".pgl", "application/x-pgl");
        sMimeType.put(".pic", "application/x-pic");
        sMimeType.put(".pko", "application/vnd.ms-pki.pko");
        sMimeType.put(".pl", "application/x-perl");
        sMimeType.put(".plg", "text/html");
        sMimeType.put(".pls", "audio/scpls");
        sMimeType.put(".plt", "application/x-plt");
        sMimeType.put(".png", "image/png");
        sMimeType.put(".png", "application/x-png");
        sMimeType.put(".pot", "application/vnd.ms-powerpoint");
        sMimeType.put(".ppa", "application/vnd.ms-powerpoint");
        sMimeType.put(".ppm", "application/x-ppm");
        sMimeType.put(".pps", "application/vnd.ms-powerpoint");
        sMimeType.put(".ppt", "application/vnd.ms-powerpoint");
        sMimeType.put(".ppt", "application/x-ppt");
        sMimeType.put(".pr", "application/x-pr");
        sMimeType.put(".prf", "application/pics-rules");
        sMimeType.put(".prn", "application/x-prn");
        sMimeType.put(".prt", "application/x-prt");
        sMimeType.put(".ps", "application/x-ps");
        sMimeType.put(".ps", "application/postscript");
        sMimeType.put(".ptn", "application/x-ptn");
        sMimeType.put(".pwz", "application/vnd.ms-powerpoint");
        sMimeType.put(".r3t", "text/vnd.rn-realtext3d");
        sMimeType.put(".ra", "audio/vnd.rn-realaudio");
        sMimeType.put(".ram", "audio/x-pn-realaudio");
        sMimeType.put(".ras", "application/x-ras");
        sMimeType.put(".rat", "application/rat-file");
        sMimeType.put(".rdf", "text/xml");
        sMimeType.put(".rec", "application/vnd.rn-recording");
        sMimeType.put(".red", "application/x-red");
        sMimeType.put(".rgb", "application/x-rgb");
        sMimeType.put(".rjs", "application/vnd.rn-realsystem-rjs");
        sMimeType.put(".rjt", "application/vnd.rn-realsystem-rjt");
        sMimeType.put(".rlc", "application/x-rlc");
        sMimeType.put(".rle", "application/x-rle");
        sMimeType.put(".rm", "application/vnd.rn-realmedia");
        sMimeType.put(".rmf", "application/vnd.adobe.rmf");
        sMimeType.put(".rmi", "audio/mid");
        sMimeType.put(".rmj", "application/vnd.rn-realsystem-rmj");
        sMimeType.put(".rmm", "audio/x-pn-realaudio");
        sMimeType.put(".rmp", "application/vnd.rn-rn_music_package");
        sMimeType.put(".rms", "application/vnd.rn-realmedia-secure");
        sMimeType.put(".rmvb", "application/vnd.rn-realmedia-vbr");
        sMimeType.put(".rmx", "application/vnd.rn-realsystem-rmx");
        sMimeType.put(".rnx", "application/vnd.rn-realplayer");
        sMimeType.put(".rp", "image/vnd.rn-realpix");
        sMimeType.put(".rpm", "audio/x-pn-realaudio-plugin");
        sMimeType.put(".rsml", "application/vnd.rn-rsml");
        sMimeType.put(".rt", "text/vnd.rn-realtext");
        sMimeType.put(".rtf", "application/msword");
        sMimeType.put(".rtf", "application/x-rtf");
        sMimeType.put(".rv", "video/vnd.rn-realvideo");
        sMimeType.put(".sam", "application/x-sam");
        sMimeType.put(".sat", "application/x-sat");
        sMimeType.put(".sdp", "application/sdp");
        sMimeType.put(".sdw", "application/x-sdw");
        sMimeType.put(".sit", "application/x-stuffit");
        sMimeType.put(".slb", "application/x-slb");
        sMimeType.put(".sld", "application/x-sld");
        sMimeType.put(".slk", "drawing/x-slk");
        sMimeType.put(".smi", "application/smil");
        sMimeType.put(".smil", "application/smil");
        sMimeType.put(".smk", "application/x-smk");
        sMimeType.put(".snd", "audio/basic");
        sMimeType.put(".sol", "text/plain");
        sMimeType.put(".sor", "text/plain");
        sMimeType.put(".spc", "application/x-pkcs7-certificates");
        sMimeType.put(".spl", "application/futuresplash");
        sMimeType.put(".spp", "text/xml");
        sMimeType.put(".ssm", "application/streamingmedia");
        sMimeType.put(".sst", "application/vnd.ms-pki.certstore");
        sMimeType.put(".stl", "application/vnd.ms-pki.stl");
        sMimeType.put(".stm", "text/html");
        sMimeType.put(".sty", "application/x-sty");
        sMimeType.put(".svg", "text/xml");
        sMimeType.put(".swf", "application/x-shockwave-flash");
        sMimeType.put(".tdf", "application/x-tdf");
        sMimeType.put(".tg4", "application/x-tg4");
        sMimeType.put(".tga", "application/x-tga");
        sMimeType.put(".tif", "image/tiff");
        sMimeType.put(".tif", "application/x-tif");
        sMimeType.put(".tiff", "image/tiff");
        sMimeType.put(".tld", "text/xml");
        sMimeType.put(".top", "drawing/x-top");
        sMimeType.put(".torrent", "application/x-bittorrent");
        sMimeType.put(".tsd", "text/xml");
        sMimeType.put(".txt", "text/plain");
        sMimeType.put(".uin", "application/x-icq");
        sMimeType.put(".uls", "text/iuls");
        sMimeType.put(".vcf", "text/x-vcard");
        sMimeType.put(".vda", "application/x-vda");
        sMimeType.put(".vdx", "application/vnd.visio");
        sMimeType.put(".vml", "text/xml");
        sMimeType.put(".vpg", "application/x-vpeg005");
        sMimeType.put(".vsd", "application/vnd.visio");
        sMimeType.put(".vsd", "application/x-vsd");
        sMimeType.put(".vss", "application/vnd.visio");
        sMimeType.put(".vst", "application/vnd.visio");
        sMimeType.put(".vst", "application/x-vst");
        sMimeType.put(".vsw", "application/vnd.visio");
        sMimeType.put(".vsx", "application/vnd.visio");
        sMimeType.put(".vtx", "application/vnd.visio");
        sMimeType.put(".vxml", "text/xml");
        sMimeType.put(".wav", "audio/wav");
        sMimeType.put(".wax", "audio/x-ms-wax");
        sMimeType.put(".wb1", "application/x-wb1");
        sMimeType.put(".wb2", "application/x-wb2");
        sMimeType.put(".wb3", "application/x-wb3");
        sMimeType.put(".wbmp", "image/vnd.wap.wbmp");
        sMimeType.put(".wiz", "application/msword");
        sMimeType.put(".wk3", "application/x-wk3");
        sMimeType.put(".wk4", "application/x-wk4");
        sMimeType.put(".wkq", "application/x-wkq");
        sMimeType.put(".wks", "application/x-wks");
        sMimeType.put(".wm", "video/x-ms-wm");
        sMimeType.put(".wma", "audio/x-ms-wma");
        sMimeType.put(".wmd", "application/x-ms-wmd");
        sMimeType.put(".wmf", "application/x-wmf");
        sMimeType.put(".wml", "text/vnd.wap.wml");
        sMimeType.put(".wmv", "video/x-ms-wmv");
        sMimeType.put(".wmx", "video/x-ms-wmx");
        sMimeType.put(".wmz", "application/x-ms-wmz");
        sMimeType.put(".wp6", "application/x-wp6");
        sMimeType.put(".wpd", "application/x-wpd");
        sMimeType.put(".wpg", "application/x-wpg");
        sMimeType.put(".wpl", "application/vnd.ms-wpl");
        sMimeType.put(".wq1", "application/x-wq1");
        sMimeType.put(".wr1", "application/x-wr1");
        sMimeType.put(".wri", "application/x-wri");
        sMimeType.put(".wrk", "application/x-wrk");
        sMimeType.put(".ws", "application/x-ws");
        sMimeType.put(".ws2", "application/x-ws");
        sMimeType.put(".wsc", "text/scriptlet");
        sMimeType.put(".wsdl", "text/xml");
        sMimeType.put(".wvx", "video/x-ms-wvx");
        sMimeType.put(".xdp", "application/vnd.adobe.xdp");
        sMimeType.put(".xdr", "text/xml");
        sMimeType.put(".xfd", "application/vnd.adobe.xfd");
        sMimeType.put(".xfdf", "application/vnd.adobe.xfdf");
        sMimeType.put(".xhtml", "text/html");
        sMimeType.put(".xls", "application/vnd.ms-excel");
        sMimeType.put(".xls", "application/x-xls");
        sMimeType.put(".xlw", "application/x-xlw");
        sMimeType.put(".xml", "text/xml");
        sMimeType.put(".xpl", "audio/scpls");
        sMimeType.put(".xq", "text/xml");
        sMimeType.put(".xql", "text/xml");
        sMimeType.put(".xquery", "text/xml");
        sMimeType.put(".xsd", "text/xml");
        sMimeType.put(".xsl", "text/xml");
        sMimeType.put(".xslt", "text/xml");
        sMimeType.put(".xwd", "application/x-xwd");
        sMimeType.put(".x_b", "application/x-x_b");
        sMimeType.put(".sis", "application/vnd.symbian.install");
        sMimeType.put(".sisx", "application/vnd.symbian.install");
        sMimeType.put(".x_t", "application/x-x_t");
        sMimeType.put(".ipa", "application/vnd.iphone");
        sMimeType.put(".apk", "application/vnd.android.package-archive");
        sMimeType.put(".xap", "application/x-silverlight-app");
    }

    public static String getMimeType(File file) {
        String fileName = file.getName();
        int lastIndexOf = fileName.lastIndexOf(".");
        if (lastIndexOf > -1) {
            String type = sMimeType.get(fileName.substring(lastIndexOf));
            if (type != null) {
                return type;
            }
        }
        return DEFAULT_TYPE;
    }
}
