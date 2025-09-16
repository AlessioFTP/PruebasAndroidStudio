package com.example.pruebasandroidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebasandroidstudio.ui.theme.PruebasAndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebasAndroidStudioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingText(
                        name = "Angie",
                        from ="Nicolas",
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "Hola $name!, estás invitada a mi cumpleaños",
            fontSize = 36.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
        )

        Text(
            text = "De $from",
            fontSize = 26.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .align(alignment = androidx.compose.ui.Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    PruebasAndroidStudioTheme {
        GreetingText("Angie", "Nicolas")
    }
}




