/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.playwithcompose.ui.screens

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playwithcompose.data.CategoryCollection
import com.example.playwithcompose.data.DataProvider
import com.example.playwithcompose.ui.theme.MyTheme
import com.example.playwithcompose.ui.theme.shapes
import com.example.playwithcompose.ui.theme.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp(DataProvider.getCategoryCollection())
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp(categories: List<CategoryCollection>) {
    Surface(color = MaterialTheme.colors.background) {
        LazyRow {
            items(categories) { categoryCollection ->
                Column{
                    Text(
                        text = categoryCollection.name,
                        style = typography.h3,
                        modifier = Modifier.padding(16.dp)
                    )
                    LazyColumn(contentPadding = PaddingValues(start = 12.dp, end = 12.dp)) {
                        items(categoryCollection.categories) { category ->
                            CategoryItem(category)
                        }
                    }
                }

            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp(DataProvider.getCategoryCollection())
    }
}

//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun DarkPreview() {
//    MyTheme(darkTheme = true) {
//        MyApp()
//    }
//}
