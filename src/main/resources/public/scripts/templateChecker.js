function checkTemplateSupport() {
    if ("content" in document.createElement("template")) {
        console.log("Templates are supported.")
    }
    else {
        document.getElementById("app").innerHTML = "Your browser does not support templates."
    }
}
checkTemplateSupport()
