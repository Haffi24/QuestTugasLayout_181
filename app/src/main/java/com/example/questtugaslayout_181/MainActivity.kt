package com.example.questtugaslayout181

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout_181.R

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

@Composable
fun StudentCard(
    nameRes: Int,
    phoneRes: Int?,
    addressRes: Int,
    bgColorRes: Int,
    addressColorRes: Int,
    isCursive: Boolean
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = bgColorRes)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.logo_desc),
                modifier = Modifier.size(60.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = stringResource(id = nameRes),
                    color = colorResource(id = R.color.text_white),
                    fontSize = 20.sp,
                    fontWeight = if (isCursive) FontWeight.Normal else FontWeight.Bold,
                    fontFamily = if (isCursive) FontFamily.Cursive else FontFamily.Default
                )

                if (phoneRes != null) {
                    Text(
                        text = stringResource(id = phoneRes),
                        color = colorResource(id = R.color.text_cyan),
                        fontSize = 14.sp
                    )
                }

                Text(
                    text = stringResource(id = addressRes),
                    color = colorResource(id = addressColorRes),
                    fontSize = 14.sp
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.logo_desc),
                modifier = Modifier.size(60.dp)
            )
        }
    }
}