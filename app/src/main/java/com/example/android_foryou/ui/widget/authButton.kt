package com.example.android_foryou.ui.widget

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AuthButton(
    text: String,
    colors: ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFFFFF4BD),
        contentColor = Color(0xFFE98995)
    ),
    onClick: () -> Unit = {}
) {
    Button(
        modifier = Modifier
            .width(321.dp)
            .height(43.dp),
        colors = colors,
        shape = RoundedCornerShape(3.dp),
        onClick = onClick
    ) {
        Text(text = text)
    }
}