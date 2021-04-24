package com.olabode.wilson.moovy.screens.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olabode.wilson.moovy.ui.theme.deepBlue
import com.olabode.wilson.moovy.utils.ThemedPreview

@Composable
fun BackArrow(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    color: Color = Color.White,
    onBackPressed: () -> Unit
) {
    Icon(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(
                brush = Brush.horizontalGradient(colors = listOf(deepBlue, deepBlue)),
                RectangleShape,
                0.5f
            )
            .clickable { onBackPressed() }
            .padding(16.dp),

        imageVector = Icons.Rounded.ArrowBack,
        contentDescription = "",
        tint = Color.White,
    )
}

@Preview
@Composable
fun PreviewBackArrow() {
    ThemedPreview(true) {
        BackArrow(icon = Icons.Rounded.ArrowBack) {

        }

    }
}