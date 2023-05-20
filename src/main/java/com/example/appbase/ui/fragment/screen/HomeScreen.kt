package com.example.appbase.ui.fragment.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appbase.R

@Composable
fun HomeScreen() {
    Card(
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(5.dp)
    ) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white )),
    ) {
            Text(
                text = "Usuario: JAracena, 14.305.302-0 ",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.align(Alignment.Start).padding(5.dp,0.dp),
                textAlign = TextAlign.Center,
                fontSize = 10.sp
            )
            Text(
                text = "Home Piero",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(15.dp),
                textAlign = TextAlign.Center,
                fontSize = 25.sp
            )
            Image(
                painterResource(
                    id = R.drawable.camion1home
                ),
                contentDescription = null,
                alignment = Alignment.Center,
                contentScale = ContentScale.Fit
            )
            Text(
                text = "¿Que desea hacer hoy?",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
            Image(
                painter = painterResource(id = R.drawable.capturahomepiero),
                contentDescription = stringResource(id = R.string.app_title)
            )
        }
    }
}