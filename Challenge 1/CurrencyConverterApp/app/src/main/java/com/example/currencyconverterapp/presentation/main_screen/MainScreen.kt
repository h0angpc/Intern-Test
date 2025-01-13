package com.example.currencyconverterapp.presentation.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.currencyconverterapp.R

@Composable
fun MainScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "ConverterApp",
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                horizontalAlignment = Alignment.End
            )
            {
                CurrencyRow(
                    modifier = Modifier.fillMaxWidth(),
                    currencyCode = "VND",
                    currencyName = "Viet Nam Dong",
                    onDropDownIconClicked = {}
                )
                Text(
                    text = "20000",
                    fontSize = 40.sp
                )
            }
        }
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 4.dp),
                horizontalAlignment = Alignment.End
            )
            {
                Text(
                    text = "20000",
                    fontSize = 40.sp
                )
                CurrencyRow(
                    modifier = Modifier.fillMaxWidth(),
                    currencyCode = "VND",
                    currencyName = "Viet Nam Dong",
                    onDropDownIconClicked = {}
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(start = 40.dp)
                .clip(CircleShape)
                .clickable {  }
                .background(color = MaterialTheme.colorScheme.background)
        )
        {
            Icon(
                painter = painterResource(R.drawable.ic_sync),
                contentDescription = "Swap Currency",
                modifier = Modifier
                    .padding(8.dp)
                    .size(25.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
fun CurrencyRow(
    modifier: Modifier = Modifier,
    currencyCode: String,
    currencyName: String,
    onDropDownIconClicked: () -> Unit
) {
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = currencyCode, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        IconButton(onClick = onDropDownIconClicked) {
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Open bottom sheet"
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(text = currencyName, fontSize = 14.sp, fontWeight = FontWeight.Bold)
    }
}