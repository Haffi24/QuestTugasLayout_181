package com.example.questtugaslayout_181

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.questtugaslayout_181.ui.theme.QuestTugasLayout_181Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.app_bg)
                ) {
                    MainScreen()
                }
            }
        }
    }
}


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = stringResource(id = R.string.title_prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )

        Text(
            text = stringResource(id = R.string.title_univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )

        Spacer(modifier = Modifier.height(24.dp))

        StudentCard(
            nameRes = R.string.nama_1,
            phoneRes = null,
            addressRes = R.string.alamat_1,
            bgColorRes = R.color.card_bg_1,
            addressColorRes = R.color.text_yellow,
            isCursive = true
        )

        StudentCard(
            nameRes = R.string.nama_2,
            phoneRes = R.string.no_hp_2,
            addressRes = R.string.alamat_2,
            bgColorRes = R.color.card_bg_2,
            addressColorRes = R.color.text_yellow,
            isCursive = false
        )

        StudentCard(
            nameRes = R.string.nama_3,
            phoneRes = R.string.no_hp_3,
            addressRes = R.string.alamat_3,
            bgColorRes = R.color.card_bg_3,
            addressColorRes = R.color.text_white,
            isCursive = false
        )

        StudentCard(
            nameRes = R.string.nama_4,
            phoneRes = R.string.no_hp_4,
            addressRes = R.string.alamat_4,
            bgColorRes = R.color.card_bg_4,
            addressColorRes = R.color.text_white,
            isCursive = false
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 12.sp,
            color = colorResource(id = R.color.text_black)
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}
}





@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestTugasLayout_181Theme {
        Greeting("Android")
    }
}