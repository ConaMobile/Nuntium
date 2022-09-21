package com.conamobile.nuntium.ui.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.conamobile.nuntium.R
import com.conamobile.nuntium.ui.main.home.vm.HomeViewModel
import com.conamobile.nuntium.ui.main.util.SpacerMe

@Composable
fun HomeScreen() {
    val viewModel = viewModel(modelClass = HomeViewModel::class.java)
    val text by remember { mutableStateOf("Search") }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White), contentAlignment = Alignment.Center) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                SpacerMe(height = 15)

                Text(text = "Browse",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))

                SpacerMe(height = 10)

                Text(text = "Discover things of this world",
                    fontSize = 20.sp,
                    color = Color.DarkGray, modifier = Modifier.padding(start = 10.dp))

                SpacerMe(height = 10)
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()) {
                    OutlinedTextField(
                        value = text,
                        onValueChange = {},
                        leadingIcon = {
                            Icon(painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = "Search")
                        },
                        modifier = Modifier
                            .fillMaxWidth(0.9f)
                            .background(Color.White)
                    )
                }
            }
        }
    }
}