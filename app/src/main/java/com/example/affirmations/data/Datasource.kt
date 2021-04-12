package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation>{
        return listOf(
            Affirmation(R.string.affiramtion1, R.drawable.image1),
            Affirmation(R.string.affiramtion2, R.drawable.image2),
            Affirmation(R.string.affiramtion3, R.drawable.image3),
            Affirmation(R.string.affiramtion4, R.drawable.image4),
            Affirmation(R.string.affiramtion5, R.drawable.image5),
            Affirmation(R.string.affiramtion6, R.drawable.image6),
            Affirmation(R.string.affiramtion7, R.drawable.image7),
            Affirmation(R.string.affiramtion8, R.drawable.image8),
            Affirmation(R.string.affiramtion9, R.drawable.image9),
            Affirmation(R.string.affiramtion10, R.drawable.image10)
        )
    }
}