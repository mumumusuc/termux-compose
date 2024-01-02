import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        title = "KotlinProject",
        state = rememberWindowState(placement=WindowPlacement.Fullscreen),
        resizable = false,
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}
