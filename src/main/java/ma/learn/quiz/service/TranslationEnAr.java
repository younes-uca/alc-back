package ma.learn.quiz.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TranslationEnAr {
    public String TranslationResult(String texttotranslate) throws IOException {
        Document doc = Jsoup.connect("https://translate.google.com/m?sl=en&tl=ar&hl=en&q=" +texttotranslate).get();
        String result = doc.select("div.result-container").text();
        return result;
    }


    public List<String> synonyme(String word)  throws IOException{
        Document doc = Jsoup.connect("https://www.multitran.com/m.exe?s="+word+"&l1=1&l2=10").get();
        Elements elements = doc.select("td.trans");
        List<String> listesynonymes = new ArrayList<>();
        for (Element e:elements) {
            Elements items = e.select("a");
            for (Element item: items) {
                listesynonymes.add(item.text());
            }
            break;
        }
        return listesynonymes;
    }
}
