package com.conamobile.nuntium.ui.login.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.conamobile.nuntium.R

@Composable
fun OnBoardingScreen(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.BottomCenter) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(modifier = Modifier.height(30.dp))

            Image(painter = painterResource(R.drawable.screen_image), contentDescription = "logo")

            Spacer(modifier = Modifier.height(30.dp))

            Text(text = "First to know", fontWeight = FontWeight.Bold, fontSize = 40.sp)

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "All news in one place, be the first to know last news",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(horizontal = 40.dp))

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate("welcome_screen")
            }, modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(50.dp), shape = RoundedCornerShape(15.dp)) {
                Text(text = "Next", fontFamily = FontFamily.Monospace)
            }

            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}