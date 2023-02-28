package com.example.composewithgithup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composewithgithup.ui.theme.ComposeWIthGITHUPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Headere()

        }
    }
}

@Composable
fun Headere() {
        Scaffold(
          topBar = { TopAppBar (
            title = {  Text(text = "ComposeWith_git_hup", modifier = Modifier.fillMaxWidth(), fontSize = 20.sp, fontFamily = FontFamily.Serif, textAlign = TextAlign.Center)}
            , backgroundColor = colorResource(id =R.color.ColorAppBar )
          , navigationIcon = { Icon(
                  imageVector = Icons.Default.MoreVert,
                  contentDescription = "",
              )}

          ) }
        ) {

        }
}


