package com.example.notes.data.recyclermodels

// 1. сделать поля nullable // check
// 2. значения в созданном списке должны быть nullable // ready
// 3. создать 20 объектов в Activity //
//    а) модели без null
//    б) все модели и вместо null реакция интерфейса на null
//       если null будет isLiked, то его не видно.
data class RecyclerNotesModel(
    val title: String?,
    val description: String?,
    val isLiked: Boolean?,
)
