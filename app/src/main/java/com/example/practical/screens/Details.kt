package com.example.practical.screens

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.Navigation

import com.example.practical.NavRoutes

@Composable
fun Details(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        Row() {
            Text(
                text = "Name: Keziah Robinson",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
        Row() {
            Text(
                text = "Course: ICT in Application Development",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
        Row() {
            Text(
                text = "Department: Information Technology",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
        Row(

            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(

                text = "Student Number : 219113149",
                color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
        val context = LocalContext.current
        val visible: MutableState<Boolean> = remember { mutableStateOf(false) }
        Spacer(modifier = Modifier.height(30.dp))
        Row(

            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center

        ) {
            Button(
                onClick = {/*Dummy Button for now*/ },
            //    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ) {


                Text(
                    text = "Current Modules"
                )


            }

            Button(
                onClick = { navController.navigate(NavRoutes.HomeScreen.route) },
               // colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.white)),
                shape = RoundedCornerShape(50),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 10.dp
                )

            ) {


                Text(
                    text = "Back To Home"
                )


            }
        }
    }
}

