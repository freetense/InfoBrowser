package sample;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.concurrent.Worker;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.PopupFeatures;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Screen;
import javafx.stage.WindowEvent;
import javafx.util.Callback;
import net.sf.image4j.codec.ico.ICODecoder;
import net.sf.image4j.codec.ico.ICOImage;
import netscape.javascript.JSException;

import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


public class Controller {
    public static double informfxy;
    public static String favIconFullURL;
    public static  Socket socket;
    public static int i = 3;
    public static int s = 3;
    public static int m = 3;
    public static double xOffset;
    public static double yOffset;
    public static URLConnection conn = null;
    @FXML
    private TabPane asas;
    private Tab tabs = new Tab();

    @FXML
    private Button buttonall;
    @FXML
    private BorderPane taktak;
    @FXML
    private BorderPane ind;
    @FXML
    private Button exits12;
    @FXML
    private TextField textfil1;
    @FXML
    private Button gida;
    @FXML
    private Button update1;
    @FXML
    private Button  backs;
    @FXML
    private Button  forwards;
    public static String f[] = new String[1000];
    public static int end;
    public static int ff;
    public static String ia;
    public static String ia1;
    public static String loc;
    public static Socket clientSocket;
    public static String styleSt =  "tabone";
    private BorderPane taktak1[] = new BorderPane[1000];
    public static WebView webView[]  = new WebView[1000];
    public static String it[] = new String[1000];
    public static ImageView facIconImageView[] = new ImageView[1000];
    public static int idpage = 0;
    public static int fa = 2;
    public static String ge = "";
    WebEngine en;
    Tab tab[] = new Tab[1000];
    public static int ids =  0;
    public static List<BufferedImage> images;
    public static HttpURLConnection httpcon;
    public static String title = "";
    public static int ha = 2;
    public static int ha1 = 2;
    public static int back = 2;
    public static int forw = 2;
    public static int id;
    public static String sys[] = new String[1000];
    public static String off;
    public static int g;
    public static String[] infodns = { ".academy", ".accountant", ".accountants", ".active", ".actor", ".adult", ".aero", ".agency", ".agency", ".apartments", ".app",
            ".archi", ".army", ".associates", ".asia", ".attorney", ".auction", ".audio",
            ".autos", ".biz", ".cat", ".com", ".coop", ".dance", ".edu", ".eus", ".gov", ".info", ".int", ".jobs", ".mil", ".mobi", ".museum", ".name", ".net", ".one",
            ".ong", ".onl", ".online", ".ooo",
            ".org", ".organic", ".partners", ".parts", ".pharmacy", ".party", ".photo", ".photography", ".photos", ".physio", ".pics", ".pictures", ".feedback", ".pink",
            ".pizza", ".place", ".plumbing",
            ".plus", ".poker", ".porn", ".post", ".press", ".pro", ".productions", ".prof", ".properties", ".property", ".qpon", ".racing", ".recipes", ".red", ".rehab",
            ".ren", ".rent", ".rentals", ".repair",
            ".report", ".republican", ".rest", ".review", ".reviews", ".rich", ".site", ".tel", ".travel", ".xxx", ".xyz", ".yoga", ".zone", ".ninja", ".art", ".moe",
            ".ac", ".ad", ".ae", ".af", ".ag", ".ai", ".al",
            ".am", ".an", ".ao", ".aq", ".ar", ".as", ".at", ".au", ".aw", ".ax", ".az", ".ba", ".bb", ".bd", ".be", ".bf", ".bg", ".bh", ".bi", ".bj", ".bm", ".bn", ".bo", ".br",
            ".bs", ".bt", ".bv", ".bw", ".by", ".бел", ".bz",
            ".ca", ".cc", ".cd", ".cf", ".cg", ".ch", ".ci", ".ck", ".cl", ".cm", ".cn", ".co", ".cr", ".cu", ".cv", ".cx", ".cy", ".cz", ".dd", ".de", ".dj", ".dk", ".dm",
            ".do", ".dz", ".ec", ".ee", ".eg", ".er", ".es", ".et",
            ".eu", ".fi", ".fj", ".fk", ".fm", ".fo", ".fr", ".ga", ".gb", ".gd", ".ge", ".gf", ".gg", ".gh", ".gi", ".gl", ".gm", ".gn", ".gp", ".gq", ".gr", ".gs", ".gt",
            ".gu", ".gw", ".gy", ".hk", ".hm", ".hn", ".hr", ".ht",
            ".hu", ".id", ".ie", ".il", ".im", ".in", ".io", ".iq", ".ir", ".is", ".it", ".je", ".jm", ".jo", ".jp", ".ke", ".kg", ".kh", ".ki", ".km", ".kn", ".kp", ".kr",
            ".krd", ".kw", ".ky", ".kz", ".la", ".lb", ".lc", ".li",
            ".lk", ".lr", ".ls", ".lt", ".lu", ".lv", ".ly", ".ma", ".mc", ".md", ".me", ".mg", ".mh", ".mk", ".ml", ".mm", ".mn", ".мон", ".mo", ".mp", ".mq", ".mr", ".ms",
            ".mt", ".mu", ".mv", ".mw", ".mx", ".my", ".mz", ".na",
            ".nc", ".ne", ".nf", ".ng", ".ni", ".nl", ".no", ".np", ".nr", ".nu", ".nz", ".om", ".pa", ".pe", ".pf", ".pg", ".ph", ".pk", ".pl", ".pm", ".pn", ".pr", ".ps",
            ".pt", ".pw", ".py", ".qa", ".re", ".ro", ".rs", ".срб",
            ".ru", ".рф", ".rw", ".sa", ".sb", ".sc", ".sd", ".se", ".sg", ".sh", ".si", ".sj", ".sk", ".sl", ".sm", ".sn", ".so", ".sr", ".st", ".su", ".sv", ".sy", ".sz",
            ".tc", ".td", ".tf", ".tg", ".th", ".tj", ".tk", ".tl",
            ".tm", ".tn", ".to", ".tp", ".tr", ".tt", ".tv", ".tw", ".tz", ".ua", ".укр", ".ug", ".uk", ".us", ".uy", ".uz", ".va", ".vc", ".ve", ".vg", ".vi", ".vn", ".vu",
            ".wf", ".ws", ".ye", ".yt", ".za", ".zm", ".zw",
            "xn--lgbbat1ad8j", "xn--90ais", "xn--fiqs8s", "xn--fiqz9s", "xn--wgbh1c", "xn--j6w193g", "xn--h2brj9c", "xn--mgbbh1a71e", "xn--fpcrj9c3d", "xn--gecrj9c", "xn--s9brj9c",
            "xn--xkc2dl3a5ee0h",
            "xn--45brj9c", "xn--mgba3a4f16a", "xn--mgbayh7gpa", "xn--mgbc0a9azcg", "xn--ygbi2ammx", "xn--wgbl6a", "xn--p1ai", "xn--mgberp4a5d4ar", "xn--90a3ac", "xn--yfro4i67o",
            "xn--clchc0ea0b2g2a9gcd",
            "xn--3e0b707e", "xn--fzc2c9e2c", "xn--xkc2al3hye2a", "xn--ogbpf8fl", "xn--kprw13d", "xn--kpry57d", "xn--o3cw4h", "xn--pgbs0dh", "xn--j1amh", "xn--mgbaam7a8h",
            "xn--54b7fta0cc", "xn--90ae",
            "xn--node", "xn--4dbrk0ce", "xn--mgb9awbf", "xn--mgbai9azgqp6j", "xn--mgb2ddes", "xn--kgbechtv", "xn--hgbk6aj7f53bba", "xn--0zwm56d", "xn--g6w251d", "xn--80akhbyknj4f",
            "xn--11b5bs3a9aj6g",
            "xn--jxalpdlp", "xn--9t4b11yi5a", "xn--deba0ad","xn--zckzah", "xn--hlcj6aya9esc7a", ".arpa"};
    @FXML
    public void onClickMethod(){
        Main main = new Main();
        main.window.setIconified(true);
    }
    @FXML
    public void upd(){
        webView[idpage].getEngine().reload();
    }
    @FXML
    public void initialize() throws IOException {

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        textfil1.setPrefWidth(bounds.getWidth() - 306);
        informfxy = bounds.getWidth()-339;
        asas.getTabs().clear();
        fa = 2;
        createAndAddNewTab("https://google.ru");
        idpage = 1;
        asas.getSelectionModel().selectedItemProperty().addListener((obs,ov,nv)->{
          System.out.println(nv.getId());
            idpage = Integer.parseInt(nv.getId());
                    ind.setCenter(taktak1[Integer.parseInt(nv.getId())]);
            textfil1.setText(it[Integer.parseInt(nv.getId())]);
            hez();





        });

    }

