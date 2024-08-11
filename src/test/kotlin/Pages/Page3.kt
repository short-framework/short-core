package Pages

import com.github.shortFramework.Page
import com.github.shortFramework.html.base.Text
import com.github.shortFramework.html.base.element.Tag
import com.github.shortFramework.html.element.Div

@Page("/page3")
fun Tag.page3() = Div { Text("Hello from Page 3.") }
