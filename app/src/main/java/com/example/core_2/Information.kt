package com.example.core_2

import android.graphics.Bitmap
import android.os.Parcelable
import android.widget.ImageView
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Information(val name: String, val location: String, val Score: String,
    val date: String): Parcelable {

}