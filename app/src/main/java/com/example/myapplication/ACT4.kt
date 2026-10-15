package com.example.myapplication

@Composable
fun FormDataDiri(modifier: Modifier) {
    Var textNama by remember { mutableStateOf(value"") }
    var textAlamat by remember { mutableStateOf(value"") }
    var textJK by remember { mutableStateOf(value"") }
    val gender:List<String> = listOf("Laki-laki","Perempuan")")
})