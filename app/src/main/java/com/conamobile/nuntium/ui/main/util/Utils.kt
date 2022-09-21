package com.conamobile.nuntium.ui.main.util

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerMe(height: Int) {
    Spacer(modifier = Modifier.height(height.dp))
}