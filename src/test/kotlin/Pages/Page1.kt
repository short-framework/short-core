package Pages

import com.github.shortFramework.Page
import com.github.shortFramework.html.base.Text
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.element.Div

@Page("/")
fun Tag.page1() = Div { Text("Hello from Page 1.") }
