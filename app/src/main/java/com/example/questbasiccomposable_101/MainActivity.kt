package com.example.questbasiccomposable_101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_101.ui.theme.QuestBasicComposable_101Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_101Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompos(
                        modifier =
                        Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompos(modifier: Modifier = Modifier) {
//Text = "ini adalah text",
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "Login" ,
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
        )
        Text(
            text = "ini adalah halaman login",
            style = TextStyle(
                fontSize = 35.sp,
                color = Color.Black,
            )
        )
        Image(painter = painterResource(id = R.drawable.logobarca),
            contentDescription = null
        ) //atau ""
        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Black,
            )
        )
        Text(
            text = "Mohamad Wahyu Rizki Adnan" ,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.Red,
        )
        Text(
            text = "20220140101" ,
            fontSize = 40.sp,
            color = Color.Black,
        )
    }
