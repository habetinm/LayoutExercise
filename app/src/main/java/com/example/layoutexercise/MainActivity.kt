package com.example.layoutexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutexercise.ui.theme.LayoutExerciseTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutExerciseTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.height(IntrinsicSize.Max).fillMaxSize()) {
            Column(modifier = Modifier.padding(1.dp).weight(4f)) {
                Row(
                    modifier = Modifier.padding(1.dp).background(Color.LightGray).fillMaxWidth()
                        .height(40.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(text = "Head")
                }

                Row {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "1")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "2")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "3")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "4")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "5")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "6")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "7")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "8")
                        }
                    }

                    Column(modifier = Modifier.weight(1f)) {
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "11")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "12")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "13")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "14")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "15")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "16")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Blue).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "17")
                        }
                        Row(
                            modifier = Modifier.padding(1.dp).background(Color.Red).fillMaxWidth()
                                .weight(1f),//.height(40.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "18")
                        }
                    }
                }

                //        Box(modifier = Modifier.fillMaxWidth().height(40.dp)) {
                //            Text(text = "PRVNI", modifier = Modifier.align(Alignment.TopStart))
                //            Text(text = "STRED", modifier = Modifier.align(Alignment.Center))
                //            Text(text = "DRUHY", modifier = Modifier.align(Alignment.BottomEnd))
                //        }

                Row(
                    modifier = Modifier.padding(1.dp).background(Color.LightGray).fillMaxWidth()
                        .weight(1f),//.height(40.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.Top
                ) {
                    //Text(text = "Tail")
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(20.dp)
                    ) {
                        Text(
                            text = "LEVÝ BOX",
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //            Text(
                    //                text = "LEVÝ BOX",
                    //                modifier = Modifier.align(Alignment.Center)
                    //            )

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(20.dp)
                    ) {
                        Text(
                            text = "PRAVÝ BOX",
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }

                    //            Text(
                    //                text = "PRAVÝ",
                    //                modifier = Modifier.align(Alignment.Center)(modifier = Modifier.weight(1f))
                    //            )
                }
            }

            Column(
                modifier = Modifier.padding(1.dp).weight(1f).background(Color.LightGray)
                    .fillMaxHeight()
            ) {
                Text(text = "Left column")
            }
        }

        Row(modifier = Modifier.padding(1.dp).background(Color.LightGray).height(40.dp).fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment =
            Alignment.CenterVertically) {
            Text(text = "Tail")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutExerciseTheme {
        Greeting("Android")
    }
}