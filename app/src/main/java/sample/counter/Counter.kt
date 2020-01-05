package sample.counter
import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Row
import androidx.ui.layout.Spacing
import androidx.ui.material.Button

@Composable
fun Counter() {
    val counter = +state{0}
    Column(Spacing(16.dp)) {
        Container() {
            Row() {
                Button(text = "-", onClick = { counter.value-- })
                Text(text = "count: ${counter.value}", modifier = Spacing(8.dp))
                Button(text = "+", onClick = { counter.value++ })
            }
        }
    }
}