    public void goBack()
    {
        final WebHistory history = webView[idpage].getEngine().getHistory();
        ObservableList<WebHistory.Entry> entryList = history.getEntries();
        int currentIndex = history.getCurrentIndex();

        Platform.runLater(() ->
        {
            history.go(entryList.size() > 1
                    && currentIndex > 0
                    ? -1
                    : 0);

        });
        System.out.println("так "+currentIndex);
        if((entryList.size() > 1)
                && (currentIndex > 1)){
            System.out.println("так1 "+currentIndex);
            forwards.getStyleClass().remove("right2");
            backs.getStyleClass().remove("left2");

        }else{
            forwards.getStyleClass().remove("right2");
            backs.getStyleClass().add("left2");
            System.out.println("так2 "+currentIndex);

        }
    }

    public void goForward()
    {
        final WebHistory history = webView[idpage].getEngine().getHistory();
        ObservableList<WebHistory.Entry> entryList = history.getEntries();
        int currentIndex = history.getCurrentIndex();

        Platform.runLater(() ->
        {
            history.go(entryList.size() > 1
                    && currentIndex < entryList.size() - 1
                    ? 1
                    : 0);
        });
        if((entryList.size() > 1)
                && (currentIndex < entryList.size() - 1)){

                System.out.println("так1к "+currentIndex);
            forwards.getStyleClass().remove("right2");
            backs.getStyleClass().remove("left2");


            }else{
            forwards.getStyleClass().add("right2");
            backs.getStyleClass().remove("left2");
            System.out.println("так2к "+currentIndex);

            }
    }
    @FXML
    public void keyHandler(javafx.scene.input.KeyEvent keyEvent) {
        if (keyEvent.getCode()== KeyCode.ENTER) {
            webView[idpage].getEngine().load("about:blank");
            ha = 2;
            ha1 = 2;
            String Urlget = textfil1.getText();
            String newStr2  = Urlget.substring(Urlget.length() - 1);
            if(newStr2.equals("/")){
                ha = 3;
                System.out.println(1);
                intor(Urlget);
                intor1(Urlget);
            }
            intor(Urlget);
            intor1(Urlget);
            for(int i = 0;i<infodns.length;i++) {
                int newStr3 = Urlget.indexOf(infodns[i]);
                if ((newStr3 != -1)&&((Urlget.length()-infodns[i].length()) == newStr3)) {
                    ha = 3;
                    System.out.println(newStr3);
                    intor(Urlget);
                    intor1(Urlget);
                }
            }
            for(int i = 0;i<infodns.length;i++) {
                int newStr4 = Urlget.indexOf(infodns[i]+"/");
                if (newStr4 != -1) {
                    System.out.println(newStr4+"sad");
                    ha = 3;
                    intor(Urlget);
                    intor1(Urlget);
                }
            }

            if(ha == 2) {
                webView[idpage].getEngine().load("https://google.ru//search?q="+Urlget);
            }else{
                if(ha1 == 2){
                    Urlget = "http://"+Urlget;
                }
                webView[idpage].getEngine().load(Urlget);
            }
           //
        }
    }
    public void intor(String Urlget){
        if(Urlget.length() >= 8) {
            String new1 = Urlget.substring(0, 8);
            if (new1.equals("https://")) {
                System.out.println(4);
                ha = 3;
                ha1 = 3;
            }
        }
    }

