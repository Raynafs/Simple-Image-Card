package com.example.imagecardtrial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imagecardtrial1.ui.theme.Imagecardtrial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           val painter= painterResource(id = R.drawable.black)
            val title = "She is a black beauty"
            val contentDescription = "She is a black beauty"
            Ic(
                painter = painter ,
                title = title ,
                contentDescription = contentDescription)
                }
            }
        }

@Composable
 fun Ic (
    painter: Painter,
    title:String,
    contentDescription: String,
    modifier: Modifier =Modifier
 )
{
     Card ( modifier = modifier
         .fillMaxWidth(.5f)
         .padding(20.dp),
            shape = RoundedCornerShape(16.dp),
            elevation = 15.dp

             )
     {
         Box ( modifier = Modifier.height(200.dp)
         )
         {
             Image(
                 painter = painter,
                 contentDescription = contentDescription,
                 contentScale = ContentScale.Crop
             )

             Box (
                 modifier = Modifier
                     .fillMaxSize()
                     .padding(15.dp),
                 contentAlignment = Alignment.BottomCenter
                     )
             {
                Text(title, style = TextStyle(color= androidx.compose.ui.graphics.Color.White,fontSize = 16.sp))
             }
             

     }
    
     
     
 }


}

@Preview
@Composable
fun ComposablePreview()
{
    Ic(painter = painterResource(id = R.drawable.black), title = "She is a " , contentDescription = "black" )
}