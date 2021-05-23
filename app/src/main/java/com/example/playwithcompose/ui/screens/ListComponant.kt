package com.example.playwithcompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playwithcompose.data.Category
import com.example.playwithcompose.ui.theme.typography
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun CategoryItem(category: Category) {
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column{
            Spacer(modifier = Modifier.height(16.dp))
            CoilImage(
                data = category.imageUrl,
                contentDescription = "Food",
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Row {
                Text(
                    text = category.name,
                    style = typography.h5,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
        }
    }

}

@Preview
@Composable
fun PuppyItemPreview() {
    Column {
        for (i in 0..5) {
            Text(text = "Hello")
        }
        Button(onClick = { }) {
            Text(text = "Simple Button")
        }
    }
}

@Composable
fun PuppyList() {
    for (i in 0..5)
        LazyColumn() {

        }
}
