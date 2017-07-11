// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS
fun foo() {

}

fun box(): String {
    (::foo)()
    return "OK"
}
