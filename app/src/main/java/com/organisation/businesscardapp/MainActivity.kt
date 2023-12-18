package com.organisation.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.organisation.businesscardapp.ui.theme.BackgroundColor
import com.organisation.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BusinessCardAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = BackgroundColor) { BusinessCard() }
      }
    }
  }
}

@Composable
fun BusinessCard() {
  Text(
      text = "Business Card",
      fontSize = 40.sp,
      fontWeight = FontWeight.ExtraBold,
      color = Color.White,
      textAlign = TextAlign.Center)

  Column(
      modifier = Modifier,
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.profile), contentDescription = null,
            modifier = Modifier.size(150.dp).clip(RectangleShape).border(2.dp, Color.White, RectangleShape))

        Text(
            text = "Ansal Pandey",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White)
        Text(
            text = "Android Developer | PR Manager",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black)
      }
  Column(
      modifier = Modifier.padding(top = 400.dp).padding(bottom = 50.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier.fillMaxWidth().padding(start = 40.dp)) {
          Icon(
              imageVector = Icons.Default.Phone,
              contentDescription = null,
              modifier = Modifier.padding(start = 70.dp).size(32.dp),
              Color.White)
          Text(text = "+91 9897435313",
              modifier = Modifier.padding(start = 10.dp),
              color = Color.White,
              fontWeight = FontWeight.Bold,
              fontSize = 21.sp)
        }

      Row(modifier = Modifier.fillMaxWidth().padding(start = 40.dp)) {
          Icon(
              imageVector = Icons.Default.Share,
              contentDescription = null,
              modifier = Modifier.padding(start = 70.dp).size(32.dp),
              Color.White)
          Text(text = "@ansal_pandey",
              modifier = Modifier.padding(start = 10.dp),
              color = Color.White,
              fontWeight = FontWeight.Bold,
              fontSize = 21.sp)
      }
      Row(modifier = Modifier.fillMaxWidth().padding(start = 40.dp)) {
          Icon(
              imageVector = Icons.Default.Email,
              contentDescription = null,
              modifier = Modifier.padding(start = 70.dp).size(32.dp),
              Color.White)
          Text(text = "pandeyansal77@gmail.com",
              modifier = Modifier.padding(start = 10.dp),
              color = Color.White,
              fontWeight = FontWeight.Bold,
              fontSize = 21.sp)
      }
      }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  BusinessCardAppTheme { BusinessCard() }
}
