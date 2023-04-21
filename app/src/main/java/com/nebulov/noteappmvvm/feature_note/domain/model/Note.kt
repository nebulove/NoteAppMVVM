package com.nebulov.noteappmvvm.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nebulov.noteappmvvm.ui.theme.Pink80
import com.nebulov.noteappmvvm.ui.theme.Purple40
import com.nebulov.noteappmvvm.ui.theme.Purple80
import com.nebulov.noteappmvvm.ui.theme.PurpleGrey40

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        val noteColors = listOf(Purple40, Purple80, PurpleGrey40, Pink80)
    }
}