    public void intor1(String Urlget){
        if(Urlget.length() >= 7) {
            String new2 = Urlget.substring(0, 7);
            if (new2.equals("http://")) {
                System.out.println(5);
                ha = 3;
                ha1 = 3;
            }
        }
    }
    public void hez(){

        final WebHistory history = webView[idpage].getEngine().getHistory();
        ObservableList<WebHistory.Entry> entryList = history.getEntries();
        int currentIndex = history.getCurrentIndex();
System.out.println(" что это -  "+currentIndex);
        if((entryList.size() > 1)
                && (currentIndex > 1)){
            System.out.println("так1 "+currentIndex);
            forwards.getStyleClass().remove("right2");
            backs.getStyleClass().remove("left2");

        }else{
            System.out.println("так11 "+currentIndex);
                forwards.getStyleClass().remove("right2");
                backs.getStyleClass().add("left2");
        }

        if((entryList.size() > 1)
                && (currentIndex < entryList.size() - 1)){

            System.out.println("так1к "+currentIndex);
            forwards.getStyleClass().remove("right2");
            backs.getStyleClass().remove("left2");


        }else{
            System.out.println("так221 "+currentIndex);
            forwards.getStyleClass().add("right2");
            backs.getStyleClass().remove("left2");
        }
    }
    @FXML
    public void  link() {
        createAndAddNewTab("https://google.ru");
        fa = 2;

    }
    public void  linknew(String Site) {
        fa = 3;
        createAndAddNewTab(Site);



    }

