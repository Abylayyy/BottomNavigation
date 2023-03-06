package kz.abylay.mybottomnavigation.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kz.abylay.mybottomnavigation.data.ChatItem

@Composable
fun ChatScreen() {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Chat Screen",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        var items by remember {
            mutableStateOf((1..20).map {
                ChatItem(
                    title = "Item $it",
                    isSelected = false
                )
            })
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(items.size) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            items = items.mapIndexed { index, item ->
                                if (it == index) {
                                    item.copy(isSelected = !item.isSelected)
                                } else {
                                    item
                                }
                            }
                        }
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = items[it].title)
                    if (items[it].isSelected) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "selected",
                            tint = Color.Green,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }
}