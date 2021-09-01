package com.example.jetcomposesmallproject

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetcomposesmallproject.ui.theme.JetComposeSmallProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(Modifier.fillMaxSize().background(Color.Red),horizontalArrangement = Arrangement.SpaceEvenly ) {
                ImageCard(title = "Doggy", painterResource(id = R.drawable.dog))
                ImageCard(title = "android", painterResource(id = R.drawable.android))
            }

        }
    }
}

@Composable
fun ImageCard(title:String, image:Painter, modifier:Modifier = Modifier) {
    Card(
        modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.4f)
            .padding(4.dp),
        shape = RoundedCornerShape(8.dp),

        ) {

        Box(modifier.fillMaxSize()){
            Image(painter = image, contentDescription = "nothing", modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)
        }
        Box(
            modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(Color.Transparent, Color.Black),
                        350f,
                        1000f
                    )
                ))

        Box(modifier.fillMaxSize()){
            Text(text = title,
                modifier
                    .align(Alignment.BottomCenter)
                    .padding(4.dp),
            color = Color.White)
        }

    }

}

