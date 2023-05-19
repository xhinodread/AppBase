package com.example.appbase.ui.fragment.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appbase.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun Seguimiento(){

    val focusRequesterMio = remember { FocusRequester() }
    var texto by remember {mutableStateOf("") }
    var cpntt by remember {mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center)
    ) {
        /****
        Text(
            text = "Seguimiento de encomiendas",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
        *****/
        Card(
            elevation = 2.dp,
            backgroundColor=(colorResource(id = R.color.purple_pi)),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(5.dp)
                .clickable { focusRequesterMio.requestFocus() }
        ) {
            Column(modifier = Modifier.padding(10.dp)){
                Text(
                    text="SEGUIMIENTO EN LINEA",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text="Para buscar, ingrese su número de orden de flete.",
                    color = Color.White,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(5.dp)
                )
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ){
                    OutlinedTextField(
                        value = texto,
                        onValueChange = {texto = it},
                        label = {Text("Nro de Orden")},
                        maxLines = 1,
                        modifier = Modifier
                            .background(colorResource(id = R.color.white))
                            .width(200.dp)
                            .focusRequester(focusRequesterMio),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                    Button(
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(backgroundColor= colorResource(id = R.color.colorPrimaryDarkPi))
                    ) {
                        Text(text="Rastrear", color=Color.White)
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                FormaTrackingB(shape= CircleShape, 0)
            }
        }
    }
}


fun hacerTrack(): Unit{

}

@Composable
fun FormaTracking(shape: Shape){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .clip(shape)
                .background(Color.Red)
        )
    }
}

@Composable
fun FormaTrackingB(shape: Shape, contador: Int =0){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
    ) {

        for (i in 1..contador){
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape)
                    .background(Color.Red)
            )
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}