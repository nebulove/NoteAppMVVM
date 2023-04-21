package com.nebulov.noteappmvvm.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nebulov.noteappmvvm.ui.theme.NoteAppMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteAppMVVMTheme {

            }
        }
    }
}
