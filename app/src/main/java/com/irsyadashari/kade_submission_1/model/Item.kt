package com.irsyadashari.kade_submission_1.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//Penerapan Parcelable Android KTX
@Parcelize
data class Item (val name: String?, val description: String?,val image: Int) : Parcelable