import Pages.page1
import Pages.page2
import com.github.shortFramework.Application
import com.github.shortFramework.PageFactory
import com.github.shortFramework.aggregatePages
import com.github.shortFramework.getPages
import com.github.shortFramework.html.base.element.Tag
import diff.markTextDiff2
import kotlin.reflect.jvm.javaMethod
import kotlin.test.Test

class PageAggregatorTests {

    private fun String.normalize() = this.replace("\r", "")

    @Test
    fun `get pages with no input`() {
        val pages = getPages(emptyList())
        assert(pages.isEmpty())
    }

    @Test
    fun `get pages with one input`() {
        val pages = getPages(listOf("Pages.Page1Kt"))
        assert(pages.size == 1)
    }

    @Test
    fun `get pages with two inputs`() {
        val pages = getPages(listOf("Pages.Page1Kt", "Pages.Page2Kt"))
        assert(pages.size == 2)
    }

    @Test
    fun `aggregate pages with no input`() {
        val application = Application(emptyArray())
        val htmlPage = aggregatePages(application, emptyList())
        val expectedPath = "expected/PageAggregatorTests/NoInput.html"
        val expectedResult = ClassLoader.getSystemResource(expectedPath).readText().normalize()
        val actualResult = htmlPage.toHtml().normalize()
        println(markTextDiff2(actualResult, expectedResult))
        assert(actualResult == expectedResult)
    }

    @Test
    fun `aggregate pages with one input`() {
        val pages = listOf(Tag::page1.javaMethod as PageFactory)

        val application = Application(emptyArray())
        val htmlPage = aggregatePages(application, pages)
        val expectedPath = "expected/PageAggregatorTests/OneInput.html"
        val expectedResult = ClassLoader.getSystemResource(expectedPath).readText().normalize()
        val actualResult = htmlPage.toHtml().normalize()
        // println(actualResult)
        println(markTextDiff2(actualResult, expectedResult))
        assert(actualResult == expectedResult)
    }

    @Test
    fun `aggregate pages with two inputs`() {
        val pages = listOf(Tag::page1.javaMethod as PageFactory, Tag::page2.javaMethod as PageFactory)

        val application = Application(emptyArray())
        val htmlPage = aggregatePages(application, pages)
        val expectedPath = "expected/PageAggregatorTests/TwoInputs.html"
        val expectedResult = ClassLoader.getSystemResource(expectedPath).readText().normalize()
        val actualResult = htmlPage.toHtml().normalize()
        println(markTextDiff2(actualResult, expectedResult))
        assert(actualResult == expectedResult)
    }
}
