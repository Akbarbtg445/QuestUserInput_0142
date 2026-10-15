package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier) {
    Var textNama by remember { mutableStateOf(value"") }
    var textAlamat by remember { mutableStateOf(value"") }
    var textJK by remember { mutableStateOf(value"") }
    val gender:List<String> = listOf("Laki-laki","Perempuan")")

    var nama by remember { mutableStateOf(value"") }
    var alamat by remember { mutableStateOf(value"") }
    var jenis by remember { mutableStateOf(value"") }

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp)
        )
    }
})