    public  synchronized void  createAndAddNewTab(String Site) {
        ff = 100000;
        end++;
        for(int r = 1;r<=ids;r++) {
            if(f[r] == "fdlgdfbghrlktermdladermewfmfdfngkjgndfgdfgrnektndfgmdfgdcvfd"){
                ff = r;
               // System.out.println(123);
            }

        }
        if(ff == 100000) {
           // System.out.println(456);
            ids++;
            ff = ids;
        }
        f[ff] = "2";
        int numTabs = asas.getTabs().size();
        tab[ff] = new Tab();
        tab[ff].getStyleClass().add(styleSt);
        //tab[ids].setText("Новая вкладка");
        tab[ff].setId(String.valueOf(ff));
        asas.getTabs().add(tab[ff]);
        webView[ff] = new WebView();
        webView[ff].getStyleClass().add("mylistview");
        webView[ff].getEngine().setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        webView[ff].getEngine().setJavaScriptEnabled(true);
        String st = Site;
        //webView[ff].getEngine().setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");

        it[ff] = st;
        webView[ff].getEngine().load(st);

        taktak1[ff] = new BorderPane();
        taktak1[ff].setCenter(webView[ff]);

        if(fa == 2) {
            ind.setCenter(taktak1[ff]);
            SingleSelectionModel<Tab> selectionModel = asas.getSelectionModel();
            selectionModel.select(tab[ff]);
        }



        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
       // System.out.println(end);
        if((200*end) >= (informfxy)){
            double j = (informfxy)     /(end);
            asas.setTabMinWidth(j);
            asas.setTabMaxWidth(j);
        }else {

            asas.setTabMinWidth(200);
            asas.setTabMaxWidth(200);
        }

        //asas.getTabs().remove(asas.getSelectionModel().getSelectedItem());


        tab[ff].setOnClosed(new EventHandler<Event>() {
            @Override
            public void handle(Event t) {

                Tab fxTab = (Tab) t.getSource();//get the source of the action...
                        taktak1[Integer.parseInt(fxTab.getId())] = null;
                String st1 = "https://google.ru";
                        webView[Integer.parseInt(fxTab.getId())].getEngine().load("about:blank");
                        it[Integer.parseInt(fxTab.getId())] = null;
                        facIconImageView[Integer.parseInt(fxTab.getId())] = null;
                       f[Integer.parseInt(fxTab.getId())]  = "fdlgdfbghrlktermdladermewfmfdfngkjgndfgdfgrnektndfgmdfgdcvfd";
                id = 3;
                end--;
                if((200*end) >= (informfxy)){
                    double j = (informfxy)     /(end);
                    //asas.setTabMinWidth(j);
                    //asas.setTabMaxWidth(j);
                }else {

                    asas.setTabMinWidth(200);
                    asas.setTabMaxWidth(200);
                }

            }
        });

        // intercept target=_blank hyperlinks
                        // grab the last hyperlink that has :hover pseudoclass
        webView[ff].getEngine().setCreatePopupHandler(
                new Callback<PopupFeatures, WebEngine>() {
                    @Override
                    public WebEngine call(PopupFeatures config) {
                        ge = "2";
                        linknew(it[ff]);
                        info(ff);
                        return webView[ff].getEngine();
                    }

                });
if(ge != "2") {
    info(ff);
}
ge = "3";

    }

