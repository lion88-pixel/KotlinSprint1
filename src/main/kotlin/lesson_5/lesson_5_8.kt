package lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {

    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    val newsHeadlines: Elements = doc.select(".sc-2aegk7-2.bzpNIu")
    for (element in newsHeadlines) {
        val quote = element.text().trim()
        println(quote)
        println("---")
    }
}