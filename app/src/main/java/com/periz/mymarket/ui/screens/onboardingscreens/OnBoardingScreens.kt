package com.periz.mymarket.ui.screens.onboardingscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.periz.mymarket.R
import com.periz.mymarket.ui.theme.Pink80

@Composable
fun OnboardingScreen(navController : NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        //Image
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)
        )
        Text(
            text ="WELCOME TO MYMARKET",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Magenta,



        )
        Text(
            text = "Shop Smarter",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

        )

        Text(
            text = "everywhere you go",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

            )
        Text(
            text = "Purpose: Provides a dedicated, user-friendly, and secure mobile-first shopping experience compared to a standard website.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,

            )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Pink80),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)


        ) {
            Text(text = "Get Started")
        }








        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }




}
@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview(){
    OnboardingScreen(rememberNavController())

}
