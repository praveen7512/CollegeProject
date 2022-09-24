package com.example.collegeproject.screens
import com.example.collegeproject.ui.theme.CollegeProjectTheme
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.collegeproject.utils.UtilsFunctions
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //this will remove the actionBar
        UtilsFunctions.actionBarRemove(window)

        setContent {

            CollegeProjectTheme {

                UtilsFunctions.LottieAnimationTheme()
            }
        }
        GlobalScope.launch {
            delay(3000L)
            startActivity(Intent(this@MainActivity, HomeScreen::class.java))
            finish()
        }

    }
}







