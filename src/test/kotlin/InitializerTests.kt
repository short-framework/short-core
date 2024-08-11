import com.github.shortFramework.Application
import com.github.shortFramework.runSHORT
import kotlin.test.Test

class InitializerTests {

    @Test
    fun `basic initialization`() {
        class WebApp(arguments: Array<String>) : Application(arguments)

        val args = emptyArray<String>()
        runSHORT<WebApp>(args)
    }
}