        public void   info(int idss){
        off = "false";
            sys[idss] = "";
            ia1  = "";
        System.out.println("+"+idss);

            //if (list.size() > 0)
            //	System.out.println(getHistory().getEntries().get(getHistory().getCurrentIndex()).getUrl());
        webView[idss].getEngine().locationProperty().addListener(new ChangeListener<String>() {

            @Override public void changed(ObservableValue<? extends String> ov, final String oldLoc, final String loc) {
                Platform.runLater(new Runnable() {
                    @Override public void run() {
                        System.out.println(loc+ "111 "+ oldLoc);
                        String html = (String)  webView[idss].getEngine().executeScript("document.documentElement.outerHTML");
                        //System.out.println( html );
                        it[idss] = loc;
                        hez();
                        if(id == 5) {

                            if(fa == 2) {
                                textfil1.setText(it[idss]);
                            }
                            fa = 2;



                        }
                        id = 5;

                        int index1 = it[idss].indexOf("youtube.com");
                        if (index1 > -1) {
                           webView[idss].getEngine().setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:58.0) Gecko/20100101 Firefox/58.0");
                            webView[idss].getEngine().load(it[idss]);

                        }else {
                            int index12 = it[idss].indexOf("mail.google.com");
                            if (index12 > -1) {
                               webView[idss].getEngine().setUserAgent("Mozilla/5.0");
                               // webView[idss].getEngine().load(it[idss]);

                            }else {
                               webView[idss].getEngine().setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
                                webView[idss].getEngine().getLoadWorker().workDoneProperty().addListener((observable, oldState, newState) -> {
                                    infourl(idss);


                                });
                                String str = oldLoc.replace("https://", "");
                                String[] subStr;
                                String delimeter = "/";
                                subStr = str.split(delimeter);
                                String str1 = loc.replace("https://", "");
                                String[] subStr1;
                                String delimeter1 = "/";
                                subStr1 = str1.split(delimeter1);


                                //System.out.println("0https:// "+subStr[0] + " " + "0https:// "+subStr1[0]);
                                if (subStr[0].equals(subStr1[0])) {
                                    int index123 = it[idss].indexOf("vk.com");
                                    if (index123 > -1) {
                                    g = 2;
                                    }else{
                                        g = 3;
                                    }

                                        infourlfalse(idss);



                                    System.out.println(off);
                                }
                            }
                        }
                    }


                });
            }

        });



    }



    public void infourlfalse(int idss){
/*
if(g == 2) {
    try {
        Thread.sleep(1100);
    } catch (InterruptedException e) {
    }
}
*/
        Document doc1 = null;
        try {
            doc1 = Jsoup.connect(it[idss]+"?ico").get();
        } catch (IOException e) {
        }
        //разный код


    //String html = (String) webView[idss].getEngine().executeScript("document.documentElement.outerHTML");
                                // System.out.println(html);
                                title = "";
                                //ex.printStackTrace()
                               // facIconImageView[idss].setImage(null);


                                Elements imports = doc1.select("link[rel]");
                                title = doc1.title();
                                System.out.println(title);

                                //System.out.println(imports.size());
                                for (Element link : imports) {
                                    //ystem.out.println(link.attr("abs:href"));
                                    if (link.attr("rel").equals("shortcut icon")) {
                                        try {

                                            favIconFullURL = link.attr("abs:href");

                                        } catch (Exception ea) {
                                           // ea.printStackTrace();
                                            favIconFullURL = "";
                                        }


                                        Image images = new Image(favIconFullURL);
                                        facIconImageView[idss] = new ImageView();
                                        facIconImageView[idss].setFitWidth(16);
                                        facIconImageView[idss].setFitHeight(16);
                                        facIconImageView[idss].setImage(images);

                                        facIconImageView[idss].setSmooth(true);
                                    }
                                }

                                tab[idss].setGraphic(facIconImageView[idss]);
                                tab[idss].setText(String.valueOf(title));



    }


    public void infourl(int idss){



    ia1 = idss+it[idss];

       // System.out.println("ia1 = "+idss+it[idss]);
        //System.out.println("sys = "+sys[idss]);
    if ((!ia1.equals(sys[idss]))) {

        sys[idss] = idss+it[idss];
        System.out.println(sys[idss]);
           // System.out.println(ia1);

            try {
                if ("about:blank".equals(it[idss]))
                    return;

                //Determine the full url
                //String favIconFullURL = getHostName(webView[id].getEngine().getLocation()) + "favicon.ico";
                try {

                    URL url = new URL(it[idss]);

                    favIconFullURL = url.getProtocol() + "://" + url.getHost() + "/" + "favicon.ico";
                    ;
                } catch (Exception e) {
                //    e.printStackTrace();
                    String favIconFullURL = "";
                }
                //System.out.println(favIconFullURL)

                //Create HttpURLConnection
                httpcon = (HttpURLConnection) new URL(favIconFullURL).openConnection();
                httpcon.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
                List<BufferedImage> image = ICODecoder.read(httpcon.getInputStream());

                //Set the favicon
                facIconImageView[idss] = new ImageView();
                facIconImageView[idss].setImage(SwingFXUtils.toFXImage(image.get(0), null));
                facIconImageView[idss].setFitWidth(17);
                facIconImageView[idss].setFitHeight(17);
                facIconImageView[idss].setSmooth(true);
            } catch (Exception ex) {
                //ex.printStackTrace()
               // facIconImageView[idss].setImage(null);
                Document doc = null;
                try {
                    doc = Jsoup.connect(it[idss]+"?ico").get();
                } catch (IOException e) {
                //    e.printStackTrace();
                }
                try{

                    Elements imports = doc.select("link[rel]");
                    title = doc.title();

                    //System.out.println(imports.size());
                    for (Element link : imports) {
                        if(link.attr("rel").equals("shortcut icon")) {
                            try {

                                favIconFullURL = link.attr("abs:href");

                            } catch (Exception e) {
                           //     e.printStackTrace();
                                String favIconFullURL = "";
                            }

                            //  System.out.println(favIconFullURL+link.attr("abs:href"));


                            Image images = new Image(favIconFullURL);
                            facIconImageView[idss] = new ImageView();
                            facIconImageView[idss].setFitWidth(17);
                            facIconImageView[idss].setFitHeight(17);
                            facIconImageView[idss].setImage(images);

                            facIconImageView[idss].setSmooth(true);
                        }
                    }

                }catch (Exception ex1) {
                    // System.out.println("sdf");
                    facIconImageView[idss].setImage(null);
                }
            }             //   System.out.println(webView[id].getEngine().getTitle());
        }

        if((webView[idss].getEngine().getTitle() != null)){
            off = "true";
            tab[idss].setGraphic(facIconImageView[idss]);
            tab[idss].setText(String.valueOf(webView[idss].getEngine().getTitle()));

        }


}
    @FXML
    public void cla() {
        webView[idpage].getEngine().load("https://google.ru");
    }

    @FXML
    public void os1() {
        if(m == 3) {
            gida.setStyle("-fx-graphic: url(img/gid.png);");
        }
    }
    @FXML
    public void os2() {
        if(m == 3) {
            gida.setStyle("-fx-graphic: url(img/gid1.png);");
        }
    }
    @FXML
    public void op() {
    if(m == 3){
        gida.setStyle("-fx-graphic: url(img/gid.png);");
        m = 4;
    }else{
        gida.setStyle("-fx-graphic: url(img/gid1.png);");
        m = 3;
    }

    }
    @FXML
    public void all(){

        if(i == 2) {
            //asas.setStyle("-fx-pref-width: 620px");
            String s = new String("\uD83D\uDDD7");
            buttonall.setText(s);
            Main main = new Main();
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
            main.window.setX(bounds.getMinX());
            main.window.setY(bounds.getMinY());
            asas.setMaxWidth(bounds.getWidth()-239);
            main.window.setWidth(bounds.getWidth());

            main.window.setHeight(bounds.getHeight());
            textfil1.setPrefWidth(bounds.getWidth()-306);
           // tabtab.setStyle(" .tabone { -fx-pref-width: 170px;} .tab-label{ -fx-pref-width: 140px; }");
            i = 3;
            informfxy = bounds.getWidth()-339;
            if((200*end) >= (informfxy)){
                double j = (informfxy)     /(end);
                asas.setTabMinWidth(j);
                asas.setTabMaxWidth(j);
            }else {

                asas.setTabMinWidth(200);
                asas.setTabMaxWidth(200);
            }
        }else{
            String s = new String("\uD83D\uDDD6");
            buttonall.setText(s);
            Main main = new Main();
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
            main.window.setX(bounds.getMinX()+100);
            main.window.setY(bounds.getMinY()+50);
            asas.setMaxWidth(bounds.getWidth()- 439);
            main.window.setWidth(bounds.getWidth()-200);
            main.window.setHeight(bounds.getHeight()-200);
            textfil1.setPrefWidth(bounds.getWidth()-306);
            i = 2;
            informfxy = bounds.getWidth()-539;
            if((200*end) >= (informfxy)){
                double j = (informfxy)     /(end);
                asas.setTabMinWidth(j);
                asas.setTabMaxWidth(j);
            }else {

                asas.setTabMinWidth(200);
                asas.setTabMaxWidth(200);
            }
        }


    }
    public void ex() {

                System.exit(0);
    }
    public void onClickPr() {

        taktak.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        asas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
    }
    public void onClickDr(){

        if(xOffset  != 0) {
            Main main = new Main();
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
             if(i == 3){
                 xOffset = xOffset-200;
                 yOffset = yOffset;
                 String s = new String("\uD83D\uDDD6");
                 buttonall.setText(s);
                 i= 2;
             }
            informfxy = bounds.getWidth()-479;
            if((200*end) >= (informfxy)){
                double j = (informfxy)     /(end);
                asas.setTabMinWidth(j);
                asas.setTabMaxWidth(j);
            }else {

                asas.setTabMinWidth(200);
                asas.setTabMaxWidth(200);
            }
            main.window.setWidth(bounds.getWidth()-200);
            main.window.setHeight(bounds.getHeight()-200);
            com.sun.glass.ui.Robot robot =
                    com.sun.glass.ui.Application.GetApplication().createRobot();
            main.window.setX(robot.getMouseX() - xOffset);
            main.window.setY(robot.getMouseY() - yOffset);
        }
    }




}