package com.conamobile.nuntium.ui.login.favorite

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.conamobile.nuntium.R
import com.conamobile.nuntium.ui.login.favorite.model.FavoriteModel
import com.conamobile.nuntium.ui.utils.Screen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FavoriteScreen(navController: NavController) {
    val list = ArrayList<FavoriteModel>()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.BottomCenter) {
        Column(verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(20.dp)) {

            Spacer(modifier = Modifier.height(10.dp))

            Text(text = "Select your favorite topics",
                fontWeight = FontWeight.Bold, fontSize = 30.sp, textAlign = TextAlign.Start)

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Select some of your favorite topics to let us suggest better news for you.",
                fontSize = 20.sp,
            )

            list.add(FavoriteModel("\uD83C\uDFC8   Sports"))
            list.add(FavoriteModel("⚖️   Politics"))
            list.add(FavoriteModel("\uD83C\uDF1E   Life"))
            list.add(FavoriteModel("\uD83C\uDFAE   Gaming"))
            list.add(FavoriteModel("\uD83D\uDC3B   Animals"))
            list.add(FavoriteModel("\uD83C\uDF34   Nature"))
            list.add(FavoriteModel("\uD83C\uDF54   Food"))
            list.add(FavoriteModel("\uD83C\uDFA8   Art"))
            list.add(FavoriteModel("\uD83D\uDCDC   History"))
            list.add(FavoriteModel("\uD83D\uDC57   Fashion"))

            Spacer(modifier = Modifier.height(10.dp))

            LazyVerticalGrid(
                cells = GridCells.Fixed(2)
            ) {
                items(list.size) {
                    val item = list[it]
                    Card(modifier = Modifier
                        .height(80.dp)
                        .width(0.dp)
                        .weight(1f)
                        .padding(5.dp)
                        .align(Alignment.CenterHorizontally),
                        shape = RoundedCornerShape(15.dp)) {

                        Column(modifier = Modifier
                            .fillMaxSize()
                            .background(colorResource(id = R.color.gray))
                            .clickable {
                                Log.d("@@@", "click $it")
                            },
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = list[it].text,
                                textAlign = TextAlign.Center, fontSize = 20.sp,
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                navController.navigate(Screen.MainScreen.route) {
//                    popUpTo(Screen.FavoriteScreen.route) {
                    popUpTo(0) {
                        inclusive = true
                    }
                }
            }, modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(50.dp), shape = RoundedCornerShape(15.dp)) {
                Text(text = "Next", fontFamily = FontFamily.Monospace)
            }

            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}