package kz.abylay.mybottomnavigation.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.abylay.mybottomnavigation.R

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Home Screen",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        val imageHeight = (LocalConfiguration.current.screenWidthDp * (2f / 3f)).dp
        val lazyListState = rememberLazyListState()
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            state = lazyListState
        ) {
            items(10) {
                Text(
                    text = "Sample item",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
            item {
                Box(
                    modifier = Modifier
                        .clipToBounds()
                        .fillMaxWidth()
                        .height(imageHeight)
                        .background(
                            Brush.verticalGradient(
                                listOf(
                                    Color(0xFFf36b21),
                                    Color(0xFFf9a521)
                                )
                            )
                        )
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_moonbg),
                        contentDescription = "moon",
                        contentScale = ContentScale.FillWidth,
                        alignment = Alignment.BottomCenter,
                        modifier = Modifier.matchParentSize()
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_midbg),
                        contentDescription = "mid bg",
                        contentScale = ContentScale.FillWidth,
                        alignment = Alignment.BottomCenter,
                        modifier = Modifier.matchParentSize()
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_outerbg),
                        contentDescription = "outer bg",
                        contentScale = ContentScale.FillWidth,
                        alignment = Alignment.BottomCenter,
                        modifier = Modifier.matchParentSize()
                    )
                }
            }
            items(20) {
                Text(
                    text = "Sample item",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }
    }
}